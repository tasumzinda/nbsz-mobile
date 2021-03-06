/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.mobile.api.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.domain.Counsellor;
import zw.org.nbsz.business.domain.Donation;
import zw.org.nbsz.business.domain.DonationStats;
import zw.org.nbsz.business.domain.Offer;
import zw.org.nbsz.business.domain.Person;
import zw.org.nbsz.business.service.CollectSiteService;
import zw.org.nbsz.business.service.CounsellorService;
import zw.org.nbsz.business.service.DonationService;
import zw.org.nbsz.business.service.DonationStatsService;
import zw.org.nbsz.business.service.OfferService;
import zw.org.nbsz.business.service.PersonService;
import zw.org.nbsz.business.util.DateUtil;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Component
@Path("/mobile/form")
@Produces(MediaType.APPLICATION_JSON)
public class PersonDataResource {

    @Resource
    private PersonService personService;

    @Resource
    private CounsellorService counsellorService;

    @Resource
    private DonationService donationService;

    @Resource
    private CollectSiteService collectSiteService;

    @Resource
    private DonationStatsService donationStatsService;
    
    @Resource
    private OfferService offerService;

    @POST
    @Path("/donor")
    public Person createDonor(Person item) {
        Counsellor c = item.getCounsellor();
        if (c != null) {
            counsellorService.save(c);
        }
        item.setDateOfBirth(DateUtil.getDateFromRest(item.getDob()));
        item.setIntDateOfBirth(DateUtil.getDateFromRest(item.getDob()));
        if (item.getEntry() != null) {
            item.setEntryDate(DateUtil.getDateFromRest(item.getEntry()));
        }
        if (item.getDeferDate() != null) {
            item.setDeferredDate(DateUtil.getDateFromRest(item.getDeferDate()));
        }

        //item.setFrequency(3);
        item.setCounsellor(c);
        String donorNumber = personService.getLastDonorNumber();
        Long donorNum = Long.parseLong(donorNumber);
        donorNum++;
        //Person p = personService.get(item.getId());
        if (item.getId() == null) {
            item.setDonorNumber(String.valueOf(donorNum));
        }
        item.setLogDonor("Y");
        item = personService.save(item);
        if (item.getEntryDate() != null) {
            item.setEntry(DateUtil.getStringFromDate(item.getEntryDate()));
        }
        if (item.getDeferredDate() != null) {
            item.setDeferDate(DateUtil.getStringFromDate(item.getDeferredDate()));
        }
        if (item.getDateOfBirth() != null) {
            item.setDob(DateUtil.getStringFromDate(item.getDateOfBirth()));
        }
        return item;
    }

    @GET
    @Path("/get-donor")
    public Person getDonor(@QueryParam("donorNumber") String donorNumber) {
        Person p = personService.getByDonorNumber(donorNumber);
        if (p != null) {
            if (p.getEntryDate() != null) {
                p.setEntry(DateUtil.getStringFromDate(p.getEntryDate()));
            }
            if (p.getDeferredDate() != null) {
                p.setDeferDate(DateUtil.getStringFromDate(p.getDeferredDate()));
            }
            if (p.getDateOfBirth() != null) {
                p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
            }
        }
        return p;
    }

    @GET
    @Path("/get-all-donors")
    public List<Person> getDonors() {
        return personService.getAll();
    }

    @GET
    @Path("/all-donors")
    public Person getAllDonors() {
        Person p = null;
        for (Person item : personService.getAll()) {
            p = item;
        }
        return p;
    }

    @POST
    @Path("/donation")
    public Long createDonation(Donation item) {
        try {
            item.setDate(DateUtil.getDateFromRest(item.getDonationDate()));
            item.setDonationKind("D");
            donationService.save(item);
            Person p = item.getPerson();
            Integer numDonations = p.getNumberOfDonations();
            numDonations++;
            p.setNumberOfDonations(numDonations);
            personService.save(p);
        } catch (Exception ex) {
            System.out.println("-----+------+------+------+-----+");
            System.out.println(ex.getMessage());
            System.out.println("-----+------+------+------+-----+");
            return 0L;
        }
        return 1L;
    }
    
