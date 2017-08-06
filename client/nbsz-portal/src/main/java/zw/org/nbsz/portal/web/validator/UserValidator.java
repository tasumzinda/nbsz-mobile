/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.validator;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.service.UserService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Component
public class UserValidator implements Validator{
    
    @Resource
    private UserService userService;

    @Override
    public boolean supports(Class<?> type) {
        return User.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        User old = null;
        ValidationUtils.rejectIfEmpty(errors, "name", "field.empty");
        ValidationUtils.rejectIfEmpty(errors, "userName", "field.empty");
        ValidationUtils.rejectIfEmpty(errors, "userRole", "field.empty");
        ValidationUtils.rejectIfEmpty(errors, "password", "field.empty");
        ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "field.empty");
        ValidationUtils.rejectIfEmpty(errors, "centre", "field.empty");
        if ( ! user.getPassword().equals(user.getConfirmPassword())) {
            errors.rejectValue("confirmPassword", "password.confirm");
        }
        if(user.getId() != null){
            old = userService.get(user.getId());
        }
        if(userService.checkDuplicate(user, old)){
            errors.rejectValue("userName", "item.duplicate");
        }
    }
}
