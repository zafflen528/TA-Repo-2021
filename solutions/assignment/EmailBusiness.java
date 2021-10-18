import java.util.Scanner;

public class EmailBusiness {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String email = sc.next();
        String username = sc.next();
        String givenName = sc.next();
        int basePrice = sc.nextInt();

        String domain = email.substring(email.indexOf('@')+1, email.length());
        String topLevelDomain = domain.substring(domain.indexOf('.'),domain.length());
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

