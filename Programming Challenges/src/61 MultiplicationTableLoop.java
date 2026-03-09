import java.util.Scanner;

class MultiplicationTableLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number whose multiplication table you want to do: ");
        int num = input.nextInt();
        System.out.println("Multiplication Table of " + num + " is: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " X " + (i) + " = " + (num*i));
        }
    }
}
