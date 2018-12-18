package model;

import enums.Color;
import enums.PieceState;
import enums.PieceType;

/**
 * Created by anzer.moid on 16/12/18.
 */
public class Queen extends Piece {
    public Queen(PieceType pieceType, PieceState pieceState, Color color) {
        super(pieceType, pieceState, color);
    }

    public boolean isValidMove(Cell startCell, Cell endCell){

        //Check if Rook move
        if(startCell.getXPosition() == endCell.getXPosition())
            return true;
        if(startCell.getYPosition() == startCell.getYPosition())
            return true;

        // Check if Bishop move
        if(Math.abs(startCell.getXPosition() - endCell.getXPosition())
                == Math.abs(startCell.getYPosition() - endCell.getYPosition()))
            return true;

        return false;
    }
}
