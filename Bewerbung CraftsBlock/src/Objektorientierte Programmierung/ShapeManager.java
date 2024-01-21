import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeManager {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Beispielobjekte erstellen
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Formen zur Liste hinzufügen
        shapes.add(circle);
        shapes.add(rectangle);

        // Gesamten Flächeninhalt ausgeben
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Gesamter Flächeninhalt: " + totalArea);
    }

    private static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
