package Qn2;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int shapesNumber = 0;
        int shapesSel = 0;

        System.out.println("Enter the total number of shapes: ");
        shapesNumber = sc.nextInt();

        Shape[] shapes = new Shape[shapesNumber];

        for(int i=0; i<shapesNumber; i++){
            System.out.printf("1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n\nSelect shape %d: ", (i+1));
            shapesSel = sc.nextInt();

            switch(shapesSel){
                case 1:
                    //Square so we need length
                    System.out.println("Length: ");
                    int length = sc.nextInt();
                    shapes[i] = new Square(length);
                    break;
                case 2:
                    //Rectangle so we need length and breadth
                    System.out.println("Length: ");
                    length = sc.nextInt();
                    System.out.println("Breadth: ");
                    int breadth = sc.nextInt();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    //Circle so we need radius
                    System.out.println("Radius: ");
                    int radius = sc.nextInt();
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    //Triangle so we need base and height
                    System.out.println("Base: ");
                    int base = sc.nextInt();
                    System.out.println("Height: ");
                    int height = sc.nextInt();
                    shapes[i] = new Triangle(height, base);
                    break;
            }
        }

        double totalArea = 0;
        for(int i=0; i<shapesNumber; i++){
            totalArea += shapes[i].area();
        }

        System.out.printf("The total area is: %.2f", totalArea);
    }
}
