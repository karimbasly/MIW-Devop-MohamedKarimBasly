package project_devops;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }


    @Test
    void testFindHighestFraction() {
        assertEquals(
                new Fraction(0, 0),
                new Searches().findHighestFraction()
        );
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0.0, Searches.findFirstDecimalFractionByUserName("Oscar"), 10e-5);
    }

    @Test
    void testFindUserIdBySomeProperFraction() {
        ArrayList<String> user = new ArrayList<>();
        user.add("1");
        user.add("2");
        user.add("3");
        user.add("5");
        assertEquals(user, Searches.findUserIdBySomeProperFraction().collect(Collectors.toList()));
    }

}