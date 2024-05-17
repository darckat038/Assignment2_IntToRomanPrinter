////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static String[] unita = {"","I","II","III","IV","V","VI"};

    public static String convert(int number){

        //Implementazione controllo > 0 && < 7 altrimenti return errore
        if (number > 0 && number < 7){

            // Es. Se la cifra delle unità è 4 --> prendo il 5° elemento (pos 4) dell'array unita ("IV") e
            // lo aggiungo in coda alla stringa di ritorno

            return unita[number];
        }
        // Se il programma arriva qua --> non ho fatto conversioni, quindi il valore non rispetta i limiti
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}