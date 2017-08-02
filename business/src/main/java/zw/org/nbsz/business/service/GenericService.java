/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tasu
 * @param <T>
 */
public interface GenericService<T extends Serializable> extends Serializable{
    public List<T> getAll();
    public T get(Long id);
    public T save(T t);
}
