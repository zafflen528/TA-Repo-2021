import java.util.*;
public class Rook {
    static Scanner sc = new Scanner(System.in);

    static String goUp(char[][] b,int x,int y){
        for(int r = x; r >= 0;r--)
            if(b[r][y] == 'E')
                return String.format("%c%d",(char)y+'A',8-r);
        return "None";
    }

    static String goRight(char[][] b,int x,int y){
        for(int c = y; c < 8; c++)
            if(b[x][c] == 'E')
                return String.format("%c%d",(char)c+'A',8-x);
        return "None";
    }

    static String goDown(char[][] b,int x,int y){
        for(int r = x; r < 8;r++)
            if(b[r][y] == 'E')
                return String.format("%c%d",(char)y+'A',8-r);
        return "None";

    }

    static String goLeft(char[][] b,int x,int y){
        for(int c = y; c >=0 ; c--)
            if(b[x][c] == 'E')
                return String.format("%c%d",(char)c+'A',8-x);
        return "None";

    }

    static void solveTheRook(char[][] papan){
        /* Your code here, boleh menambahkan method untuk mempermudah proses. */
        int rRook=0,cRook=0;
        //find rook
        String up,right,down,left;
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                if(papan[i][j] == 'R'){
                    rRook = i;
                    cRook = j;
                    break;
                }

        System.out.println();
        System.out.printf("Posisi Benteng: %c%d\n",(char)cRook+'A',8-rRook);

        /* Go up, right ,down, and left */

        up = goUp(papan,rRook,cRook);
        right = goRight(papan,rRook,cRook);
        down = goDown(papan,rRook,cRook);
        left = goLeft(papan,rRook,cRook);

        System.out.printf("%s\n%s\n%s\n%s\n",up,right,down,left);
    }

    /*
     * DILARANG MENGEDIT DI BAWAH INI!!!
     */

    public static void main(String[] args) {

        char[][] board = new char[8][8];
        String rw;
        for(int i=0;i<8;i++){
            rw = sc.nextLine();
            for(int j=0;j<8;j++){
                board[i][j] = rw.charAt(j);
            }
        }
        solveTheRook(board);

    }
}

