import java.util.Scanner;
public class Tower {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        // SOH CAH TOA
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter theta: ");
        double theta = Math.toRadians(sc.nextDouble());
        double height = Math.ceil(Math.tan(theta)*base);
        int hyp = (int)Math.hypot(base, height);
        boolean detected = hyp<= 1000;
        System.out.println("\nTinggi gedung: "+(int)height);
        System.out.println("Jarak kamera dengan Blisk: "+hyp);
        System.out.println("Apakah Blisk terdeteksi? "+ detected );
    }
}

