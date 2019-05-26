package com.tertiaryinfotech.day_2.module_12;

public class AssertExample {
    public static void main(String[] args) {
        // By default, assertions are not enabled
        // Run -> Edit Configurations... -> VM Options -> "-ea"
        assert 1 == 2: "one is not equals to two";
        new Employee("Jane", -1000);
    }
}

class Employee {

    String name;
    double salary;

    Employee() {}

    Employee(String name, double salary) {
        this.name = name;   //pass the name to the object
        assert salary > 0.0: "Salary cannot be less than $0.00";
        this.salary = salary; //pass the salary to the object
    }

    public void displayEmpDetails() {
        System.out.printf("%s salary is %.2f\n", this.name, this.salary);
    }
}
