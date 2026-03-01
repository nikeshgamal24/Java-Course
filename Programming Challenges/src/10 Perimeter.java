import java.util.Scanner;

class Perimeter {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter of a Rectangle");

        System.out.println("Enter length of the rectangle: ");
        double length = input.nextDouble();

        System.out.println("Enter breadth of the rectangle: ");
        double breadth = input.nextDouble();

        System.out.println("Perimeter of the Rectangle:");
        double perimeter= 2*(length+breadth);
        System.out.println("Result: "+ perimeter);
    }
}
