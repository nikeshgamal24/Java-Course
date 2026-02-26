import java.util.Scanner;

//Program to take 2 inputs and calculate the sum of the the 2 numbers
public class UserInput {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println("The Sum of the two numbers is: " + sum);
    }
}
