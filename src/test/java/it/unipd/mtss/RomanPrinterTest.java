////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrimi3() {
        
        //Test primi 3 numeri
        //1 - 2  - 3
        //I - II - III
        
        String v_1 = "  _____  \n" +
        " |_   _| \n" +
        "   | |   \n" +
        "   | |   \n" +
        "  _| |_  \n" +
        " |_____| \n";

        String v_2 = "  _____    _____  \n" + 
        " |_   _|  |_   _| \n" + 
        "   | |      | |   \n" +
        "   | |      | |   \n" +  
        "  _| |_    _| |_  \n" + 
        " |_____|  |_____| \n";

        String v_3 = "  _____    _____    _____  \n"+ 
        " |_   _|  |_   _|  |_   _| \n" + 
        "   | |      | |      | |   \n" +
        "   | |      | |      | |   \n" +
        "  _| |_    _| |_    _| |_  \n" +
        " |_____|  |_____|  |_____| \n";

        assertEquals(v_1, RomanPrinter.print(1));
        assertEquals(v_2, RomanPrinter.print(2));
        assertEquals(v_3, RomanPrinter.print(3));
    }

    @Test
    public void testPrimi6() {
        
        //Test primi 6 numeri
        //4  - 5 - 6
        //IV - V - VI

        String v_4 = "  _____   __      __ \n" +
        " |_   _|  \\ \\    / / \n" +
        "   | |     \\ \\  / /  \n" +
        "   | |      \\ \\/ /   \n" +
        "  _| |_      \\  /    \n" +
        " |_____|      \\/     \n";

        String v_5 = " __      __ \n" +
        " \\ \\    / / \n" +
        "  \\ \\  / /  \n" +
        "   \\ \\/ /   \n" +
        "    \\  /    \n" +
        "     \\/     \n";

        String v_6 = " __      __   _____  \n" +
        " \\ \\    / /  |_   _| \n" +
        "  \\ \\  / /     | |   \n" +
        "   \\ \\/ /      | |   \n" +
        "    \\  /      _| |_  \n" +
        "     \\/      |_____| \n";

        assertEquals(v_4, RomanPrinter.print(4));
        assertEquals(v_5, RomanPrinter.print(5));
        assertEquals(v_6, RomanPrinter.print(6));
    }

    @Test
    public void testPrimi10() {
        
        //Test primi 10 numeri

        String v_7 = " __      __   _____    _____  \n" +
        " \\ \\    / /  |_   _|  |_   _| \n" +
        "  \\ \\  / /     | |      | |   \n" +
        "   \\ \\/ /      | |      | |   \n" +
        "    \\  /      _| |_    _| |_  \n" +
        "     \\/      |_____|  |_____| \n";

        String v_8 = " __      __   _____    _____    _____  \n" +
        " \\ \\    / /  |_   _|  |_   _|  |_   _| \n" +
        "  \\ \\  / /     | |      | |      | |   \n" +
        "   \\ \\/ /      | |      | |      | |   \n" +
        "    \\  /      _| |_    _| |_    _| |_  \n" +
        "     \\/      |_____|  |_____|  |_____| \n";

        String v_9 = "  _____   __   __ \n" + 
        " |_   _|  \\ \\ / / \n" + 
        "   | |     \\ V /  \n" + 
        "   | |      > <   \n" + 
        "  _| |_    / . \\  \n" + 
        " |_____|  /_/ \\_\\ \n";

        String v_10 = " __   __ \n" +
        " \\ \\ / / \n" +
        "  \\ V /  \n" +
        "   > <   \n" +
        "  / . \\  \n" +
        " /_/ \\_\\ \n";

        assertEquals(v_7, RomanPrinter.print(7));
        assertEquals(v_8, RomanPrinter.print(8));
        assertEquals(v_9, RomanPrinter.print(9));
        assertEquals(v_10, RomanPrinter.print(10));
    }

    @Test
    public void testPrimi20() {
        
        //Test primi 20 numeri
        //11 - 14  - 17   - 19  - 20
        //XI - XIV - XVII - XIX - XX

        String v_11 = " __   __   _____  \n" +
        " \\ \\ / /  |_   _| \n" +
        "  \\ V /     | |   \n" +
        "   > <      | |   \n" +
        "  / . \\    _| |_  \n" +
        " /_/ \\_\\  |_____| \n";    
        
        String v_14 = " __   __   _____   __      __ \n" +
        " \\ \\ / /  |_   _|  \\ \\    / / \n" +
        "  \\ V /     | |     \\ \\  / /  \n" +
        "   > <      | |      \\ \\/ /   \n" +
        "  / . \\    _| |_      \\  /    \n" +
        " /_/ \\_\\  |_____|      \\/     \n";
        
        String v_17 = " __   __  __      __   _____    _____  \n" + 
        " \\ \\ / /  \\ \\    / /  |_   _|  |_   _| \n" + 
        "  \\ V /    \\ \\  / /     | |      | |   \n" + 
        "   > <      \\ \\/ /      | |      | |   \n" + 
        "  / . \\      \\  /      _| |_    _| |_  \n" + 
        " /_/ \\_\\      \\/      |_____|  |_____| \n";
        
        String v_19 = " __   __   _____   __   __ \n" +
        " \\ \\ / /  |_   _|  \\ \\ / / \n" +
        "  \\ V /     | |     \\ V /  \n" +
        "   > <      | |      > <   \n" +
        "  / . \\    _| |_    / . \\  \n" +
        " /_/ \\_\\  |_____|  /_/ \\_\\ \n";
        
        String v_20 = " __   __  __   __ \n" +
        " \\ \\ / /  \\ \\ / / \n" +
        "  \\ V /    \\ V /  \n" +
        "   > <      > <   \n" +
        "  / . \\    / . \\  \n" +
        " /_/ \\_\\  /_/ \\_\\ \n";

        assertEquals(v_11, RomanPrinter.print(11));
        assertEquals(v_14, RomanPrinter.print(14));
        assertEquals(v_17, RomanPrinter.print(17));
        assertEquals(v_19, RomanPrinter.print(19));
        assertEquals(v_20, RomanPrinter.print(20));
    }

    @Test
    public void testPrimi50() {

        //Test primi 50 numeri
        //24 - 27 - 32 - 39 - 40 - 44 - 49 - 50

        String v_24 = " __   __  __   __   _____   __      __ \n" + 
        " \\ \\ / /  \\ \\ / /  |_   _|  \\ \\    / / \n" + 
        "  \\ V /    \\ V /     | |     \\ \\  / /  \n" + 
        "   > <      > <      | |      \\ \\/ /   \n" + 
        "  / . \\    / . \\    _| |_      \\  /    \n" + 
        " /_/ \\_\\  /_/ \\_\\  |_____|      \\/     \n";

        String v_27 = " __   __  __   __  __      __   _____    _____  \n" + 
        " \\ \\ / /  \\ \\ / /  \\ \\    / /  |_   _|  |_   _| \n" + 
        "  \\ V /    \\ V /    \\ \\  / /     | |      | |   \n" + 
        "   > <      > <      \\ \\/ /      | |      | |   \n" + 
        "  / . \\    / . \\      \\  /      _| |_    _| |_  \n" + 
        " /_/ \\_\\  /_/ \\_\\      \\/      |_____|  |_____| \n";

        String v_32 = " __   __  __   __  __   __   _____    _____  \n" + 
        " \\ \\ / /  \\ \\ / /  \\ \\ / /  |_   _|  |_   _| \n" + 
        "  \\ V /    \\ V /    \\ V /     | |      | |   \n" + 
        "   > <      > <      > <      | |      | |   \n" + 
        "  / . \\    / . \\    / . \\    _| |_    _| |_  \n" + 
        " /_/ \\_\\  /_/ \\_\\  /_/ \\_\\  |_____|  |_____| \n";

        String v_39 = " __   __  __   __  __   __   _____   __   __ \n" + 
        " \\ \\ / /  \\ \\ / /  \\ \\ / /  |_   _|  \\ \\ / / \n" + 
        "  \\ V /    \\ V /    \\ V /     | |     \\ V /  \n" + 
        "   > <      > <      > <      | |      > <   \n" + 
        "  / . \\    / . \\    / . \\    _| |_    / . \\  \n" + 
        " /_/ \\_\\  /_/ \\_\\  /_/ \\_\\  |_____|  /_/ \\_\\ \n";

        String v_40 = " __   __   _       \n" + 
        " \\ \\ / /  | |      \n" + 
        "  \\ V /   | |      \n" + 
        "   > <    | |      \n" + 
        "  / . \\   | |____  \n" + 
        " /_/ \\_\\  |______| \n";

        String v_44 = " __   __   _         _____   __      __ \n" + 
        " \\ \\ / /  | |       |_   _|  \\ \\    / / \n" + 
        "  \\ V /   | |         | |     \\ \\  / /  \n" + 
        "   > <    | |         | |      \\ \\/ /   \n" + 
        "  / . \\   | |____    _| |_      \\  /    \n" + 
        " /_/ \\_\\  |______|  |_____|      \\/     \n";

        String v_49 = " __   __   _         _____   __   __ \n" +
        " \\ \\ / /  | |       |_   _|  \\ \\ / / \n" +
        "  \\ V /   | |         | |     \\ V /  \n" +
        "   > <    | |         | |      > <   \n" +
        "  / . \\   | |____    _| |_    / . \\  \n" +
        " /_/ \\_\\  |______|  |_____|  /_/ \\_\\ \n";

        String v_50 = "  _       \n" +
        " | |      \n" +
        " | |      \n" +
        " | |      \n" +
        " | |____  \n" +
        " |______| \n";


        assertEquals(v_24, RomanPrinter.print(24));
        assertEquals(v_27, RomanPrinter.print(27));
        assertEquals(v_32, RomanPrinter.print(32));
        assertEquals(v_39, RomanPrinter.print(39));
        assertEquals(v_40, RomanPrinter.print(40));
        assertEquals(v_44, RomanPrinter.print(44));
        assertEquals(v_49, RomanPrinter.print(49));
        assertEquals(v_50, RomanPrinter.print(50));
    }
}
