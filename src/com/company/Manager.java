package com.company;

public class Manager extends Employee {

    public Manager(String type, String name) {
        super(type, name);
    }

    @Override
    public void setFinalsalary(int increasepercent) {
        this.finalsalary = getSalary() + getSalary() * increasepercent / 100;
    }


}
