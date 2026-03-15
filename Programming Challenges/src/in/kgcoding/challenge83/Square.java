package in.kgcoding.challenge83;

public class Square extends Shape{
    private final long side;

    Square(long side){
        this.side = side;
    }

    public long getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return Math.pow(this.side,2);
    }
}
