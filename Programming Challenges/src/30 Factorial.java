import java.util.Scanner;

class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        long result = factorial(number);
        System.out.println("Result: ");
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int num){
        long factorial = 1;
        while(num >= 1){
            factorial *= num;
            num--;
        }
        return factorial;
    }
}
