package GetteryISettery;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void gettersAndSettersTest() {
        Customer customer = new Customer();
        int age = 15;
        customer.setAge(15);
        System.out.println("Wiek: " + customer.getAge());
    }
    @Test
    public void gettersAndSettersObjectsTest() {

    }
}
