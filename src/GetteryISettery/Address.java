package GetteryISettery;

public class Address {
    private String street;
    private String apartment;
    private String city;

    public Address(String cityName, String streetName, String apartmentNumber) {
        street = streetName;
        apartment = apartmentNumber;
        city = cityName;
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
