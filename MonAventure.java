package labyrinthe.soumission;

import labyrinthe.code_squelette.Exterieur;
import labyrinthe.code_squelette.Labyrinthe;
import labyrinthe.code_squelette.Piece;

public class MonAventure implements Labyrinthe {
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

}
