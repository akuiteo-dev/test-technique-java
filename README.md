# Test technique de recrutement orienté Java

Ce test technique, divisé en 3 parties a pour objectif de valider les compétences du candidat en Java.

# Environnement technique

1. Le candidat peut utiliser toutes les versions de Java à partir la version 8
1. L'environnement de développement n'est pas imposé
1. 2 librairies sont disponibles : TestNG et Guava. L'emploi d'une autre librairie est possible mais devra être justifié

# Présentation des tests

## Test 1

Le programme va prendre en entrée un tableau d'entiers.
Il doit indiquer en sortie le plus petit écart entre 2 entiers parmi tous ceux de la liste

Exemple : [1,32,5]
* Ecart entre 1 et 32 : 31
* Ecart entre 1 et 5 : 4
* Ecart entre 5 et 32 : 27

*=> Le programme va afficher 4*

## Test 2

Ce programme va prendre une chaine de caractères en entrée et doit dire si celle-ci est un palindrome.

Exemples:

* "Kayak" => Oui
* "Canoë" => Non

## Test 3

Ce programme va prendre une chaine de caractères en entrée et compter le nombre de mots distincts.
Il affichera chaque mot avec le nombre d'occurrences.

Exemple: _I believe I can fly I believe I can touch the sky_ 

"I" => 4

"believe" = > 2

"can" => 2

"fly" => 1

"touch" => 1 

"the" => 1 

"sky" => 1
