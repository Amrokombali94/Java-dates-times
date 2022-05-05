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
        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = DayOfWeek.from(now);
        return dayOfWeek;
    }

    public int getDayOfMonthForNow() {
        LocalDate now = LocalDate.now();

        return now.getDayOfMonth();
    }

    public int getDayOfYearForNow() {
        LocalDate dayOfYear = LocalDate.now();
        return dayOfYear.getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        ZoneId zoneid = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = ZonedDateTime.of(LocalDateTime.now(zoneid), zoneid);
//        ZonedDateTime newYorkTime = ZonedDateTime.

        return newYorkTime;
    }

    public ZonedDateTime getNowDateTimeForLA() {
        ZoneId zoneid = ZoneId.of("America/Los_Angeles");
        ZonedDateTime laTime = ZonedDateTime.of(LocalDateTime.now(zoneid),zoneid);
        return laTime;
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        ZoneId zoneid = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = ZonedDateTime.of(LocalDateTime.now(zoneid),zoneid);
        return londonTime;
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        ZoneId zoneid = ZoneId.of("Europe/Moscow");
        ZonedDateTime moscowTime = ZonedDateTime.of(LocalDateTime.now(zoneid),zoneid);
        return moscowTime;
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        ZoneId zoneid = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoTime = ZonedDateTime.of(LocalDateTime.now(zoneid),zoneid);
        return tokyoTime;
    }



}
