package com.probal.aop.reflection;

import com.probal.aop.proxy.StudentActivity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> studentActivityClassInfo = Class.forName("com.probal.aop.proxy.StudentActivity");
        StudentActivity student = (StudentActivity) studentActivityClassInfo.newInstance();

        Method method = studentActivityClassInfo.getDeclaredMethod("attendClass");
        method.invoke(student);
    }
}
