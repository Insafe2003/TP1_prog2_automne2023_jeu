package labyrinthe.soumission;

import labyrinthe.code_squelette.*;
import labyrinthe.solution.*;

public class DIROgue {

	public static void main(String[] args) {

		// Cette invocation est ici juste pour vous demontrer quelques choses
		// TODO: supprimez-l'appel a la methode expliquerQuelquesChoses() dans votre propre soumission!!
		expliquerQuelquesChoses();

	}

	/*
	 * Cette methode n'est pas necessaire pour le TP, c'est ici juste pour vous
	 * demontrer comment utiliser la classe Exterieur
	 */
	private static void expliquerQuelquesChoses() {
		// ceci est le seul facon de creer une instance de la classe Exterieur!
		Exterieur lExterieur = Exterieur.getExterieur();
		// l'exterieur contient le rencontre Rencontre.RIEN
		System.out.println(lExterieur.getRencontre() == Rencontre.RIEN);
	}

}
