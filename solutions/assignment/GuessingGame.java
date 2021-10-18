import java.util.Scanner;
public class GuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int rand =  (int)(Math.random() * 10.0),input,diff;
        System.out.println(rand);
        boolean isRunning = false;
        String msg = "";
        System.out.println("Welcome to the guessing number game");

        while(!isRunning){
            System.out.println("Guess the number, from 1 - 10");
            input = sc.nextInt();
            diff = Math.abs(rand-input);
            if(diff == 0){
                msg = "Jackpot!!! Grats.";
                isRunning = true;
            }else if(diff > 0 && diff <=3){
                msg = "Guess is close";
            }else{
                msg = "Guess is too high";
            }
            System.out.println(msg);
        }
        System.out.println("Thanks for playing the guessing game!");
    }
}

