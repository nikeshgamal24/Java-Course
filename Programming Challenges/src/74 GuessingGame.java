import java.util.Scanner;

class GuessingGame {
    int random;
    GuessingGame(){
      this.random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber: is the number that the user has guessed
     * @return
     *  Negative: if the guess number is lower than the actual number
     *  0 : if the guess number is correct
     *  Positive: if the guess number is higher than the actual number
     */
    int guess(int guessNumber){
        return guessNumber - this.random;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing game:");
        GuessingGame game = new GuessingGame();
        int guessNumber ,result;

        do{
            System.out.println("Guess a number: ");
            guessNumber = input.nextInt();
            result = game.guess(guessNumber);

            if(result == 0){
                System.out.println("Congratulations! Your guess is correct..."  + guessNumber);
            }else if(result < 0){
                System.out.println("Sorry! Guess higher number...");
            }else{
                System.out.println("Sorry! Guess lower number...");
            }
        }while(result != 0);
    }
}
