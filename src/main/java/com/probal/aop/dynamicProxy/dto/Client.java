package com.probal.aop.dynamicProxy.dto;

import com.probal.aop.dynamicProxy.proxy.EmployeeSalaryInvocationHandler;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        ProgrammerEmployee programmerEmployee = new ProgrammerEmployee();
        programmerEmployee.setName("Ahamed Rashid");
        programmerEmployee.setId(100);
        programmerEmployee.setSalary(50000);

        EmployeeSalaryInvocationHandler invocationHandler = new EmployeeSalaryInvocationHandler(programmerEmployee);
        IEmployee employee = (IEmployee) invocationHandler.createProxy(IEmployee.class, invocationHandler);
        employee.giveHike(5000);


        System.out.println(employee.getSalary());
    }
}
