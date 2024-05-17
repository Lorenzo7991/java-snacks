package org.exercise;
import java.util.Scanner;

/* Snack5
*  Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
*  quanti numeri e quanti simboli non alfanumerici.
*  Continuare a chiedere una nuova stringa finchè non si inserisce 0.
* */

public class Snack5 {
    public static void main(String[] args) {
        // Oggetto scanner
        Scanner scanner = new Scanner(System.in);
        String word;

        // Iterazione Input utente con condizione di uscita "0"
        while (true) {
            System.out.println("Inserisci una parola: (o 0 per uscire)");
            word = scanner.nextLine();

            if (word.equals("0")) {
                System.out.println("Programma terminato");
                break;
            } else {
                int totalChars = 0;
                int totalNumbers = 0;
                int totalSymbols = 0;

                // Iterazione per il conteggio dei diversi tipi di caratteri
                for (int i = 0; i < word.length(); i++) {
                    char character = word.charAt(i);

                    if (Character.isLetter(character)) {
                        totalChars++;
                    } else if (Character.isDigit(character)) {
                        totalNumbers++;
                    } else {
                        totalSymbols++;
                    }
                }

                System.out.println("Numero di caratteri alfabetici: " + totalChars);
                System.out.println("Numero di numeri: " + totalNumbers);
                System.out.println("Numero di simboli non alfanumerici: " + totalSymbols);
            }
        }

        // Chiusura dello scanner quando non è più necessario
        scanner.close();
    }
}
