# INF600G - Partie arrière de démonstration

  - Source: https://github.com/simenflatby/jersey-swagger-ui-example
  
## Lancement du système

On lance d'abord la compilation du serveur : 

```
mosser@lucifer serveur % mvn clean package
```

Pour lancer le serveur sur la machine locale : 

```
mosser@lucifer serveur % mvn jetty:run-war
```

Pour arrêter le serveur, faites un `^C` dans le terminal où vous l'avez lancé.

**Important**: On est ici dans un contexte d'évaluation, dans la _vraie vie(c)_ on n'utilisera pas Jetty lancé depuis Maven pour heberger de la production. Mais INF600G n'est pas un cours d'API web (INF5190 l'est pas contre) 

## Interface Swagger

On utilise Swagger pour interagir manuellement avec les ressources exposées dans le serveur.

  - L'interface web: [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)
  - Le contrat d'API: [http://localhost:8080/api/openapi.json](http://localhost:8080/api/openapi.json)