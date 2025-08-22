package BoardChess;

public class Board_Default {

    final private Piece[][] pieceOp = new Piece[8][8];

    public Piece getPieceOp() {
        return pieceOp[0][1];
    }

    public void setPieceOp(int r, int c, Piece piece) {
        this.pieceOp[r][c] = piece;
    }

    @Override
    public String toString() {
        String xOp = "  a b c d e f g h";
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (c == 0) {
                    sb.append((r + 1) + " ");
                }
                sb.append(pieceOp[r][c] == null ? "-" : pieceOp[r][c].getSymbol()).append(" ");
            }
            sb.append("\n");
        }
        sb.append(xOp);
        return sb.toString();
    }
}
