package utils;

import model.Employee;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputString(String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            }
        } while (input.isEmpty());
        return input;
    }

    public static double inputDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static Employee inputEmployee() {
        System.out.println("=== Enter Employee Details ===");
        String id = inputString("Enter Employee ID (format NV-1234): ");
        String name = inputString("Enter Name: ");
        String birthdate = inputString("Enter Birthdate (yyyy-mm-dd): ");
        String gender = inputString("Enter Gender (Male/Female): ");
        String email = inputString("Enter Email: ");
        String phone = inputString("Enter Phone: ");
        double salary = inputDouble("Enter Salary: ");

        return new Employee(id, name, birthdate, gender, id, phone, email, phone, email, salary);
    }
}
