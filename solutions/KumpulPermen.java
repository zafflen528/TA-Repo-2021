import java.util.*;
public class KumpulPermen {
    static Scanner sc = new Scanner(System.in);

    static int solveRecursive(int[][] map, int i , int j, int sz){
        if(j == sz || i < 0)
            return 0;
        int uv = solveRecursive(map,i-1,j,sz);
        int rv = solveRecursive(map,i,j+1,sz);

        return Math.max(uv,rv) + map[i][j];
    }

    static int solveIterative(int[][] map, int i , int j, int sz){
        /* TODO, blm kelar lmao */
        boolean found = false;
        int u = 0,r=0;
        while(!found){
            continue;
        }
        return 0;
    }

    public static void main(String[] args) {
        int dim = sc.nextInt();
        int[][] map = new int[dim][dim];

        for(int i=0; i<dim;i++){
            for(int j=0;j<dim;j++){
                map[i][j] = sc.nextInt();
            }
        }

        System.out.println("Recursive method");
        System.out.println(solveRecursive(map,dim-1,0,dim));
        System.out.println("Iterative method");

    }
}

