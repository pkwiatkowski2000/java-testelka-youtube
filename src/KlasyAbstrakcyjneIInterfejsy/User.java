package KlasyAbstrakcyjneIInterfejsy;

class User {

    String username;
    String password;
    String name;
    String lastName;

    void login (String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Logowanie użytkownika: " + username + "/" + password);
        } else System.out.println("Nieprawidłowe hasło i/lub nazwa użytkownika");
    }

    void logout() {
        System.out.println("Wylogowywanie");
    }
}
