package KlasyAbstrakcyjneIInterfejsy;

class Student extends User {

    Student( String username, String password) {
        super(username, password);
    }

    void checkNotes() {
        System.out.println("Sprawdzam oceny");
    }

    void skipClass() {
        System.out.println("Idę na wagary");
    }
}
