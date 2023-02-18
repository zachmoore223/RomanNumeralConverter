import org.example.RomanNumeralConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    void oneGivesI() {
        assertEquals("I", RomanNumeralConverter.toRomanNumeral(1));
    }

    @Test
    void twoGivesII() {
        assertEquals("II", RomanNumeralConverter.toRomanNumeral(2));
    }

    @Test
    void threeGivesIII() {
        assertEquals("III", RomanNumeralConverter.toRomanNumeral(3));
    }

    @Test
    void fourGivesIV() {
        assertEquals("IV", RomanNumeralConverter.toRomanNumeral(4));
    }

    @Test
    void fiveGivesV() {
        assertEquals("V", RomanNumeralConverter.toRomanNumeral(5));
    }

    @Test
    void sixGivesVI() {assertEquals("VI", RomanNumeralConverter.toRomanNumeral(6));}

    @Test
    void sevenGivesVII() {
        assertEquals("VII", RomanNumeralConverter.toRomanNumeral(7));
    }

    @Test
    void eightGivesV() {
        assertEquals("VIII", RomanNumeralConverter.toRomanNumeral(8));
    }

    @Test
    void nineGivesIX() {
        assertEquals("IX", RomanNumeralConverter.toRomanNumeral(9));
    }


}
