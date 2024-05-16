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
        while (true){
            System.out.println("Inserisci una parola: (o 0 per uscire)");
            word = scanner.nextLine().toLowerCase();

            if (word.equals("0")){
                System.out.println("Programma terminato");
                break;
            } else {
                int totalChar = word.length();
                int totalSimbols = 0;
                // Iterazione conteggio simboli tramite regex
                for (int i = 0; i < word.length(); i++){
                    char character = word.charAt(i);
                    if (!Character.toString(character).matches("[a-zA-Z0-9]")){
                        totalSimbols++;
                    }
                }

                System.out.println("Numero totale di caratter:" + totalChar);
                System.out.println("Numero di simboli non alfanumerici:" + totalSimbols);
            }
        }

        // Chiusura dello scanner quando non è più necessario
        scanner.close();
    }
}
