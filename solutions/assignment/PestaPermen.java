import java.util.Scanner;
public class PestaPermen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long z = sc.nextLong();
        System.out.println(
                a % z == 0 &&
                b % z == 0 &&
                c % z ==0 &&
                (a+b+c) > 0
                );
    }
}

