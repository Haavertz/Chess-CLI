package BoardChess;

public enum Piece {
    KING_WHITE("♚"),
    QUEEN_WHITE("♛"),
    ROOK_WHITE("♜"),
    BISHOP_WHITE("♝"),
    KNIGHT_WHITE("♞"),
    PAWN_WHITE("♟"),

    KING_BLACK("♔"),
    QUEEN_BLACK("♕"),
    ROOK_BLACK("♖"),
    BISHOP_BLACK("♗"),
    KNIGHT_BLACK("♘"),
    PAWN_BLACK("♙"),

    EMPTY("-");

    private final String symbol;

    Piece(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}