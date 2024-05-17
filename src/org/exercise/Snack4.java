package org.exercise;
import java.util.Scanner;

/* Snack4
 * Data in input una stringa verificare se è palindroma.
 * */

public class Snack4 {
    public static void main(String[] args) {
        // Oggetto scanner
        Scanner scanner = new Scanner(System.in);

        // Input utente
        System.out.print("Inserisci una frase: ");
        // Acquisisco l'input e lo converto in lettere minuscole
        String word = scanner.nextLine().toLowerCase();
        scanner.close();

        // Flag per validazione stringa
        boolean isPalindrome = false;

        // Validazione stringa (se è o meno palindroma)
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                // Se i caratteri corrispondenti non sono uguali, non è palindroma
                isPalindrome = false;
                break;
            } else {
                // Se i caratteri corrispondenti sono uguali, è palidroma
                isPalindrome = true;
            }
        }

        // Stampo il risultato
        if (isPalindrome) {
            System.out.println(word + " è una parola palindroma.");
        } else {
            System.out.println(word + " non è una parola palindroma.");
        }
    }
}
