package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long Longvalue;
        double Doublevalue;

        Longvalue = intvalue;
        System.out.println("long value is " + Longvalue);

        Doublevalue = intvalue;
        System.out.println("double value is " + Doublevalue);

        Doublevalue = 20L;
        System.out.println(Doublevalue);


    }
}
