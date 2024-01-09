package java_basics.Exceptions;

public class SqrtException {

    public static void main(String[] args) {
        sqrt(2);
        sqrt(-1);
    }

    public static double sqrt(double x) throws java.lang.IllegalArgumentException {
        if (x < 0) {
            String s = String.format("Expected non-negative number, got %f", x);
            throw new java.lang.IllegalArgumentException(s);
        } else {
            return Math.sqrt(x);
        }
    }
}
