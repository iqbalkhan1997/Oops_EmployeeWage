package com.blz.employeeWageOops;

public class EmployeeWage {
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public static final int EMP_WAGE_PER_HR=20;
    public static final int MAX_WORKING_DAYS=20;
    public static final int MAX_WORKING_HRS=100;
    public static final int PROBLEMATIC_SCENARIO=36;

    public static int computeEmpWage() {
        int empHr=0;
        int attendance;
        int totalWorkingDays=0,totalEmpHrs=0,totalEmpWage=0;
        System.out.println("Welcome to Employee Wage Computation Program");

        while(totalEmpHrs < MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS)
        {
            if (totalEmpHrs==PROBLEMATIC_SCENARIO) {
                attendance = PART_TIME;
            }
            else {
                attendance = (int) (Math.random() * 10) % 3;
            }

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
        System.out.println("Employee's Monthly wage is " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args){
        // EmployeeWage EmployeeWage=new EmployeeWage();
         computeEmpWage();
    }
}
