/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.convertor;

import javax.annotation.Resource;
import org.springframework.core.convert.converter.Converter;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.service.CentreService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class CentreConvertor implements Converter<String, Centre>{
    
    @Resource
    private CentreService centreService;
    
    @Override
    public Centre convert(String s){
        if(s.equals(""))
            return null;
        return centreService.get(Long.valueOf(s));
    }
}
