package labyrinthe.soumission;

import labyrinthe.code_squelette.Aventure;
import labyrinthe.code_squelette.Exterieur;
import labyrinthe.code_squelette.Labyrinthe;
import labyrinthe.code_squelette.Piece;

public class MonAventure extends Aventure implements Labyrinthe{
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
