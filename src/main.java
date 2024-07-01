import java.util.ArrayList;

class Test {

    interface Funcinterface {
        int operation(int a, int b);
    }

    private int operate(int a, int b, Funcinterface test) {
        return test.operation(a, b);
    }

    public static void main(String args[]) {
        Funcinterface add = (int x, int y) -> x + y;
        Funcinterface multiply = (int x, int y) -> x * y;
        Test t = new Test();
        System.out.println("Addtion is : " + t.operate(6, 3, add));
        System.out.println("Multiplacation is : " + t.operate(6, 3, multiply));
    }

}