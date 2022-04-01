package com.RashidGafurov_INC_LOL;

import java.util.Arrays;
import java.util.Objects;

public class EmployeeBook {
    private final Employee[] employees;
    private int size = 10;

    public EmployeeBook() {
        this.employees = new Employee[size];
    }

    //Hard 4.a
    //Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
    //Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее.
    //Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
    public void addEmployee(String firstName, String lastName, int department, float salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(firstName, lastName, department, salary);
                employees[i] = employee;
                break;
            }
        }
    }

    //Easy 8.a
    //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.toString());
            }
        }
    }

    //Easy 8.b
    //Посчитать сумму затрат на зарплаты в месяц.
    public float totalSalary() {
        float sum = 0.0f;
        for (Employee e :
                employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    //Easy 8.c
    //Найти сотрудника с минимальной зарплатой.
    public void minSalary() {
        float minS = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minS) {
                minS = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println(employees[index].fullName() + " have smallest salary of " + minS + "$.");
    }

    //Easy 8.d
    //Найти сотрудника с максимальной зарплатой.
    public void maxSalary() {
        float maxS = Float.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxS) {
                maxS = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println(employees[index].fullName() + " have biggest salary of " + maxS + "$.");
    }

    public int countOfEmployees() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
            }
        }
        return count;
    }

    //Easy 8.e
    //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public float averageSalary() {
        return totalSalary() / countOfEmployees();
    }

    //Medium 1
    //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public void indexSalary(float percentage) {
        for (Employee e :
                employees) {
            e.setSalary(e.getSalary() * (100f + percentage) / 100f);
        }
    }

    //Medium 2.a
    //Сотрудника с минимальной зарплатой.
    public void minSalaryByDep(int department) {
        float minS = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minS) {
                if (employees[i].getDepartment() == department) {
                    minS = employees[i].getSalary();
                    index = i;
                }
            }
        }
        System.out.println(employees[index].fullName() + " have smallest salary of " + minS + "$ in department " + department);
    }

    //Medium 2.b
    //Сотрудника с максимальной зарплатой.
    public void maxSalaryByDep(int department) {
        float maxS = Float.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxS) {
                if (employees[i].getDepartment() == department) {
                    maxS = employees[i].getSalary();
                    index = i;
                }
            }
        }
        System.out.println(employees[index].fullName() + " have biggest salary of " + maxS + "$ in department " + department);
    }

    public int countBydDepartment(int department) {
        int count = 0;
        for (Employee e :
                employees) {
            if (e.getDepartment() == department) {
                count++;
            }
        }
        return count;
    }

    //Medium 2.c
    //Сумму затрат на зарплату по отделу.
    public float salarySumByDepartment(int department) {
        float sum = 0f;
        for (Employee e :
                employees) {
            if (e.getDepartment() == department) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    //Medium 2.d
    //Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    public float averageByDepartment(int department) {
        return salarySumByDepartment(department) / countBydDepartment(department);
    }

    //Medium 2.e
    //Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public void indexSalary(float percentage, int department) {
        for (Employee e :
                employees) {
            if (e.getDepartment() == department) {
                e.setSalary(e.getSalary() * (100f + percentage) / 100f);
            }
        }
    }

    //Medium 2.f
    //Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public void printAllEmployeesByDepartment(int department) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getDepartment() == department) {
                    System.out.println(e.toString(true));
                }
            }
        }
    }

    public int getEmployeeIndex(int id) {
        int index = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    index = i;
                    break;
                }
            }
        }
        if (index < 0) {
            throw new RuntimeException("Индекс не может быть меньше 0");
        } else {
            return index;
        }
    }

    public int getEmployeeIndex(String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].equalNames(firstName, lastName)) {
                    index = i;
                    break;
                }
            }
        }
        if (index < 0) {
            throw new RuntimeException("Индекс не может быть меньше 0");
        } else {
            return index;
        }
    }

    //Medium 3.b
    //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public void printAllEmployeesAbove(float salary) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() >= salary) {
                    System.out.println(e.toString());
                }
            }
        }
    }

    //Medium 3.a
    //Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public void printAllEmployeesBelow(float salary) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() < salary) {
                    System.out.println(e.toString());
                }
            }
        }
    }


    //Hard 4.b
    //Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
    public void deleteEmployee(int id) {
        employees[getEmployeeIndex(id)] = null;
    }

    public void deleteEmployee(String firstName, String lastName) {
        employees[getEmployeeIndex(firstName, lastName)] = null;
    }

    //Hard 5.1
    //Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
    //Изменить зарплату.
    public void setSalary(String firstName, String lastName, float salary) {
        employees[getEmployeeIndex(firstName, lastName)].setSalary(salary);
    }

    public void setSalary(int id, float salary) {
        employees[getEmployeeIndex(id)].setSalary(salary);
    }

    //Hard 5.2
    //Изменить отдел.
    //Придумать архитектуру. Сделать или два метода, или один, но продумать его.
    public void setDepartment(String firstName, String lastName, int department) {
        employees[getEmployeeIndex(firstName, lastName)].setDepartment(department);
    }

    public void setDepartment(int id, int department) {
        employees[getEmployeeIndex(id)].setDepartment(department);
    }

    //Hard 6
    //Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
    public void printAllEmployeesByDepartment() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Department " + i + ":");
            printAllEmployeesByDepartment(i);
        }
    }

}