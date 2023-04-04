package KlasyAbstrakcyjneIInterfejsy;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("student", "test123");
        student.login("student", "test123");


        Employee employee = new Professor("profesor", "test123");

        Professor employee1 = new Professor("profesor", "test123");

        System.out.println(Employee.maxVacation);

        Professor professor = new Professor("profesor", "test123");
        Professor professor2 = new Professor("profesor", "test123");
        Professor professor3 = new Professor("profesor", "test123");
        professor.quitJob();


        Employee[] employees = {professor, professor2, professor3};

        Employee.fireEmployees(employees);
    }
}


