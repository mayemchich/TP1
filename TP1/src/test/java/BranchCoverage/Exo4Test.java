package BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo4;
import org.junit.jupiter.api.Test;

public class Exo4Test {

    @Test
    public void testSolve() {
        // Test cas standard avec deux racines réelles distinctes
        double[] result1 = Exo4.solve(1, -4, 3);
        assertNotNull(result1);
        assertEquals(2, result1.length);
        assertEquals(3.0, result1[0]);
        assertEquals(1.0, result1[1]);

        // Test cas avec une seule racine réelle
        double[] result2 = Exo4.solve(1, -4, 4);
        assertNotNull(result2);
        assertEquals(1, result2.length);
        assertEquals(2.0, result2[0]);

        // Test cas avec pas de racine réelle
        double[] result3 = Exo4.solve(1, 1, 1);
        assertNull(result3);

        // Test cas avec a égal à zéro (doit lancer une exception)
        assertThrows(IllegalArgumentException.class, () -> {
            Exo4.solve(0, 1, 2);
        });

        // Test cas avec delta égal à zéro (une seule racine réelle)
        double[] result4 = Exo4.solve(1, -4, 4);
        assertNotNull(result4);
        assertEquals(1, result4.length);
        assertEquals(2.0, result4[0]);

    }
}

