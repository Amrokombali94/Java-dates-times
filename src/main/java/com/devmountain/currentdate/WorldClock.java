package com.devmountain.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        LocalDate now = LocalDate.now();
        return now;
    }

    public LocalDateTime getNowForDateAndTime() {
        LocalDateTime now = LocalDateTime.now();
        return now;
    }

    public DayOfWeek getDayOfWeekForNow() {
        return null;
    }

    public int getDayOfMonthForNow() {
        return 0;
    }

    public int getDayOfYearForNow() {
        return 0;
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        return null;
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return null;
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        return null;
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return null;
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return null;
    }



}
