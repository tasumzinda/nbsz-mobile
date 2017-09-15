/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.mobile.api.resource;

import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import zw.org.nbsz.business.domain.BankStaff;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.DefferredReason;
import zw.org.nbsz.business.domain.DonationType;
import zw.org.nbsz.business.domain.DonorType;
import zw.org.nbsz.business.domain.MaritalStatus;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.domain.Profession;
import zw.org.nbsz.business.domain.User;
import zw.org.nbsz.business.service.BankStaffService;
import zw.org.nbsz.business.service.CentreService;
import zw.org.nbsz.business.service.CollectSiteService;
import zw.org.nbsz.business.service.DefferredReasonService;
import zw.org.nbsz.business.service.DonationTypeService;
import zw.org.nbsz.business.service.DonorTypeService;
import zw.org.nbsz.business.service.MaritalStatusService;
import zw.org.nbsz.business.service.PersonService;
import zw.org.nbsz.business.service.ProfessionService;
import zw.org.nbsz.business.service.UserService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Component
@Path("/mobile/static")
@Produces(MediaType.APPLICATION_JSON)
public class StaticDataResource {
    
    @Resource
    private ProfessionService professionService;
    
    @Resource
    private MaritalStatusService maritalStatusService;
    
    @Resource
    private CentreService centreService;
    
    @Resource
    private DefferredReasonService defferredReasonService;
    
    @Resource
    private BankStaffService bankStaffService;
    
    @Resource
    private PersonService personService;
    
    @Resource
    private CollectSiteService collectSiteService;
    
    @Resource
    private DonationTypeService donationTypeService;
    
    @Resource
    private UserService userService;
    
    @Resource
    private DonorTypeService donorTypeService;
    
    @GET
    @Path("/profession")
    public List<Profession> getProfessions(){
        return professionService.getAll();
    }
    
    @GET
    @Path("/marital-status")
    public List<MaritalStatus> getMaritalStatus(){
        return maritalStatusService.getAll();
    }
    
    @GET
    @Path("/centre")
    public List<Centre> getCentres(){
        return centreService.getAll();
    }
    
    @GET
    @Path("/deferred-reason")
    public List<DefferredReason> getDefferredReason(){
        return defferredReasonService.getAll();
    }
    
    @GET
    @Path("/bank-staff")
    public List<BankStaff> getBankStaff(){
        return bankStaffService.getAll();
    }
    
    @GET
    @Path("/donor")
    public List<Person> getDonor(){
        return personService.getBySurname("Muzinda");
    }
    
    @GET
    @Path("/collect-site")
    public List<CollectSite> getCollectSites(@QueryParam("id") Long id){
        Centre centre = centreService.get(id);
        return collectSiteService.getByCentre(centre);
    }
    
    @GET
    @Path("/donation-type")
    public List<DonationType> getDonationTypes(){
        return donationTypeService.getAll();
    }
    
    @GET
    @Path("/user")
    public List<User> getUsers(@QueryParam("id") Long id){
        Centre centre = centreService.get(id);
        return userService.getByCentreAndActive(centre, "Y");
    }
    
    @GET
    @Path("/donor-type")
    public List<DonorType> getDonorTypes(){
        return donorTypeService.getAll();
    }
}
