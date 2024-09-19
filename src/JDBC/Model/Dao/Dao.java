/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package JDBC.Model.Dao;


/**
 *
 * @author retam
 */
public interface Dao<T> {
    public abstract void create(T t);
    public abstract void delete(T t);
    public abstract java.util.List<T> getAll();
    public abstract T getByid(int id);
}

