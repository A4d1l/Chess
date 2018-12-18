package model;


import enums.Color;
import enums.PieceState;
import enums.PieceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by anzer.moid on 16/12/18.
 */


@AllArgsConstructor
@Getter
public class Piece {
    protected PieceType pieceType;
    @Setter
    protected PieceState pieceState;
    protected Color color;

    protected boolean validateMove(){
        return true;
    }
    protected List<Cell> possibleMoves(){
        return null;
    }


}
