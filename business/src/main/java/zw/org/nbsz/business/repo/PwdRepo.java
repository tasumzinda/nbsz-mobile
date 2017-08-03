/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.Pwd;
import zw.org.nbsz.business.domain.PwdKey;
import zw.org.nbsz.business.domain.User;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface PwdRepo extends AbstractRepo<Pwd, PwdKey>{

    public Pwd findByDesPwd(@Param("desPwd") String desPwd);
    
    public Pwd findByUser(@Param("user") User user);
}
