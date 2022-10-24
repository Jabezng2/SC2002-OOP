package Qn2;

public class Cube implements Shape{
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        Square square = new Square(length); //The flat square
        return 6 * square.area();
    }
}

