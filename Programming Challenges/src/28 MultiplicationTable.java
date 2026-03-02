import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        System.out.println("Multiplication table for " + num);
        multiplicationTable(num);
    }


    public static void multiplicationTable(int number){
        int i = 1;
        while(i <= 10){
            System.out.println(number + " X "+ i + " = " + (number*i));
            i++;
        }
    }
}
