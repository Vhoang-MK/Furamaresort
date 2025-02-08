package model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer(String id, String name, String birthDate, String gender, String idCard,
                    String phoneNumber, String email, String customerType, String address) {
        super(id, name, birthDate, gender, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Customer Type: " + customerType + ", Address: " + address;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
