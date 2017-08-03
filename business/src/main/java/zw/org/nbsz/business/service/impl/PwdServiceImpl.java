/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zw.org.nbsz.business.domain.Pwd;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.repo.PwdRepo;
import zw.org.nbsz.business.service.PwdService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PwdServiceImpl implements PwdService{
    
    @Resource
    private PwdRepo pwdRepo;
            
    @Override
    public Pwd save(Pwd item){
        throw new UnsupportedOperationException("Operation not yet supported");
    }
    
    @Override
    public Pwd get(Long id){
        throw new UnsupportedOperationException("Operation not yet supported");
    }
    
    @Override
    public List<Pwd> getAll(){
        throw new UnsupportedOperationException("Operation not yet supported");
    }
    
    @Override
    public Pwd getByUserId(User user){
        return pwdRepo.findByUser(user);
    }
}
