import java.util.Scanner;

class OddSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Number Summation!!!");
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int oddSum = oddSum(number);
        System.out.println("The Sum of odd number till "+ number + " is: " + oddSum);
    }

    public static int oddSum(int num){
        int i = 1;
        int sum = 0;
        while(i < num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
