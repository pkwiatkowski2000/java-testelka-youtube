package PolaMetodyKlasyStatyczne;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        System.out.println("Id pracownika pierwszego: " + employee1.id);
        System.out.println("Id pracownika drugiego: " + employee2.id);
        System.out.println("Id pracownika trzeciego: " + employee3.id);

//        System.out.println("Następne id to: " + employee3.nextId);
        System.out.println("Następne id to: " + Employee.nextId);
    }
}
