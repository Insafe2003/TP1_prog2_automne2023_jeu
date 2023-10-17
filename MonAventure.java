package labyrinthe.soumission;

import labyrinthe.code_squelette.Aventure;
import labyrinthe.code_squelette.Exterieur;
import labyrinthe.code_squelette.Labyrinthe;
import labyrinthe.code_squelette.Piece;

public class MonAventure extends Aventure implements Labyrinthe{
    // Suggestion de IntelliJ faire un constructeur MonAventure
    /**
     * Initialize une Aventure avec un Labyrinthe
     *
     * @param c - la carte de l'Aventure
     */
    public MonAventure(Labyrinthe c) {
        super(c);
    }

    @Override
    public Piece[] getPieces() {
        return new Piece[0];
    }

    @Override
    public int nombreDesPieces() {
        return 0;
    }

    @Override
    public void ajouteEntree(Exterieur out, Piece e) {

    }

    @Override
    public void ajouteCorridor(Piece e1, Piece e2) {

    }

    @Override
    public boolean existeCorridorEntre(Piece e1, Piece e2) {
        return false;
    }

    @Override
    public Piece[] getPiecessConnectes(Piece e) {
        return new Piece[0];
    } // extends ? implements?

    @Override
    public boolean estPacifique() {
        carte.getPieces(); // boucle if iterer a travers le tableau pour voir les types de pieces et returner faux
                           // quand il y a monstre ou boss et else return vrai
        return false;
    }

    @Override
    public boolean contientDuTresor() {
        return false;
    }

    @Override
    public int getTresorTotal() {
        return 0;
    }

    @Override
    public boolean contientBoss() {
        return false;
    }

    @Override
    public Piece[] cheminJusquAuBoss() {
        return new Piece[0];
    }
}
