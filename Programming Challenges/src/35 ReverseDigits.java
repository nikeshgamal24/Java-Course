import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse Digit Program");

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int reversedDigit = reverseDigits(number);

        System.out.println("Result: ");
        System.out.println("The Reverse Digit of " + number + " is " + reversedDigit);

    }

    public static int reverseDigits(int num){
        int reverse = 0;
        while(num > 0){
            reverse  = reverse * 10 + num % 10;
            num = num / 10;
        }
        return  reverse;
    }
}
