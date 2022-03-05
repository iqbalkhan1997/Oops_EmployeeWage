package com.blz.employeeWageOops;

public class EmployeeWage {
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public static final int EMP_WAGE_PER_HR=20;
    public static final int MAX_WORKING_DAYS=20;

    public static void main(String[] args) {
        int empHr=0;
        int empWage;
        int totalWorkingDays; int totalEmpWage=0;
        System.out.println("Welcome to Employee Wage Computation Program");

        for(totalWorkingDays=1;totalWorkingDays<=MAX_WORKING_DAYS;totalWorkingDays++) {
            int Empcheck = (int) (Math.random() * 10) % 3;

            switch (Empcheck) {
                case FULL_TIME:
                    empHr = 8;
                    break;
                case PART_TIME:
                    empHr = 4;
                    break;
                default:
            }

            empWage = empHr * EMP_WAGE_PER_HR;
            totalEmpWage =+ empWage+totalEmpWage;
        }
        System.out.println("Employee's Monthly wage is " + totalEmpWage);
    }
}
