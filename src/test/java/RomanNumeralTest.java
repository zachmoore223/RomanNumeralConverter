import org.example.RomanNumeralConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    void oneGivesI () {
        assertEquals("I", RomanNumeralConverter.toRomanNumeral(1));
    }


}
