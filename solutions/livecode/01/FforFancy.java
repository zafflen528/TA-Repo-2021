import java.util.Scanner;

public class FforFancy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter name, dob, exp, proffession respectively");
        String name = sc.nextLine();
        String dob = sc.nextLine();
        double expendature = sc.nextDouble(); sc.nextLine();
        String proffession = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.printf(
                "|%-18s:%18s|\n|%-18s:%18s|\n|%-18s:%17.2f$|\n|%-18s:%18s|\n",
                "Nama",name,
                "Tanggal lahir",dob,
                "Pengeluaran",expendature,
                "Pekerjaan",proffession
                );
        System.out.println("---------------------------------------");
        sc.close();
    }
}
