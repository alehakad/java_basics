package java_basics.Exceptions;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        causeEx();

    }

    public static void causeEx() {
        Test2 test2Var = new Test2();
        Test1 test1Var = new Test1();
        Test2 ab = (Test2) test1Var;
        System.out.println(test1Var);
    }

    public static void tryEx() throws IOException {
        System.out.println("AAA");
        throw new IOException("Wrong File");
    }
}

class Test1 {
    int a = 1;
}

class Test2 extends Test1 {
    int b = 1;
}

class CalculatorException extends RuntimeException {
    public CalculatorException(String message) {
        super(message);

    }

}