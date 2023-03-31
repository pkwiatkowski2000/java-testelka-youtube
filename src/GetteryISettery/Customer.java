package GetteryISettery;

public class Customer {
    private String name;
    private String lastName;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressParameter) {
        address = addressParameter;
    }

    public void setAge(int ageParameter) {
        if (ageParameter < 0) {
            throw new IllegalArgumentException("Age can't be negative number");
        }
        age = ageParameter;
    }

    public String getAge() {
        return age + " lat";
    }
}