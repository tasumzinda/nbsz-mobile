/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.convertor;

import javax.annotation.Resource;
import org.springframework.core.convert.converter.Converter;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.service.CollectSiteService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class CollectSiteConvertor implements Converter<String, CollectSite>{
    
    
    @Resource
    private CollectSiteService service;
    
    @Override
    public CollectSite convert(String s){
        if(s.equals(""))
            return null;
        return service.get(Long.valueOf(s));
    }
}
