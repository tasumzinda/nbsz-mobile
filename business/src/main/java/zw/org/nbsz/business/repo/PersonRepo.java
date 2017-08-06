/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.Person;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface PersonRepo extends AbstractRepo<Person, Long>{
    
    @Query("from Person p where p.surname=:surname")
    public List<Person> findBySurname(@Param("surname") String surname);
    
    @Query("Select max(p.id) from Person p")
    public Long findLastInsertId();
    
    public Person findByDonorNumber(@Param("donorNumber") String donorNumber);
    
    public List<Person> findByCollectSite(@Param("collectSite") CollectSite collectSite);
    
    public Person findByIdNumber(@Param("idNumber") String idNumber);
}
