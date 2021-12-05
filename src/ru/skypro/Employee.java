package ru.skypro;

public class Employee {
    private final String fio;
    private final String department;
    private final int salary;
    private final int id; //
    public Employee (String fio, String department, int salary, int id){
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getfio(){return fio;}
    public String getepartment(){return department;}
    public int getsalary(){return salary;}
    public int getid(){return id;}
    public void setdepartment(String department){ department = department;}
    public void setsalaryalary(int salary){salary = salary;}
    public void setid(int id) {id = id;}

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
