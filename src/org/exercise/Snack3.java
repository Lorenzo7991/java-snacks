package org.exercise;

/* Snack3
* Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari.
* */

public class Snack3 {
    public static void main(String[] args) {
        // Inizializzo Array di numeri interi
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Flag per somma elementi in posizione dispari
        int sum = 0;

        // Itero sull'array e sommo gli elementi in posizione dispari
        for (int i = 1; i < numbers.length; i += 2) {
            sum += numbers[i];
        }

        // Stampo la somma
        System.out.println("La somma degli elementi in posizione dispari è: " + sum);
    }
}

