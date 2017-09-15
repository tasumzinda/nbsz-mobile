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
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.repo.PersonRepo;
import zw.org.nbsz.business.service.PersonService;
import zw.org.nbsz.business.util.dto.SearchDTO;

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
    public List<Person> getByEntryDate(Date entryDate){
        return personRepo.findByEntryDate(entryDate);
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
    public Person getByIdNumber(String idNumber){
        return personRepo.findByIdNumber(idNumber);
    }
    
    @Override
    public List<Person> getByFirstNameAndSurnameAndDateOfBirth(String firstName, String surname, Date dateOfBirth){
        return personRepo.findByFirstNameAndSurnameAndDateOfBirth(firstName, surname, dateOfBirth);
    }
    
    @Override
    public List<Person> getBySurnameAndDateOfBirth(String surname, Date dateOfBirth){
        return personRepo.findBySurnameAndDateOfBirth(surname, dateOfBirth);
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
    
    @Override
    public List<Person> get(SearchDTO dto){
        StringBuilder builder = new StringBuilder("from Person p");
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
                    builder.append("p.entryDate=:entryDate");
                    position++;
                }else{
                    builder.append(" and p.entryDate=:entryDate");
                }
            }
        }
        TypedQuery query = entityManager.createQuery(builder.toString(), Person.class);
        if(dto.getCentre()!= null){
            query.setParameter("centre", dto.getCentre());
        }
        if(dto.getCollectSite()!= null){
            query.setParameter("collectSite", dto.getCollectSite());
        }
        if(dto.getEntryDate()!= null){
            query.setParameter("entryDate", dto.getEntryDate());
        }
        return (List<Person>) query.getResultList();
    }
}
