package BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo5Correction;
import org.junit.jupiter.api.Test;

public class Exo5Test {

    @Test
    public void testToRoman() {
        // Test cas standard
        assertEquals("IV", Exo5Correction.toRoman(4));
        assertEquals("IX", Exo5Correction.toRoman(9));
        assertEquals("XLVI", Exo5Correction.toRoman(46));
        assertEquals("XCII", Exo5Correction.toRoman(92));
        assertEquals("CMXCIX", Exo5Correction.toRoman(999));

        // Test cas limite inférieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo5Correction.toRoman(0);
        });

        // Test cas limite supérieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo5Correction.toRoman(4000);
        });

        // Test cas où n est égal à 1
        assertEquals("I", Exo5Correction.toRoman(1));

        // Test cas où n est égal à 3999
        assertEquals("MMMCMXCIX", Exo5Correction.toRoman(3999));
    }
}

