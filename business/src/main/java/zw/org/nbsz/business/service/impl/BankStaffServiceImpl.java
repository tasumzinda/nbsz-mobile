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
import zw.org.nbsz.business.domain.BankStaff;
import zw.org.nbsz.business.repo.BankStaffRepo;
import zw.org.nbsz.business.service.BankStaffService;

/**
 *
 * @author tasu
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BankStaffServiceImpl implements BankStaffService{
    
    @Resource
    private BankStaffRepo bankStaffRepo;
    
    @Override
    public BankStaff save(BankStaff item){
        return bankStaffRepo.save(item);
    }
    
    @Override
    public BankStaff get(Long id){
        if(id == null){
            throw new IllegalStateException("Item does not exist");
        }
        return bankStaffRepo.findOne(id);
    }
    
    @Override
    public List<BankStaff> getAll(){
        return bankStaffRepo.findAll();
    }
}
