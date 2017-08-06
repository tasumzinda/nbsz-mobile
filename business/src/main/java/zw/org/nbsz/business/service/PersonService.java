/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import java.util.List;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.Person;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface PersonService extends GenericService<Person>{

    public List<Person> getBySurname(String surname);
    
    public Person getByDonorNumber(String donorNumber);
    
    public List<Person> getByCollectSite(CollectSite collectSite);
    
    public String getLastDonorNumber();
    
    public Person getByIdNumber(String idNumber);
}
