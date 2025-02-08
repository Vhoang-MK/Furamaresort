package model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Villa(String id, String name, double area, double cost, int maxPeople, String rentalType,
                 String roomStandard, double poolArea, int floors) {
        super(id, name, area, cost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public String getFacilityType() {
        return "Villa";
    }

    @Override
    public String toString() {
        return super.toString() + ", Room Standard: " + roomStandard +
               ", Pool Area: " + poolArea + "m², Floors: " + floors;
    }
}
