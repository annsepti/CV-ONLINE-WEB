/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import java.util.ArrayList;
import java.util.List;
import models.Bahasa;
import org.hibernate.SessionFactory;

/**
 *
 * @author 680183
 * @param <T>
 */
public class GeneralController<T> implements InterfaceController<T>{
    public SessionFactory sessionFactory;
    private InterfaceDAO iDAO;

    public GeneralController(SessionFactory sessionFactory, Class type) {
        this.sessionFactory = sessionFactory;
        this.iDAO = new GeneralDAO(sessionFactory,type);
    }
    
    private List<T> castToT(List<Object> allData) {
    List<T> datas = new ArrayList<>();
    allData.stream().map((object) -> (T) object).forEachOrdered((t) -> {
        datas.add(t);
        });
    return datas;
    }
    
    @Override
    public boolean saveOrUpdate(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(T t) {
        return iDAO.delete(t);
    }

    @Override
    public List<T> getAll() {
        System.out.println(iDAO.getAll().size());
        return this.castToT(iDAO.getAll());
    }

    @Override
    public List<T> search(String category, String key){
        return this.castToT(iDAO.search(category, key));
    }

    @Override
    public T getById(Object id) {
        return (T) iDAO.getById(id);
    }
    
   
}
// @Override
//    public List<T> getAll(){
//    return this.castToT(iDAO.getAll());
//}
//
//    private List<T> castToT(List<Object> allData) {
//    List<T> datas = new ArrayList<>();
//    for(Object object : allData){
//        T t = (T) object;
//        datas.add(t);
//    }
//    return datas;
//    }
//   
//    @Override
//    public List<T> search(String category, String key){
//        return this.castToT(iDAO.search(category, key));
//    }
//    
//    @Override
//    public T getById(String id){
//        return (T) iDAO.getById(id);
//    }
//
//    @Override
//    public boolean saveOrUpdate(Object t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//
//    @Override
//    public boolean delete(Object t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
