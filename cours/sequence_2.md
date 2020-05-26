# Séquence 2 : Application Mobile Minimale & Viable (MVP)

* Feuille d'inscription pour les rendez vous de suivi : 
    - [https://docs.google.com/spreadsheets/d/1fbgmtB2ujJCZhAnURif73yWEBcU0rx7rAV2k5WqPmB8/edit?usp=sharing](https://docs.google.com/spreadsheets/d/1fbgmtB2ujJCZhAnURif73yWEBcU0rx7rAV2k5WqPmB8/edit?usp=sharing) 

## Objectifs

  1. Découvrir le langage Kotlin pour développer une application mobile
  2. Déployer un service consommé par l'application mobile
  4. Suivre le déroulement de son projet en exploitant les récits utilisateurs

## Leçon introductive

:x: **TODO** Ajouter les vidéos et les liens vers les diapositives :x:

- Diapositives
    1. [Rétrospective sur la séquence #1](./seq2/Seq2_Part1.pdf)
    2. [Architecture client - serveur](./seq2/Seq2_Part2.pdf)
    3. [Exposition de ressources](./seq2/Seq2_Part3.pdf)
    4. [Introduction au développement Android](./seq2/Seq2_Part4.pdf)
    5. [Travail à réaliser pour L2](./seq2/Seq2_Part5.pdf)
- Vidéos
    - [Playlist INF600G - E20 - S2](https://www.youtube.com/playlist?list=PLpni-AW3kOU6cqO9rA57oKkO5mQayT1kR)

## Outils nécessaires

  - Maven (version 3+)
  - Java (Version 11 recommandée, 8 minimum)
  - [Android studio](https://developer.android.com/studio/)
  - Pour le développement Java, [IntelliJ](https://www.jetbrains.com/fr-fr/idea/download/) est recommandé

## Ressources disponibles

- Documentation [Eclipse Jersey](https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/index.html)
- [Android Kotlin fundamental course](https://codelabs.developers.google.com/android-kotlin-fundamentals/)
    - Principalement les tutoriels 1, 2, 3, 5, 7 et 8.
- Cours Android à Université Côte d'Azur (2017)
    - [Introduction à Android](./seq2/uca_android_1.pdf)
    - [Layout](./seq2/uca_android_2.pdf)
    - [Material design et appel à des services](./seq2/uca_android_3.pdf)
- Bibliothèque Android [OkHttp](https://github.com/square/okhttp)
- Guide utilisateur [Gson](https://github.com/google/gson/blob/master/UserGuide.md)



## Travail à réaliser pour la séquence (`L2`)

Durant cette séquence, vous devez développer le produit minimal viable correspondant au produit décrit à la séquence 1. Ce produit correspond au travail de 4 (ou 3) personnes pour une durée de 4 semaines, en tenant compte de votre apprentissage préalable de la technologie Android (une équipe de débutants en Android arrivera moins loin qu'une équipe possédant de l'expertise).

Minimalement (c.à.d., si vous êtes des débutants en Android), votre MVP doit permettre de réaliser les actions suivantes :

1. Différentier un _aidant_ d'un _résident_;
2. Pour un _résident_, répondre à un quizz textuel d'au moins deux questions;
3. Pour un _aidant_, de voir les résultats (réponses justes/fausses) des _résidents_ ayant joués.

Si vous êtes à l'aise avec la technologie Android, vous pouvez enrichir ce produit en travaillant prioritairement sur l'adaptation des quizz (problèmes de vues par exemple).


### Contraintes non-fonctionelles

1. Pour la partie arrière (serveur)
    - Les données sont stockée uniquement en mémoire (pas de base de données);
    - Il existe une séparation claire entre les trois couches de l'application (exposition en service, logique d'affaire, stockage des données);
    - pour lancer le serveur : `mvn clean package jetty:run-war`.
2. Pour l'application mobile (client)
    - Les données sont obtenues et enregistrées dans la partie arrière uniquement;
    - L'application est lançable depuis Android studio sur un émulateur de tablette
3. Pour le développement du projet:
    - Vous travaillez récit par récit (et non pas couche pas couche);
    - Chaque _commit_ doit référencer le récit utilisateur auquel il contribue;
    - Vous tenez à jour le suivi du projet (`suivi_projet.md`) et votre journal individuel (`journal_CODE_PERMANENT.md`, un fichier par membre de l'équipe)


### Livraison du travail (Github classroom)

1. Acceptez le travail [Projet de session](https://classroom.github.com/g/BfPOer2u) sur Github classroom.
    - si votre équipe n'existe pas, créez là.
    - si votre équipe existe déjà, rejoignez là
    - Attention, c'est vraiment galère de faire des modifications dans github si vous vous trompez d'équipe à ce stade.
2. Déposez une étiquette `L2` sur le _commit_ correspondant à votre remise pour la fin de cette séquence
    - `git tag L2`
    - `git push --tags`
3. Assurez vous de la présence de l'étiquette sur l'interface web de Github

:rotating_light: **N'oubliez pas de pousser (`git push`) votre travail au fur et à mesure de votre avancée pour ne pas rater votre livraison**

### Grille d'évaluation pour `L2`

**La note individuelle pourra être modulée par l'équipe enseignante en fonction de votre implication dans la réalisation de l'équipe.**

| Thème         | Critère                      | Poids |
| :---:         | :---                         | :---: |
| **Général**   | Respect des gabarits         | 5%    |
|               | Traçabilité commit-récits    | 15%   |
|               | Couverture fonctionelle du MVP | 15%   |
| **Application**  | Qualité du code source    | 15%   |
|               | Scénarios & adaptation à l'usage | 20%  
| **Serveur**   | Qualité du code source     | 15%   |
|               | bonnes pratiques REST      | 15%   |
| :rotating_light: **MALUS**     | _non respect des consignes de livraison_ | **-100%** |
