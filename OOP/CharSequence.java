package java_basics.OOP;

public class CharSequence {

    public static void main(String[] args) {

    }
}

class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] bytes;

    public AsciiCharSequence(byte[] bytesArray) {
        bytes = bytesArray.clone();

    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int i) {
        char aByte = (char)(bytes[i]);
        return aByte;
    }

    @Override
    public java.lang.CharSequence subSequence(int i, int i1) {
        int length = i1 - i;
        byte[] subArray = new byte[length];
        System.arraycopy(bytes, i, subArray, 0, length);
        return new AsciiCharSequence(subArray);
    }

    @Override
    public String toString(){
        return new String(bytes);
    }


}

class Main {

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 35; // ????
        System.out.println(answer.toString());//Hello!
    }

}