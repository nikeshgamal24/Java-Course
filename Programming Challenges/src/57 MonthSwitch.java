import java.util.Scanner;

class MonthSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the month: ");
        int num = input.nextInt();

        String month = month(num);
        System.out.println("The month of the given number is: " + month);
    }

    public static String month(int num){
       return switch (num){
           case 1 -> "January";
           case 2 -> "February";
           case 3 -> "March";
           case 4 -> "April";
           case 5 -> "May";
           case 6 -> "June";
           case 7 -> "July";
           case 8 -> "August";
           case 9 -> "September";
           case 10 -> "October";
           case 11 -> "November";
           case 12 -> "December";
           default -> "Invalid";
        };
    }
}
