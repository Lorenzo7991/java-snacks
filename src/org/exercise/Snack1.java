package org.exercise;
import java.util.Scanner;

/* Snack 1
* Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
* */

public class Snack1 {
    public static void main(String[] args) {
        // Inizializzo l'oggetto scanner
        Scanner scanner = new Scanner(System.in);

        // Ricevo un numero in imput dall'utente
        System.out.println("Inserisci un numero:");
        int userNumber = Integer.parseInt(scanner.nextLine());

        // Verifico tramite modulo se è pari o dispari e stampo il messaggio appropriato
        if(userNumber % 2 == 0){
            System.out.println("Il numero inserito1:" + " " + userNumber + " " + "è PARI!");
        } else {
            System.out.println("Il numero inserito:" + " " + userNumber + " " + "è DISPARI... il numero successivo è:" + " " + (userNumber + 1));
        }
    }
}
