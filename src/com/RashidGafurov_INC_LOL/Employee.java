package com.RashidGafurov_INC_LOL;

public class Employee {

    private String firstName;
    private String lastName;
    private int department;
    private float salary;
    private int id;
    private char currency;
    private static int idCounter = 0;

    public int getId() {
        return id;
    }

    public Employee(String firstName, String lastName, int department, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        return  id + ": " + firstName + " " + lastName + " " + department + " " + salary + "$.";
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

}
