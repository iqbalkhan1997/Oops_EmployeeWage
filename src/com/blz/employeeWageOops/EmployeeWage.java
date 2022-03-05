package com.blz.employeeWageOops;

public class EmployeeWage {
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    private final String company;
    private final int EMP_WAGE_PER_HR;
    private final int MAX_WORKING_DAYS;
    private final int MAX_WORKING_HRS;
    private int totalEmpWage;

    public EmployeeWage(String company, int EMP_WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        this.company = company;
        this.EMP_WAGE_PER_HR = EMP_WAGE_PER_HR;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
    }

    public void computeEmpWage() {
        int empHr = 0;
        int attendance;
        int totalWorkingDays = 0, totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
            attendance = (int) (Math.random() * 10) % 3;
            switch (attendance) {
                case FULL_TIME:
                    empHr = 8;
                    break;
                case PART_TIME:
                    empHr = 4;
                    break;
                default:
                    empHr = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = +empHr + totalEmpHrs;
        }
        totalEmpWage = EMP_WAGE_PER_HR * totalEmpHrs;
    }

    @Override
    public String toString() {
        return "For the company " + company + ", Employee's total wage is " + totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //initializing companies and their properties
        EmployeeWage royalMart = new EmployeeWage("RoyalMart", 20, 20, 100);
        EmployeeWage fortune = new EmployeeWage("Fortune", 15, 15, 85);
        EmployeeWage megaMart = new EmployeeWage("MegaMart", 15, 15, 85);
        royalMart.computeEmpWage();
        System.out.println(royalMart);
        fortune.computeEmpWage();
        System.out.println(fortune);
        megaMart.computeEmpWage();
        System.out.println(megaMart);
    }
}
