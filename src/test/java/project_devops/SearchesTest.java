package project_devops;

import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.stream.Collectors;


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
        assertEquals(List.of("1", "2", "3", "5"), Searches.findUserIdBySomeProperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Antonio", "Paula"), new Searches().findUserNameByAnyImproperFraction().collect(Collectors.toList()));
    }

}