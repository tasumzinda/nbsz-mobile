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
import zw.org.nbsz.business.domain.OfferSession;
import zw.org.nbsz.business.repo.OfferSessionRepo;
import zw.org.nbsz.business.service.OfferSessionService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class OfferSessionServiceImpl implements OfferSessionService{
    
    @Resource
    private OfferSessionRepo offerSessionRepo;
    
    @Override
    public OfferSession save(OfferSession item){
        return offerSessionRepo.save(item);
    }
    
    @Override
    public OfferSession get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return offerSessionRepo.findOne(id);
    }
    
    @Override
    public List<OfferSession> getAll(){
        return offerSessionRepo.findAll();
    }
}
