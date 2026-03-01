import java.util.Scanner;

class SwapNumbers{
    public static void main(String [] args){
        System.out.println("Swapping Numbers Program");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 ,num2 ;
        num1= input.nextInt();
        System.out.println("------------------------");

        System.out.println("Enter your second number: ");
        num2 = input.nextInt();
        System.out.println();
        System.out.println("------------------------");

        System.out.println("Before Swapping");
        System.out.println("First Number: "+ num1);
        System.out.println("Second Number: "+ num2);
        System.out.println("------------------------");

        //Swapping logic
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping");
        System.out.println("First Number: "+ num1);
        System.out.println("Second Number: "+ num2);
        System.out.println("------------------------");
    }
}