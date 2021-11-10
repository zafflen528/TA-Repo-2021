import java.util.Scanner;

public class CountLetter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            char in1[] = sc.nextLine().toLowerCase().toCharArray();

            int numLttr[] = new int[26]; /* <- nilai default 0, no need to fill*/

            for(int i=0;i<in1.length;i++)
                if(Character.isLetter(in1[i]))  /*<- mengabaikan angka,titik, koma, dan whitespace supaya berada di dalam range array numLttr*/
                    numLttr[in1[i]-'a']++;      /*tambah jumlah suatu huruf ke array numLttr, misal huruf 'b' - 'a' = 1, jd pada index ke-1, ditambah jumlahnya*/

            int least = Integer.MAX_VALUE, most = Integer.MIN_VALUE;
            char mostChar ='0',leastChar='0';

            for(int i =0;i<26;i++){
                /* cari huruf yg frekuensinya terbanyak */
                if(numLttr[i] > most){
                    most=numLttr[i];
                    mostChar = (char) (i+'a');
                }

                /* cari huruf yang frekuensinya terkecil */
                if(numLttr[i] <least && numLttr[i] != 0){ /*memastikan jumlah huruf yg bernilai 1*/
                    least = numLttr[i];
                    leastChar = (char) (i + 'a');
                }
            }

            System.out.println("Huruf terbanyak: "+mostChar+" dengan jumlah: "+most);
            System.out.println("Huruf paling sedikit: "+leastChar+" dengan jumlah: "+least);


    }
}
