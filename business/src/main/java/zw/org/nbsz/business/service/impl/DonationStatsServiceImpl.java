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
import zw.org.nbsz.business.domain.DonationStats;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.repo.DonationStatsRepo;
import zw.org.nbsz.business.service.DonationStatsService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class DonationStatsServiceImpl implements DonationStatsService{
    
    @Resource
    private DonationStatsRepo repo;
    
    @Override
    public DonationStats save(DonationStats item){
        return repo.save(item);
    }
    
    @Override
    public DonationStats get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return repo.findOne(id);
    }
    
    @Override
    public List<DonationStats> getAll(){
        return repo.findAll();
    }
    
    @Override
    public DonationStats getByPersonAndEntryDate(Person p, Date entryDate){
        return repo.findByPersonAndEntryDate(p, entryDate);
    }
}
