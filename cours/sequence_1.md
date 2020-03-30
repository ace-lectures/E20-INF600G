# Séquence 1 : Génie Logiciel Centré Utilisateur

## Avertissement d'usage

Selon les critères de l'UQAM, chaque crédit d'enseignenemt équivaut à 30h de travail personnel. Le cours INF600G est un cours de 3 crédits, et le livrable de la première séquence correspond à 15% de la note du cours. Une simple règle de trois estime l'effort attendu sur ce livrable à 13h30 de travail personnel, en addition du temps prévu à l'horaire durant les 3 semaines.

**Ne sous-estimez pas ce travail, c'est beaucoup plus difficile et long que cela n'en a l'air**, et il est important de travailler sur la durée pour pouvoir collecter de la rétro-action auprès de l'équipe enseignante afin d'améliorer votre travail. C'est un marathon de trois semaines, pas un sprint à quelques heures de la remise.

## Objectifs

  1. Comprendre les principes d'une démarche centrée utilisateurs;
  2. Caractériser des personas sur la base de la description d'une problématique;
  3. Caractériser et prioriser des récits utilisateurs pour spécifier un développement logiciel.

## Leçon introductive

:x: **TODO** ajouter intégration _slideshare_ des diapos (ou lien PDF) de la leçon introductive pour la séquence. :x:

## Travail à réaliser pour la séquence (`L1`)

### Sujet d'étude : Un quizz pour les aînés en résidence.

Dans les résidences pour aînés, le personel d'encadrement organise des activités à destination des résidents, pour animer la communauté. Ces activités servent à occuper les résidents qui pourraient trouver le temps long, mais ont aussi un rôle de suivi thérapeutique pour identifier de la manière la plus précoce possible des troubles liés à l'âge.

On s'interesse donc principalement  dans cette étude à deux classes d'utilisateurs : (i) les personnes _résidentes_ et (ii) les personnes _aidantes_ (animateurs ou animatrices, aide-soignant.e.s, ergothérapeutes, ...).

Pour permettre aux _aidant.e.s_ de se concentrer sur les résident.e.s ayant le plus de difficultés (_p.-ex._, infirmité motrice demandant un soutien au déplacement, démence sénile légère) et de leur apporter le meilleur service, il est souhaité fournir aux aînés un certains nombres d'activités sous forme numérique, en utilisant des tablettes numériques. Ceci permettra de remplir la fonction d'animation de la communauté, sans pour autant accaparer le personnel aidant.

La première de ces activités identifiée comme prioritaire pour une étude pilote est un système de _quizz_ à destination des personnes résidentes. Parmi ce public, on distingue celles et ceux qui sont a l'aise avec l'outil numérique (ils ou elles utilisent régulièrement un téléphone intelligent), et les autres qui ne sont pas du tout à l'aise avec ce type de matériel.

Un quizz est une succession de questions à choix multiple. Les questions peuvent être purement textuelles, mais aussi accompagnée d'une image, d'une vidéo, d'un enregistrement audio. Une fois le quizz terminé, les réusltats sont enregistrés et la personne résidente peut continuer à jouer, ou décider d'arrêter là.

Les quizzes défini peuvent être de deux types : collectif ou individuel. Un quizz collectif est sur un thème d'interêt pour les résident.e.s, par exemple le sport, l'histoire, la culture générale, ... Ces quizzes peuvent être proposés aux résident.e.s par les aidant.e.s, qui peuvent aussi en ajouter de nouveaux. Les quizz individuels sont définis spécifiquement pour un ou une résidente en particulier. Ces quizzes sont définis en collaboration avec leurs familles, sur des événements d'importance pour eux. Ces quizzes personalisés sont particulièrement interessant pour maintenir un lien mémoriel, et par exemple identifier des signes précoces de confusion parmis les personnes résidentes.

