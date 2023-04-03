package PolaMetodyKlasyStatyczne;

public class Employee {
    int id;
    static int nextId = 1;

    Employee() {
        id = nextId;
        nextId++;
    }
}
