import java.util.Calendar;
import java.util.Scanner;

public class AppCalendar {

    public static String[] monthNames = { "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一", "十二" };
    // public static String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static String[] weekDays = { "日", "一", "二", "三", "四", "五", "六" };
    // public static String[] weekDays = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year and columns (optional): ");
        String input = scanner.nextLine();
        String[] yearColumns = input.split(" ");

        int year = Integer.parseInt(yearColumns[0]);
        int columns = (yearColumns.length > 1) ? Integer.parseInt(yearColumns[1]) : 3;

        scanner.close();

        printCalendar(year, columns);
    }

    public static void printCalendar(int year, int columns) {
        System.out.println("\nCalendar for the Year " + year + ":\n");
        int rows = (int) Math.ceil(12.0 / columns);

        for (int row = 0; row < rows; row++) {
            printMonthNames(row, columns);
            System.out.println();
            printDaysNames(row, columns);
            System.out.println();
            printDays(row, columns, year);
            System.out.println();
        }
    }

    public static void printMonthNames(int row, int columns) {
        for (int i = 0; i < columns; i++) {
            int month = row * columns + i;
            if (month < 12) {
                System.out.printf("%-22s", monthNames[month]);
            }
        }
    }

    public static void printDaysNames(int row, int columns) {
        for (int i = 0; i < columns; i++) {
            if (row * columns + i < 12) {
                for (String day : weekDays) {
                    System.out.printf("%s ", day);
                }
                System.out.print("   ");
            }
        }
    }

    public static void printDays(int row, int columns, int year) {
        for (int line = 0; line < 6; line++) {
            for (int col = 0; col < columns; col++) {
                int month = row * columns + col;
                if (month < 12) {
                    printMonthLine(year, month, line);
                }
            }
            System.out.println();
        }
    }

    public static void printMonthLine(int year, int month, int line) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < 7; i++) {
            int date = line * 7 + i - startDay + 1;
            if (date > 0 && date <= daysInMonth) {
                System.out.printf("%02d ", date);
            } else {
                System.out.print("   ");
            }
        }
        System.out.print("   ");
    }
}
