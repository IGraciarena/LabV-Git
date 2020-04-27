package com.company.dao;

import java.sql.SQLException;
import java.util.List;

public interface AbstractDao <T>{
    public abstract void add(T value) throws SQLException;
    public abstract void remove(T value);
    public abstract T update(T value);
    public abstract void remove(Integer id);
    public abstract T getById(Integer id);
    public abstract List<T>getAll();
}
