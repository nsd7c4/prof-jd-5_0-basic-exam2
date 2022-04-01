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

        //Easy 8.a
        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        employees.printAllEmployees();

        //Easy 8.b
        //Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("Sum of all salaries is " + employees.totalSalary() + "$.");

        //Easy 8.d
        //Найти сотрудника с максимальной зарплатой.
        employees.maxSalary();

        //Easy 8.c
        //Найти сотрудника с минимальной зарплатой.
        employees.minSalary();

        //Easy 8.e
        //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("Average salaryy is " + employees.averageSalary() + "$.");

        //Medium 1
        //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        employees.indexSalary(10f);

        //Easy 8.a
        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        employees.printAllEmployees();

        //Medium 2.a
        //Сотрудника с минимальной зарплатой.
        employees.minSalaryByDep(3);

        //Medium 2.b
        //Сотрудника с максимальной зарплатой.
        employees.maxSalaryByDep(3);

        //Medium 2.d
        //Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        System.out.println("Average salary for department is " + employees.averageByDepartment(3) + "$.");

        //Medium 2.e
        //Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
        employees.indexSalary(25,3);
        employees.printAllEmployeesByDepartment(3);

        //Medium 3.a
        //Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
        employees.printAllEmployeesBelow(2000f);

        //Medium 3.b
        //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
        employees.printAllEmployeesAbove(500_000f);


        //Hard 4.b
        //Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
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
