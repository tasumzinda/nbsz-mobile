/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import java.util.Date;
import java.util.List;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.util.dto.SearchDTO;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface PersonService extends GenericService<Person>{

    public List<Person> getBySurname(String surname);
    
    public List<Person> getByEntryDate(Date entryDate);

    public List<Person> get(SearchDTO dto);
    
    public Person getByDonorNumber(String donorNumber);
    
    public List<Person> getByCollectSite(CollectSite collectSite);
    
    public String getLastDonorNumber();
    
    public Person getByIdNumber(String idNumber);
    
    public List<Person> getByFirstNameAndSurnameAndDateOfBirth(String firstName, String surname, Date dateOfBirth);
    
    public List<Person> getBySurnameAndDateOfBirth(String surname, Date dateOfBirth);
}