    @POST
    @Path("/offer")
    public Long createOffer(Offer item) {
        try {
            item.setOfferDate(DateUtil.getDateFromRest(item.getOffer()));
            if(item.getDefer() != null){
                item.setDeferDate(DateUtil.getDateFromRest(item.getDefer()));
            }
            item.setDonationKind("D");
            offerService.save(item);
        } catch (Exception ex) {
            System.out.println("-----+------+------+------+-----+");
            System.out.println(ex.getMessage());
            System.out.println("-----+------+------+------+-----+");
            return 0L;
        }
        return 1L;
    }

    @POST
    @Path("/donation-stats")
    public Long createDonationStats(DonationStats item) {
        try {
            item.setEntryDate(DateUtil.getDateFromRest(item.getEntry()));
            donationStatsService.save(item);
        } catch (Exception ex) {
            System.out.println("-----+------+------+------+-----+");
            System.out.println(ex.getMessage());
            System.out.println("-----+------+------+------+-----+");
            return 0L;
        }
        return 1L;
    }

    @GET
    @Path("/get-by-surname")
    public List<Person> getBySurname(@QueryParam("surname") String surname) {
        return personService.getBySurname(surname);
    }

    @GET
    @Path("/get-by-idNumber")
    public Person getByIdNumber(@QueryParam("idNumber") String idNumber) {
        Person p = personService.getByIdNumber(idNumber);
        if (p != null) {
            if (p.getEntryDate() != null) {
                p.setEntry(DateUtil.getStringFromDate(p.getEntryDate()));
            }
            if (p.getDeferredDate() != null) {
                p.setDeferDate(DateUtil.getStringFromDate(p.getDeferredDate()));
            }
            if (p.getDateOfBirth() != null) {
                p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
            }
        }
        return p;
    }

    @GET
    @Path("/get-by-details")
    public List<Person> getByFirstNameAndSurname(@QueryParam("firstName") String firstName, @QueryParam("surname") String surname, @QueryParam("dob") String dob) {
        Date dateOfBirth = DateUtil.getDateFromString(dob);
        List<Person> list = new ArrayList<>();
            for (Person p : personService.getByFirstNameAndSurnameAndDateOfBirth(firstName, surname, dateOfBirth)) {
                if (p.getEntryDate() != null) {
                    p.setEntry(DateUtil.getStringFromDate(p.getEntryDate()));
                }
                if (p.getDeferredDate() != null) {
                    p.setDeferDate(DateUtil.getStringFromDate(p.getDeferredDate()));
                }
                if (p.getDateOfBirth() != null) {
                    p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
                }
                if (p.getDateOfBirth() != null) {
                    p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
                }
                list.add(p);
            }

        return list;
    }
    
    @GET
    @Path("/get-by-surname-and-dob")
    public List<Person> getBySurnameAndDob(@QueryParam("surname") String surname, @QueryParam("dob") String dob) {
        Date dateOfBirth = DateUtil.getDateFromString(dob);
        List<Person> list = new ArrayList<>();
            for (Person p : personService.getBySurnameAndDateOfBirth(surname, dateOfBirth)) {
                if (p.getEntryDate() != null) {
                    p.setEntry(DateUtil.getStringFromDate(p.getEntryDate()));
                }
                if (p.getDeferredDate() != null) {
                    p.setDeferDate(DateUtil.getStringFromDate(p.getDeferredDate()));
                }
                if (p.getDateOfBirth() != null) {
                    p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
                }
                if (p.getDateOfBirth() != null) {
                    p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
                }
                list.add(p);
            }

        return list;
    }

    @GET
    @Path("/get-by-collect-site")
    public List<Person> getByCollectSite(@QueryParam("id") Long id) {
        CollectSite collectSite = collectSiteService.get(id);
        List<Person> list = new ArrayList<>();
        for (Person p : personService.getByCollectSite(collectSite)) {
            if (p.getEntryDate() != null) {
                p.setEntry(DateUtil.getStringFromDate(p.getEntryDate()));
            }
            if (p.getDeferredDate() != null) {
                p.setDeferDate(DateUtil.getStringFromDate(p.getDeferredDate()));
            }
            if (p.getDateOfBirth() != null) {
                p.setDob(DateUtil.getStringFromDate(p.getDateOfBirth()));
            }
            list.add(p);
        }
        return list;
    }

    @GET
    @Path("/get-last-donor-num")
    public String getPreviousDonorNumber() {
        return personService.getLastDonorNumber();
    }
}
