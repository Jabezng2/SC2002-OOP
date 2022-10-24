package F1U2P2_solution.solution;

import java.lang.Math;

public class Circle extends Point {
    protected double radius;

    public Circle(int x, int y, double radius){
        super(x, y); //super refers to parent class Point
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public String toString(){
        return super.toString();
    }
    public double area(){
        return Math.PI*Math.pow(this.radius, 2);
    }
}
