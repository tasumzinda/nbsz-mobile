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
import zw.org.nbsz.business.domain.Counsellor;
import zw.org.nbsz.business.repo.CounsellorRepo;
import zw.org.nbsz.business.service.CounsellorService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class CounsellorServiceImpl implements CounsellorService{
    
    @Resource
    private CounsellorRepo counsellorRepo;
    
    @Override
    public Counsellor save(Counsellor item){
        return counsellorRepo.save(item);
    }
    
    @Override
    public Counsellor get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return counsellorRepo.findOne(id);
    }
    
    @Override
    public List<Counsellor> getAll(){
        return counsellorRepo.findAll();
    }
}
