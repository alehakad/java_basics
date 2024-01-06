package java_basics.PrimitiveTypes;

import java.security.MessageDigest;

public class Quiz {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
/*
 Primitive types
 1) boolean
 2) char
 3) byte, short, int (4 bytes), long
 4) float, double
 Passed by value, don't affect original variable
 All other types are referencable
 String
 null - empty reference
 in java not possible to get object address

 boolean is not converted to other types
 =! not, && and, || or, ^ xor
 short variant - &=, |=, ^=

 number types
 byte 8 -128...+127
 short 16 -2**15...+2**15-1
 int 32
 long 64
 can ve written int a = 10_000_000;
 longs are written long a = 10_000_000_000L;

 a+=b
 a++ and ++a
 overflow does throw an error byte b = 127; b++; b = -128 !!!

 there are bytes operations


 char -  16 bites 0...2**16-1
 in char unicode symbols are saved

float 32
double 64
+inf, -inf
nan != nan


to count logs, abs, max, round, min, max there is class Math
to work with doubles BigInteger and BigDecimal classes
*/
