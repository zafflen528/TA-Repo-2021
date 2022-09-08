import java.util.*;

public class PosisiRobot {
    static Scanner sc = new Scanner(System.in);

    static boolean withinBounds(int x, int y, int p, int l){
        return x >= 0 && y >=0 && (x < p && y < l);
    }

    static String posisiRobot(int n,String[] perintah, int p, int l){
        /* Your code here, boleh menambahkan method lagi utk mempermudah proses */
        int x = 0,y=0;

        for(int i=0;i<n;i++){
            switch(perintah[i]){
                case "up" : y++;break;
                case "down" : y--;break;
                case "left" : x--;break;
                case "right" : x++;break;
            }
        }

        if(withinBounds(x, y, p, l))
            return String.format("(%d,%d)", x,y);

        return "Di luar peta";
    }

    /*
     *DILARANG MENGEDIT DI BAWAH INI
     */
    public static void main(String[] args) {
        int nMoves = sc.nextInt();
        int panjang = sc.nextInt(),lebar = sc.nextInt();
        String[] instructions = new String[nMoves];

        for(int i=0;i<nMoves;i++){
            instructions[i] = sc.next();
        }
        System.out.println(posisiRobot(nMoves, instructions, panjang, lebar));

    }
}
