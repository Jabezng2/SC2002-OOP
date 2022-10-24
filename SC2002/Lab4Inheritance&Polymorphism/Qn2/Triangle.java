package Qn2;

public class Triangle implements Shape{
    private int height;
    private int base;

    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double area(){
        return 0.5*base*height;
    }
}
