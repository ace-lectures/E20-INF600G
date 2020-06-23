# Séquence 3 : Collecte de métadonnées & IA

* Feuille d'inscription pour les rendez vous de suivi :
    - [https://docs.google.com/spreadsheets/d/1fbgmtB2ujJCZhAnURif73yWEBcU0rx7rAV2k5WqPmB8/edit?usp=sharing](https://docs.google.com/spreadsheets/d/1fbgmtB2ujJCZhAnURif73yWEBcU0rx7rAV2k5WqPmB8/edit?usp=sharing)

## Objectifs

  1. Approfondir le MVP pour prendre en compte deux adaptations
  2. Collecter des méta-données sur les résidents
  3. Permettre aux soignants d'activer ou désactiver une adaptation
  4. Travailler en équipe dans une démarche d'amélioration continue

## Leçon introductive

- Diapositives
    1. [Rétrospective de la deuxième séquence](./seq3/Seq3_Part1.pdf)
    2. [Detection de contexte](./seq3/Seq3_Part2.pdf)
    3. [Application au téléphone intelligent](./seq3/Seq3_Part3.pdf)
    4. [Lieux de vie intelligents](./seq3/Seq3_Part4.pdf)
    5. [Travail à réaliser pour `L3`](./seq3/Seq3_Part5.pdf)
- Vidéos
    - TODO

## Outils nécessaires

  - Comme pour la séquence précédente
  - [RStudio](https://rstudio.com/products/rstudio/download/) si vous avez le goût d'expérimenter un peu la partie apprentissage machine (optionel)

## Ressources disponibles

- [Dépôt Github](https://github.com/ace-lectures/behavioral-context-recognition) pour la partie apprentissage
- Le carnet ([PDF]()) d'experience



## Travail à réaliser pour la séquence (`L3`)

Durant cette séquence, vous devez continuyer le développement de votre application de quizz a destination des aînés en résidence. Les points a prendre en compte pour les quatre prochaines semaines sont :

1. Collecte de méta-données fonctionelles:
    - Pour chaque quizz, on dispose pour chaque résident de ses réponses justes ou fausse.
2. Collecte de méta-données des capteurs:
    - Pendant qu'un aîné utilise votre application, vous devez collecter les données des capteurs de la tablette pour mesurer ses tremblements.
    - Ces données doivent être envoyée au serveur pour y être enregistré;
    - **VOUS N'AVEZ PAS A RÉALISER LA PARTIE APPRENTISSAGE MACHINE POUR LE MOMENT**
3. Adaptation:
    - En fonction de l'état de santé des résidents, vous proposerez au moins deux adaptations différentes (a valider avec votre auxiliaire)
    - Une des adaptations doit porter sur la mécanique du quizz (p.ex., ne pas afficher une mauvaise réponse)
    - Une des adaptations doit porter sur l'affichage de votre quizz
    - Les adaptations doivent s'enraciner dans la description de vos personas.
4. Activation à la demande :
    - Depuis l'interface de contrôle des soignants, il est possible d'activer ou désactiver une adaptation pour un résident donné.
    - On enregistre le moment ou une adaptation est activée ou désactivée pour pouvoir vérifier si cela à un impact sur le taux de bonnes réponses du résident

### Plan de match type

- Semaine 1 :
    - mardi : leçon introductive
    - jeudi : _backlog_ défini pour la séquence, attribution des responsabilités
- Semaine 2 :
    - mardi : première démo à votre auxiliaire
    - jeudi : avancée sur le projet
- Semaine 3 :
    - mardi : Collecte de rétroaction avec votre auxiliaire
    - jeudi : Répétition d'une version minimale de la démo avec l'auxiliaire
- Semaine 4 :
    - mardi ou jeudi : démonstration évaluée
    - Finalisation de la livraison

### Contraintes non-fonctionelles

1. Pour la partie arrière (serveur)
    - comme pour `L2`
2. Pour l'application mobile (client)
    - comme pour `L2`
3. Pour le développement du projet:
    - comme pour `L2`
      - rappel: **Vous travaillez récit par récit (et non pas couche pas couche);**
    - Addition: Chaque récit est dirigé par un membre de l'équipe.   

Si certains d'entre vous sont plus confortable a faire deux applications séparées (une pour les résidents, une pour les soignants)

### Livraison du travail (Github classroom)

1. Déposez une étiquette `L3` sur le _commit_ correspondant à votre remise pour la fin de cette séquence
    - `git tag L3`
    - `git push --tags`
2. Assurez vous de la présence de l'étiquette sur l'interface web de Github

:rotating_light: **N'oubliez pas de pousser (`git push`) votre travail au fur et à mesure de votre avancée pour ne pas rater votre livraison**

### Démonstration

  - La démonstration dure 20 minutes
  - Elle se décompose en une période de présentation des fonctionalités de l'application (7 minutes max), suivie d'une période de questions/réponses et de rétroaction de la part du professeur
  - Pendant la démonstration, chaque membre de l'équipe doit s'exprimer

Conseils :

  - Ayez votre démonstration déjà prête à l'écran pour pouvoir immédiatement démarrer;
  - Scénarisez votre démonstration;
  - Faite une (ou plusieures) répétitions avant la _vraie_ démonstration

### Grille d'évaluation pour `L3`

**La note individuelle sera modulée par l'équipe enseignante en fonction de votre implication dans la réalisation de l'équipe.**

| Thème         | Critère                      | Poids |
| :---:         | :---                         | :---: |
| **Général**   | Couverture fonctionelle du produit | 15%   |
|               | Travail par récit & Intégration    | 10%   |
|               | État du dépôt Git    | 5%   |
| **Code source**  | Qualité Application mobile    | 20%   |
|               | Qualité Serveur | 20%  
| **Démonstration**   | Scénarios     | 10%   |
|               | Questions & Réponses      | 20%   |
| :rotating_light: **MALUS**     | _non respect des consignes de livraison_ | **-100%** |
