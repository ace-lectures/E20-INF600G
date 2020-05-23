package ca.uqam.info.inf600g.data;

import ca.uqam.info.inf600g.model.Theme;

import java.util.*;
import java.util.stream.Collectors;

public class ThemeCollection {

    /*******************************************
     * Static access to the account collection *
     *******************************************/

    private static ThemeCollection database;
    public static ThemeCollection getAccess() {
        if (database == null)
            database = new ThemeCollection();
        return database;
    }

    /*******************************************
     * Private construction and data structure *
     *******************************************/

    private Map<String, Theme> themes;
    private ThemeCollection() {
        this.themes = new HashMap<>();
        initialize();
    }

    /******************************
     * Theme collection interface *
     ******************************/

    public Set<Theme> getAllThemes() {
        return new HashSet<>(this.themes.values());
    }

    public Optional<Theme> findThemeByLabel(String label) {
        if(this.themes.containsKey(label))
            return Optional.of(this.themes.get(label));
        return Optional.empty();
    }

    public Set<Theme> findThemesBySearchingDescription(String keywords) {
        return this.themes.values()
                .stream()
                .filter(t -> { return t.getDescription().contains(keywords); })
                .collect(Collectors.toSet());
    }

    public void registerNewTheme(Theme t) {
        if(this.themes.containsKey(t.getLabel()))
            throw new IllegalArgumentException("Duplicated identifier!");
        this.themes.put(t.getLabel(), t);
    }

    public void updateTheme(Theme t) {
        if (!this.themes.containsKey(t.getLabel()))
            throw new IllegalArgumentException("Cannot update an unknown theme");
        Theme old = this.themes.get(t.getLabel());
        this.themes.remove(old.getLabel());
        Theme updated = new Theme(t.getLabel(),
                t.getName().equals("")? old.getName() : t.getName(),
                t.getDescription().equals("")? old.getDescription() : t.getDescription());
        this.themes.put(updated.getLabel(), updated);
    }

    public void deleteTheme(String label) {
        if(!this.themes.containsKey(label))
            throw new IllegalArgumentException("Cannot delete an unknown theme");
        this.themes.remove(label);
    }

    /**********************
     * Dummy data for MVP *
     **********************/

    private void initialize() {
        Theme sport = new Theme("sport", "Sportif", "Des quizzs sportifs");
        this.themes.put(sport.getLabel(),sport);
        Theme history = new Theme("history", "Histoire", "L'Histoire, avec un grand H");
        this.themes.put(history.getLabel(), history);
    }
}
