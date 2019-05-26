package com.tertiaryinfotech.day_2.module_10;

public class Employee {

    String name;
    double salary;

    Employee() {}

    Employee(String name, double salary) {
        this.name = name;   //pass the name to the object
        this.salary = salary; //pass the salary to the object
    }

    public void displayEmpDetails() {
        System.out.printf("%s salary is %.2f\n", this.name, this.salary);
    }
}