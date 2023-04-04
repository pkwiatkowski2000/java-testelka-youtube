package KlasyAbstrakcyjneIInterfejsy;

interface Employee {

    int maxVacation = 26;
    void takeVacation (int days);
    void takeSickLeave();

    default void quitJob() {
        printBye();
    }

    static void fireEmployees(Employee[] employees) {
        for (Employee employee: employees) {
            employee.quitJob();
        }
    }

    private void printBye() {
        System.out.println("Nara!");
    }
}
