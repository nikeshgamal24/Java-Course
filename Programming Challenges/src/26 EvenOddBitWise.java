import java.util.Scanner;

class EvenOddBitWise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Even or Odd number Bitwise");
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if((num & 1) == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}
