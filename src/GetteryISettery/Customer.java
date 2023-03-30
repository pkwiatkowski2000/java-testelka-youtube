package GetteryISettery;

public class Customer {
    private String name;
    private String lastName;
    private int age;

    public void setAge(int ageParameter) {
        if (ageParameter<0) {
            throw new IllegalArgumentException("Age can't be negative number");
        }
        age = ageParameter;
    }
}

6:30