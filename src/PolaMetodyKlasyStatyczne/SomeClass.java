package PolaMetodyKlasyStatyczne;

public class SomeClass {

    SomeClass() {

    }
    static void staticMethod() {
        System.out.println("Jestem metodą statyczną");
    }

    void instanceMethod() {
        System.out.println("Jestem metodą niestatyczną");
        staticMethod();
    }
}
