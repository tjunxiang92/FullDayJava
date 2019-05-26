// Create FullTimeStaff and PartTimeStaff sub classes inherited from the superclass Employee. 
// - FullTimeStaff has extra attribute of leave, besides name and salary
// - PartTimeStaff has extra attribute of hourly rate, besides name and salary
// Create a method displayEmpDetails()

package com.tertiaryinfotech.day_1.challenges;

public class PTEmployee extends Employee {
    double hourlyRate;

    PTEmployee(String name, double salary, double hourlyRate) {
        super(name, salary);
        this.hourlyRate = hourlyRate;
    }

    public void displayEmpDetails() {
        System.out.printf("%s salary is %.0f and hourly rate is $%.2f", this.name,
                this.salary, this.hourlyRate);
    }

    public static void main(String[] args) {
        PTEmployee emp1 = new PTEmployee("Ally", 5000, 3.5);
        emp1.displayEmpDetails();
    }

}
