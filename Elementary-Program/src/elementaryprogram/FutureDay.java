package elementaryprogram;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FutureDay { // Ex2. Future Day of the Week
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current year, month, day, and today's day of the week (0 for Sunday, 6 for Saturday): ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        int todayDayOfWeek = input.nextInt();

        System.out.print("Enter future year, month, and day: ");
        int futureYear = input.nextInt();
        int futureMonth = input.nextInt();
        int futureDay = input.nextInt();

        input.close();

        LocalDate today = LocalDate.of(year, month, day);
        LocalDate futureDate = LocalDate.of(futureYear, futureMonth, futureDay);
        long dayDifference = ChronoUnit.DAYS.between(today, futureDate);

        int futureDayOfWeek = (int) ((todayDayOfWeek + dayDifference % 7 + 7) % 7);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Today is " + days[todayDayOfWeek] + " and the future day is " + days[futureDayOfWeek] + ".");
    }
}
