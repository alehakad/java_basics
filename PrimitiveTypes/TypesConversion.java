package java_basics.PrimitiveTypes;

public class TypesConversion {
    public static void main(String[] args) {
        int i = 10000;
        char c = 'a';
        float f = 10000;
        byte b = 1;

        System.out.println(i);
        System.out.println(i == f);
        System.out.println(Integer.bitCount(i) == Math.abs(i));
    }
}

/*
internal conversion:
byte->short
short->int
int->long
char-> int, long
float->double

other conversions:
byte byteValue = (byte) intValue;
int intValue = (int) doubleVal; (3.14->3)
int intValue = (int) floatVal; (converted to max int)
float floatVal = (float) largeDoubleVal; (converted to inf)

every java primitive type has a class Wrapper:


special methods of wrappers:
- Double.isNaN(doubleNaN);
- Character.isLetter("a");
...
 */