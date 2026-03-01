import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Fahrenheit To Celsius Converter");

        System.out.println("Enter Temperature in Fahrenheit Scale: ");
        float F = input.nextFloat();

        System.out.println("Fahrenheit To Celsius: ");
        double C =(double) (F -32) * 5.0f/9.0f;
        System.out.println("Equivalent Celsius Measurement is : " + C + "C");
    }
}
