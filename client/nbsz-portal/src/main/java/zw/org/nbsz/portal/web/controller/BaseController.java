/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.portal.web.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.ModelAttribute;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.service.UserService;
import zw.org.nbsz.portal.util.AppMessage;
import zw.org.nbsz.portal.util.MessageType;

/**
 *
 * @author Tasunungurwa Muzinda
 */
abstract public class BaseController {

    @Resource
    private UserService userService;

    public String appPrefix = "Edelphyn Mobile Administration Dashboard::";

    @ModelAttribute("currentuser")
    public User getUserName() {
        return userService.getCurrentUser();
    }
    public AppMessage getMessage(Integer type) {
        switch (type) {
            case 1:
                return new AppMessage.MessageBuilder(Boolean.TRUE).message("Record saved").messageType(MessageType.MESSAGE).build();
            case 2:
                return new AppMessage.MessageBuilder(Boolean.TRUE).message("Record deleted").messageType(MessageType.MESSAGE).build();
            case 3:
                return new AppMessage.MessageBuilder(Boolean.TRUE).message("Operation cancelled").messageType(MessageType.MESSAGE).build();
            default:
                throw new IllegalArgumentException("Parameter provided not recognised :" + type);
        }
    }
}
