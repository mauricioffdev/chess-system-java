package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //Apenas para enfatizar, pois por padrão do Java já seria null.
    }

    protected Board getBoard() {
        return board;
    }
}
