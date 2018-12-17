package model;

import enums.Color;
import enums.PieceState;
import enums.PieceType;

import java.util.List;

/**
 * Created by anzer.moid on 16/12/18.
 */
public class Rook extends Piece {

    public Rook(PieceType pieceType, PieceState pieceState, Color color) {
        super(pieceType, pieceState, color);
    }

    protected boolean validateMove(){
        return true;
    }

    protected List<Cell> possibleMoves(){
        return null;
    }
}
