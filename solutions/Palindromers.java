import java.util.*;

public class Palindromers {
    static Scanner sc = new Scanner(System.in);

    static char[] unifyString(String s){
        return s.toLowerCase().replaceAll(" ","").toCharArray(); /* Make sure it's uniform */
    }

    static boolean palindromeOrNah(String s){
        /* Your code here */

        char[] arr = unifyString(s);
        int end = arr.length-1;
        for(int i=0;i<arr.length/2;i++)
            if(arr[i] != arr[end--])
                return false;

        return true;
    }

    /*
     *DILARANG MENGEDIT DI BAWAH INI
     */
    public static void main(String[] args) {
        String in1 = sc.nextLine();
        System.out.println((palindromeOrNah(in1) ? "IYA":"TIDAK"));
    }
}
