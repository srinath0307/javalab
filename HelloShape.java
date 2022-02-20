import java.util.Scanner;

public class HelloShape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        Shape rectangle = new Rectangle(length, breadth);
        
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        Shape rightAngledTriangle = new RightTriangle(base, height);
        
        int radius = scanner.nextInt();
        Shape circle = new Circle(radius, radius);
        
        rectangle.printArea();
        rightAngledTriangle.printArea();
        circle.printArea();
       
    }
}
