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
        String [] guestsNames = {"Arianna", "Lorenzo", "Alessandro", "Marco", "Emiliano"};
        String [] guestsSurnames = {"Costanzo", "Chierisini", "Semeraro", "Granata", "Gastaldo"};

        System.out.println("Invitati della festa:");

        int randomizedNames = Math.min(guestsNames.length, guestsSurnames.length);
        for(int i = 0; i < randomizedNames; i++){
            int indexRandomName = random.nextInt(guestsNames.length);
            int indexRandomSurname = random.nextInt(guestsSurnames.length);
            System.out.println(guestsNames[indexRandomName] + " " + guestsSurnames[indexRandomSurname]);
        }
     }
}
