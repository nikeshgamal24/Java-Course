import java.util.Scanner;

class Prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Prime Number Check");

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        prime(number); //method call
    }

    public static void prime(int num){
        int i = 1;
        int factor = 0;

        if(num == 1){
            System.out.println(num + " is a neither prime number nor composite");
        }else{
            while(i <= num){
                if(num % i == 0){
                    factor += 1;
                }
                i++;
            }
            if(factor == 2){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num + " is not prime number");
            }
        }
    }
}
