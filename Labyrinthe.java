package labyrinthe.code_squelette;

/**
 * Représentation d'un labyrinthe (graphe non-orienté). La méthode
 * ajouteEntree(Exterieur out, Piece e) doit être appellée au minumum une
 * fois.
 * <p/>
 * 
 * NB: NE PAS CHANGER CE FICHIER
 * 
 * @author Michalis Famelis
 *
 */
public interface Labyrinthe {

	/**
	 * Retourne un tableau avec tous les Pieces du Labyrinthe.
	 * 
	 * @return - l'ensemble des Pieces.
	 */
	public Piece[] getPieces();

	/**
	 * Retourne le nombre total des Pieces du Labyrinthes.
	 * 
	 * @return - le nombre des Pieces.
	 */
	public int nombreDesPieces();

	/**
	 * Crée un corridor (lien) entre l'Exterieur et un Piece. Si l'un ou les
	 * deux paramètres ne font pas partie du Labyrinthe, il les ajoute. Cette
	 * méthode doit être invoquée au minimum une fois.
	 * 
	 * @param e1 - l'Exterieur (vous pouvez prendre un instance comme
	 *           Exterieur.getExterieur())
	 * @param e2 - un autre Piece
	 */
	public void ajouteEntree(Exterieur out, Piece e);

	/**
	 * Crée un corridor (lien) entre deux Pieces. Si l'un ou les deux
	 * Pieces ne font pas partie du Labyrinthe, il les ajoute.
	 * 
	 * @param e1 - un Piece
	 * @param e2 - un autre Piece
	 */
	public void ajouteCorridor(Piece e1, Piece e2);

	/**
	 * Retourne vrai si et juste si deux Pieces font partie du Labyrinthe et
	 * sont connectés via un corridor. Les corridors ne sont pas orientés.
	 * 
	 * @param e1 - un Piece
	 * @param e2 - un autre Piece
	 * @return - true si e1 et e2 sont dans le Labyrinthe et il y a un corridor
	 *         entre eux; false sinon.
	 */
	public boolean existeCorridorEntre(Piece e1, Piece e2);

	/**
	 * Retourne l'ensemble des Pieces reliés à l'Piece donné par des
	 * corridors.
	 * 
	 * Pour un Labyrinthe lab, l'appel
	 * lab.PiecesConnectes(Exterieur.getExterieur()) doit nous donner
	 * l'ensemble des entrées.
	 * 
	 * @param e - un Piece
	 * @return - un tableau des Pieces, reliés au e; null si e ne fait pas
	 *         partie du Labyrinthe
	 */
	public Piece[] getPiecessConnectes(Piece e);



}
