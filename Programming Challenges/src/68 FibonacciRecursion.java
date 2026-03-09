import java.util.Scanner;

class FibonacciRecursion {
    public static void main(String[] args){
        System.out.println("Welcome to Fibonacci Series:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth term of the series: ");
        int nTerm = input.nextInt();

        System.out.println("The fibonacci series is:");
        for(int i = 1; i <= nTerm; i++){
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int position){
        if(position == 1){
            return 0;
        }

        if(position == 2){
            return 1;
        }

        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
