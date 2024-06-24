
public class main {

    public interface Shape {
        double calculateArea();
    }

    public enum ShapeType implements Shape {
        CIRCLE {
            @Override
            public double calculateArea() {
                double radius = 5.0;
                return Math.PI * radius * radius;
            }
        },
        SQUARE {
            @Override
            public double calculateArea() {
                double side = 5.0;
                return side * side;
            }
        },
        RECTANGLE {
            @Override
            public double calculateArea() {
                double length = 5.0;
                double width = 3.0;
                return length * width;
            }
        };
    }

    public static void main(String[] args) {
        double circleArea = ShapeType.CIRCLE.calculateArea();
        double squareArea = ShapeType.SQUARE.calculateArea();
        double rectangleArea = ShapeType.RECTANGLE.calculateArea();

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
