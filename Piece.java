package labyrinthe.code_squelette;

/**
 * Répresente un lieu dans le labyrinthe: une grotte, une salle, un chambre, une
 * cave, etc.
 * 
 * NB: NE PAS CHANGER CE FICHIER
 * 
 * @author Michalis Famelis
 *
 */
public class Piece {

	private int id;

	private Rencontre rencontre;

	/**
	 * Crée un nouvel objet Piece avec une Rencontre donnée.
	 * 
	 * Exemple:
	 * 
	 * <pre>
	 * Piece trésorerie = Piece(34, Rencontre.TRESOR);
	 * </pre>
	 * 
	 * @param i - numéro identificateur -- on suppose que c'est unique et que le
	 *          id==0 est reservé pour l'Exterieur
	 * @param r - un des possibles valeurs de l'enumération {@link Rencontre}
	 */
	public Piece(int i, Rencontre r) {
		this.id = i;
		this.rencontre = r;
	}

	/**
	 * Retourne ce qui peut être renontré à ce lieu.
	 * 
	 * @return - un des possibles valeurs de l'enumération {@link Rencontre}
	 */
	public Rencontre getRencontre() {
		return rencontre;
	}

	/**
	 * Une représentation très abstraite d'un Piece.
	 */
	public String toString() {
		return "<" + Integer.toString(this.id) + "-" + this.rencontre.toString() + ">";
	}

	/**
	 * Retourne le ID du Piece.
	 * 
	 * @return le id.
	 */
	public int getID() {
		return this.id;
	}

}
