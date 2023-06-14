package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise1 {

    private static final int HOURS_PER_WORK_DAY = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date in the format yyyy-MM-dd: ");
        String date1 = scanner.next();

        System.out.println("Enter the second date in the format yyyy-MM-dd: ");
        String date2 = scanner.next();

        System.out.println("Number of working hours: " + calculateWorkingHours(date1, date2));
    }

    private static long calculateWorkingHours(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);

        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        long totalWorkDays = 0;

        for (long i = 0; i <= totalDays; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            // Skip weekends
            if (!(currentDate.getDayOfWeek().name().equals("SATURDAY") || currentDate.getDayOfWeek().name().equals("SUNDAY"))) {
                totalWorkDays++;
            }
        }

        return totalWorkDays * HOURS_PER_WORK_DAY;
    }
}
