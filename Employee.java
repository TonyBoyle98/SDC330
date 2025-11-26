/********************************
 * Tony Boyle Jr
 * 11/24/2025
 * Assignment: 3.8 Project Class
 ********************************/

public abstract class Employee implements IRecordActions {

    protected int employeeId;
    protected String firstName;
    protected String lastName;
    protected String employeeType;

    public Employee(int employeeId, String firstName, 
                    String lastName, String employeeType) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
    }

    public abstract double calculatePay();

    public int getEmployeeId() { return employeeId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmployeeType() { return employeeType; }

    @Override
    public void updateRecord() {
        System.out.println("Updating record for employee ID: " + employeeId);
    }

    @Override
    public void deleteRecord() {
        System.out.println("Deleting record for employee ID: " + employeeId);
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
               "\nName: " + firstName + " " + lastName +
               "\nType: " + employeeType;
    }
}