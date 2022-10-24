package Qn2;

public class Cuboid implements Shape {
    private int length, breadth, width;

    public Cuboid(int length, int breadth, int width) {
        this.length = length;
        this.breadth = breadth;
        this.width = width;
    }

    @Override
    public double area() {
        Rectangle rectangle1 = new Rectangle(length, breadth);
        Rectangle rectangle2 = new Rectangle(width, breadth);
        return 4 * rectangle1.area() + 2 * rectangle2.area();
    }
}