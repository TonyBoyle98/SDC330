/********************************
 * Tony Boyle Jr
 * 11/24/2025
 * Assignment: 3.8 Project Class
 ********************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollSystem {

    private List<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.\n");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
                System.out.println("----------------------------");
            }
        }
    }

    // Placeholder for future DB integration
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Payroll System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // buffer clear

            switch (choice) {
                case 1 -> dummyAddEmployee(scanner);
                case 2 -> displayAllEmployees();
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 3);
    }

    // Temporary method until DB version arrives
    private void dummyAddEmployee(Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter first name: ");
        String first = scanner.nextLine();

        System.out.print("Enter last name: ");
        String last = scanner.nextLine();

        System.out.print("Full-time or Part-time (F/P)? ");
        String type = scanner.nextLine().toUpperCase();

        if (type.equals("F")) {
            System.out.print("Enter annual salary: ");
            double salary = scanner.nextDouble();
            addEmployee(new FullTimeEmployee(id, first, last, salary));
        } else {
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            double hours = scanner.nextDouble();
            addEmployee(new PartTimeEmployee(id, first, last, rate, hours));
        }
    }
}