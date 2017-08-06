/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.repo;

import java.util.List;
import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.CollectSite;

/**
 *
 * @author tasu
 */
public interface CollectSiteRepo extends AbstractRepo<CollectSite, Long>{
    public List<CollectSite> findByCentre(@Param("centre") Centre centre);
}
