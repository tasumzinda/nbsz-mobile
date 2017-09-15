/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author tasu
 */
@Entity
@Table(name = "person")
public class Person implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_PERSON")
    private Long id;
    
    @Column(name = "DES_NAME")
    private String firstName;
    
    @Column(name = "DES_SURNAME")
    private String surname;
    
    @Column(name = "COD_CIVILID")
    private String idNumber;
    
    @Column(name = "COD_GENDER")
    private String gender;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_BIRTH")
    private Date dateOfBirth;
    
    @Transient
    private String dob;
    
    @JoinColumn(name = "ID_PROFESSION")
    @ManyToOne
    private Profession profession;
    
    @JoinColumn(name = "ID_MARITALSTATUS")
    @ManyToOne
    private MaritalStatus maritalStatus;
    
    @Column(name = "DES_ADDRESS")
    private String residentialAddress;
    
    @JoinColumn(name = "ID_TOWN")
    @ManyToOne
    private Centre city;
    
    @Column(name = "DES_HOMEPHONE")
    private String homeTelephone;
    
    @Column(name = "DES_WORKPHONE")
    private String workTelephone;
    
    @Column(name = "DES_MOBILEPHONE")
    private String cellphoneNumber;
    
    @Column(name = "DES_EMAIL")
    private String email;
    
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "ID_COUNSELLOR")
    @ManyToOne
    private Counsellor counsellor;
    
    @JoinColumn(name = "ID_DEFERREDREASON")
    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    private DefferredReason deferredReason;
    
    @JoinColumn(name = "ID_COLLECTSITE")
    @ManyToOne
    private CollectSite collectSite;
    
    @JoinColumn(name = "ID_DONATIONTYPE")
    @ManyToOne
    private DonationType donationType;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_INTBIRTH")
    private Date intDateOfBirth;
    
    @Column(name = "NUM_FREQUENCY")
    private Integer frequency;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_ENTRY")
    private Date entryDate;
    
    @Transient
    private String entry;
    
    @Column(name = "TIM_ENTRY")
    private String timeEntry;
    
    @Column(name = "COD_DONOR")
    private String donorNumber;
    
    @JoinColumn(name = "ID_USR")
    @ManyToOne
    private User bledBy;
    
    @Column(name = "LOG_DONOR")
    private String logDonor;
    
    @JoinColumn(name = "ID_DONORTYPE")
    @ManyToOne
    private DonorType donorType;
    
    private String deferNotes;
    
    private int deferPeriod;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_DEFERRED")
    private Date deferredDate;
    
    @Transient
    private String deferDate;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public Centre getCity() {
        return city;
    }

    public void setCity(Centre city) {
        this.city = city;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    public String getWorkTelephone() {
        return workTelephone;
    }

    public void setWorkTelephone(String workTelephone) {
        this.workTelephone = workTelephone;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public DefferredReason getDeferredReason() {
        return deferredReason;
    }

    public void setDeferredReason(DefferredReason deferredReason) {
        this.deferredReason = deferredReason;
    }
    
    public void setDob(String dob){
        this.dob = dob;
    }
    
    public String getDob(){
        return dob;
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

    public Date getIntDateOfBirth() {
        return intDateOfBirth;
    }

    public void setIntDateOfBirth(Date intDateOfBirth) {
        this.intDateOfBirth = intDateOfBirth;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getTimeEntry() {
        return timeEntry;
    }

    public void setTimeEntry(String timeEntry) {
        this.timeEntry = timeEntry;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getDonorNumber() {
        return donorNumber;
    }

    public void setDonorNumber(String donorNumber) {
        this.donorNumber = donorNumber;
    }

    public User getBledBy() {
        return bledBy;
    }

    public void setBledBy(User bledBy) {
        this.bledBy = bledBy;
    }

    public String getLogDonor() {
        return logDonor;
    }

    public void setLogDonor(String logDonor) {
        this.logDonor = logDonor;
    }

    public DonorType getDonorType() {
        return donorType;
    }

    public void setDonorType(DonorType donorType) {
        this.donorType = donorType;
    }

    public String getDeferNotes() {
        return deferNotes;
    }

    public void setDeferNotes(String deferNotes) {
        this.deferNotes = deferNotes;
    }

    public int getDeferPeriod() {
        return deferPeriod;
    }

    public void setDeferPeriod(int deferPeriod) {
        this.deferPeriod = deferPeriod;
    }

    public Date getDeferredDate() {
        return deferredDate;
    }

    public void setDeferredDate(Date deferredDate) {
        this.deferredDate = deferredDate;
    }

    public String getDeferDate() {
        return deferDate;
    }

    public void setDeferDate(String deferDate) {
        this.deferDate = deferDate;
    }
    
}
