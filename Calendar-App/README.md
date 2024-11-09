# Array and Method - Calendar Design Lab

**Project**: Lab to Design a Calendar

## Objectives

- Define and invoke methods.
- Use loop statements to solve the given problems.
- Apply abstraction and modeling to simplify complex issues.

## Tasks

1. Define a class and methods to generate the calendar.
2. Create a console program that shows the calendar for a specified year and number of columns.
3. Document the solution, design, and any encountered issues.

## Requirements Analysis and Solution

### Requirements
The program allows users to specify a year and column layout for the calendar display. The default layout is three columns, presenting months as shown:

| January  | February | March    |
|----------|----------|----------|
| April    | May      | June     |
| July     | August   | September|
| October  | November | December |

### Solution
1. **Input**: Year and optional number of columns (defaults to 3 if not specified).
2. **Process**: Use `java.util.Calendar` to determine the start day and days in each month.
3. **Output**: Print the calendar in the specified format.

## Design

### Overall Design
- **Case 1**: Input only the year (e.g., `2011`).
- **Case 2**: Input the year and columns (e.g., `2011 5`).

### Data Structure
- **Class**: `AppCalendar`
  - **Attributes**: `String[] monthNames` (month names), `String[] weekDays` (weekday names).
  - **Methods**: `printCalendar`, `printMonthNames`, `printDaysNames`, `printDays`, `printMonthLine`.

## Code and Execution

Refer to the `arraymethod` package inside the `source` folder for the full implementation and additional documentation of the program's methods and structure.

For the complete source code, see the [Array and Method Project in the source folder](./src/arraymethod).

---

**Check the full repository here**: [Java Projects Repository](https://github.com/Al-rimi/java)
