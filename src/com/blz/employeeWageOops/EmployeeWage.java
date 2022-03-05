package com.blz.employeeWageOops;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Present=1;
        int attendance=(int)(Math.random()*10) % 2;

        if(attendance==Present){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
