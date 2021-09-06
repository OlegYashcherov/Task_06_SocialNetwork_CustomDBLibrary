package com.olegyashcherov.dao;

import java.util.List;

public interface Dao<T> {

    List<T> getAll();

    T getById(long id);

    long insert(T t);

    void delete(T t);

}
