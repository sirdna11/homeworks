package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the server launch date in the format yyyy-MM-dd: ");
        String startDate = scanner.next();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        System.out.println("Enter the month as a number (1 for January, 2 for February, etc.): ");
        int month = scanner.nextInt();

        List<LocalDate> dates = getUpdateDates(startDate, year, month);

        System.out.println("Server must be updated on following dates:");
        for (LocalDate date : dates) {
            System.out.println(date);
        }
    }

    private static List<LocalDate> getUpdateDates(String startDateStr, int year, int month) {
        List<LocalDate> dates = new ArrayList<>();
        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate startOfMonth = LocalDate.of(year, month, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        if (startOfMonth.isBefore(startDate)) {
            return dates; // If the given month is before the start date, return an empty list.
        }

        LocalDate nextUpdate = startDate.plus(Period.ofDays(14));

        while (true) {
            if (nextUpdate.getMonthValue() == month && nextUpdate.getYear() == year) {
                dates.add(nextUpdate);
            } else if (nextUpdate.isAfter(LocalDate.of(year, month, 1))) {
                break;
            }
            nextUpdate = nextUpdate.plus(Period.ofDays(14));
        }

        return dates;
    }
}
