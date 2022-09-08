import java.util.*;
public class FrekNoverdy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sz = 256;
        int[] countsChar = new int[sz];
        char[] par = sc.nextLine().toCharArray();
        for(int i = 0; i < par.length;i++){
            int pos = par[i];
            countsChar[pos]++;
        }

        for(int i=0; i< sz;i++){
            if(countsChar[i] > 0){
                System.out.println((char) i+": "+countsChar[i]);
            }
        }
    }
}

