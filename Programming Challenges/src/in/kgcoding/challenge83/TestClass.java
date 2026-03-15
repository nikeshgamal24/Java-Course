package in.kgcoding.challenge83;

public class TestClass{
    public static void main(String[] args){
        Circle cir = new Circle(5);
        Square sq = new Square(5);

        System.out.println("Area of the circle is: " + cir.calculateArea());
        System.out.println("Area of the square is: " + sq.calculateArea());
    }
}
