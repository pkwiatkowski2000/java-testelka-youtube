package PolaMetodyKlasyStatyczne;

public class Main {
    public static void main(String[] args) {
        FunnyClass funnyClass = new FunnyClass();
        funnyClass.print();

        FunnyClass.FunnyNestedClass funnyNestedClass = funnyClass.new FunnyNestedClass();
        funnyNestedClass.print();
    }


}
