package com.probal.aop.proxy;

import java.util.Date;

public class Attendance {
    private Date attendanceDate;
    private boolean isPresent;

    public Attendance() {
    }
    public Attendance(Date attendanceDate, boolean isPresent) {
        this.attendanceDate = attendanceDate;
        this.isPresent = isPresent;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
