package com.blz.employeeWageOops;

public class EmployeeWageArray {
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;

private int numOfCompanies=0;
private CompanyEmpWage[] companyEmpWageArray;

public EmployeeWageArray(){
    companyEmpWageArray=new CompanyEmpWage[5];
}
private void addCompanyEmpWage(String company,int EMP_WAGE_PER_HR,int MAX_WORKING_DAYS,int MAX_WORKING_HRS){
    companyEmpWageArray[numOfCompanies]=new CompanyEmpWage(company,EMP_WAGE_PER_HR,MAX_WORKING_DAYS,MAX_WORKING_HRS);
    numOfCompanies++;
}
private void computeEmpWage(){
    for(int i=0;i<numOfCompanies;i++){
        companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
        System.out.println(companyEmpWageArray[i]);
    }
}

    private int computeEmpWage(CompanyEmpWage CompanyEmpWage) {
        int empHr = 0;
        int attendance;
        int totalWorkingDays = 0, totalEmpHrs = 0;

        while (totalEmpHrs <= CompanyEmpWage.MAX_WORKING_HRS && totalWorkingDays < CompanyEmpWage.MAX_WORKING_DAYS) {
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
        int totalEmpWage = CompanyEmpWage.EMP_WAGE_PER_HR * totalEmpHrs;

        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //initializing companies and their properties
        EmployeeWageArray empWage = new EmployeeWageArray();

        empWage.addCompanyEmpWage("DMart",20,15,70);
        empWage.addCompanyEmpWage("Swiggy",25,15,60);
        empWage.computeEmpWage();
    }
}
