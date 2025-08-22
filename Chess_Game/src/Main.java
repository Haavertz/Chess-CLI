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
            break;
        }


    }

}
