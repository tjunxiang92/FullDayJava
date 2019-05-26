// Create FullTimeStaff and PartTimeStaff sub classes inherited from the superclass Employee. 
// - FullTimeStaff has extra attribute of leave, besides name and salary
// - PartTimeStaff has extra attribute of hourly rate, besides name and salary
// Create a method displayEmpDetails()

package com.tertiaryinfotech.day_1.challenges;

public class FTEmployee extends Employee {

    int leave;

    FTEmployee(String name, double salary, int leave) {
        super(name, salary);
        this.leave = leave;
    }

    public void displayEmpDetails() {
        System.out.printf("%s salary is %.2f and leave is %d", this.name, this.salary, this.leave);
    }


    public static void main(String[] args) {
        FTEmployee emp1 = new FTEmployee("Ally", 5000, 18);

        emp1.displayEmpDetails();
    }

}


