/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.Donation;
import zw.org.nbsz.business.domain.Offer;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.repo.OfferRepo;
import zw.org.nbsz.business.service.OfferService;
import zw.org.nbsz.business.util.dto.SearchDTO;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class OfferServiceImpl implements OfferService{
    
    @Resource
    private OfferRepo offerRepo;
    
    @PersistenceContext
    private EntityManager entityManager;
    
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
    
    @Override
    public List<Offer> get(SearchDTO dto){
        StringBuilder builder = new StringBuilder("from Offer p");
        int position = 0;
        if(dto.getSearch(dto)){
            builder.append(" where ");
            if(dto.getCentre()!= null){
                if(position == 0){
                    builder.append("p.centre=:centre");
                    position++;
                }else{
                    builder.append(" and p.centre=:centre");
                }
            }
            if(dto.getCollectSite()!= null){
                if(position == 0){
                    builder.append("p.collectSite=:collectSite");
                    position++;
                }else{
                    builder.append(" and p.collectSite=:collectSite");
                }
            }
            if(dto.getEntryDate()!= null && dto.getEntryDate()!= null){
                if(position == 0){
                    builder.append("p.offerDate=:offerDate");
                    position++;
                }else{
                    builder.append(" and p.offerDate=:offerDate");
                }
            }
        }
        TypedQuery query = entityManager.createQuery(builder.toString(), Offer.class);
        if(dto.getCentre()!= null){
            query.setParameter("centre", dto.getCentre());
        }
        if(dto.getCollectSite()!= null){
            query.setParameter("collectSite", dto.getCollectSite());
        }
        if(dto.getEntryDate()!= null){
            query.setParameter("offerDate", dto.getEntryDate());
        }
        return (List<Offer>) query.getResultList();
    }
}
