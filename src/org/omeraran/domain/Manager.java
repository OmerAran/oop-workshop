package org.omeraran.domain;

public class Manager extends Employee {

    protected String department;
    public final static int MANAGEMENT_PAYMENT = 10_000;

    public Manager(int no, String name, int yearOfWorked, String department) {
        super(no, name, yearOfWorked);
        /*
        * hiçbir kod parçasından 2 tane olmamalı DRY = DontRepeatYourself
        * bu yüzden this.no = no gibi ifadeler yerine super() ile Employee için gereken constructor'u da kolayca hazırladık.*/
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        salary = MANAGEMENT_PAYMENT + super.calculateSalary();
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Manager " + name + " is working!");
        manage();
    }

    public void manage() {
        System.out.println("Manager " + name + " is managing!");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", yearOfWorked=" + yearOfWorked +
                '}';
    }
}
