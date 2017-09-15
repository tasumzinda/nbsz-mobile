/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import java.util.Date;
import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.Donation;
import zw.org.nbsz.business.domain.Person;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface DonationRepo extends AbstractRepo<Donation, Long>{

    public Donation findByPersonAndDate(@Param("person") Person person, @Param("date") Date date);
}
