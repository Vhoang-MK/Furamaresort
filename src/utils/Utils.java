package utils;

import java.util.Scanner;
import model.Employee;
import model.Customer;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int inputInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static double inputDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }
    }

    public static boolean validateEmployeeId(String id) {
        return id.matches("^NV-\\d{4}$");
    }

    public static Employee inputEmployee() {
        System.out.println("Enter Employee Details:");
        String id;
        do {
            id = inputString("ID (e.g., NV-1234): ");
            if (!validateEmployeeId(id)) {
                System.out.println("Invalid ID format. Please try again.");
            }
        } while (!validateEmployeeId(id));

        String name = inputString("Name: ");
        String birthDate = inputString("Birth Date (yyyy-MM-dd): ");
        String gender = inputString("Gender (Male/Female): ");
        String idCard = inputString("ID Card Number: ");
        String phone = inputString("Phone Number: ");
        String email = inputString("Email: ");
        String position = inputString("Position: ");
        String qualification = inputString("Qualification: ");
        double salary = inputDouble("Salary: ");

        return new Employee(id, name, birthDate, gender, idCard, phone, email, position, qualification, salary);
    }

    public static Customer inputCustomer() {
        System.out.println("Enter Customer Details:");
        String id = inputString("Customer ID: ");
        String name = inputString("Name: ");
        String birthDate = inputString("Birth Date (yyyy-MM-dd): ");
        String gender = inputString("Gender (Male/Female): ");
        String idCard = inputString("ID Card Number: ");
        String phone = inputString("Phone Number: ");
        String email = inputString("Email: ");
        String customerType = inputString("Customer Type (Diamond, Platinum, etc.): ");
        String address = inputString("Address: ");

        return new Customer(id, name, birthDate, gender, idCard, phone, email, customerType, address);
    }
}
