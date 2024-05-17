////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
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
                }
            }
            outString += "\n";
        }

        return outString;
    }
}