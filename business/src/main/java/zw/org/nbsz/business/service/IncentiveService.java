/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import zw.org.nbsz.business.domain.Incentive;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface IncentiveService extends GenericService<Incentive>{
   public Incentive getByName(String name);
   
   public Boolean checkDuplicate(Incentive current, Incentive old);
   
   public void delete(Incentive t);
}
