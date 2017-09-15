/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.domain.util.UserRole;
import zw.org.nbsz.business.repo.UserRepo;
import zw.org.nbsz.business.service.UserService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService{
    
    @Resource
    private UserRepo userRepo;
    
    @Override
    public User save(User t){
        if (t.getId() == null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String hashedPassword = encoder.encode(t.getPassword());
            t.setPassword(hashedPassword);
            t.setUserId(t.getUserName()); 
            t.setActive("Y");
            return userRepo.save(t);
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = encoder.encode(t.getPassword());
        t.setPassword(hashedPassword);
        if(t.getUserId() == null)
            t.setUserId(t.getUserName()); 
        t.setActive("Y");
        return userRepo.save(t);
    }
    
    @Override
    public Boolean checkDuplicate(User current, User old) {
        if(current.getId() != null){
            /**
             * @param current is in existence
             */
            if(!current.getUserName().equals(old.getUserName())){
                if(findByUserName(current.getUserName()) != null){
                    return true;
                }
            }
            
        }else if(current.getId() == null){
            /**
             * @param current is new
             */
            if(findByUserName(current.getUserName()) != null){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public User get(Long id){
        if(id == null){
            throw new IllegalStateException("Item does not exist");
        }
        return userRepo.findOne(id);
    }
    
    @Override
    public List<User> getAll(){
        return userRepo.findAll();
    }
    
    @Override
    public List<User> getByCentreAndActive(Centre centre, String active){
        return userRepo.findByCentreAndActive(centre, active);
    }
    
    @Override
    public User getByUserId(String userId){
        return userRepo.findByUserId(userId);
    }
    
    @Override
    public User findByUserName(String name) {
        return userRepo.findByUserName(name);
    }
    
    @Override
    public User getCurrentUser() {
        String username = getCurrentUsername();
        if (username == null) {
            return null;
        }
        User user = findByUserName(username);
        if (user == null) {
            return null;
        }
        return user;
    }

    @Override
    public String getCurrentUsername() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated() || authentication.getPrincipal() == null) {
            return null;
        }
        if (authentication.getPrincipal() instanceof String) {
            String principal = (String) authentication.getPrincipal();

            if (principal.compareTo("anonymousUser") != 0) {
                return null;
            }
            return principal;
        }
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return userDetails.getUsername();
    }
}
