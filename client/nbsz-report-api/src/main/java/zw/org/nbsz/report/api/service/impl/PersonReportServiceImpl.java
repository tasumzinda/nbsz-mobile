/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.report.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.service.PersonService;
import zw.org.nbsz.business.util.DateUtil;
import zw.org.nbsz.business.util.dto.SearchDTO;
import zw.org.nbsz.report.api.GenericReportModel;
import zw.org.nbsz.report.api.service.PersonReportService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
public class PersonReportServiceImpl implements PersonReportService{
    
    @Resource
    private PersonService personService;
    
    @Override
    public List<GenericReportModel> getDefaultReport(SearchDTO dto) {
        List<GenericReportModel> list = new ArrayList<>();
        
        List<Person> donors = personService.get(dto);
        List<String> items = new ArrayList<>();
        items.add("First Name");
        items.add("Surname");
        items.add("Collect Site");
        items.add("Donation Date");
        list.add(new GenericReportModel(items));
        for(Person user : donors){
            GenericReportModel model = new GenericReportModel();
            List<String> row = new ArrayList<>();
            row.add(user.getFirstName());
            row.add(user.getSurname());
            row.add(user.getCollectSite().getName());
            row.add(DateUtil.getStringFromDate(user.getEntryDate()));
            model.setRow(row);
            list.add(model);
        }
        return list;
    }
}
