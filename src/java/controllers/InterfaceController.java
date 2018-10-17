/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 680183
 * @param <T>
 */
public interface InterfaceController<T> {

    public boolean saveOrUpdate(T t);

    public boolean delete(T t);

    public List<T> getAll();

    public List<T> search(String category, String key);

    public T getById(Object id);
//    public Object getLastId();
//    public Object getByLogin(Object model);
//    public int addNewEmployee(Employee employee, Employee hr)throws SQLException;
//    public List<Employee> getByManagerId(Object object);
//    public int changePassword(String username, String password) throws SQLException;
//    public Object getTempById(Object id);
}
