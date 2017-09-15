/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.Incentive;
import zw.org.nbsz.business.repo.IncentiveRepo;
import zw.org.nbsz.business.service.IncentiveService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class IncentiveServiceImpl implements IncentiveService{
    
    @Resource
    private IncentiveRepo incentiveRepo;
    
    @Override
    public List<Incentive> getAll() {
        return incentiveRepo.findAll();
    }

    @Override
    public Incentive get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return incentiveRepo.findOne(id);
    }

    @Override
    public void delete(Incentive t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        incentiveRepo.delete(t);
    }


    @Override
    @Transactional
    public Incentive save(Incentive t) {
        if (t.getId() == null) {
            return incentiveRepo.save(t);
        }
        return incentiveRepo.save(t);
    }

    @Override
    public Incentive getByName(String name) {
        return incentiveRepo.findByName(name);
    }

    @Override
    public Boolean checkDuplicate(Incentive current, Incentive old) {
        if (current.getId() != null) {
            /**
             * @param current is in existence
             */
            if (!current.getName().equalsIgnoreCase(old.getName())) {
                if (getByName(current.getName()) != null) {
                    return true;
                }
            }

        } else if (current.getId() == null) {
            /**
             * @param current is new
             */
            if (getByName(current.getName()) != null) {
                return true;
            }
        }
        return false;
    }
}
