# Séquence 4 : Approfondissement

* Feuille d'inscription pour les rendez vous de suivi :
    - [https://docs.google.com/spreadsheets/d/1fbgmtB2ujJCZhAnURif73yWEBcU0rx7rAV2k5WqPmB8/edit?usp=sharing](https://docs.google.com/spreadsheets/d/1fbgmtB2ujJCZhAnURif73yWEBcU0rx7rAV2k5WqPmB8/edit?usp=sharing)


## Objectifs

  1. Approfondir un sujet autour de la conception de logiciel adaptés
  2. Finaliser un projet en vue de sa livraison
  3. Réaliser une vidéo de démonstration mettant en avant la réalisation et les défis
  4. Tirer les leçons d'un projet de 15 semaines

## Leçon introductive

- Diapositives:
  1. Présentation d'AGE-WELL par Samantha Sandassie
  2. [Rétroaction sur la séquence précédente](./seq4/Seq4_Part2.pdf)
  3. [Évaluation Utilisateurs](./seq4/Seq4_Part3.pdf)
  4. [Axes d'extension disponibles](./seq4/Seq4_Part4.pdf)
  5. [Travail a réaliser pour `L4`](./seq4/Seq4_Part5.pdf)
- Vidéo:
  - [Playlist séquence 4](https://www.youtube.com/playlist?list=PLpni-AW3kOU7lUKrY5sgECnt4N1hAfrpx)
- Ressource supplémentaire :
  - [Ergonomie et Modélisation des utilisateurs des IHMs](./seq4/uca_ludotic.pdf) par Teresa Colombi (LudoTic)

## Travail à réaliser pour la séquence (`L4`)

  - Choisissez et développez **un** axe d'extension parmi les axes suivants (ou proposez le votre d'ici le premier jeudi au professeur);
  - Finalisez les fonctionalités et la qualité de code de vos précédentes livraisons;
  - Préparer un rapport technique et une vidéo de démonstration;
  - Participer à une revue de code avec le professeur.

## Axes d'extension

Tous les axes d'extensions proposés sont _équivalents_ en terme de difficultés. Certains sont cependant plus _techniques_, là où d'autres vont demander un plus grand raisonnement _scientifique_.  La table suivante peut vous aider à faire votre choix.

| Extension  | Difficulté "scientifique" | Difficulté "technique" |
| :---:      | :---:                     | :---:                  |
| Prédiction de comportement |  4/5      |  1/5                   |
| Visualisation de données   |  3/5      |  2/5                   |
| Dégénérescence / Vision    |  3/5      |  2/5                   |
| Quiz personalisés          |  2/5      |  3/5                   |
| Tests de Motricité         |  1/5      |  4/5                   |


### Prédiction de comportement

On ne dispose malheureusement pas de jeux de données suffisament large et "_propre_" pour mettre en oeuvre un prédicteur de comportement sur la base des données que vous collectez a partir des capteurs du téléphone. On donc de voir _s'adapter_ ... :).

Lors du cours de la séquence 3, on à travaillé sur la prédiction des étiquettes de localisation du téléphone : `ON_TABLE`, `IN_POCKET`, ... On va s'interesser à la prédiction du comportement de l'utilisateur du téléphone : `LYING_DOWN`, `RUNNING`, `WALKING`, ...

**Profil étudiant•e•s type**: Vous avez de l'interêt pour la partie _prédiction_ et _classification_ de la séquence précédente. Vous avez le gout de définir et appliquer une démarche _scientifique_ et de prendre du temps pour caractériser les éléments sur lesquels vous travaillez et les résultats que vous obtenez. Le génie logiciel vous interesse, pour les défis d'intégration d'un modèle de prédiction à votre archicture. Idéalement vous avez suivi le cours `INF4230` ou `INF5081`.


**Travail à réaliser**

1. Nettoyez le jeu de données `ExtraSensory` pour conserver uniquement les capteurs moteurs que vous savez lire via l'API Android;
2. Adaptez votre collecte de données pour qu'elle envoie a votre serveur en fin de quiz des données similaires à celle du jeu de données;
3. Définissez en Java et entrainez plusieurs prédicteurs (p.ex., _kNN_, arbre de décision, réseau de neurones);
4. Comparez vos modèles pour determiner celui qu'il faut embarquer dans le serveur de jeu;
5. Intégrez le modèle choisi dans votre systeme. A la fin d'un quiz, les données captées sont envoyée au modèle, qui fait une prédiction sur le comportement de l'utilisateur au moment du quiz. Cette prédiction est visible par les aidants comme une méta-donnée de la séance de jeu.
6. Soyez prêt a répondre lors de la démonstration aux questions : "quels type de prédictions serait vraiment utile dans le contexte de l'application de quiz développée ?" et "que vous faudrait-il pour mettre cela en oeuvre dans l'application ?".

**Ressources disponibles**

  - La bibliothèque Weka (apprentissage en Java): [www](https://waikato.github.io/weka-wiki/use_weka_in_your_java_code/)
  - Jeu de données disponible pour l'apprentissage: [ExtraSensory](https://github.com/ace-lectures/behavioral-context-recognition/tree/master/_datasets/ExtraSensory)
  - Un article décrivant comment utiliser les données de capteurs Android pour détecter les signes précoces de la maladie d'Alzheimer: [www](https://jneuroengrehab.biomedcentral.com/articles/10.1186/s12984-019-0576-y).
    - **Il est important de noter que malgré deux courriels les auteurs de l'article ont refusé de partager leurs données.**

### Visualisation de données pour les aidants

Suite au développement des séquences 2 et 3, les données collectées par l'application vis à vis des résidents sont les suivantes : _(i)_ bonnes et mauvaises réponses aux quizs, _(ii)_ adaptations activées/désactivées, _(iii)_ données des capteurs.

On s'interesse ici à adapter l'application aux usages des aidants, et non plus uniquement aux usages des résidents. Comment ces données peuvent-elles être utilisée par les aidants dans le cadre du suivi des résidents ? A quelle questions les aidants souhaitent-ils obtenir des réponses sur la base de ces données ? Comment visualiser ces données pour permettre aux aidant d'obtenir rapidement la réponse à ces questions ?

**Profil étudiant•e•s type**: Vous vous interessez à l'adaptation à l'usage, et souhaitez aller plus loin dans celle-ci en attaquant des problèmes différents de ceux de l'adaptation aux poly-handicaps liés au vieillisement. Idéalement vous avez suivi le cours d'interaction personnes-machines (`INF4150`) et le cours d'analyse (`INF5151`)

**Travail à réaliser**

1. Identifiez les questions auxquelles vos visualisations devront permettre de répondre, et validez les avec votre auxiliaire via Mattermost;
2. Pour chaque question, développez une ou plusieures visualisations de données qui permette d'y répondre;
3. Vous porterez une attention particulière à orienter les scénarios d'usages décrit dans votre backlog autour de ces questions;
4. Soyez prêt à défendre vos choix de visualisation lors de la démonstration finale. Vous devrez démontrer la pertinence des questions identifiées, **ET** la pertinence de la visualisation mise en oeuvre pour les supporter.

**Ressources disponibles**

  - [Data visualization catalogue](https://datavizcatalogue.com/search.html)

### Dégénérescence de la vision

Les adaptations réalisée à date sont assez simpliste. On va ici s'interesser à differentes pathologies visuelles pouvant classiquement toucher les aînés : [dégénérescence maculaire liée à l'âge](https://fr.wikipedia.org/wiki/D%C3%A9g%C3%A9n%C3%A9rescence_maculaire_li%C3%A9e_%C3%A0_l%27%C3%A2ge), [rétinopathie diabétique](https://fr.wikipedia.org/wiki/R%C3%A9tinopathie_diab%C3%A9tique), [glaucome](https://fr.wikipedia.org/wiki/Glaucome), [daltonisme](https://fr.wikipedia.org/wiki/Daltonisme), [rétinite pigmentaire](https://fr.wikipedia.org/wiki/R%C3%A9tinite_pigmentaire), [cataracte](https://fr.wikipedia.org/wiki/Cataracte_(maladie)), [myopie](https://fr.wikipedia.org/wiki/Myopie) et [presbytie](https://fr.wikipedia.org/wiki/Presbytie).

**Profil étudiant•e•s type**: Vous avez le goût d'approfondir l'adaptation aux aînés démaré lors de la séquence 3, en attaquant des défis d'adaptation plus ambitieux qui portent sur l'interaction personne-machine au sens de la présentation des écrans.

**Travail à réaliser**

1. Documentez vous sur les différentes types de dégénérescence listé ci-dessus;
2. Proposez des adaptations permettant aux résidents souffrants de ces pathologies de continuer à utiliser votre application de quiz (c.à.d., se connecter, choisir un quiz, y jouer et voir les résultats);
3. Vous livrerez à la racine de votre dépôts un fichier `simulations.pdf` qui montre via des captures d'écrans comment votre application se comporte pour chacune des pathologie traitées. Ces simulations peuvent être faite à l'aide du logiciel proposé ci-dessous, ou via n'importe quel outil de dessin ou de présentation.
4. Soyez prêt à défendre vos choix d'adaptations lors de la démonstration finale.

**Ressources disponibles**

  - [Simulateur de handicap visuel](http://www.inclusivedesigntoolkit.com/simsoftware/simsoftware.html) (attention, il faut une clé qui met jusqu'à une semaine à arriver)
  - [Formulaire d'auto-évaluation](http://calc.inclusivedesigntoolkit.com/) de l'accessibilité d'une application

### Quiz personalisés pour les résidents

On s'interesse ici aux quiz qui vont mobiliser la mémoire des résidents, à l'aide d'images, de vidéos, de sons, ... L'idée est de permettre à un personna aidant (famille ou employé de la résidence) de définir un ou plusieurs quizs conçus précisément pour un résident. Ces quizs seront concu à partir des souvenirs proches ou lointains du résident, et on cherchera à y collecter de l'information sur sa capacité mémorielle à court et long terme. Les questions personalisées pourront inclure des photos ou de la voix enregistrée fournies par les proches, des vidéos, ... il est important de mobiliser plusieurs capacité cognitives. Entre les questions précises pour ce résident, on intercalera des jeux mémoriels pour mesurer la mémoire à court terme du résident. Par exemple, on pourra demander au résident si une image est celle d'un chat ou celle d'un oiseau, puis poser une question sur son enfance, et demander ensuite si la première image était celle d'un chat ou celle d'un oiseau.


**Profil étudiant•e•s type**: Vous avez le goût d'approfondir l'adaptation aux aînés démaré lors de la séquence 3, en attaquant des défis d'adaptation plus ambitieux qui portent sur l'interaction personne-machine au sens de la multi-modalité des capacité cognitives mobilisées.

**Travail à réaliser**

1. Identifiez le (ou les) jeu(x) mémoriels que vous allez introduire dans les quizs, et validez vos choix avec votre auxiliaire via Mattermnost;
2. Mettez en place une interface pour les aidants permettant de définir des questions personalisées (a minimal images et voix);
3. Lorsqu'un résident participe à ce genre de quiz, collectez les métadonnées de réponses de manière différente des métadonnées des quiz réguliers, et differenciez les éléments de mémoire a court terme (jeux) de ceux à long terme (question personalisées) dans l'affichage des résultats aux aidants;
4. Mettez en place un **vrai** quiz a l'aide de votre système, qui permette de bien démontrer l'adaptation à votre résident (c.à.d. que les questions ne doivent pas paraitre honteusement factices);
5. Lors de la démonstration finale, soyez prêt a dérouler un scénario où l'on puisse voir une évolution d'un résident sur plusieurs quizs.


**Ressources disponibles**

  - Exemple de jeux mémoriels : [www](https://autonome-a-domicile.com/7-jeux-de-memoire-pour-votre-proche-age/)

### Tests de Motricité

Le système développé à date propose uniquement un système de quiz, et les potentielles pertes de motricités des résidents sont mesurées via leurs tremblements par les capteurs de la tablette. On souhaite collecter de meilleurs données sur la motricité des résidents, par la collecte de nouvelles métadonnées ainsi que l'aide d'un nouveau type de jeu à intégrer dans l'application. Lorsque le résident utilise l 'application, on s'attachera a collecter des données sur sa précision lors de l'utilisation : tape t'il en plein centre de la zone de réponse, ou a coté ? Une seule tentative est suffisante, ou au contraire doit-il s'y reprendre à plusieurs fois pour valider sa réponse ? Pour aller plus loin sur l'entrainement de la motricité, vous proposerez un mini-jeu permetant de déplacer une bille à faire tomber dans un trou, à l'aide des capteurs de la tablette (une sorte de version electronique du [Basculo](http://lejeu-enboite.e-monsite.com/medias/images/basculo-2-1.jpg?fx=r_1200_800) par exemple).

**Profil étudiant•e•s type**: Vous n'avez pas peur d'écrire du code pour enrichir votre application avec un nouveau type de jeu différent des précédents. Vous souhaitez aller plus loin dans l'utilisation des capteurs de la tablette pour proposer une nouvelles activité à vos utilisateurs.

**Travail à réaliser**

1. Identifier comment collecter les méta-données de précision lors de la réponse aux questions du quiz (sans aucune adaptations dans une version minimale)
2. Experimentez avec les capteurs pour voir comment développer une nouvelle activité disponible pour controler une bille à l'aide des capteurs
3. Enrichissez votre visualisation pour que les aidants suive l'évolution des résidents avec les informations nouvellement collectées.

**Ressources disponibles**

  - [Sensor game tutorial](https://androidkennel.org/android-sensors-game-tutorial/) (date de 2016)
  - [Android motion sensors](https://developer.android.com/guide/topics/sensors/sensors_motion) (pour aller plus loin que juste l'acceleromètre si vousu voulez experimenter des trucs exotiques)


## Livraison

### Vidéo "vitrine"

Un des objectifs de ce cours est que vous réalisiez une application dont vous soyez fiers. Il faut donc laisser une trace de votre travail pour permettre à votre application de passer à la postérité. Vous pourrez par exemple réferer cette vidéo pour montrer un exemple de

Vous préparerez une vidéo de 3 minutes maximum, qui devra présenter : _(i)_ les personas que vous visiez pour vos adaptations et _(ii)_ une démonstration fonctionelle de votre application vis à vis de ces personas, montrant sur quels critères vous considérez que vous avez adapté l'application à leurs usages.

Pour la forme, c'est a vous de décider ce qui vous correspond le mieux. Cela peut-être des diapositives avec une voix off, une animation, une personne parlant face-caméra, ... Mais la partie _démonstration_ doit forcément reposer sur une capture vidéo de l'émulateur android. On ne cherche pas a évaluer vos talents d'acteurs ou de monteur dans cet exercice, mais bien a évlauer comment vous posez le contexte et mettez en avant les adaptations développée pour ce contexte.

**Conseils** : Ne cherchez pas à tout montrer, vous n'aurez pas le temps en 3 minutes. Identifiez les faits saillants et les bons coups en terme d'adaptation de votre produit, et concentrez votre vidéo là dessus.

Si vous souhaitez que votre vidéo soit pas publiée sur Youtube à la fin de la session, indiquez le très clairement à l'équipe enseignante avant la fin du cours.

### Entretien technique (20 minutes)

La dernière séance sera une séance plus technique que les démonstrations précédentes.

- Faire le bon produit: Vous aurez **précisément** sept (7) minutes pour présenter les fonctionalités de votre produit.
- Le faire de la bonne manière: Les treize (13) minutes restante seront des questions technique sur la mise en oeuvre de votre produit au niveau du code. Vous devrez convaincre votre évaluateur que votre produit est implémenté à un niveau de qualité raisonnable après trois itérations de développement et deux rétroactions intermédiaires.


### Github classroom

1. Continuez a travailler sur votre dépôt
2. Déposez une étiquette `L4` sur le _commit_ correspondant à votre remise pour la fin de cette séquence
  - `git tag L4`
  - `git push --tags`
3. Assurez vous de la présence de l'étiquette sur l'interface web de Github

:rotating_light: **N'oubliez pas de pousser (`git push`) votre travail au fur et a mesure de votre avancée pour ne pas rater votre livraison**

Si vous êtes satisfait de votre résultat final, nous vous encourageons fortement à basculer votre dépôt Git en _public_.

#### Consignes de livraisons :

0. Préalable :
  - L'étiquette de livraison `L4` est présente
1. Partie arrière :
  - Le code du serveur est dans le repertoire `serveur`
  - Il se lance avec un `mvn clean package jetty:run` (ou un `docker-compose up`)
2. Partie mobile :
  - Le projet Android Studio est dans le repertoire `app`
  - On peut le lancer sur un émulateur Android avec la version R de l'API et une résolution de 1200x1920
3. Vidéo : On trouve à la racine de votre dépot
  - un fichier `video.mp4` de résolution 1080p et d'une taille inférieure à 100MB. Cette vidéo de 3 minutes (180 secondes) maximum est une démonstration de votre produit qui aura vocation a être publiée sur YouTube à la fin de la session;
  - un fichier `video_descr.txt` qui contient le nom des auteurs, une courte description de votre produit, et la liste de crédits musicaux si vous en utilisez. Privilégiez des musiques libres ou des extraits courts (15-30s) pour éviter les problèmes de droit d'auteurs qui pourrait bloquer la diffusion de votre travail.
4. Extension: Si votre extension necessite des fichiers supplémentaire (voir description de l'extension), ils sont présent à la racine du dépôt.


### Grille d'évaluation pour `L4`

| Thème         | Critère                            | Poids |
| :---:         | :---                               | :---: |
| **Général**   | Couverture fonctionelle du produit | 20%   |
|               | Suivi du projet (Git, récits, ...) | 10%   |
| **Vidéo**     | Mise en contexte / Personas        | 10%   |
|               | Description des adaptations        | 20%  
| **Démonstration**  | Scénarios                     | 15%   |
|                    | Entretien technique           | 25%   |
| :rotating_light: **MALUS**     | _non respect des consignes de livraison_ | **-100%** |
