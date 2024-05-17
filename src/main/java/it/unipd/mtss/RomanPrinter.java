////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    //Costruttore con firma variabile intera
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    //Costruttore con firma variabile String -->
    //Per errore se viene passato come input una stringa, quindi non int.
    public static String print(String str){
        try {
            int num = Integer.parseInt(str);
            return printAsciiArt(IntegerToRoman.convert(num));
        } 
        catch (NumberFormatException e) {
            return "Errore: Input non numerico intero!";
        }
    }

    //Costruttore con firma variabile Double -->
    //Per errore se viene passato come input un valore dobule, quindi non int.
    public static String print(double dbl){
        try {
            if (dbl == (int) dbl) {
                return printAsciiArt(IntegerToRoman.convert((int)dbl));
            } else {
                throw new IllegalArgumentException("Errore: Input non numerico intero!");
            }
        } 
        catch (IllegalArgumentException e) {
            return "Errore: Input non numerico intero!";
        }
    }

    
    private static String printAsciiArt(String romanNumber){
        String outString = "";
        char[] romanNumber_char = romanNumber.toCharArray();
        
        //Lettera I
        String[] letter_I = {"  _____ ",
                             " |_   _|",
                             "   | |  ",
                             "   | |  ",
                             "  _| |_ ",
                             " |_____|"};

        //Lettera V
        String[] letter_V = {" __      __",
                             " \\ \\    / /",
                             "  \\ \\  / / ",
                             "   \\ \\/ /  ",
                             "    \\  /   ",
                             "     \\/    "};

        //Lettera X
        String[] letter_X = {" __   __",
                             " \\ \\ / /",
                             "  \\ V / ",
                             "   > <  ",
                             "  / . \\ ",
                             " /_/ \\_\\"};
        
        //Lettera L
        String[] letter_L = {"  _      ",
                             " | |     ",
                             " | |     ",
                             " | |     ",
                             " | |____ ",
                             " |______|"};

        //Lettera C
        String[] letter_C = {"   _____ ",
                             "  / ____|",
                             " | |     ",
                             " | |     ",
                             " | |____ ",
                             "  \\_____|"};

        //Lettera D
        String[] letter_D = {"  _____  ",
                             " |  __ \\ ",
                             " | |  | |",
                             " | |  | |",
                             " | |__| |",
                             " |_____/ "};

        //Lettera M
        String[] letter_M = {"  __  __ ",
                             " |  \\/  |",
                             " | \\  / |",
                             " | |\\/| |",
                             " | |  | |",
                             " |_|  |_|"};                          


        for (int i = 0; i < 6; i++){
            for (int j = 0; j < romanNumber.length(); j++){

                if (romanNumber_char[j]=='I'){
                    outString += letter_I[i] + " ";
                } else if ( romanNumber_char[j]=='V') {
                    outString += letter_V[i] + " ";
                } else if ( romanNumber_char[j]=='X') {
                    outString += letter_X[i] + " ";
                } else if ( romanNumber_char[j]=='L') {
                    outString += letter_L[i] + " ";
                } else if ( romanNumber_char[j]=='C') {
                    outString += letter_C[i] + " ";
                } else if ( romanNumber_char[j]=='D') {
                    outString += letter_D[i] + " ";
                } else {
                    outString += letter_M[i] + " ";
                }
            }
            outString += "\n";
        }

        return outString;
    }
}