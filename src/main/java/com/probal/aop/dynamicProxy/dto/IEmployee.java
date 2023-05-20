package com.probal.aop.dynamicProxy.dto;

public interface IEmployee {
    void giveHike(double amount);

    void payCut(double amount);

    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    void setSalary(double amount);

    double getSalary();
}
