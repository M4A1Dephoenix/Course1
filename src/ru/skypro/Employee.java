package ru.skypro;

public class Employee {
    private final String fio;
    private String department;
    private int salary;
    private final int id;
    static int counter;
    public Employee (String fio, String department, int salary){
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                ", id=" + id +
                '}';
    }
}
