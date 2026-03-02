import java.util.Scanner;

class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Armstrong Digit Program");

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean isArmstrong = isArmstrong(number);
        System.out.println(isArmstrong);
        System.out.println("Result: ");
        if(isArmstrong){
            System.out.println(number + " is an Armstrong Number");
        }else{
            System.out.println(number + " is not an Armstrong Number");
        }
    }

    public static boolean isArmstrong(int num){
        int finalNumber = 0;
        int numOfDigit = numOfDigits(num);
        int initialNumber = num;  // we are creating a copy of the initial number for later comparison
        while(num > 0){
            finalNumber  += (int)Math.pow((num % 10), numOfDigit);
            num = num / 10;
        }
       if(initialNumber == finalNumber){
           return true;
       }
       else{
           return false;
       }
    }

    public static int numOfDigits(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count ++;
        }
        return  count;
    }
}
