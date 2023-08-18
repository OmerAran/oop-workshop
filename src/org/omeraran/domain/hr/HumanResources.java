package org.omeraran.domain.hr;

import org.omeraran.domain.Worker;

public class HumanResources {

    public void paySalary(Worker worker) {
        double salary = worker.calculateSalary();
        System.out.println("Employee " + worker.getName()  + " Salary : " + salary + "\n");
    }
}

/*
* Human resources is client
* they even don't know employee types(manager, employee or director
* they just pay.
* This means it is Loose Coupling.
* */