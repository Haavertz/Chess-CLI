import BoardChess.Board_Default;
import BoardChess.Mount_Chess;
import GamingProcess.MovingPieces;
import GamingProcess.ControllerGameWin;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Board_Default chess = new Mount_Chess().Mount_Chess_Default();
        Scanner sc = new Scanner(System.in);
        ControllerGameWin winOrLoser = new ControllerGameWin(true);

        while(winOrLoser.getWinLoser()) {
            System.out.println(chess);

            System.out.print("Movimento (ex: e2 e4): ");
            String fromString = sc.next();
            String toString = sc.next();

            int position = new MovingPieces().StringToIndex(String.valueOf(fromString.charAt(0)));
//            int positonAfter = new MovingPieces().StringToIndex(String.valueOf(toString.charAt(0)));

            System.out.println(position);
//            System.out.println(positonAfter);

            break;
        }

    }

}