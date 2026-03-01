import java.util.Scanner;

record TriangleArea() {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle");

        System.out.println("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = input.nextDouble();

        System.out.println("Area of the triangle: ");
        double triangleArea = (double) (base * height)/2;
        System.out.println("Result: " + triangleArea);
    }
}
