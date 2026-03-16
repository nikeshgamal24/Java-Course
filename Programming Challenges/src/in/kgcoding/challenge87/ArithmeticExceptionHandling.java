package in.kgcoding.challenge87;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int first = input.nextInt();

        System.out.println("Enter your second number: ");
        int second = input.nextInt();

        try{
            int result = first / second;
            System.out.println("Result is: " + result);
        }catch (ArithmeticException exception){
            System.out.println("Division by Zero occurs");
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
