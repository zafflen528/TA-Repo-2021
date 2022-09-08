import java.util.Scanner;

public class StringReverse {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        int n = s.length()-1;
        String result ="";
        if(s.length() <= 6)
            for(int i=0;i<s.length();i++)
                result += s.charAt(n--);
        else
            result = s;

        System.out.println(result);
    }
}
