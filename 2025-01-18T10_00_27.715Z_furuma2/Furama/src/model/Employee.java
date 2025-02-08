package model;

public class Employee extends Person {
    private String position;
    private String qualification;
    private double salary;

    public Employee(String id, String name, String birthDate, String gender, String idCard,
                    String phoneNumber, String email, String position, String qualification, double salary) {
        super(id, name, birthDate, gender, idCard, phoneNumber, email);
        this.position = position;
        this.qualification = qualification;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", Position: " + position +
               ", Qualification: " + qualification + ", Salary: $" + salary;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public char[] toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