Du coté du personel aidants, en plus de la possibiliter d'ajouter et de recommander de nouveaux quizzes, la surveillance des résidents est très importante. Ils espèrent pouvoir utiliser les données collectées par l'application pour suivre la population résidente, par exemple en identifiant que le taux de bonnes réponses d'un certain résident est en déclin sur des thématiques où il était réputé être un connaisseur il y a peu.  Le nombre de quizz commencé mais non terminés est aussi un indicateur interessant pour le suivi des résidents. L'utilisation du support numérique peut aussi identifier des tremblements physiques anonciateur de troubles moteurs, des problématiques de vue (la personne ne clique plus vraiment là où il faut dans l'interface), ... Ces informations sont pertinentes pour le personel aidant, qui peut adapter une prise en charge thérapeutique au plus tôt (p.-ex., avec un ergothérapeute ou un physiothérapeute pour travailler un problème moteur en train de s'installer).

Le vieillissement entrainant des problèmes au long cours, on souhaite aussi pouvoir adapter l'application aux problèmes que pourra rencontrer une personne résidente au cours de son séjour dans la résidence. Par exemple une personne souffrant d'un trouble évolutif de la vision  (_p.-ex_, dégénérescence maculaire liée à l'âge, DMLA) pourra dans un premier temps utiliser une version adaptée de l'application (_p.-ex._ réponses plus grosses, non situées au centre pour une DMLA, ...), pour au final basculer sur une version entièrement audio du système. Certaines adaptations interagissent avec la mécanique même du système de quizz : par exemple, pour des personnes atteinte de sénilité légère, les recommandations sont d'encourager la personne jusqu'à ce qu'elle trouve la bonne réponse plutôt que d'afficher une erreur (par exemple en restant sur la même question mais en enlevant la mauvaise réponse qui vient d'être selectionnée), et de se concentrer sur des quizzes individuels pour stimuler sa mémoire en lien avec des évenements familiaux.

Une autre problématique liée à l'âge est l'apparition de troubles qui sont mineurs en isolation, mais qui s'accumulent et rendent difficile l'utilisation d'une l'application informatique : vue qui baisse, précision des gestes moindres, plus grand temps de changement de contexte, ... Parmi les adaptations disponible pour les personnes résidentes, il est important de se poser la question de leur composition.

**Dans le cadre de la première séquence, votre travail est de produire une analyse fonctionnelle de ce sujet d'étude** :

  1. caractériser les personnas évoluant dans ce domaine;
  2. identifier les récits utilisateurs (_user stories_);
  3. les estimer (sur deux axes : valeur métier et risque technique);
  4. et proposer un ensemble de récits qui constituerait le contenu d'un produit minimal et viable.

En plus de la description du sujet, vous êtes invités :

  - A lire les étude du CEFRIO donné dans la bibliographie du cours pour vour aider à raffiner vos personas;
  - A utiliser le canal `#sequence1` du slack du cours pour poser des questions.


### Livraison du travail (Github classroom)

  1. Acceptez le travail _individuel_ sur Github classroom (compte github requis)
  2. Une fois le travail accepté, vous trouvez 3 fichiers à la racine de votre dépôt git :
    - `personas.md` : pour la description de vos personas
    - `backlog.md` : pour la description de votre _backlog_ (vos récits utilisateurs et votre produit minimal viable)
    - `journal.md` : séance par séance, ce que vous avez fait durant le déroulement du projet
  3. Le contenu de votre dépôt sera automatiquement récupéré à la date de livraison par un script.

:rotating_light: **N'oubliez pas de pousser (`git push`) votre travail au fur et a mesure de votre avancée pour ne pas rater votre livraison**

### Grille d'évaluation pour `L1`

| Thème         | Critère                      | Poids |
| :---:         | :---                         | :---: |
| **Général**   | Qualité rédactionelle        | 10%   |
|               | Respect des gabarits         | 5%    |
| **Personas**  | Couverture du domaine        | 10%   |
|               | Pertinence                   | 15%   |
| **_Backlog_** | Couverture fonctionnelle     | 15%   |
|               | Cohérence taille/estimé      | 15%   |
|               | Pertinence des récits        | 20%   |
|               | Adéquation du _MVP_ au sujet | 10%   |
| :rotating_light: **MALUS**     | _non respect des consignes de livraison_ | **-100%** |
