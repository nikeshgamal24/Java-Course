import java.util.Scanner;

class BitWiseComplement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Showing BitWise Complement(~) Operation");
        System.out.println("Enter a first number: ");
        int first = input.nextInt();

        // bit wise complement operation (~)
        int result = ~first;
        System.out.println("Bit Wise Complement Operation Result: " + result);
    }
}
