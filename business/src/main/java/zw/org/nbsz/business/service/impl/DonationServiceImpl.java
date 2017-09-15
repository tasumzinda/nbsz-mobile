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
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.repo.DonationRepo;
import zw.org.nbsz.business.service.DonationService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class DonationServiceImpl implements DonationService{
    
    @Resource
    private DonationRepo donationRepo;
    
    @Override
    public Donation save(Donation item){
        return donationRepo.save(item);
    }
    
    @Override
    public Donation get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return donationRepo.findOne(id);
    }
    
    @Override
    public List<Donation> getAll(){
        return donationRepo.findAll();
    }
    
    @Override
    public Donation findByPersonAndDonationDate(Person p, Date date){
        return donationRepo.findByPersonAndDate(p, date);
    }
}
