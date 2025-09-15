package GamingProcess;
import java.util.Map;

public class MovingPieces {

    private String fromPiece;
    private String toPiece;

    private int fromPieceidx;
    private int toPieceidx;

    public MovingPieces() { }
    public MovingPieces(String fromPiece, String toPiece) { this.fromPiece = fromPiece; this.toPiece = toPiece; }

    public int getToPieceidx() { return toPieceidx; }
    public void setToPieceidx(int toPieceidx) { this.toPieceidx = toPieceidx; }

    public int getFromPieceidx() { return fromPieceidx; }
    public void setFromPieceidx(int fromPieceidx) { this.fromPieceidx = fromPieceidx; }

    final public int StringToIndex(String alph) {
        Map<String, Integer> stringConvertFromStringToIndex = Map.of(
                "a", 0,
                "b", 1,
                "c", 2,
                "d", 3,
                "e", 4,
                "f", 5,
                "g", 6,
                "h", 7
        );
        return stringConvertFromStringToIndex.get(alph.toLowerCase());

    }


}
