package service;

import java.util.List;

public interface Service<T> {
    List<T> getAll();
    void add(T item);
    void update(String id, T item);
    T findById(String id);
}
