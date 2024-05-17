////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number){

        //Implementazione controllo > 0 && < 4 altrimenti return errore
        if (number > 0 && number < 4){
            if (number == 1){
                return "I";
            } else if (number == 2){
                return "II";
            } else {
                return "III";
            }
        }
        // Se il programma arriva qua --> non ho fatto conversioni, quindi il valore non rispetta i limiti
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}