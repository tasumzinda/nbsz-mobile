/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import zw.org.nbsz.business.domain.Pwd;
import zw.org.nbsz.business.domain.User;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface PwdService extends GenericService<Pwd>{
    public Pwd getByUserId(User user);
}
