package BoardChess;

public class Mount_Chess extends Board_Default {

    public Board_Default Mount_Chess_Default() {

        Board_Default chess = new Board_Default();
        chess.setPieceOp(0,0, Piece.ROOK_WHITE);
        chess.setPieceOp(0,1, Piece.KNIGHT_WHITE);
        chess.setPieceOp(0, 2, Piece.BISHOP_WHITE);
        chess.setPieceOp(0, 3, Piece.QUEEN_WHITE);
        chess.setPieceOp(0, 4, Piece.KING_WHITE);
        chess.setPieceOp(0, 5, Piece.BISHOP_WHITE);
        chess.setPieceOp(0,6, Piece.KNIGHT_WHITE);
        chess.setPieceOp(0,7, Piece.ROOK_WHITE);

        chess.setPieceOp(7,0, Piece.ROOK_BLACK);
        chess.setPieceOp(7,1, Piece.KNIGHT_BLACK);
        chess.setPieceOp(7, 2, Piece.BISHOP_BLACK);
        chess.setPieceOp(7, 3, Piece.QUEEN_BLACK);
        chess.setPieceOp(7, 4, Piece.KING_BLACK);
        chess.setPieceOp(7, 5, Piece.BISHOP_BLACK);
        chess.setPieceOp(7,6, Piece.KNIGHT_BLACK);
        chess.setPieceOp(7,7, Piece.ROOK_BLACK);

        for (int i = 0; i < 8; i++) {
            chess.setPieceOp(1, i, Piece.PAWN_WHITE);
        }
        for (int i = 0; i < 8; i++) {
            chess.setPieceOp(6 , i, Piece.PAWN_BLACK);
        }

        return chess;

    }

}
