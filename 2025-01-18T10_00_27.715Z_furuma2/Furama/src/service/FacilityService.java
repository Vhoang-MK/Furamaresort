package service;

import model.Facility;

public interface FacilityService extends Service<Facility> {
    void displayFacilityList();
    void addNewFacility();
    void displayFacilityMaintenanceList();
}
