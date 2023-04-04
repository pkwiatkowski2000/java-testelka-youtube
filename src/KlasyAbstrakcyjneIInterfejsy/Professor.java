package KlasyAbstrakcyjneIInterfejsy;

class Professor extends User {

    Professor (String username, String password) {
        super(username, password);

    }

    void giveNotes() {
        System.out.println("Nadaję oceny");
    }

    void cancelClass() {
        System.out.println("Odwołuję lekcje");
    }

    void sendMessage (String message) {
        System.out.println("Wysyłanie wiadomości lda studentów");
        System.out.println(message);
    }
}
