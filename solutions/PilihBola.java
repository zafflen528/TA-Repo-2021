import java.util.*;
public class PilihBola {
    static Scanner sc = new Scanner(System.in);

    static int poundSign(int n){/* faktorial */
        if(n == 0)
            return 1;
        return n * poundSign(n-1);
    }

    static int choose(int n, int r){
        return poundSign(n)/(poundSign(n-r)*poundSign(r));
    }

    static int oddBall(int n, int nAndi, int nBudi, String nama){
        /*
         * ketik kode di dalam sini, boleh menambahkan method untuk mempermudah proses.
         */
        switch(nama){
            case "Andi": return choose(n,nAndi);
            case "Budi": return choose(n,nBudi);
        }
        return 0;
    }

    /*
     *DILARANG MENGEDIT DI BAWAH INI!!1
     */

    public static void main(String[] args) {
        /* n = a, nm = b,nb=c*/
        int n = sc.nextInt();
        int nm = sc.nextInt();
        int nb = sc.nextInt();
        sc.nextLine();
        String nama = sc.nextLine();

        System.out.println(oddBall(n,nm,nb,nama));


    }
}

