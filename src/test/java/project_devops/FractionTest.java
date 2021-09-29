package project_devops;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class FractionTest {
   private Fraction fraction;

    @BeforeEach
    void initializeTestData() {
        fraction = new Fraction(4, 2);
    }

    @Test
    void testGetNumerator() {
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(2);
       assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2.0, fraction.decimal(), 10e-2);
    }

    @Test
    void testToString() {
        assertEquals("Fraction{numerator=4, denominator=2}", fraction.toString());
    }

    @Test
    void testIsProper() {
        assertFalse(fraction.isProper());
        fraction.setDenominator(5);
        assertTrue(fraction.isProper());
    }
    @Test
    void testisImproper(){
        assertTrue(fraction.isImproper());
        fraction.setDenominator(5);
        assertFalse(fraction.isImproper());
    }


    @Test
    void testIsEquivalent() {
        Fraction f = new Fraction(4, 2);
        assertTrue(fraction.isEquivalent(f));
    }



    @Test
    void testMultiply(){
        Fraction fr = new Fraction(2, 2);
        assertEquals(new Fraction(8,4), fraction.multiply(fr));
    }

    @Test
    void testDivide(){
        Fraction fr = new Fraction(3,1);
        assertEquals(new Fraction(4,6),fraction.divide(fr));
    }
    @Test
    void testAdd() {
        assertEquals(new Fraction(16, 4), fraction.add(fraction));
        Fraction newFraction = new Fraction(3, 2);
        assertEquals(new Fraction(14, 4), fraction.add(newFraction));
    }


}
