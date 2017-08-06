/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service;

import java.util.List;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.CollectSite;

/**
 *
 * @author tasu
 */
public interface CollectSiteService extends GenericService<CollectSite>{
    
    public List<CollectSite> getByCentre(Centre centre);
}
