package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook();
        employees.addEmployee("Rashid", "Gafurov", 1, 1.6f);
        employees.addEmployee("Kostya", "Sink", 1, 2369.6f);
        employees.addEmployee("Max", "Smouzh", 1, 15896.6f);
        employees.addEmployee("Hleb", "Filipchyk", 2, 9871.6f);
        employees.addEmployee("Tatiana", "Random", 2, 17891.6f);
        employees.addEmployee("Valery", "Paulau", 3, 654654f);
        employees.addEmployee("Levon", "Magderosyan", 3, 4654.6f);
        employees.addEmployee("Sergey", "Belov", 4, 5646.6f);
        employees.addEmployee("Alex", "Ryabkov", 1, 1986.6f);
        employees.addEmployee("Nikolai", "Konsntanrinov", 2, 1556.6f);

        employees.printAllEmployees();
        System.out.println("Sum of all salaries is " + employees.totalSalary() + "$.");
        employees.maxSalary();
        employees.minSalary();
        System.out.println("Average salaryy is " + employees.averageSalary() + "$.");

        employees.indexSalary(10f);
        employees.printAllEmployees();
        employees.minSalaryByDep(3);
        employees.maxSalaryByDep(3);
        System.out.println("Average salary for department is " + employees.averageByDepartment(3) + "$.");

        employees.indexSalary(25,3);
        employees.printAllEmployeesByDepartment(3);

        employees.printAllEmployeesAbove(500_000f);
        employees.printAllEmployeesBelow(2000f);

        employees.deleteEmployee(0);
        employees.printAllEmployees();

        System.out.println("ID " + employees.getEmployeeIndex("Alex", "Ryabkov"));
        employees.deleteEmployee("Alex", "Ryabkov");
        employees.printAllEmployees();

        //Hard 5.1
        employees.setSalary(5,24000f);
        employees.setSalary("Kostya", "Sink", 500f);

        //Hard 5.2
        employees.setDepartment(1,2);
        employees.setDepartment("Max", "Smouzh",3);

        //Hard 6
        employees.printAllEmployeesByDepartment();
    }
}
