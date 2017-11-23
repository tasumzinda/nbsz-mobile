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
import zw.org.nbsz.business.domain.Incentive;
import zw.org.nbsz.business.domain.SpecialNotes;
import zw.org.nbsz.business.service.SpecialNotesService;
import zw.org.nbsz.portal.util.AppMessage;
import zw.org.nbsz.portal.util.MessageType;
import zw.org.nbsz.portal.web.controller.BaseController;
import zw.org.nbsz.portal.web.validator.SpecialNotesValidator;

/**
 *
 * @author tasu
 */
@Controller
@RequestMapping("/admin/adverse-effects")
public class SpecialNotesController extends BaseController{
    
    @Resource
    private SpecialNotesService specialNotesService;
    @Resource
    private SpecialNotesValidator validator;

    private String setUpModel(ModelMap model, SpecialNotes item) {
        model.addAttribute("pageTitle", appPrefix + "Create/ Edit Adverse Effects");
        model.addAttribute("item", item);
        model.addAttribute("itemDelete", "index?type=3");
        return "admin/incentiveForm";
    }

    @RequestMapping(value = "/item.form", method = RequestMethod.GET)
    public String specialNotesForm(ModelMap model, @RequestParam(required = false) Long id) {
        model.addAttribute("message", new AppMessage.MessageBuilder().build());
        SpecialNotes p = new SpecialNotes();
        if (id != null) {
            p = specialNotesService.get(id);
        }
        return setUpModel(model, p);
    }

    @RequestMapping(value = "/item.form", method = RequestMethod.POST)
    public String saveSpecialNotes(@ModelAttribute("item") @Valid SpecialNotes incentive, BindingResult result, ModelMap model) {
        validator.validate(incentive, result);
        model.addAttribute("message", new AppMessage.MessageBuilder().build());
        if (result.hasErrors()) {
            model.addAttribute("message", new AppMessage.MessageBuilder(Boolean.TRUE).message("Data entry error has occurred").messageType(MessageType.ERROR).build());
            return setUpModel(model, incentive);
        }
        specialNotesService.save(incentive);
        return "redirect:item.list?type=1";
    }

    @RequestMapping(value = {"/item.list", "/"}, method = RequestMethod.GET)
    public String specialNotesList(ModelMap model, @RequestParam(required = false) Integer type) {
        model.addAttribute("message", new AppMessage.MessageBuilder().build());
        model.addAttribute("pageTitle", appPrefix + "Adverse Effects List");
        model.addAttribute("items", specialNotesService.getAll());
        if (type != null) {
            model.addAttribute("message", getMessage(type));
        }
        return "admin/nameList";
    }
}
