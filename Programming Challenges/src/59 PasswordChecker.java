import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password checker:");
        String password;
        do{
            System.out.println("Enter your password:");
            password = input.next();
        }while(!isPasswordValid(password));
        System.out.println("Thank you for checking your password with us!!!");
    }

    public static boolean isPasswordValid(String password){
        //1. is 6 character long
        if(password.length() >= 6){
            return true;
        }

        return false;
    }
}
