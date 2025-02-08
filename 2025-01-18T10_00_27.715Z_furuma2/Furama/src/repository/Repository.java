package repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    void saveAll(List<T> items);
    T findById(String id);
    void add(T item);
    void update(String id, T item);
}
