package com.RashidGafurov_INC_LOL;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees;
    private int size = 10;

    public EmployeeBook() {
        this.employees = new Employee[size];
    }

    public void addEmployee(String firstName, String lastName, int department, float salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(firstName, lastName, department, salary);
                employees[i] = employee;
                break;
            }
        }
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.toString());
            }
        }
    }

    public float totalSalary() {
        float sum = 0.0f;
        for (Employee e :
                employees) {
            sum += e.getSalary();
        }
        return sum;
    }


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

    public float averageSalary() {
        return totalSalary() / countOfEmployees();
    }

    public void indexSalary(float percentage) {
        for (Employee e :
                employees) {
            e.setSalary(e.getSalary() * (100f + percentage) / 100f);
        }
    }

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

    public float averageByDepartment(int department) {
        return salarySumByDepartment(department) / countBydDepartment(department);
    }

    public void indexSalaryByDepartment(float percentage, int department) {
        for (Employee e :
                employees) {
            if (e.getDepartment() == department) {
                e.setSalary(e.getSalary() * (100f + percentage) / 100f);
            }
        }
    }

    public void printAllEmployeesByDepartment(int department) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getDepartment() == department) {
                    System.out.println(e.toString());
                }
            }
        }
    }

    public void printAllEmployeesAbove(float salary) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() >= salary) {
                    System.out.println(e.toString());
                }
            }
        }
    }

    public void printAllEmployeesBelow(float salary) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() < salary) {
                    System.out.println(e.toString());
                }
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public void deleteEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName() == firstName && employees[i].getLastName() == lastName) {
                employees[i] = null;
                break;
            }
        }
    }
}