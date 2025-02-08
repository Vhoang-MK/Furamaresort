package repository;

import model.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String FILE_PATH = "data/employee.csv";

    @Override
    public List<Employee> readFile() {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.add(new Employee(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], Double.parseDouble(data[9])));//Employee(data[0], data[1], data[2], data[3], data[4], data[5], Double.parseDouble(data[6])));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return employees;
    }

    @Override
    public void writeFile(List<Employee> employees) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Employee e : employees) {
                bw.write(e.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
