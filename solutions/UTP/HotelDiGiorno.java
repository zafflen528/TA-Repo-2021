import java.util.Scanner;

public class HotelDiGiorno {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int cost,nights, firstNights, remNights;
        double discount = 1.0;
        boolean isDiscount;
        String name;

        System.out.println("Enter name: ");
        name = sc.nextLine().toUpperCase();
        System.out.println("Enter cost per night: ");
        cost = sc.nextInt();
        System.out.println("Enter n nights: ");
        nights = sc.nextInt();

        firstNights = nights > 5 ? 5: nights;
        remNights = nights > 5 ? nights - 5 : 0;

        switch(name){
            case "BRUNO": discount -= 0.2;break;
            case "TRISH": discount -= 0.3;break;
            case "MISTA": discount -= 0.4;break;
        }

        isDiscount = discount < 1.0;

        double firstNightPrice = isDiscount ? cost*(1-discount)*firstNights : cost*firstNights;
        //System.out.println("First nights price: " + firstNightPrice);
        double remNightPrice=0;

        if(remNights > 0)
            remNightPrice = isDiscount ? (cost/2.0)*(1-discount)*remNights : (cost/2.0)*remNights;


        //System.out.println("remaining night price: " + remNightPrice);

        System.out.println("Nama: "+name);
        System.out.println("Lama penginapan: "+nights);
        System.out.println("Harga permalam: "+cost);

        if(isDiscount)
            System.out.printf("Diskon : %.0f%%%n",discount*100);
        else
            System.out.println("Tidak ada diskon");

        System.out.printf("Biaya total: %.2f%n",firstNightPrice+remNightPrice);
    }
}

