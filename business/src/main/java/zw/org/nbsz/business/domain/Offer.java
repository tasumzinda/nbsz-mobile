/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Entity
public class Offer implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_OFFER")
    private Long id;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DAT_OFFER")
    private Date offerDate;
    
    @JoinColumn(name = "ID_USR")
    @ManyToOne
    private User user;
    
    @JoinColumn(name = "ID_PERSON")
    @ManyToOne
    private Person person;
    
    @JoinColumn(name = "ID_COLLECTSITE")
    @ManyToOne
    private CollectSite collectSite;
    
    @JoinColumn(name = "ID_DONATIONTYPE")
    @ManyToOne
    private DonationType donationType;
    
    @Column(name = "COD_DONATIONKIND")
    private String donationKind;
    
    @Column(name = "COD_CHECKUP")
    private String checkUp;
    
    @Column(name = "COD_PHLEBOTOMY")
    private String phlebotomy;
    
    @Column(name = "COD_DONATION")
    private String donationNumber;
    
    @Column(name = "LOG_DIRECTED")
    private String directed;
    
    @JoinColumn(name = "ID_DEFERREDREASON")
    @ManyToOne
    private DefferredReason defferredReason;
    
    @JoinColumn(name = "ID_CENTRE")
    @ManyToOne
    private Centre centre;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DAT_DEFERRED")
    private Date deferDate;
    
    @Column(name = "NUM_DONORAGE")
    private Integer donorAge;
    
    @Transient
    private String offer;
    
    @Transient
    private String defer;
    
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "offer_incentive", joinColumns = {
        @JoinColumn(name = "offer_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "incentive_id", nullable = false)})
    private Set<Incentive> incentives = new HashSet<>();
    
    private Integer pulse;
    
    public Offer(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(Date offerDate) {
        this.offerDate = offerDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CollectSite getCollectSite() {
        return collectSite;
    }

    public void setCollectSite(CollectSite collectSite) {
        this.collectSite = collectSite;
    }

    public DonationType getDonationType() {
        return donationType;
    }

    public void setDonationType(DonationType donationType) {
        this.donationType = donationType;
    }

    public String getDonationKind() {
        return donationKind;
    }

    public void setDonationKind(String donationKind) {
        this.donationKind = donationKind;
    }

    public String getCheckUp() {
        return checkUp;
    }

    public void setCheckUp(String checkUp) {
        this.checkUp = checkUp;
    }

    public String getPhlebotomy() {
        return phlebotomy;
    }

    public void setPhlebotomy(String phlebotomy) {
        this.phlebotomy = phlebotomy;
    }

    public String getDonationNumber() {
        return donationNumber;
    }

    public void setDonationNumber(String donationNumber) {
        this.donationNumber = donationNumber;
    }

    public String getDirected() {
        return directed;
    }

    public void setDirected(String directed) {
        this.directed = directed;
    }

    public DefferredReason getDefferredReason() {
        return defferredReason;
    }

    public void setDefferredReason(DefferredReason defferredReason) {
        this.defferredReason = defferredReason;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public Date getDeferDate() {
        return deferDate;
    }

    public void setDeferDate(Date deferDate) {
        this.deferDate = deferDate;
    }

    public Integer getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(Integer donorAge) {
        this.donorAge = donorAge;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getDefer() {
        return defer;
    }

    public void setDefer(String defer) {
        this.defer = defer;
    }

    public Set<Incentive> getIncentives() {
        return incentives;
    }

    public void setIncentives(Set<Incentive> incentives) {
        this.incentives = incentives;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }
    
    
}
