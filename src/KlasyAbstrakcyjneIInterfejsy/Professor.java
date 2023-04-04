package KlasyAbstrakcyjneIInterfejsy;

class Professor extends User implements Employee {

    Professor(String username, String password) {
        super(username, password);

    }

    void giveNotes() {
        System.out.println("Nadaję oceny");
    }

    void cancelClass() {
        System.out.println("Odwołuję lekcje");
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Wysyłanie wiadomości do studentów");
        System.out.println(message);
    }

    public void takeVacation(int days) {
        System.out.println("Wniosek o wakacje dla profesora wysłany. " +
                "Długość urlopu: " + days + " dni");
    }

    public void takeSickLeave() {
        System.out.println("Informacja o wzięciu zwolnienia lekarskiego" +
                "przez profesora wysłana");
    }
}
