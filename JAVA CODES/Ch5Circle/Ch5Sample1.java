package Ch5Circle;
import java.util.*;
class Ch5Sample1 {
public static void main(String[] args) {
double radius, circumference, area;
Ch5Circle circle;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter radius: ");
radius = scanner.nextDouble();
circle = new Ch5Circle(radius);
circumference = circle.getCircumference();
area = circle.getArea();
System.out.println("Input radius: " + radius);
System.out.println("Circumference: " + circumference);
System.out.println("Area: " + area);
}
}
