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
import zw.org.nbsz.business.domain.Profession;
import zw.org.nbsz.business.repo.ProfessionRepo;
import zw.org.nbsz.business.service.ProfessionService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class ProfessionServiceImpl implements ProfessionService{
    
    @Resource
    private ProfessionRepo professionRepo;
    
    @Override
    public Profession save(Profession item){
        return professionRepo.save(item);
    }
    
    @Override
    public Profession get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return professionRepo.findOne(id);
    }
    
    @Override
    public List<Profession> getAll(){
        return professionRepo.findAll();
    }
}
