package KlasyAbstrakcyjneIInterfejsy;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("student", "test123");
        student.login("student", "test123");

        User user = new Professor("profesor", "1111");
    }
}
