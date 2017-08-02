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
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.repo.CollectSiteRepo;
import zw.org.nbsz.business.service.CollectSiteService;

/**
 *
 * @author tasu
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class CollectSiteServiceImpl implements CollectSiteService{
    
    @Resource
    private CollectSiteRepo collectSiteRepo;
    
    @Override
    public CollectSite save(CollectSite item){
        return collectSiteRepo.save(item);
    }
    
    @Override
    public CollectSite get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
       return collectSiteRepo.findOne(id);
    }
    
    
    
    @Override
    public List<CollectSite> getAll(){
        return collectSiteRepo.findAll();
    }
}
