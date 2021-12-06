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

    public String getfio(){return fio;}
    public String getepartment(){return department;}
    public int getsalary(){return salary;}
    public int getid(){return id;}
    public void setdepartment(String department){ department = department;}
    public void setsalaryalary(int salary){salary = salary;}

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
