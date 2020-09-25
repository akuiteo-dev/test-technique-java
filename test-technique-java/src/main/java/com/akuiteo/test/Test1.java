package com.akuiteo.test;

/**
 * Le programme va prendre en entrée un tableau d'entiers.
 * Il doit indiquer en sortie le plus petit écart entre 2 entiers parmi tous ceux de la liste
 * Exemple : [1,32,5]
 * Ecart entre 1 et 32 : 31
 * Ecart entre 1 et 5 : 4
 * Ecart entre 5 et 32 : 27
 * => Le programme va afficher 4
 */
public class Test1 {
	public static void main(String[] args) {
		final int input[] = { 3, 9, 50, 15, 99, 7, 98, 65 };
		// TODO à vous
		System.out.println("Résultat attendu : 1, car les 2 entiers les plus proches sont 98 et 99");
	}
}
