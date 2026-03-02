import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        // method call for sum of digit
        int result = sumOfDigit(num);
        System.out.println("Result:");
        System.out.println("Sum of Digit of "+ num+ " is: " + result);
    }

    public static int sumOfDigit(int num){
        int sum = 0;
//        int lastDigit;
        while(num > 0){
//            lastDigit = num % 10;
//            sum += lastDigit;
            sum += num % 10; // optimize code
            num = (int) num / 10;
        }
        return sum;
    }
}
