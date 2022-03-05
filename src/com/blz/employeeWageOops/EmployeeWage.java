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

        switch (attendance){
            case FULL_TIME:
                System.out.println("Employee is working Full Time");
                empHr=8;
                break;
            case PART_TIME:
                System.out.println("Employee is working Part Time");
                empHr=4;
                break;
            default:
                System.out.println("Employee is absent");
        }

        empWage=empHr*EMP_WAGE_PER_HR;
        System.out.println("Employee's wage is " + empWage);
    }
}
