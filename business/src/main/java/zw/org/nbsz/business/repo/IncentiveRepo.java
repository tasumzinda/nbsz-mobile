/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.Incentive;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface IncentiveRepo extends AbstractRepo<Incentive, Long>{

    public Incentive findByName(@Param("name") String name);
}
