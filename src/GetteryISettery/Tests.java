package GetteryISettery;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void gettersAndSettersTest() {
        Customer customer = new Customer();
        int age = 15;
        customer.setAge(15);
        System.out.println("Wiek: " + customer.getAge());
        int age2 = customer.getAge();
        age2 = 22;
        System.out.println("Wiek: " + customer.getAge());
    }
    @Test
    public void gettersAndSettersObjectsTest() {
        Customer customer = new Customer();
        Address address = new Address("Kraków", "Fiołkowa", "15/22");
        customer.setAddress(address);
        Address address2 = customer.getAddress();
        System.out.println("Adres: " +
                customer.getAddress().getStreet() + " " +
                customer.getAddress().getApartment() + ", " +
                customer.getAddress().getCity());
        address2.setCity("Gdańsk");
        System.out.println("Adres: " +
                customer.getAddress().getStreet() + " " +
                customer.getAddress().getApartment() + ", " +
                customer.getAddress().getCity());
    }
}
