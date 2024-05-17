////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static String[] unita = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private static String[] decine = {"","X","XX","XXX","XL","L"};

    public static String convert(int number){

        //Implementazione controllo > 0 && < 51 altrimenti return errore
        if (number > 0 && number < 51){
            char[] char_numero = String.valueOf(number).toCharArray();
                    
            String outString = "";

            // In base al numero di cifre del numero intero, si crea la stringa di return
            // Per il numero da restituire, si preleva il rispettivo valore dall'array di stringhe
            // e lo si aggiunge alla stringa di ritorno per comporla con le rispettive lettere romane
            // Es. Se la cifra delle unità è 4 --> prendo il 5° elemento (pos 4) dell'array unita ("IV") e
            // lo aggiungo in coda alla stringa di ritorno

            if (char_numero.length == 1) {
                // 1 sola cifra --> numero con solo unità
                outString += unita[Integer.parseInt(String.valueOf(char_numero[0]))];
            } else {        
                outString += decine[Integer.parseInt(String.valueOf(char_numero[0]))];
                outString += unita[Integer.parseInt(String.valueOf(char_numero[1]))];
            }
        
            // Terminata la composizione, ritorno la stringa finale con il numero convertito.
            return outString;
        }
        // Se il programma arriva qua --> non ho fatto conversioni, quindi il valore non rispetta i limiti     
        return "Errore: Numero non rispetta le PRE-Condizioni del Programma";
    }
}