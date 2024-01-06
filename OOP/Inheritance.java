package java_basics.OOP;

import java.util.Objects;
import java.util.Random;

public class Inheritance {

    public static void main(String[] args){

    }

    public static class Word{
       String Hey = "Hello";

    }

    public static class RuWord extends Word{
        String Hey = "Zdorovo";
    }

    public class Animal {
        int age = 0;

        protected Word sayHello(String sound) {
            Word word = new Word();
            System.out.println(word.Hey);
            return word;
        }
    }

    public class Dog extends Animal {
        @Override
        public RuWord sayHello(String sound)

        {
            RuWord word = new RuWord();
            System.out.println(word.Hey);
            return new RuWord();
        }
    }




}
