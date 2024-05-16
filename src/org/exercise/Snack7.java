package org.exercise;
import java.util.Scanner;

/* Snack7
*   Scrivere un programma che dati dei secondi li converta in ore,
*   minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
* */


public class Snack7 {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        // User data input
        System.out.print("Enter the number of seconds to convert: ");
        int userInput= Integer.parseInt(scanner.nextLine());
        scanner.close();

        // Initializing variables and converting seconds
        int hours = userInput / 3600;
        int secondsLeft = userInput % 3600;
        int minutes = secondsLeft / 60;
        int lastSeconds = secondsLeft % 60;

        // Converted user data output
        System.out.printf("Converted time: %02d:%02d:%02d\n", hours, minutes, lastSeconds);

    }
}
