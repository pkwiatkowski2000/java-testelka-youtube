package KlasyAbstrakcyjneIInterfejsy;

class Student extends User {

    Student( String username, String password) {
        this.username = username;
        this.password = password;
    }

    void checkNotes() {
        System.out.println("Sprawdzam oceny");
    }

    void skipClass() {
        System.out.println("Idę na wagary");
    }
}
