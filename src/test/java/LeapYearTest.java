import org.junit.jupiter.api.Test; //Imported and downloaded the correct JUnit with Testers.
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    public void testLeapYear() {
        // Testing for leap year
        assertTrue(LeapYear.isLeapYear(2000)); //Testing if year 2000 is a leap year
        assertTrue(LeapYear.isLeapYear(2020)); //Testing if year 2020 is a leap year
        assertTrue(LeapYear.isLeapYear(2400)); //Testing if year 2400 is a leap year

        /*
        assertTrue(LeapYear.isLeapYear(2101)); //Testing if year 2101 is a leap year
        ^--^ This would become an error ^--^
        As that is NOT a leap year
        */

        // Testing if not leap year
        assertFalse(LeapYear.isLeapYear(1700)); //Testing if year 1700 is not a leap year
        assertFalse(LeapYear.isLeapYear(1800)); //Testing if year 1800 is not a leap year
        assertFalse(LeapYear.isLeapYear(1900)); //Testing if year 1900 is not a leap year
        assertFalse(LeapYear.isLeapYear(2100)); //Testing if year 2100 is not a leap year

        /*
        assertFalse(LeapYear.isLeapYear(2000)); //Testing if year 2000 is not a leap year
        ^--^ This would become an error ^--^
        As this IS a leap year
        */
    }
}