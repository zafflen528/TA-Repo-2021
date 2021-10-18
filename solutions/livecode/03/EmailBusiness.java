import java.util.Scanner;

public class EmailBusiness {
    static Scanner sc = new Scanner(System.in);

    //Dzikri adalah seorang developer yang sedang melihat profile orang-orang di Github. Ia penasaran mengapa mereka mempunyai situs dan email sendiri.
    //Ia sangat antusias untuk membeli domain, ia pergi ke situs DomainBros untuk membeli domain berdasarkan user Github yang ia temukan. Situs DomainBros menjual harga domain berdasarkan akhirannya (seperti .com) seharga _x_ $. Namun, terdapat beberapa akhiran domain yang harganya lebih mahal daripada harga _x_$ itu.
    //akhiran .id lebih mahal 75%, .com lebih mahal 50%, dan .net lebih mahal 25%.
    //selain ketiga akhiran tersebut, harganya adalah _x_. Setelah menentukan nama domain dan akhirannya, DomainBros memberi struk pembelian.
    //
    //
    //Terdapat masukkan email dari Dzikri dengan format yang *valid*, nama domain yang akan diberikan oleh Dzikri, dan harga domain awal (base price) dalam USD, buatlah program penerapan dari situs DomainBros tersebut.

    public static void main(String[] args){
        //System.out.println("email,username,name for domain, base price\n");
        String email = sc.next();
        String username = sc.next();
        String givenName = sc.next();
        int basePrice = sc.nextInt();

        String domain = email.substring(email.indexOf('@')+1, email.length());
        String topLevelDomain = domain.substring(domain.indexOf('.'),domain.length());
        //System.out.println(domain+" "+topLevelDomain);
        double priceMul = 1.0;
        switch(topLevelDomain){
            case ".id" :  priceMul += 0.75; break;
            case ".com" : priceMul += 0.5; break;
            case ".net" : priceMul += 0.25; break;
        }
        double result = basePrice *(priceMul);
        System.out.printf(
                "Nama email baru: %s@%s%s\nNama domain untuk Dzikri: %s%s\nTotal harga pembelian: %.2f$\n",
                username,givenName,topLevelDomain,givenName,topLevelDomain,result
                );
    }
}


