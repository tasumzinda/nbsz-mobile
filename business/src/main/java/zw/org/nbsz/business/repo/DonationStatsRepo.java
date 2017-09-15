/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import java.util.Date;
import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.DonationStats;
import zw.org.nbsz.business.domain.Person;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface DonationStatsRepo extends AbstractRepo<DonationStats, Long>{

    public DonationStats findByPersonAndEntryDate(@Param("person") Person person, @Param("entryDate") Date entryDate);
}
