package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces; //MATRIZ DE PEÇAS

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) { //Se a qtd de linhas for menor do que 1 ou colunas menor do que 1
            throw new BoardException("Erro cheating board: there musr be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //Métodos
    public Piece piece(int row, int column){
        if (!positionExists(row, column)){ //! not, posição n existe
            throw new BoardException("Position not on the board");
        }
        return pieces[rows] [columns];
    }

    public Piece piece(Position position){
        if (!positionExists(position)){ //! not, posição n existe
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()] [position.getColumn()];
    }

    public void placePiece (Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position" + position);
        }
        pieces[position.getRow()] [position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists (int row, int column){
        return row >= 0 && rows < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){ //! not, posição n existe
            throw new BoardException("Position not on the board");
        }
       return piece(position) != null;
    }
}
