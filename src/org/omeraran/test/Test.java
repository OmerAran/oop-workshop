package org.omeraran.test;

import org.omeraran.domain.*;
import org.omeraran.domain.hr.HumanResources;

public class Test {

    public static void main(String[] args) {
//        run1();
//        run2();
        run3();
    }

    private static void run1() {
        Employee engineer = new Engineer(1, "Ömer", 2, "CENG");
        System.out.println(engineer);
        engineer.work();

        System.out.println();

        Manager manager1 = new Manager(2, "Ahmet", 2, "IT");
        System.out.println(manager1);
        manager1.work();

        System.out.println();

        Director director1 = new Director(3, "Sezai", 2,"CTO", 20_000);
        director1.work();
        System.out.println(director1);

        System.out.println();
    }
    private static void run2() {
//        Employee employee1 = new Employee(1, "Ömer", 2); abstract  yaparsak bu nesneyi oluşturamayız ki istediğimiz de bu.
        Employee engineer = new Engineer(1,"Ömer", 2, "CENG");
        Employee manager1 = new Manager(2, "Ahmet", 2, "IT"); //Upcasting E e = new Manager kısmı
        Employee director1 = new Director(3, "Sezai", 2,"CTO", 20_000);

        HumanResources humanResources = new HumanResources();
        humanResources.paySalary(engineer);
        humanResources.paySalary(manager1);
        humanResources.paySalary(director1);
    }

    private static void run3() {
        Worker engineer = new Engineer(1,"Ömer", 2, "CENG");
        Worker manager1 = new Manager(2, "Ahmet", 2, "IT"); //Upcasting E e = new Manager kısmı
        Worker director1 = new Director(3, "Sezai", 2,"CTO", 20_000);

        HumanResources humanResources = new HumanResources();
        humanResources.paySalary(engineer);
        humanResources.paySalary(manager1);
        humanResources.paySalary(director1);
    }
}
