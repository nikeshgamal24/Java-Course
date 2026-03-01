import java.util.Scanner;

class Arithmetic {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a = input.nextInt();

        System.out.println("Enter value for B: ");
        int b = input.nextInt();

        //Arithmetic Operaitons (+,-,*,/,%)
        int sum = a + b;
        int diff = a - b;
        int multiplication = a * b;
        float division = (float) b/a;
        int modulus = b % a;

        System.out.println("Result of the arithmetic operationss:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: "+ diff);
        System.out.println("Multiplication: "+ multiplication);
        System.out.println("Division: "+ division);
        System.out.println("Modulus: "+ modulus);
    }
}
