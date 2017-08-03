/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.repo;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tasu
 * @param <T>
 * @param <ID>
 */
public interface AbstractRepo<T, ID extends Serializable> extends CrudRepository<T, ID>{
   
    @Override
    public List<T> findAll();
}
