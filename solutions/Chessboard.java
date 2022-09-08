import java.util.Scanner;

public class Chessboard {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int len = sc.nextInt();
        for(int rows = 1;rows <=len;rows++){
            //String row ="";
            for(int cols=1; cols <=len;cols++)
                if(rows % 2 == 0)
                    if(cols % 2 == 0)
                        System.out.print(" ");
                    else
                        System.out.print("#");
                /*O(n^3)*/
                /*
                 *row += cols % 2 == 0 ? " " : "#";
                 */
                else
                    if(cols % 2 == 0)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                    /*O(n^3)*/
                    /*
                     *row += cols % 2 == 0 ? "#" : " ";
                     */

            System.out.println();
        }

    }
}
