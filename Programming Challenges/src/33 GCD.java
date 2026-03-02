import java.util.Scanner;

class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("GCD of two numbers");

        System.out.println("Enter first number: ");
        int first = input.nextInt();

        System.out.println("Enter second number: ");
        int second = input.nextInt();

        // method call for LCM calculator
        int gcd = gcd(first,second);
        System.out.println("Result");
        System.out.println("GVD of "+ first + " and " + second + " is " + gcd);
    }

    public static int gcd(int first, int second){
        int i = 1;
        int gcd = 1;
        while(i <= Math.min(first,second)){
            if(first % i ==0 && second % i==0){
                gcd = i;
            }
            System.out.println("GCD after each iteration: "+ gcd);
            i++;
        }
        return gcd;
    }
}
