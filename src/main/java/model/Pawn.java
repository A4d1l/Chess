package model;

import enums.Color;
import enums.PieceState;
import enums.PieceType;

/**
 * Created by anzer.moid on 16/12/18.
 */
public class Pawn extends Piece {
    public Pawn(PieceType pieceType, PieceState pieceState, Color color) {
        super(pieceType, pieceState, color);
    }

    /**
     * A convention should be taken such as 0th rows will have white player.
     * Using this technique, we can determine the direction of the pawn movement
     * @param startCell
     * @param endCell
     * @return
     */
    public boolean isValidMove(Cell startCell, Cell endCell){
       return (color == Color.WHITE) ? isValideMoveForWhite(startCell, endCell) : isValideMoveForBlack(startCell, endCell);
    }

    private boolean isValideMoveForWhite(Cell startCell, Cell endCell) {
        if((endCell.getXPosition() == startCell.getXPosition() + 1) &&
                Math.abs(startCell.getYPosition() - endCell.getYPosition()) <= 1)
            return true;
        return false;
    }

    private boolean isValideMoveForBlack(Cell startCell, Cell endCell) {
        if((startCell.getXPosition() == endCell.getXPosition() + 1) &&
                Math.abs(startCell.getYPosition() - endCell.getYPosition()) <= 1)
            return true;
        return false;
    }
}