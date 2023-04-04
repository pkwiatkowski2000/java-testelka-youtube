package TypyGeneryczne;

public class Main {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(45);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(23.6);
        doublePrinter.print();

        Printer<Float> printer = new Printer<>(44.8f);
        printer.print();

        NumberPrinter<Double> numberPrinter = new NumberPrinter<>(39.2);
    }
}
