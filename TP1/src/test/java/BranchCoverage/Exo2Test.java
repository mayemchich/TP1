package BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo2Correction;
import org.junit.jupiter.api.Test;

public class Exo2Test {
    @Test
    public void testIsAnagram() {
        // Test cas standard
        assertTrue(Exo2Correction.isAnagram("angel", "glean"));

        // Test avec chaîne vide
        assertTrue(Exo2Correction.isAnagram("", ""));

        // Test avec chaînes différentes en longueur
        assertFalse(Exo2Correction.isAnagram("it's", "not an anagram"));

        // Test avec chaînes contenant des espaces
        assertTrue(Exo2Correction.isAnagram("debit card", "bad credit"));

        // Test avec chaînes contenant des caractères spéciaux
        assertTrue(Exo2Correction.isAnagram("étripa", "parité"));

        // Test avec chaînes null (doit lancer une exception)
        assertThrows(NullPointerException.class, () -> {
            Exo2Correction.isAnagram(null, "test");
        });
        assertThrows(NullPointerException.class, () -> {
            Exo2Correction.isAnagram("test", null);
        });
        // Test avec les deux chaînes null (doit lancer une exception)
        assertThrows(NullPointerException.class, () -> {
            Exo2Correction.isAnagram(null, null);
        });

    }
}
