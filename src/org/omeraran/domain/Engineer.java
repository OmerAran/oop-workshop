package org.omeraran.domain;

public class Engineer extends Employee {
    protected String field;
    public static final int ENGINEER_PAYMENT = 8_000;

    public Engineer(int no, String name, int yearOfWorked, String field) {
        super(no, name, yearOfWorked);
        this.field = field;
    }

    @Override
    public void work() {
        System.out.println("Engineer " + name + " is working!");
        develop();
    }

    @Override
    public double calculateSalary() {
        return ENGINEER_PAYMENT + super.calculateSalary();
    }

    public void develop() {
        System.out.println("Engineer " + name + " is developing!");
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "field='" + field + '\'' +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", yearOfWorked=" + yearOfWorked +
                '}';
    }
}
