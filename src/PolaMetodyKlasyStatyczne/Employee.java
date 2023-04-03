package PolaMetodyKlasyStatyczne;

public class Employee {
    int id;
    static int nextId = 1;
    int maxHolidayDays = 26;
    int usedHolidayDays = 0;

    Employee() {
        id = nextId;
        nextId++;
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
