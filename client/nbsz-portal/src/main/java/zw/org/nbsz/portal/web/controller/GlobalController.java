/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.service.CollectSiteService;
import zw.org.nbsz.business.util.dto.NameIdDTO;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Controller
@RequestMapping("/global")
public class GlobalController {
    
    @Resource
    private CollectSiteService collectSiteService;
    
    @RequestMapping(value = "/getcentrecollectsites", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public List<NameIdDTO> getCentreCollectSites(Centre centre) {
        return formatCollectSites(collectSiteService.getByCentre(centre));
    }
    
    private List<NameIdDTO> formatCollectSites(List<CollectSite> collectSites) {
        List<NameIdDTO> items = new ArrayList<>();
        for (CollectSite item : collectSites) {
            items.add(new NameIdDTO(item.getName(), item.getId()));
        }
        return items;
    }
}
