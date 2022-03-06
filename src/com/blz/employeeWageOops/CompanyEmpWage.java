package com.blz.employeeWageOops;

public class CompanyEmpWage {
    public final String company;
    public final int EMP_WAGE_PER_HR;
    public final int MAX_WORKING_DAYS;
    public final int MAX_WORKING_HRS;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int EMP_WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        this.company = company;
        this.EMP_WAGE_PER_HR = EMP_WAGE_PER_HR;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }

    @Override
    public String toString() {
        return "For the company " + company + ", Employee's total wage is " + totalEmpWage;
    }
}
