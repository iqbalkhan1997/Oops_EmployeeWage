package com.blz.employeeWageOops;

public class EmployeeWage {
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public static final int EMP_WAGE_PER_HR=20;

    public static void main(String[] args) {
        int empHr=0;
        int empWage;
        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance=(int)(Math.random()*10) % 3;

        if(attendance==FULL_TIME){
            empHr=8;
            System.out.println("Employee is working Full Time");
        }
        else if(attendance==PART_TIME){
            empHr=4;
            System.out.println("Employee is working Part Time");
        }
        else{
            System.out.println("Employee is Absent");
        }
        empWage=empHr*EMP_WAGE_PER_HR;
        System.out.println("Employee's wage is " + empWage);
    }
}
