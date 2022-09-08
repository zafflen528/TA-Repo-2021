import java.util.Scanner;

public class Warzone {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n =sc.nextInt();
        boolean[][] map = new boolean[n][n];
        int t = sc.nextInt();

        int[][] bombArr = new int[t][2]; //x,y
        for(int i=0;i<t;i++){
            bombArr[i][0] = sc.nextInt(); bombArr[i][1] = sc.nextInt();
        }

        for(int k=0;k<t;k++){// nuke em
            int xVal = bombArr[k][0]-1; //<- 0 based indexing
            int yVal = bombArr[k][1]-1;
            if(xVal >= 0 && yVal >= 0 && yVal < n && xVal < n) // <- check if it is within bounds
                map[xVal][yVal] = true;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((map[i][j] ? "X":"O"));
            }
            System.out.println();
        }

    }
}
