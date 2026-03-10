class Circle {
    static final double PI = Math.PI;

    public double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double getArea(){
        return PI * Math.pow(this.radius, 2);
    }

    double getCircumference(){
        return 2*PI*this.radius;
    }


    public static void main(String[] args){
         Circle c1 = new Circle(7);
         Circle c2 = new Circle(9);

         System.out.println("Area of the circle C1 is: " + c1.getArea());
         System.out.println("Area of the circle C1 is: " + c1.getCircumference());
         System.out.println("Area of the circle C2 is: " + c2.getArea());
         System.out.println("Area of the circle C2 is: " + c2.getCircumference());

    }
}
