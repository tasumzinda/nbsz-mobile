/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import java.util.Date;
import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.Offer;
import zw.org.nbsz.business.domain.Person;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface OfferRepo extends AbstractRepo<Offer, Long>{

    public Offer findByPersonAndOfferDate(@Param("person") Person person, @Param("offerDate") Date offerDate);
}
