package GamingProcess;
import java.util.Map;

public class MovingPieces {

    private String fromPiece;
    private String toPiece;

    private int fromPieceidx;
    private int toPieceidx;

    public MovingPieces(String fromPiece, String toPiece) { this.fromPiece = fromPiece; this.toPiece = toPiece; }

    public int getToPieceidx() { return toPieceidx; }
    public void setToPieceidx(int toPieceidx) { this.toPieceidx = toPieceidx; }

    public int getFromPieceidx() { return fromPieceidx; }
    public void setFromPieceidx(int fromPieceidx) { this.fromPieceidx = fromPieceidx; }

    final public int[] StringToIndex(String alph, int i) {
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

        Map<Integer, Integer> intConvertFromStringToIndex = Map.of(
                8, 0,
                7, 1,
                6, 2,
                5, 3,
                4, 4,
                3, 5,
                2, 6,
                1, 7
        );

        int[] positions = new int[2];
        positions[0] = stringConvertFromStringToIndex.get(alph);
        positions[1] = intConvertFromStringToIndex.get(i);

        return positions;

    }

}
