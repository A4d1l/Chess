package model;

import enums.Color;
import enums.PieceState;
import enums.PieceType;

/**
 * Created by anzer.moid on 16/12/18.
 */
public class Knight extends Piece {

    public Knight(PieceType pieceType, PieceState pieceState, Color color) {
        super(pieceType, pieceState, color);
    }

    public boolean isValidMove(Cell startCell, Cell endCell){
        int xPosDiff = Math.abs(startCell.getXPosition() - endCell.getXPosition());
        int yPosDiff = Math.abs(startCell.getYPosition() - endCell.getYPosition());

        if((xPosDiff == 1 && yPosDiff == 2) || (xPosDiff == 2 || yPosDiff == 1))
            return true;
        return false;
    }
}