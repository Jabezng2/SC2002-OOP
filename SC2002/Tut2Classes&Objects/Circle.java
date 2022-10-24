import java.util.Scanner;

public class Circle {
    private double radius;
    private static final double PI = 3.14159;
    public Circle(double rad) {this.radius = rad;}
    public void setRadius(double rad) {this.radius = rad;}
    public double getRadius() {return radius;}
    public double area() {return PI*radius*radius;}
    public double circumference() {return 2*radius*PI;}
    public void printArea() {System.out.println("Area: " + area());}
    public void printCircumference() {System.out.println("Circumference: " + circumference());}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle newCircle = new Circle(0.0);
        System.out.println("==== Circle Computation ====");
        System.out.println("|1. Create a new circle    |");
        System.out.println("|2. Print Area             |");
        System.out.println("|3. Print circumference    |");
        System.out.println("|4. Quit                   |");
        System.out.println("============================");
        System.out.println("Choose option (1-3):");
        int option = sc.nextInt();
        while(true) {
            if(option == 4){System.out.println("Thank you!!"); break;}
            else{
               switch(option){
                   case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    Double radius = sc.nextDouble();
                    newCircle.setRadius(radius);
                    System.out.println("A new circle is created");
                    break;
                   case 2:
                    System.out.println("Area of circle");
                    System.out.println("Radius: " + newCircle.getRadius());
                    newCircle.printArea();
                    break;
                   case 3:
                    System.out.println("Circumference of circle");
                    System.out.println("Radius: " + newCircle.getRadius());
                    newCircle.printCircumference();
                    break;
               } 
            }
            System.out.println("Choose option (1-3):");
            option = sc.nextInt();
        }
    }
}

