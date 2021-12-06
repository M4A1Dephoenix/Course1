package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    Employee[] employee = new Employee[2];
    employee[0] = new Employee("Васильев Василий Васильевич", "1", 100000);
    employee[1] = new Employee("Иванов Иван Иванович", "2", 110000);
    int allSalary = 0;
    int lowSalary = 999999999;
    int hightSalary = 0;
    int mediumSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getsalary();
            allSalary = allSalary(salary,allSalary);
        }
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getsalary();
            allSalary = allSalary(salary,allSalary);
        }
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getsalary();
            lowSalary = lowtSalary(salary,lowSalary);
        }
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getsalary();
            hightSalary = hightSalary(salary,hightSalary);
        }
        for (int i = 0; i < employee.length ; i++) {

            int salary = employee[i].getsalary();
            mediumSalary = mediumSalary(i+1, mediumSalary,salary);

            System.out.println("ФИО " + employee[i].getfio()+"; " + "Отдел " + employee[i].getepartment() +"; " + "Заработная плата " + employee[i].getsalary());

        }
        for (int i = 0; i < employee.length ; i++){
            System.out.println("ФИО сотрудника " + employee[i].getfio());
        }
        System.out.println("Общая заработная плата = "+ allSalary);
        System.out.println("Минимальная заработная плата у сотрудника: " + lowSalary);
        System.out.println("Максимальная заработная плата у сотрудника: " + hightSalary);
        System.out.println("Средняя заработная плата у сотрудников: " + mediumSalary);


    }
    public static int allSalary(int salary,int allSalary){

        allSalary= allSalary + salary;
        return allSalary;
    }
    public static int lowtSalary(int salary, int lowSalary){
        if (lowSalary > salary){
            lowSalary = salary;
        }
        return lowSalary;
    }
    public static int hightSalary(int salary, int hightSalary)
    {
        if (hightSalary < salary){
        hightSalary = salary;
        }
        return hightSalary;
    }
    public static int mediumSalary(int i, int  mediumSalary, int salary){
        mediumSalary =  (mediumSalary+salary) /i;
        return  mediumSalary;


    }
}
