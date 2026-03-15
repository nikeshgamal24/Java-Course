package in.kgcoding.challenge85;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return  a + b;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();

        System.out.println("Addition of two integers: " + cal.add(12,17));
        System.out.println("Addition of three integers: " + cal.add(12,17,8));
        System.out.println("Addition of two doubles: " + cal.add(1.25,45.2));

    }
}
