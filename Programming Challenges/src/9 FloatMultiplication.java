import java.util.Scanner;

class FloatMultiplication {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first floating number: ");
        double first = input.nextDouble();

        System.out.println("Enter your second floating number: ");
        double second = input.nextDouble();

        System.out.println("Product of two floating points numbers is:");
        double product = first * second;
        System.out.println("Product of two floating point numbers is: " + product);
    }
}
