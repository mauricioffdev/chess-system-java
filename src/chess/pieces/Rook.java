package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

//Classe Torre
public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    //Converte na hora de imprimir Rook para R
    @Override
    public String toString(){
        return "R";
    }
}
