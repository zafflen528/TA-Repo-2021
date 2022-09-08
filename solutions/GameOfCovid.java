import java.util.*;

public class GameOfCovid {
    static Scanner sc = new Scanner(System.in);

    /* ghetto game of life */
    public static void main(String[] args) {
        int rows =sc.nextInt(),cols=sc.nextInt();
        sc.nextLine();
        char[][] map = new char[rows][cols];
        boolean[][] infectedMap = new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            map[i] = sc.nextLine().toCharArray();
        }

        /*solve*/
        int[][] directions ={ /* clockwise motion */
            {-1,0},// up
            {-1,1}, // up to the right
            {0,1}, // right
            {1,1}, // down to the right
            {1,0}, // down
            {1,-1}, // down to the left
            {0,-1},// left
            {-1,-1},// up to the left
        };

        for(int row=0;row<rows;row++)
            for(int col=0;col<cols;col++)
                if(map[row][col] =='p'){
                    infectedMap[row][col]=true;
                    for(int[] dir : directions){
                        int x = row+dir[0];
                        int y = col+dir[1];
                        if(x >= 0 && y >=0 && (x < rows && y < cols)){//within bounds
                            char currChar = map[x][y];
                            if(currChar == 't'){
                                infectedMap[x][y] = true;
                            }
                        }
                    }
                }
        /*print*/
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(infectedMap[i][j] ? '1':'0');
            }
            System.out.println();
        }
    }
}
