/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain.util;

import zw.org.nbsz.business.util.StringUtils;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public enum UserRole {
    ROLE_ADMIN(1), ROLE_REST(2);
    
    private final Integer code;
    
    UserRole(Integer code){
        this.code = code;
    }
    
    public static UserRole get(Integer code){
        for(UserRole item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Parameter provided is not recognized"); 
    }
    
    public Integer getCode(){
        return code;
    }

    public String getName(){
        return super.name();
    }
}
