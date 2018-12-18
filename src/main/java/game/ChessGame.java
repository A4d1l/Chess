package game;

import enums.Color;
import model.Cell;
import model.Piece;
import util.ChessUtil;

/**
 * Assumptions:
 * 1. The starting row of the matrix i.e 0th row will hold the white pieces. This will ensure the pawns directions of movement
 *
 * TODO:
 * 1. How to handle the case when pawn is promoted?
 * 2. How to handle the case when a piece can't be moved because it will lead to check on King?
 * 3. How to handle the case when a piece can't be moved because the King is already in check
 */
public class ChessGame {

    private Piece[][] chessBoard;

    private Color currentPlayer;

    //TODO: initialize the chessBoard placing the pieces
    public ChessGame() {
        chessBoard = new Piece[8][8];
        currentPlayer = Color.WHITE;
    }

    public void makeMove(Cell startCell, Cell endCell) {
        ChessUtil.validateCell(startCell);
        ChessUtil.validateCell(endCell);

        Piece startPiece = chessBoard[startCell.getXPosition()][startCell.getYPosition()];
        Piece endPiece = chessBoard[endCell.getXPosition()][endCell.getYPosition()];

        ChessUtil.validateCurrentPlayer(currentPlayer, startPiece);
        ChessUtil.validateSamePiece(startPiece, endPiece);

        validateMove(startPiece, endPiece, startCell, endCell);

        // place the start piece in destination cell
        chessBoard[endCell.getXPosition()][endCell.getYPosition()] = startPiece;
        //change the player turn
        currentPlayer = currentPlayer == Color.WHITE ? Color.BLACK : Color.WHITE;

    }

    /**
     * TODO: for every case there should be a private method to handle it?
     * @param startPiece
     * @param startCell
     * @param endCell
     */
    private void validateMove(Piece startPiece, Piece endPiece, Cell startCell, Cell endCell) {

        if(!startPiece.isValidMove(startCell, endCell)) {
            //Throw exception
        }

        switch (startPiece.getPieceType()) {

            case KING:
                //This does not requires any validation as King only moves one step and that has been validated
                break;

            case PAWN:

                break;

            case ROOK:
                break;

            case QUEEN:
                break;

            case BISHOP:
                break;

            case KNIGHT:
                break;

            default:
        }
    }

}
