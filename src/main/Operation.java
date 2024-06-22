package main;

public enum Operation{
    PLUS{
        @Override
        public double apply(double x, double y){
            return x + y;
        }
    },
    MINUS{
        @Override
        public double apply(double x, double y){
            return x - y;
        }
    },
    TIMES{
        @Override
        public double apply(double x, double y){
            return x * y;
        }
    },
    DIVIDE{
        @Override
        public double apply(double x , double y){
            return x / y ;
        }
    };


    public abstract double apply(double x , double y);
    public static Operation fromString(String sybmol){
        switch(sybmol){
            case "+": return PLUS;
            case "-": return MINUS;
            case "*": return TIMES;
            case "/": return DIVIDE;
            default:
                throw new IllegalArgumentException("Unkown symbol: " + sybmol);
        }
    }
}