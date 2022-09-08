import java.util.*;

public class MyPreUAP {
    static Scanner sc = new Scanner(System.in);

    static char[][] convBool(boolean[][] map,int w,int h){
        char[][] res = new char[w][h];

        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                res[i][j]= map[i][j] ? 'H' : 'O';
            }
        }
        return res;
    }

    static char[][] kemanaSiRobot(int n,String[] perintah, int a, int b){
        int x =0,y=0;
        boolean[][] map = new boolean[a][b];
        for(String order: perintah){
            switch(order){
                case "up": x--;break;
                case "down":x++;break;
                case "left":y--;break;
                case "right":y++;break;
            }
        }
        if(x >=0 && y>= 0 && x <a && y < b)
            map[x][y] = true;

        return convBool(map,a,b);
    }

    /*
     *DILARANG MENGEDIT DI BAWAH INI
     */
    public static void main(String[] args) {
            //System.out.println("inputs n , a, b,and instructions");
            int nMoves = sc.nextInt();
            int n = sc.nextInt(),m = sc.nextInt();

            String[] instructions = new String[nMoves];
            char[][] map = new char[n][m];

            //System.out.println("input instructions");
            sc.nextLine(); /* good measures */
            for(int i=0;i<nMoves;i++){
                instructions[i] = sc.nextLine();
            }

            map = kemanaSiRobot(nMoves,instructions,n,m);


            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }

    }
}
