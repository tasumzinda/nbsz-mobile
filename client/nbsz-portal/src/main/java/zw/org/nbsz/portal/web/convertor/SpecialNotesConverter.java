/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.convertor;

import org.springframework.core.convert.converter.Converter;
import zw.org.nbsz.business.domain.SpecialNotes;
import zw.org.nbsz.business.service.SpecialNotesService;

/**
 *
 * @author tasu
 */
public class SpecialNotesConverter implements Converter<String, SpecialNotes>{
    
    private SpecialNotesService specialNotesService;
    
    @Override
    public SpecialNotes convert(String s){
        return s.equals("") ? null : specialNotesService.get(Long.valueOf(s));
    }
}
