/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.service;

import java.util.List;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.User;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface UserService extends GenericService<User>{
    public User getByUserId(String userId);
    
    public User findByUserName(String name);

    public String getCurrentUsername();

    public User getCurrentUser();
    
    public List<User> getByCentre(Centre centre);
    
    public Boolean checkDuplicate(User current, User old);
}
