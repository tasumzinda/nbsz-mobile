/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.controller.admin;

import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.domain.util.UserRole;
import zw.org.nbsz.business.service.CentreService;
import zw.org.nbsz.business.service.UserService;
import zw.org.nbsz.portal.web.controller.BaseController;
import zw.org.nbsz.portal.util.AppMessage;
import zw.org.nbsz.portal.util.MessageType;
import zw.org.nbsz.portal.web.validator.UserValidator;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Controller
@RequestMapping("/admin/user")
public class UserController extends BaseController{
    
    @Resource
    private UserService userService;
    @Resource
    private UserValidator userValidator;
    @Resource
    private CentreService centreService;

    private String setUpModel(ModelMap model, User item) {
        model.addAttribute("pageTitle", appPrefix + "Create/ Edit User");
        model.addAttribute("roles", UserRole.values());
        model.addAttribute("centres", centreService.getAll());
        model.addAttribute("item", item);
        model.addAttribute("itemDelete", "index?type=3");
        return "admin/userForm";
    }

    @RequestMapping(value = "/user.form", method = RequestMethod.GET)
    public String userForm(ModelMap model, @RequestParam(required = false) Long id) {
        model.addAttribute("message", new AppMessage.MessageBuilder().build());
        User p = new User();
        if (id != null) {
            p = userService.get(id);
        }
        return setUpModel(model, p);
    }

    @RequestMapping(value = "/user.form", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("item") @Valid User user, BindingResult result, ModelMap model) {
        userValidator.validate(user, result);
        model.addAttribute("message", new AppMessage.MessageBuilder().build());
        if (result.hasErrors()) {
            model.addAttribute("message", new AppMessage.MessageBuilder(Boolean.TRUE).message("Data entry error has occurred").messageType(MessageType.ERROR).build());
            return setUpModel(model, user);
        }
        userService.save(user);
        return "redirect:user.list?type=1";
    }

    @RequestMapping(value = {"/user.list", "/"}, method = RequestMethod.GET)
    public String userList(ModelMap model, @RequestParam(required = false) Integer type) {
        model.addAttribute("message", new AppMessage.MessageBuilder().build());
        model.addAttribute("pageTitle", appPrefix + "User List");
        model.addAttribute("items", userService.getAll());
        if (type != null) {
            model.addAttribute("message", getMessage(type));
        }
        return "admin/userList";
    }
}
