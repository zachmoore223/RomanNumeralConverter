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

    @Test
    void tenGivesX () {
        assertEquals("X", RomanNumeralConverter.toRomanNumeral(10));
    }

    @Test
    void elevenGivesXI () {
        assertEquals("XI", RomanNumeralConverter.toRomanNumeral(11));
    }
    @Test
    void twelveGivesXII () {
        assertEquals("XII", RomanNumeralConverter.toRomanNumeral(12));
    }

    @Test
    void thirteenGivesXIII () {
        assertEquals("XIII", RomanNumeralConverter.toRomanNumeral(13));
    }

    @Test
    void fourteenGivesXIV () {assertEquals("XIV", RomanNumeralConverter.toRomanNumeral(14));}

    @Test
    void fifteenGivesXV () {
        assertEquals("XV", RomanNumeralConverter.toRomanNumeral(15));
    }

    @Test
    void sixteenGivesXVI () {
        assertEquals("XVI", RomanNumeralConverter.toRomanNumeral(16));
    }

    @Test
    void seventeenGivesXVII () {
        assertEquals("XVII", RomanNumeralConverter.toRomanNumeral(17));
    }

    @Test
    void eighteenGivesXVIII () {
        assertEquals("XVIII", RomanNumeralConverter.toRomanNumeral(18));
    }

    @Test
    void nineteenGivesXIX () {
        assertEquals("XIX", RomanNumeralConverter.toRomanNumeral(19));
    }


}
