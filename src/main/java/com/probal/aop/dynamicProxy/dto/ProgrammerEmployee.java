package com.probal.aop.dynamicProxy.dto;

public class ProgrammerEmployee implements IEmployee {

    private int id;
    private String name;
    private double salary;

    @Override
    public void giveHike(double amount) {
        salary += amount;
    }

    @Override
    public void payCut(double amount) {
        salary -= amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(double amount) {
        salary = amount;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
