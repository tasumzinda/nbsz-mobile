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
import zw.org.nbsz.business.domain.Incentive;
import zw.org.nbsz.business.domain.SpecialNotes;
import zw.org.nbsz.business.service.SpecialNotesService;

/**
 *
 * @author tasu
 */
@Component
public class SpecialNotesValidator implements Validator{
    
    @Resource
    private SpecialNotesService specialNotesService;

    @Override
    public boolean supports(Class<?> type) {
        return Incentive.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        SpecialNotes current = (SpecialNotes) o;
        SpecialNotes old = null;
        ValidationUtils.rejectIfEmpty(errors, "name", "field.empty");
        if(current.getId() != null){
            old = specialNotesService.get(current.getId());
        }
        if(specialNotesService.checkDuplicate(current, old)){
            errors.rejectValue("name", "item.duplicate");
        }
    }
}
