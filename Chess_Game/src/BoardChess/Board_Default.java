package BoardChess;

public class Board_Default {

    final private Piece[][] pieceOp = new Piece[8][8];

    public Piece[][] getPieceOp() {
        return pieceOp;
    }

    public void setPieceOp(int r, int c, Piece piece) {
        this.pieceOp[r][c] = piece;
    }

    @Override
    public String toString() {
        String xOp = "  a b c d e f g h";
        StringBuilder sb = new StringBuilder();
        for (int r = 7; r >= 0; r--) {
            for (int c = 7; c >= 0; c--) {
                if (c == 7) {
                    sb.append(r + 1).append(" ");
                }
                sb.append(pieceOp[r][c] == null ? "-" : pieceOp[r][c].getSymbol()).append(" ");
            }
            sb.append("\n");
        }
        sb.append(xOp);
        return sb.toString();
    }
}
