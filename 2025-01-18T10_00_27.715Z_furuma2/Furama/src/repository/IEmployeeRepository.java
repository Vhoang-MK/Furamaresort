package repository;

import model.Employee;
import java.util.List;

public interface IEmployeeRepository {
    List<Employee> readFile();
    void writeFile(List<Employee> employees);
}
