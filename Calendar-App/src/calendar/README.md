# Calendar Design Lab - Source Code Documentation

**Package**: `calendar`  
**Class**: `AppCalendar`

## Class Overview

### AppCalendar

The `AppCalendar` class is designed to generate and print a formatted calendar for a specified year and number of columns.

### Attributes

- **`String[] monthNames`**: Holds the names of the months (e.g., "一月", "二月", etc.).
- **`String[] weekDays`**: Holds the names of the days of the week (e.g., "日", "一", etc.).

### Main Method

- **`main(String[] args)`**: Entry point of the application.
  - Reads user input for the year and optional column count.
  - Calls `printCalendar()` to generate and display the calendar.

## Methods

1. **`printCalendar(int year, int columns)`**: Prints the entire calendar for a specified year.
   - Calculates the number of rows needed based on the columns.
   - Calls helper methods to print month names, day names, and days.

2. **`printMonthNames(int row, int columns)`**: Prints the names of the months in the current row.
   - Loops through the months in the current row and formats their names.

3. **`printDaysNames(int row, int columns)`**: Prints the weekday names for each month in the current row.

4. **`printDays(int row, int columns, int year)`**: Prints the days of the months for the current row.
   - Loops through a maximum of six lines and calls `printMonthLine()` for each month.

5. **`printMonthLine(int year, int month, int line)`**: Prints a single line of days for a specific month.
   - Calculates the starting day of the month using `Calendar`.
   - Outputs the days in a week-aligned format.

## Example Usage

- **Input**: `2011 3`
- **Output**: The calendar for 2011 in 3 columns, formatted with month and day names.

## Conclusion

The `AppCalendar` class effectively demonstrates method definition, looping, and abstraction in Java. This experiment offered valuable insights into structuring data using built-in Java classes like `Calendar` for date management.

For any questions or issues, refer to the main repository: [Java Projects Repository](https://github.com/Al-rimi/java).
