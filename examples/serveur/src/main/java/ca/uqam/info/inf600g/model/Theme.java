package ca.uqam.info.inf600g.model;

public class Theme {

    private String label;
    private String name;
    private String description;


    public Theme() { } // required for marshalling purpose

    public Theme(String label, String name, String description) {
        this.label = label;
        this.name = name;
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
