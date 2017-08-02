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
import zw.org.nbsz.business.domain.DefferredReason;
import zw.org.nbsz.business.repo.DefferredReasonRepo;
import zw.org.nbsz.business.service.DefferredReasonService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class DefferedReasonServiceImpl implements DefferredReasonService{
    
    @Resource
    private DefferredReasonRepo defferredReasonRepo;
    
    @Override
    public DefferredReason save(DefferredReason item){
        return defferredReasonRepo.save(item);
    }
    
    @Override
    public DefferredReason get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return defferredReasonRepo.findOne(id);
    }
    
    @Override
    public List<DefferredReason> getAll(){
        return defferredReasonRepo.findAll();
    }
}
