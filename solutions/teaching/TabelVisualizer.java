import java.util.Scanner;

public class TabelVisualizer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        System.out.println("\tkolom");
        System.out.print("   "); // empty header
        for (int nKolom = 1; nKolom <= n; nKolom++) {
            System.out.print(nKolom+" ");
        }
        System.out.println();

        for(int baris =1; baris<=n;baris++){
            System.out.print(baris+"  ");
            for(int kolom =1; kolom <=n;kolom++){
                System.out.print("# ");
            }
            System.out.println();
        }

        String kata = "baris";
        System.out.println();
        for(int baris=1;baris <=kata.length();baris++){
            System.out.println(String.valueOf(kata.charAt(baris-1)));
        }
    }
}
