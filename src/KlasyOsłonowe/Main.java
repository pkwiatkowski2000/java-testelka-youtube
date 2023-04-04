package KlasyOsłonowe;

public class Main {
    public static void main(String[] args) {
        int primitive = 200;
        /*Integer reference = Integer.valueOf(primitive); //boxing
        int anotherPrimitive = reference.intValue(); //unboxing

        System.out.println(reference);
        System.out.println(anotherPrimitive);*/

       /* Integer reference = primitive; //auto-boxing
        int anotherPrimitive = reference; //auto-unboxing

        Double doubleNumber = primitive;
        Double otherDoubleNumber = Double.valueOf(primitive);
        System.out.println(otherDoubleNumber);

        Double doubleNumber = 10.2;
        int intNumber = doubleNumber.intValue();
        System.out.println(intNumber);*/

        Integer number = Integer.valueOf("110");
        int otherNumber = Integer.parseInt("110");

        Float floatNumber = Float.valueOf("10.2");
        Float otherFloatNumber = Float.parseFloat("10.2");


        Integer number3 = null;
    }
}
