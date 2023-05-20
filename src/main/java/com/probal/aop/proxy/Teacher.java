package com.probal.aop.proxy;

import java.util.Date;

public class Teacher {
    public static void main(String[] args) {
        DailyClass dailyClass = new StudentActivityProxy(new Attendance(new Date(), true));
        dailyClass.attendClass();
    }
}