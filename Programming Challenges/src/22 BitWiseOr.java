import java.util.Scanner;

class BitWiseOr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Showing BitWise Or Operation");
        System.out.println("Enter a first number: ");
        int first = input.nextInt();

        System.out.println("Enter a second number: ");
        int second = input.nextInt();

        // bit wise Or operation (|)
        int result = first | second;
        System.out.println("Bit Wise Or Operation Result: " + result);
    }
}
