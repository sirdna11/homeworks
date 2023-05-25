package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod other) {
        if (!doOverlap(other)) {
            return null;
        }
        LocalDate newStart = this.start.isAfter(other.getStart()) ? this.start : other.getStart();
        LocalDate newEnd = this.end.isBefore(other.getEnd()) ? this.end : other.getEnd();
        return new DatePeriod(newStart, newEnd);
    }

    private boolean doOverlap(DatePeriod other) {
        return this.start.isBefore(other.getEnd()) && this.end.isAfter(other.getStart());
    }
}
