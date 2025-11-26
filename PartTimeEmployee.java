/********************************
 * Tony Boyle Jr
 * 11/24/2025
 * Assignment: 3.8 Project Class
 ********************************/

public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(int employeeId, String firstName, String lastName,
                            double hourlyRate, double hoursWorked) {
        super(employeeId, firstName, lastName, "PART_TIME");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nHourly Rate: $" + hourlyRate +
               "\nHours Worked: " + hoursWorked +
               "\nPay: $" + calculatePay();
    }
}