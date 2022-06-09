package com.RashidGafurov_INC_LOL;

public class Employee {
    //Easy 1
    //Создать класс Employee, который содержит информациюо Ф.И.О, отделе и зарплате сотрудника.
    // Отделы для простоты должны быть названы от 1 до 5.
    private String firstName;
    private String lastName;
    private int department;
    private float salary;
    //Easy 3
    //Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    private int id;
    //Easy 2
    //Добавить статическую переменную-счетчик, которая будет отвечать за id.
    private static int idCounter = 0;

    //Easy 6
    //По умолчанию все поля должны передавать через конструктор (кроме id)
    // и заполняться в нем (включая id, который нужно получить из счетчика).
    public Employee(String firstName, String lastName, int department, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        //Easy 3
        //Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public boolean equalNames(String firstName, String lastName) {
        return this.getLastName().equals(lastName) & this.getFirstName().equals(firstName);
    }

    @Override
    public String toString() {
        return  id + ": " + firstName + " " + lastName + " " + department + " " + salary + "$.";
    }

    public String toString(boolean nodepartment) {
        return  id + ": " + firstName + " " + lastName + " " + salary + "$.";
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    //Easy 5
    //Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //Easy 4
    //Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
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
