package PolaMetodyKlasyStatyczne;

public class Employee {
    int id;
    static int nextId = 1;
    static final int maxHolidayDays = 26;
    int usedHolidayDays = 0;

    final String lastName;

    Employee(String lastName) {
        id = nextId;
        nextId++;

        this.lastName = lastName;
    }

    void takeVacation(int days) {
        if (usedHolidayDays + days <= maxHolidayDays) {
            usedHolidayDays += days;
            System.out.println("Przydzielono urlop w wysokości " + days + " dni.");
        } else {
            System.out.println("Urlop przekracza liczę dostępnych dni. Dostępne dni wolne: " + (maxHolidayDays - usedHolidayDays));
        }
    }
}
