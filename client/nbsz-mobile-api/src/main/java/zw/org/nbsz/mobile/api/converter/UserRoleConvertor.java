/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.mobile.api.converter;

import org.springframework.core.convert.converter.Converter;
import zw.org.nbsz.business.domain.util.UserRole;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class UserRoleConvertor implements Converter<String, UserRole>{
 
    @Override
    public UserRole convert(String s){
        if(s.equals(""))
            return null;
        return UserRole.get(Integer.valueOf(s));
    }
}
