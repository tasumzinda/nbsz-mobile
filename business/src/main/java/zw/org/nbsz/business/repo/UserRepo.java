/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.business.repo;

import java.util.List;
import org.springframework.data.repository.query.Param;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.User;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public interface UserRepo extends AbstractRepo<User, Long>{

    public User findByUserId(@Param("userId") String userId);
    
    public User findByUserName(@Param("username") String userName);
    
    public List<User> findByCentreAndActiveAndUserNameIsNotNull(@Param("centre") Centre centre, @Param("active") String active);
}