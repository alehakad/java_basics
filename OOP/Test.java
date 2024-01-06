package java_basics.OOP;

public class Test {
    int x;
    static int oil;
    final static int iok = 10;
    public Test(){
        System.out.println("constructor");
        x = 5;
        final int y = 3;
    }

    public static void main(String[] args){
        Test test = new Test();
        System.out.println(test.x);
    }

    public final void method(final int x){
        System.out.println("method");
    }

    final class Inner{};
}
