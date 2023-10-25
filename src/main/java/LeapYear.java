public class LeapYear {

    // Method in which it checks whether a year is or isn't a leap year
    // Corresponds with the claims in the assignment


    public static boolean divisableBy4(int year) {
        return (year % 4 == 0);
    }

    public static boolean notDivisableBy100(int year) {
        return (year % 100 != 0);
    }

    public static boolean divisableBy400(int year) {
        return (year % 400 == 0);
    }

    public static boolean isLeapYear(int year) {
        return (divisableBy4(year) && notDivisableBy100(year) || divisableBy400(year));
    }
}