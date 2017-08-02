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
import zw.org.nbsz.business.domain.DonorType;
import zw.org.nbsz.business.repo.DonorTypeRepo;
import zw.org.nbsz.business.service.DonorTypeService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class DonorTypeServiceImpl implements DonorTypeService{
    
    @Resource
    private DonorTypeRepo donorTypeRepo;
    
    @Override
    public DonorType save(DonorType item){
        return donorTypeRepo.save(item);
    }
    
    @Override
    public DonorType get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return donorTypeRepo.findOne(id);
    }
    
    @Override
    public List<DonorType> getAll(){
        return donorTypeRepo.findAll();
    }
}
