import java.util.Scanner;

public class A{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(Math.min(Math.min(a,b),Math.min(c,d)));
    }
}
