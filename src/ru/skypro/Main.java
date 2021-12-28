package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    private static Employee[] employees = new Employee[2];

    public static void main(String[] args) {Employee[] employee = new Employee[2];
    employees[0] = new Employee("Васильев Василий Васильевич", "1", 100000);
    employees[1] = new Employee("Иванов Иван Иванович", "2", 110000);
    int allSalary = 0;


        allSalary = calculateTotalSalary();
        int lowSalary = calculateLowSalary();
        int hightSalary = calculateHightSalary();
        int mediumSalary = calculateMediumSalary();

        /*for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            allSalary = allSalary(salary,allSalary);
        }
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            allSalary = allSalary(salary,allSalary);
        }
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            lowSalary = lowtSalary(salary,lowSalary);
        }
        for (int i = 0; i < employee.length; i++) {
            int salary = employee[i].getSalary();
            hightSalary = hightSalary(salary,hightSalary);
        }
       /* for (int i = 0; i < employee.length ; i++) {

            int salary = employee[i].getSalary();
            mediumSalary = mediumSalary(i+1, mediumSalary,salary);

            System.out.println("ФИО " + employee[i].getFio()+"; " + "Отдел " + employee[i].getDepartment() +"; " + "Заработная плата " + employee[i].getSalary());

        }

        for (int i = 0; i < employee.length ; i++){
            System.out.println("ФИО сотрудника " + employee[i].getFio());
        }
        */
        System.out.println("Общая заработная плата = "+ allSalary);
        System.out.println("Минимальная заработная плата у сотрудника: " + lowSalary);
        System.out.println("Максимальная заработная плата у сотрудника: " + hightSalary);
        System.out.println("Средняя заработная плата у сотрудников: " + mediumSalary);


    }
    public static int calculateTotalSalary () {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
        }
    public static int calculateLowSalary(){
        int lowSalary = 999999999;
        for (Employee employee : employees){
            if (lowSalary> employee.getSalary()){
                lowSalary = employee.getSalary();
            }
        }
        return lowSalary;
        }
    public static int calculateHightSalary() {
        int hightSalary = 0;
        for (Employee employee : employees) {
            if (hightSalary < employee.getSalary()) {
                hightSalary = employee.getSalary();
            }
        }
        return hightSalary;
    }
    public static int calculateMediumSalary(){
        int mediumSalary = 0;
        int i = 0;
        for (Employee employee : employees){
            mediumSalary =+employee.getSalary();
            i++;


        }
        mediumSalary = mediumSalary / i;
        return mediumSalary;
        }


   /* public static int allSalary(int salary,int allSalary){

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
    */
}
