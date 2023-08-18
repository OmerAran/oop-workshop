package org.omeraran.domain;

public abstract class Employee implements Worker {
    protected int no;
    protected String name;
    protected double salary;
    protected int yearOfWorked;

    public Employee(int no, String name, int yearOfWorked) {
        this.no = no;
        this.name = name;
        this.yearOfWorked = yearOfWorked;
    }

    @Override
    public double calculateSalary() {
        salary = yearOfWorked * 1000;
        return salary;
    }

    @Override
    public String toString() {
        salary = calculateSalary();
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", yearOfWorked=" + yearOfWorked +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}


//Default boş Employee oluşturmasına izin vermiyorum.

/*arayüzün aynı ancak davranışların farklı olmalı,
calculateSalary, calculateSalaryForManager gibi değil! interface aynı hepsinde calculateSalary()
*/
