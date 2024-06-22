package main;
import static main.Operation.*;
public class App {

    public static void main(String[] args) throws Exception {
        double x = 10.0;
        double y = 5.0;

        Operation add = Operation.PLUS;
        Operation subtract = Operation.MINUS;
        Operation multiplay = Operation.TIMES;
        Operation divide = Operation.DIVIDE;

        System.out.printf("X is %.1f and y is %.1f\n", x , y);
        System.out.println( "Addition: " + add.apply(x, y));
        System.out.println( "Subtraction: " + subtract.apply(x, y));
        System.out.println( "Multiplacation: " + multiplay.apply(x, y));
        System.out.println( "Division: " + divide.apply(x, y));
    }
}
