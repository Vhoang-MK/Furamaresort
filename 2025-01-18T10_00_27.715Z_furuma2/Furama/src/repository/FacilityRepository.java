package repository;

import model.Facility;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements Repository<Facility> {
    private List<Facility> facilities = new ArrayList<>();

    @Override
    public List<Facility> getAll() {
        return facilities;
    }

    @Override
    public void saveAll(List<Facility> items) {
        this.facilities = items;
    }

    @Override
    public Facility findById(String id) {
        return facilities.stream()
                .filter(facility -> facility.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Facility item) {
        facilities.add(item);
    }

    @Override
    public void update(String id, Facility updated) {
        Facility existing = findById(id);
        if (existing != null) {
            int index = facilities.indexOf(existing);
            facilities.set(index, updated);
        }
    }
}
