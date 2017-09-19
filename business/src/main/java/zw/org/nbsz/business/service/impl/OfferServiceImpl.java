/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.Donation;
import zw.org.nbsz.business.domain.Offer;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.repo.OfferRepo;
import zw.org.nbsz.business.service.OfferService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class OfferServiceImpl implements OfferService{
    
    @Resource
    private OfferRepo offerRepo;
    
    @Override
    public Offer save(Offer item){
        return offerRepo.save(item);
    }
    
    @Override
    public Offer get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return offerRepo.findOne(id);
    }
    
    @Override
    public List<Offer> getAll(){
        return offerRepo.findAll();
    }
    
    @Override
    public Offer findByPersonAndDonationDate(Person p, Date date){
        return offerRepo.findByPersonAndOfferDate(p, date);
    }
}
