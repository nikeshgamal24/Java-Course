import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.println("The absolute value of the number " + num + " is: " + result);
    }
}
