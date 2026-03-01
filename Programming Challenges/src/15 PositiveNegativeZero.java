import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println(num + " is positive number.");
        }else if(num < 0 ){
            System.out.println(num + " is negative number.");
        }else{
            System.out.println(num + " is zero.");
        }
    }
}
