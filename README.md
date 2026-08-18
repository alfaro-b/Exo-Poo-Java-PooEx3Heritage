# Exercice 3 - POO Java : Héritage

## Présentation

Projet réalisé dans le cadre d'un exercice de programmation orientée objet en Java consacré principalement à l'héritage.

## Résumé de l'exercice

### Exercice 3.1 - `Capital` hérite de `City`

Création d'une classe `Capital` héritant de `City`.

Une capitale possède les caractéristiques d'une ville avec en plus un monument.

Création et affichage de plusieurs capitales avec utilisation des accesseurs et redéfinition de `toString()`.

### Exercice 3.2 - `Employee` hérite de `Person`

Création d'une classe `Employee` héritant de `Person`.

Un employé possède en plus :

* une entreprise ;
* un salaire.

La ville de naissance d'un employé peut être une `City` ou une `Capital`.

### Exercice 3.3 - Classe `Commercial`

Création d'une classe `Commercial` héritant de `Person`.

Un commercial travaille pour une entreprise et possède une rémunération basée sur un pourcentage du chiffre d'affaires mensuel.

### Exercice 3.4 - Contrôle des valeurs

Ajout de contrôles afin d'empêcher certaines valeurs incorrectes, notamment :

* un salaire négatif ;
* un pourcentage du chiffre d'affaires négatif.

Des valeurs minimales par défaut sont utilisées.

### Exercice 3.5 - Modification de l'affichage

Modification de l'affichage afin de ne plus afficher la population de la ville de naissance.

### Exercice 3.6 - Tableau et liste d'objets

Création d'une classe `TestEntities` permettant de stocker et parcourir plusieurs objets `Employee` et `Commercial` :

* dans une liste d'objets.

### Exercice 3.7 - Calcul de la rémunération

Ajout d'une méthode de calcul de rémunération adaptée à chaque type de personne :

* pour un `Employee` : salaire après déduction des charges ;
* pour un `Commercial` : rémunération calculée à partir d'un pourcentage du chiffre d'affaires.

La classe `Person` ne peut plus être instanciée directement et sert de classe parent aux différentes catégories de personnes.
