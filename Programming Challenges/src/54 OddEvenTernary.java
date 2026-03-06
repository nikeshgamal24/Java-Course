import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();

        boolean isEven = num % 2 == 0 ? true : false;
        if(isEven){
            System.out.println("The given number is even number");
        }else{
            System.out.println("The given number is odd number");
        }
    }
}
