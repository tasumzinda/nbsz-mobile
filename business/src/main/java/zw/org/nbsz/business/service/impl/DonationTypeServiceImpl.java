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
import zw.org.nbsz.business.domain.DonationType;
import zw.org.nbsz.business.repo.DonationTypeRepo;
import zw.org.nbsz.business.service.DonationTypeService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class DonationTypeServiceImpl implements DonationTypeService{
    
    @Resource
    private DonationTypeRepo donationTypeRepo;
    
    @Override
    public DonationType save(DonationType item){
        return donationTypeRepo.save(item);
    }
    
    @Override
    public DonationType get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return donationTypeRepo.findOne(id);
    }
    
    @Override
    public List<DonationType> getAll(){
        return donationTypeRepo.findAll();
    }
}
