package com.company;

public class Employee {
    private final String type;
    private final String name;
    private static double baseSalary = 500;
    public double finalsalary = baseSalary;

    public Employee(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static double getSalary() {
        return baseSalary;
    }

    public String getType() {
        return type;
    }

    public void setFinalsalary(int increasepercent){
    }

    public String getName() {
        return name;
    }

    public double getFinalsalary() {
        return finalsalary;
    }
}
