/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.repo.CentreRepo;
import zw.org.nbsz.business.service.CentreService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class CentreServiceImpl implements CentreService{
    
    @Resource
    private CentreRepo centreRepo;
    
    @Override
    public Centre save(Centre item){
        return centreRepo.save(item);
    }
    
    @Override
    public Centre get(Long id){
        if(id == null){
            throw new IllegalStateException("Item does not exist");
        }
        return centreRepo.findOne(id);
    }
    
    
    @Override
    public List<Centre> getAll(){
        return centreRepo.findAll();
    }
}
