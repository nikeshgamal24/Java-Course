import java.util.Scanner;

class LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("LCM of two numbers");

        System.out.println("Enter first number: ");
        int first = input.nextInt();

        System.out.println("Enter second number: ");
        int second = input.nextInt();

        // method call for LCM calculator
        int lcm = lcm(first, second);
        System.out.println("Result");
        System.out.println("LCM of "+ first + " and " + second + " is " + lcm);
    }

    public static int lcm(int first, int second){
        int i = 1;
//        while(i <= second){
//            int multiple = first * i;
//            if(multiple % second == 0){
//                return multiple;
//            }
//            i++;
//        }
//        return 0; //unreachable

        while(true){
            int multiple = first * i;
            if(multiple % second == 0){
                return multiple;
            }
            i++;
        }
    }
}
