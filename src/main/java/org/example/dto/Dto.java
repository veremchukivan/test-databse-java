package org.example.dto;

import java.util.List;
import java.util.Optional;

public interface Dto<T> {
    Optional<T> get(int id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}
