package org.exercise;

/* Snack6
*   Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
*   Possibile usare solo :
*   cicli
*   chartAt
*   if / switch
*   Es. “25" come stringa deve essere convertito in intero 25.
* */
public class Snack6 {
    public static void main(String[] args) {
        // Numero rappresentato come stringa
        String numberString = "-25";

        // Variabili di appoggio
        int result = 0;
        boolean isNegative = false;
        int indexStart = 0;

        // Verifica se il numero è negativo
        char firstChar = numberString.charAt(0);
        if (firstChar == '-') {
            isNegative = true;
            indexStart = 1;
        }

        // Conversione da caratteri a intero
        for (int i = indexStart; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            if (digitChar < '0' || digitChar > '9') {
                break;
            }
            // Conversione carattere ASCII a valore numerico
            int digitValue = digitChar - '0';
            // Costruzione numero intero
            result = result * 10 + digitValue;
        }

        // Applicazione segno negativo se necessario
        if (isNegative) {
            result = -result;
        }

        System.out.println("Numero convertito: " + result);
    }
}
