package model;

public abstract class Facility {
    private String id;
    private String name;
    private double area;
    private double cost;
    private int maxPeople;
    private String rentalType;

    public Facility(String id, String name, double area, double cost, int maxPeople, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public abstract String getFacilityType();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Area: " + area + "m², Cost: $" + cost +
               ", Max People: " + maxPeople + ", Rental Type: " + rentalType;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
