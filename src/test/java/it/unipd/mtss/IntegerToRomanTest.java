////////////////////////////////////////////////////////////////////
// Filippo Bellon 2076432
// Nicolò Bolzon 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testPrimi3() {

        //Test primi 3 numeri
        //1 - 2  - 3
        //I - II - III

        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testPrimi6() {

        //Test primi 6 numeri
        //4  - 5 - 6
        //IV - V - VI

        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testLimiti() {

        //Test numeri fuori range di conversione

        assertEquals("Errore: Numero non rispetta le PRE-Condizioni del Programma", IntegerToRoman.convert(-1));
        assertEquals("Errore: Numero non rispetta le PRE-Condizioni del Programma", IntegerToRoman.convert(7));
    }
}
