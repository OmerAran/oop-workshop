package org.omeraran.domain;

public class Director extends Manager {

    protected int bonus;
    public final static int DIRECTOR_PAYMENT = 20_000;

    public Director(int no, String name, int yearOfWorked, String department, int bonus) {
        super(no, name, yearOfWorked, department);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        salary = bonus + super.calculateSalary();
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Director " + name + " is working!");
        System.out.println("Director " + name + " is managing!");
        makeAStrategicPlan();
    }

    public void makeAStrategicPlan() {
        System.out.println("Director " + name + " is making strategic plan.");
    }

    @Override
    public String toString() {
        return "Director{" +
                "bonus=" + bonus +
                ", department='" + department + '\'' +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", yearOfWorked=" + yearOfWorked +
                '}';
    }
}

/*
* set ve get gereksizse hiç kullanma!!!*/