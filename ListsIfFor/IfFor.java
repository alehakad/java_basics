package java_basics.ListsIfFor;

public class IfFor {
    public static void main(String[] args){
        boolean b = true;
        if (b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        String mode = "good";
        // ternary operator
        System.out.println("Mood is "+ (mode.equals("good") ? "nice" : "bad"));


        String mode1 = "nice";
        // switch case
        switch (mode1){
            case "good":
                System.out.println(5);
                break; // without break the conditions will continue to check
            case "bad":
                System.out.println(1);
                break;
            default:
                System.out.println("default");
        }

        cycle();
    }
    public static void cycle(){
        int i = 0;
        // while cycle
        while (i<5){
            i++;
            System.out.println(i);
        }
        // do while cycle
        do{
            i++;
        } while(i<10);

        // for cycle
        for (int a=0; a<i; a++){
            System.out.println(a);
        }
        // for(;;) - infinite cycle
        String[] strArr = {"a","b","c"};
        for (String arg: strArr){
            System.out.println(arg);
        }
    }
}
