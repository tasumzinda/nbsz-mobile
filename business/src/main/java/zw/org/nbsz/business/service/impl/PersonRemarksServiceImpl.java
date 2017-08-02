/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.PersonRemarks;
import zw.org.nbsz.business.repo.PersonRemarksRepo;
import zw.org.nbsz.business.service.PersonRemarksService;

/**
 *
 * @author tasu
 */
@Transactional
@Repository
public class PersonRemarksServiceImpl implements PersonRemarksService{
    
    @Resource
    private PersonRemarksRepo personRemarksRepo;
    
    @Override
    public PersonRemarks save(PersonRemarks item){
        return personRemarksRepo.save(item);
    }
    
    @Override
    public PersonRemarks get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return personRemarksRepo.findOne(id);
    }
    
    @Override
    public List<PersonRemarks> getAll(){
        return personRemarksRepo.findAll();
    }
}
