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
import zw.org.nbsz.business.domain.MaritalStatus;
import zw.org.nbsz.business.repo.MaritalStatusRepo;
import zw.org.nbsz.business.service.MaritalStatusService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class MaritalStatusServiceImpl implements MaritalStatusService{
    
    @Resource
    private MaritalStatusRepo maritalStatusRepo;
    
    @Override
    public MaritalStatus save(MaritalStatus item){
        return maritalStatusRepo.save(item);
    }
    
    @Override
    public MaritalStatus get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return maritalStatusRepo.findOne(id);
    }
    
    @Override
    public List<MaritalStatus> getAll(){
        return maritalStatusRepo.findAll();
    }
}
