package org.exercise;
import java.util.Random;

/* Snack2
* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
* e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
* */

public class Snack2 {
    public static void main(String[] args) {
        Random random = new Random();

        // Inizializzo gli array di nomi e cognomi
        String[] guestsNames = {"Arianna", "Lorenzo", "Alessandro", "Marco", "Emiliano"};
        String[] guestsSurnames = {"Costanzo", "Chierisini", "Semeraro", "Granata", "Gastaldo"};
        // Inizializzo gli array per tenere traccia degli invitati già selezionati
        boolean[] selectedNames = new boolean[guestsNames.length];
        boolean[] selectedSurnames = new boolean[guestsSurnames.length];
        // Flag per numero invitati
        int maxGuests = Math.min(guestsNames.length, guestsSurnames.length);

        System.out.println("Invitati della festa:");

        // Iterazione per numero massimo di invitati
        for (int i = 0; i < maxGuests; i++) {
            // Trovo un nome non ancora selezionato
            int indexRandomName;
            do {
                indexRandomName = random.nextInt(guestsNames.length);
            } while (selectedNames[indexRandomName]);

            // Trovo un cognome non ancora selezionato
            int indexRandomSurname;
            do {
                indexRandomSurname = random.nextInt(guestsSurnames.length);
            } while (selectedSurnames[indexRandomSurname]);

            // Salvo il nome e il cognome come selezionati
            selectedNames[indexRandomName] = true;
            selectedSurnames[indexRandomSurname] = true;

            // Stampiamo il nome e il cognome accoppiati
            System.out.println(guestsNames[indexRandomName] + " " + guestsSurnames[indexRandomSurname]);
        }
    }
}
