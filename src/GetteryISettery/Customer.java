package GetteryISettery;

public class Customer {
    private String name;
    private String lastName;
    private int age;
    private Address address;

    public Address getAddress() {
        return copy(address);
    }

    public void setAddress(Address addressParameter) {
        address = copy(addressParameter);
    }

    public void setAge(int ageParameter) {
        if (ageParameter < 0) {
            throw new IllegalArgumentException("Age can't be negative number");
        }
        age = ageParameter;
    }

    public int getAge() {
        return age;
    }

    private Address copy(Address addressToCopy) {
        Address address = new Address(addressToCopy.getCity(), addressToCopy.getStreet(), addressToCopy.getApartment());
        return address;
    }
}