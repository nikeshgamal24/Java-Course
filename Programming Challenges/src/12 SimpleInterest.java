import java.util.Scanner;

class SimpleInterest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Calculator");

        System.out.println("Enter Principle Amount(P): ");
        double P = input.nextDouble();
        System.out.println("Enter Time Period(T): ");
        double T= input.nextDouble();
        System.out.println("Enter Rate of interest(R): ");
        double R = input.nextDouble();

        System.out.println("Simple Interest: ");
        double SI = (double) (P*T*R)/100;

        System.out.println("Result: "+SI);

    }
}
