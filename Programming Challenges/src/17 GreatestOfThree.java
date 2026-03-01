import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number A:");
        int a = input.nextInt();

        System.out.println("Enter first number B:");
        int b = input.nextInt();

        System.out.println("Enter first number C:");
        int c = input.nextInt();

        if( a > b && a > c){
            System.out.println(a + " is the greatest among the three.");
        }else if(b > c){
            System.out.println(b + " is the greatest among the three");
        }else{
            System.out.println(c + " is the greatest among the three");
        }
    }
}
