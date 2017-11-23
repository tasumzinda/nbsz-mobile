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
import zw.org.nbsz.business.domain.Incentive;
import zw.org.nbsz.business.domain.SpecialNotes;
import zw.org.nbsz.business.repo.IncentiveRepo;
import zw.org.nbsz.business.repo.SpecialNotesRepo;
import zw.org.nbsz.business.service.SpecialNotesService;

/**
 *
 * @author tasu
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class SpecialNotesServiceImpl implements SpecialNotesService{
    
    @Resource
    private SpecialNotesRepo specialNotesRepo;
    
    @Override
    public List<SpecialNotes> getAll() {
        return specialNotesRepo.findAll();
    }

    @Override
    public SpecialNotes get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return specialNotesRepo.findOne(id);
    }

    @Override
    public void delete(SpecialNotes t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        specialNotesRepo.delete(t);
    }


    @Override
    @Transactional
    public SpecialNotes save(SpecialNotes t) {
        if (t.getId() == null) {
            return specialNotesRepo.save(t);
        }
        return specialNotesRepo.save(t);
    }

    @Override
    public SpecialNotes getByName(String name) {
        return specialNotesRepo.findByName(name);
    }

    @Override
    public Boolean checkDuplicate(SpecialNotes current, SpecialNotes old) {
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
