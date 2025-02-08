package model;

public class House extends Facility {
    private String roomStandard;
    private int floors;

    public House(String id, String name, double area, double cost, int maxPeople, String rentalType,
                 String roomStandard, int floors) {
        super(id, name, area, cost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    @Override
    public String getFacilityType() {
        return "House";
    }

    @Override
    public String toString() {
        return super.toString() + ", Room Standard: " + roomStandard + ", Floors: " + floors;
    }
}
