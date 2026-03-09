import java.util.Scanner;

class CheckForPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker:");

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(num == 1){
            System.out.println("Your number is neither prime nor composite" );
        }else if(num <= 0){
            System.out.println("Your number is non natural number. Please enter a natural number.");
        }else {
            boolean isPrime = isPrime(num);

            if (isPrime) {
                System.out.println("The number is a prime number.");
            } else {
                System.out.println("The number is not a prime number");
            }
        }
    }

    public static boolean isPrime(int num){
        int factor = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                factor += 1;
            }
        }

        return factor == 2;
    }
}
