import java.util.Scanner;

class MinimumTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        int min = num1 < num2 ? num1 : num2;
        System.out.println("The minimum number among the two is: " + min);
    }
}
