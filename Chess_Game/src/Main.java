import BoardChess.Board_Default;
import BoardChess.Mount_Chess;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Board_Default chess = new Mount_Chess().Mount_Chess_Default();
        Scanner sc = new Scanner(System.in);
        final boolean winOrLoser = true;

        while(winOrLoser) {
            System.out.println(chess);

            System.out.print("Movimento (ex: e2 e4): ");
            String fromString = sc.next();
            String toString = sc.next();

//            MovingPieces position = new MovingPieces.StringToIndex(fromString.indexOf(0));


        }

    }

}