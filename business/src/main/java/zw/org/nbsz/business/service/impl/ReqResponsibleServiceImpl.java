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
import zw.org.nbsz.business.domain.ReqResponsible;
import zw.org.nbsz.business.repo.ReqResponsibleRepo;
import zw.org.nbsz.business.service.ReqResponsibleService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class ReqResponsibleServiceImpl implements ReqResponsibleService{
    
    @Resource
    private ReqResponsibleRepo reqResponsibleRepo;
    
    @Override
    public ReqResponsible save(ReqResponsible item){
        return reqResponsibleRepo.save(item);
    }
    
    @Override
    public ReqResponsible get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return reqResponsibleRepo.findOne(id);
    }
    
    @Override
    public List<ReqResponsible> getAll(){
        return reqResponsibleRepo.findAll();
    }
}
