package model;

public abstract class Person {
    private String id;
    private String name;
    private String birthDate;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;

    public Person(String id, String name, String birthDate, String gender, String idCard, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Birth Date: " + birthDate +
               ", Gender: " + gender + ", ID Card: " + idCard +
               ", Phone: " + phoneNumber + ", Email: " + email;
    }
}
