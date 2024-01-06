package java_basics.OOP;
import java.util.function.DoubleUnaryOperator;
public class Integrate {
    
    public static void main(String[] args){
        double res = integrate(x->1, 0, 10);
        System.out.println(res);
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double res = 0.0;
        double curVal = a;
        double step = 1e-8;
        while (curVal<=b){

            res = res + step*f.applyAsDouble(curVal);
            curVal += step;

        }
        return res;
    }
}
