package com.probal.aop.proxy;

public class StudentActivityProxy extends StudentActivity {
    public StudentActivityProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendClass() {

        if (!super.getAttendance().isPresent())
            throw new RuntimeException("Student is not present");

        super.attendClass();
    }
}
