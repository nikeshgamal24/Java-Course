package in.kgcoding.challenge83;

public class Circle extends Shape{
    private final float radius;

    Circle(float radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }
}
