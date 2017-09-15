/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zw.org.nbsz.portal.web.controller.BaseController;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndex(ModelMap model) {
        model.addAttribute("pageTitle", appPrefix+"Administration Page Home");
        return "admin/index";
    }
}
