package project_devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    ArrayList<Fraction> fractions;
    private User user;

    @BeforeEach
    void before() {
        fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(3, 7));
        user = new User("1", "pablo", "escobar", fractions);
    }

    @Test
    void testUserWithoutParameters() {
        user = new User();
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("pablo", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("karim");
        assertEquals("karim", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("escobar", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Basly");
        assertEquals("basly", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        Assertions.assertEquals(fractions, user.getFractions());
    }

    @Test
    void testSetFractions() {
        ArrayList<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(9, 5));
        user.setFractions(newFractions);
        Assertions.assertEquals(newFractions, user.getFractions());
        Assertions.assertNotEquals(newFractions, this.fractions);
    }

    @Test
    void testAddFraction() {
        Fraction fraction = new Fraction(1, 3);
        user.addFraction(fraction);
        Assertions.assertEquals(fraction, user.getFractions().get(user.getFractions().size() - 1));
    }

    @Test
    void testFullName() {
        assertEquals("pablo escobar", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("p.", user.initials());
    }

}
