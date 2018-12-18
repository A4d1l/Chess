package util;

import enums.Color;
import model.Cell;
import model.Piece;

public class ChessUtil {

    public static void validateCell(Cell cell) {
        if(!(0 <= cell.getXPosition() && cell.getXPosition() <= 7 && 0 <= cell.getYPosition() && cell.getYPosition() <= 7)) {
            //TODO: throw some exception
        }

    }

    public static void validateCurrentPlayer(Color currentPlayer, Piece piece) {
        if(currentPlayer != piece.getColor()) {
            //TODO: throw some exception
        }
    }

    public static void validateSamePiece(Piece startPiece, Piece endPiece) {
        if(endPiece != null && startPiece.getColor() == endPiece.getColor()) {
            //TODO: throw some exception
        }
    }

}
