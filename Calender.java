import java.io.*;
import java.util.*;
class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String[] days = {
                "SUNDAY", "MONDAY", "TUESDAY",
                "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };
        return days[dayOfWeek - 1];
    }
}
public class Solution {

public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        String result = Result.findDay(month, day, year);
        System.out.println(result);
        scanner.close();
    }
}
