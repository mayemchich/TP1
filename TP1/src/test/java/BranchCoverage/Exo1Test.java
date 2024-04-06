package BranchCoverage;


import org.example.Exo1Correction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    public void testIsPalindrome() {
        // Test cas standard avec un palindrome
        assertTrue(Exo1Correction.isPalindrome("level"));
        assertTrue(Exo1Correction.isPalindrome("Was it a car or a cat I saw"));

        // Test cas standard avec une chaîne qui n'est pas un palindrome
        assertFalse(Exo1Correction.isPalindrome("hello"));
        assertFalse(Exo1Correction.isPalindrome("not a palindrome"));

        // Test cas limite avec une chaîne vide
        assertTrue(Exo1Correction.isPalindrome(""));

        // Test cas limite avec une seule lettre
        assertTrue(Exo1Correction.isPalindrome("a"));

        // Test cas limite avec une chaîne nulle
        assertThrows(NullPointerException.class, () -> {
            Exo1Correction.isPalindrome(null);
        });

        // Test cas où la chaîne contient deux caractères identiques
        assertTrue(Exo1Correction.isPalindrome("aa"));
    }
}

