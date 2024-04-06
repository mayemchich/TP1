package BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo3Correction;
import org.junit.jupiter.api.Test;

public class Exo3Test {

    @Test
    public void testBinarySearch() {
        int[] array = {1, 3, 7, 11, 12, 14, 19, 37, 51};


        // Test cas où l'élément est dans la première moitié du tableau
        assertEquals(0, Exo3Correction.binarySearch(array, 1));
        // Test cas où l'élément est au milieu du tableau
        assertEquals(4, Exo3Correction.binarySearch(array, 12));
        // Test cas où l'élément est dans la dernière moitié du tableau
        assertEquals(8, Exo3Correction.binarySearch(array, 51));

        // Test cas où l'élément n'est pas présent
        assertEquals(-1, Exo3Correction.binarySearch(array, 56));
        assertEquals(-1, Exo3Correction.binarySearch(array, 99));

        // Test avec tableau vide
        assertEquals(-1, Exo3Correction.binarySearch(new int[0], 5));

        // Test avec tableau null (doit lancer une exception)
        assertThrows(NullPointerException.class, () -> {
            Exo3Correction.binarySearch(null, 5);
        });

    }
}
