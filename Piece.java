public class Piece {
    protected Position Position;
    private Board board;

    public Piece() {

    }

    public Piece(Board board) {
        this.board = board;
        Position = null;
    }
}