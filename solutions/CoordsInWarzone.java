import java.util.Scanner;

class Coords{
    public int x;
    public int y;

    Coords(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class CoordsInWarzone {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n =sc.nextInt();
        boolean[][] map = new boolean[n][n];
        int t = sc.nextInt();

        Coords[] bombArr = new Coords[t]; //x,y
        for(int i=0;i<t;i++){
            int posx = sc.nextInt(),posy=sc.nextInt();
            bombArr[i] = new Coords(posx,posy);
            //System.out.println("x: "+bombArr[i].x+" y: "+bombArr[i].y);
        }

        // nuke em, with oop to avoid awkward sub array of length 2
        for(int k=0;k<t;k++){
            int xVal = bombArr[k].x-1; //<- turn to 0 based index
            int yVal = bombArr[k].y-1;
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
