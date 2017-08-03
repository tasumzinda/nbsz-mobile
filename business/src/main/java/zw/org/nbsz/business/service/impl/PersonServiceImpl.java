/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.repo.PersonRepo;
import zw.org.nbsz.business.service.PersonService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class PersonServiceImpl implements PersonService{
    
    @Resource
    private PersonRepo personRepo;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Person save(Person item){
        return personRepo.save(item);
    }
    
    @Override
    public Person get(Long id){
        if(id == null)
            throw new IllegalStateException("Item does not exist");
        return personRepo.findOne(id);
    }
    
    @Override
    public List<Person> getAll(){
        return personRepo.findAll();
    }
    
    @Override
    public List<Person> getBySurname(String surname){
        return personRepo.findBySurname(surname);
    }
    
    @Override
    public Person getByDonorNumber(String donorNumber){
        return personRepo.findByDonorNumber(donorNumber);
    }
    
    @Override
    public List<Person> getByCollectSite(CollectSite collectSite){
        return personRepo.findByCollectSite(collectSite);
    }
    
    public Long getLastInsertId(){
        return personRepo.findLastInsertId();
    }
    
    @Override
    public String getLastDonorNumber() {
        String builder = "Select p.donorNumber from Person p where p.id=" + getLastInsertId();
        TypedQuery query = entityManager.createQuery(builder, String.class);
        return (String) query.getSingleResult();
    }
}
