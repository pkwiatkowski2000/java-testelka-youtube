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
    @Override
    void sendMessage (String message) {
        System.out.println("Wysyłanie wiadomości do studentów");
        System.out.println(message);
    }
}
