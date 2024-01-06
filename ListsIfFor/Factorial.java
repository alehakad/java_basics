package java_basics.ListsIfFor;

import java.math.BigInteger;
import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(factorial(3));
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.valueOf(1);
        while (value > 1) {
            res = res.multiply(BigInteger.valueOf(value));
            //System.out.println(res);
            value -= 1;
        }
        return res;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] resArr;
        int totalLen = a1.length + a2.length;
        resArr = new int[totalLen];
        int index1 = 0, index2 = 0;
        while ((index1 + index2) < totalLen) {
            if (index1<a1.length && (index2>=a2.length || a1[index1] <= a2[index2])) {
                resArr[index1 + index2] = a1[index1];
                index1++;
            } else {
                resArr[index1 + index2] = a2[index2];
                index2++;
            }
        }

        return resArr;

    }
}
