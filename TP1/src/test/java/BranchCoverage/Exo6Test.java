package BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo6;
import org.junit.jupiter.api.Test;

public class Exo6Test {

    @Test
    public void testFizzBuzz() {
        // Test cas standard
        // Test cas où n est égal à 1
        assertEquals("1", Exo6.fizzBuzz(1));
        // Test cas où n est divisible par 3 mais pas par 5
        assertEquals("Fizz", Exo6.fizzBuzz(6));
        // Test cas où n est divisible par 5 mais pas par 3
        assertEquals("Buzz", Exo6.fizzBuzz(40));
        // Test cas où n n'est ni divisible par 3 ni par 5
        assertEquals("4", Exo6.fizzBuzz(4));
        // Test cas où n est divisible par 15
        assertEquals("FizzBuzz", Exo6.fizzBuzz(30));

        // Test cas limite inférieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo6.fizzBuzz(0);
        });


    }
}
