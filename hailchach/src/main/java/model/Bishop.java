package model;

import enums.Color;
import enums.PieceState;
import enums.PieceType;

/**
 * Created by anzer.moid on 16/12/18.
 */
public class Bishop extends Piece{

    public Bishop(PieceType pieceType, PieceState pieceState, Color color) {
        super(pieceType, pieceState, color);
    }
}