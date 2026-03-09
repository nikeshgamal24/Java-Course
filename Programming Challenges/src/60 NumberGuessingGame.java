import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String [] args){
        int num = 5, guess;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Guess a number between 5 to 100: ");
            guess = input.nextInt();
        }while(!(guess == num));
        System.out.println("Congratulation on guessing the number correctly");
    }
}
