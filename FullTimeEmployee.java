/********************************
 * Tony Boyle Jr
 * 11/24/2025
 * Assignment: 3.8 Project Class
 ********************************/

public class FullTimeEmployee extends Employee {

    private double annualSalary;

    public FullTimeEmployee(int employeeId, String firstName, 
                            String lastName, double annualSalary) {
        super(employeeId, firstName, lastName, "FULL_TIME");
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() { return annualSalary; }
    public void setAnnualSalary(double annualSalary) { this.annualSalary = annualSalary; }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAnnual Salary: $" + annualSalary +
               "\nMonthly Pay: $" + calculatePay();
    }
}