package main;

// Define an interface
interface Shape {
    double calculateArea();
}

// Define an enum implementing the Shape interface
enum ShapeType implements Shape {
    SQUARE {
        @Override
        public double calculateArea() {
            double side = 5;
            return side * side;
        }
    },
    CIRCLE {
        @Override
        public double calculateArea() {
            double radius = 3;
            return Math.PI * radius * radius;
        }
    },
    RECTANGLE {
        @Override
        public double calculateArea() {
            double length = 4;
            double width = 6;
            return length * width;
        }
    };
}

public class Main {
    public static void main(String[] args) {
        ShapeType type = ShapeType.SQUARE;
        System.out.println("Area of square: " + type.calculateArea());

        type = ShapeType.CIRCLE;
        System.out.println("Area of circle: " + type.calculateArea());
        
        type = ShapeType.RECTANGLE;
        System.out.println("Area of rectangle: " + type.calculateArea());
    }
}