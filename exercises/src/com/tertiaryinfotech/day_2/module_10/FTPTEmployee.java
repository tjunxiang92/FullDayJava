package com.tertiaryinfotech.day_2.module_10;

public class FTPTEmployee {
}

class FTEmployee extends Employee {
    int leave;

    FTEmployee (String name, double salary, int leave) {
        super(name,salary);
        this.leave = leave;
    }

    public void displayEmpDetails() {
        super.displayEmpDetails();
        System.out.printf("I am fulltime & my leave is %d\n", this.leave);
    }
}

class PTEmployee extends Employee {
    public static int emptyField;
    public double hourlyRate;

    PTEmployee (String name, double salary, double hourlyRate) {
        super(name,salary);
        this.hourlyRate = hourlyRate;
    }

    public void displayEmpDetails() {
        super.displayEmpDetails();
        System.out.printf("I am partime & my rate is $%.2f\n", this.hourlyRate);
    }
}