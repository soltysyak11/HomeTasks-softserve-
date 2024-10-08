package com.softserve.edu06.hw.task2;

public class Developer extends  Employee {
    private final String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f", getName(), getAge(), getPosition(), getSalary());
    }
}