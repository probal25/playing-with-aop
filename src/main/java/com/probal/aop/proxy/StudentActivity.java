package com.probal.aop.proxy;

public class StudentActivity implements DailyClass {

    private Attendance attendance;

    public Attendance getAttendance() {
        return attendance;
    }
    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public StudentActivity(Attendance attendance) {
        this.attendance = attendance;
    }

    public StudentActivity() {
    }

    @Override
    public void attendClass() {
        System.out.println("Attending class . .");
    }
}
