import java.util.Scanner;

public class DiscordParser {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String input = sc.next();
        //System.out.println(input);
        //boolean containsHT = input.contains("#");
        int htIndex = input.indexOf("#");
        if(input.length() < 6 || htIndex < 0){
            System.out.println("Nama user tidak valid.");
        }else{
            String nameSubstr = input.substring(0,htIndex);
            String digitsString = input.substring(htIndex+1,input.length());

            if(nameSubstr.length() < 3 || digitsString.length() != 4){
                System.out.println("\nNama user tidak valid.");
            }else{
                System.out.println("\nUsername "+input+" valid.");
                System.out.printf("Nama: %s\nNomor ID: %s\n",nameSubstr,digitsString);

            }
        }

    }
}

