/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.mobile.api.resource;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.service.UserService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Component
@Path("/mobile/login")
@Produces(MediaType.APPLICATION_JSON)
public class UserLoginResource {
   
    @Resource
    private UserService userService;
    
    @GET
    @Path("/get-user")
    public User getUser(@QueryParam("userName") String userName){
        return userService.findByUserName(userName);
    }
}
