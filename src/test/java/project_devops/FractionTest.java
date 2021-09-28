package project_devops;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FractionTest {
    Fraction fraction;

    @BeforeEach
    void initializeTestData() {
        fraction = new Fraction(4, 2);
    }

    @Test
    void testGetNumerator() {
        Assertions.assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        Assertions.assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(2);
        Assertions.assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(5);
        Assertions.assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        Assertions.assertEquals(2.0, fraction.decimal(), 10e-2);
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Fraction{numerator=4, denominator=2}", fraction.toString());
    }


}
