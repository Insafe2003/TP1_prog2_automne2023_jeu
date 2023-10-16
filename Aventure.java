package labyrinthe.code_squelette;

/**
 * La representation d'une aventure.
 * <p/>
 * 
 * NB: NE PAS CHANGER CE FICHIER
 * 
 * @author Michalis Famelis
 *
 */
public abstract class Aventure {

	/**
	 * Toute aventure doit contenir une carte.
	 */
	protected Labyrinthe carte;

	/**
	 * Initialize une Aventure avec un Labyrinthe
	 * 
	 * @param c - la carte de l'Aventure
	 */
	public Aventure(Labyrinthe c) {
		this.carte = c;
	}

	/**
	 * Retourne la carte de l'Aventure.
	 * 
	 * @return la carte
	 */
	public Labyrinthe getLabyrinthe() {
		return this.carte;
	}

	/**
	 * Nous dit si l'aventure contient des méchants.
	 * 
	 * @return true si et juste si la carte de l'Aventure ne contient pas des
	 *         Rencontres avec des Rencontre.MONSTRE ou Rencontre.BOSS.
	 */
	public abstract boolean estPacifique();

	/**
	 * Nous dit si l'aventure contient du tresor.
	 * 
	 * @return true si et juste si la carte de l'Aventure contient au minimum une
	 *         Rencontre avec du Rencontre.TRESOR
	 */
	public abstract boolean contientDuTresor();

	/**
	 * Nous dit combien de Rencontre.TRESOR existent dans l'Aventure.
	 * 
	 * @return le nombre des Rencontre.TRESOR dans l'Aventure.
	 */
	public abstract int getTresorTotal();

	/**
	 * Nous dit si l'Aventure contient un boss ou plus.
	 * 
	 * @return true si et juste si l'Aventure contient une Rencontre.BOSS ou plus.
	 */
	public abstract boolean contientBoss();

	/**
	 * Retourne un chemin de l'Exterieur jusqu'au Boss. Nous faisons l'hypothèse que
	 * un Labyrinthe sera toujours construit de telle sorte qu'en commençant à
	 * l'Extérieur (ID=0) et en suivant des Pieces avec des ID croissantes, nous
	 * devrions trouver le Boss, tomber dans une boucle, ou arreter à un Piece sans
	 * sorties.
	 * 
	 * @return - une chaine des Pieces telle que chaine[0].getID()==0,
	 *         chaine[i+1].getID()=chaine[i].getID()+1 et
	 *         chaine[chaine.length-1].getEmplacement==Rencontre.BOSS; s'il n'est
	 *         pas possible de trouver le Boss, retourne un tableau vide.
	 */
	public abstract Piece[] cheminJusquAuBoss();

}
