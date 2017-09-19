/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import java.util.Date;
import java.util.List;
import zw.org.nbsz.business.domain.Offer;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.util.dto.SearchDTO;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface OfferService extends GenericService<Offer>{
  public Offer findByPersonAndDonationDate(Person p, Date offerDate);
  
  public List<Offer> get(SearchDTO dto);
}
