import java.util.Scanner;
public class ComprehensivePattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int length = 27;
        for(int i =1; i <= length; i++){
            char letter = 65;
            //System.out.print(i+" - ");

            for(int j = i; j<=length;j++){
                    System.out.printf("%c",letter+(j-1)%26);

            }

            for(int j = 1; j<i;j++){
                System.out.printf(" ");
            }

            for(int j = 1; j<i;j++){
                System.out.printf(" ");
            }

            for(int j = i; j<=length;j++){
                System.out.printf("%c",letter+(j%26));
            }

            System.out.println();
        }

    }
}

