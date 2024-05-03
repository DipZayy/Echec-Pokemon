# Jeu d'échecs Pokémon

Projet universitaire - BUT Informatique 2023/2024
Réalisé par Louis Prévost

## Description du Projet

Ce projet a été développé dans le cadre du cours de programmation orienté objets en Java à l'université.

## Technologies Utilisées

- Langage : Java
- Bibliothèque graphique : MG2D

## Génération des Classes pour chaques Pokémon

Les 150 classes pour chacun des pokémons ont été réalisées à l'aide d'un script sh.

## Comment Jouer

1. Ouvrez un terminal dans le dossier `Code`.
2. Compilez le programme en entrant la commande suivante :
    ```
    javac Main.java
    ```
3. Lancez le jeu en entrant la commande :
    ```
    java Main
    ```

## Informations sur les Combats

Le combat se déroule comme suit :

1. Les joueurs alternent les tours jusqu'à ce que l'un des deux pokémons soit vaincu.
2. Le pokémon le plus rapide attaque en premier.
3. Les dégâts infligés par chaque attaque suivent le calcul suivant :
    ```
    Dégât de mon pokémon - Défense du pokémon adverse
    ```
4. Si le pokémon adverse survit à l'attaque, c'est à son tour d'attaquer. Sinon, la victoire est annoncée pour le premier pokémon.

---
© 2024 Louis Prévost
