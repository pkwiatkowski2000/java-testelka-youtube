package KlasyAbstrakcyjneIInterfejsy;

interface Employee {

    int maxVacation = 26;
    void takeVacation (int days);
    void takeSickLeave();

    default void quitJob() {
        System.out.println("Nara!");
    }

    static void fireEmployees(Employee[] employees) {
        for (Employee employee: employees) {
            employee.quitJob();
        }
    }
}
