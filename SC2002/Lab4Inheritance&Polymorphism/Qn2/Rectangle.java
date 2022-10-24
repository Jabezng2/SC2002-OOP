package Qn2;

public class Rectangle implements Shape{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return (double)(length*breadth);
    }
}
