/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import java.util.Date;
import zw.org.nbsz.business.domain.DonationStats;
import zw.org.nbsz.business.domain.Person;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface DonationStatsService extends GenericService<DonationStats>{
    public DonationStats getByPersonAndEntryDate(Person p, Date entryDate);
}
