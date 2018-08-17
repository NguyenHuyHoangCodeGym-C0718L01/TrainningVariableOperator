package Exercise4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CountAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert year of birth: ");
        int year = scanner.nextInt();

        System.out.println();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int yearDate = calendar.get(Calendar.YEAR);
        System.out.print("Age now: "+(yearDate-year));
    }
}
