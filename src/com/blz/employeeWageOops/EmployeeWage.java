package com.blz.employeeWageOops;

public class EmployeeWage {
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;
//    public static final int EMP_WAGE_PER_HR=20;
//    public static final int MAX_WORKING_DAYS=20;
//    public static final int MAX_WORKING_HRS=100;
//    public static final int PROBLEMATIC_SCENARIO=36;

    public static void computeEmpWage(String company, int EMP_WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        int empHr=0;
        int attendance;
        int totalWorkingDays=0,totalEmpHrs=0,totalEmpWage=0;

        while(totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS)
        {
                attendance = (int) (Math.random() * 10) % 3;
            switch (attendance) {
                case FULL_TIME:
                    empHr = 8;
                    break;
                case PART_TIME:
                    empHr = 4;
                    break;
                default:
                    empHr=0;
            }
            totalWorkingDays++;
            totalEmpHrs =+ empHr + totalEmpHrs;
        }
        totalEmpWage = EMP_WAGE_PER_HR * totalEmpHrs;
        System.out.println("Employee worked for "+totalWorkingDays+" days "+totalEmpHrs+" hours");
        System.out.println("For the company "+company+", Employee's Monthly wage is " + totalEmpWage);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmpWage("Saffola",20,20,100);
        computeEmpWage("Fortune",15,15,85);

    }
}
