import java.util.Scanner;
/**
 * Program menebak angka dari 1-100
 */
public class Tebak_Angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int)(Math.random()*100);
        int input;
        int jumlah = 0;

        do {
            jumlah++;
            System.out.print("Masukkan angka: ");
            input = sc.nextInt();

            if (input == rand) {
                System.out.printf("Congrats! Angka yang benar: %d. Setelah %d kali menebak.", rand, jumlah);
            } else if (Math.abs(input-rand) < 2) {
                System.out.println("SELISIH 1 ANGKA");
            } else if (Math.abs(input-rand) < 5) {
                System.out.println("Selisih di bawah 5 angka");
            } else if (Math.abs(input-rand) < 10) {
                System.out.println("Selisih di bawah 10 angka");
            } else if (Math.abs(input-rand) < 20) {
                System.out.println("Selisih di bawah 20 angka");
            } else {
                System.out.println("Selisihnya jauh sekali");
            }

        } while (input != rand);

        sc.close();
        System.out.println();
    }
}
