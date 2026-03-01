import java.util.Scanner;
import java.lang.Math;

class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Compound Interest Calculator");

        System.out.println("Enter Principle Amount(P): ");
        float P = input.nextFloat();
        System.out.println("Enter Time Period(T): ");
        float T= input.nextFloat();
        System.out.println("Enter Rate of interest(R): ");
        float R = input.nextFloat();

        System.out.println("Simple Interest: ");
        double CI = P * Math.pow((1 + R/100),T);

        System.out.println("Result: "+CI);
    }
}
