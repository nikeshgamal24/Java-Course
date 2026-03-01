import java.util.Scanner;

class BitWiseLeftShift {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Showing BitWise Left Shift (<<) Operation");
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        // BitWise Left Shift (<<) Operation
        int result = num << 4;
        System.out.println("Bit Wise Left Shift Operation Result: " + result);
    }
}
