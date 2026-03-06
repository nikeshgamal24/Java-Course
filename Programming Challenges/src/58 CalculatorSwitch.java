import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter number second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter the operation you want to perform (+, -, /, *): ");
        String operation  = input.next();

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
        if(result == 0){
            System.out.println("Invalid Operation");
        }else{
            System.out.println("The " + operation + " of the two numbers is: " + result);
        }
    }

}
