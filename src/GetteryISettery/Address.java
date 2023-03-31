package GetteryISettery;

public class Address {
    private String street;
    private String postalcode;
    private String apartment;
    private String city;

    public Address(String city, String street, String apartment) {
        this.street = street;
        this.apartment = apartment;
        this.city = city;
    }

    public Address(String city, String street, String apartment, String postalcode) {
        this(city, street, apartment);
        this.postalcode = postalcode;
    }

    public String getStreet() {
        return street;
    }

    public String getApartment() {
        return apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String cityName) {
        city = cityName;
    }
}
