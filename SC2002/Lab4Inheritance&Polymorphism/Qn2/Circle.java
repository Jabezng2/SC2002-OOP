package Qn2;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override //Used to override the parent class/interface that has that same method
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}
