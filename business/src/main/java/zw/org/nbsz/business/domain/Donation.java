/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import java.util.Date;
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
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author tasu
 */
@Entity
@Table(name = "donation")
public class Donation implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_DONATION")
    private Long id;
    
    @Column(name = "COD_DONATION")
    private String donationNumber;
    
    @Column(name = "DAT_DONATION")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Column(name = "TIM_START")
    private String timStart;
    
    @Column(name = "TIM_DONATION")
    private String timDonation;
    
    @JoinColumn(name = "ID_DONATIONTYPE")
    @ManyToOne
    private DonationType donationType;
    
    @JoinColumn(name = "ID_PERSON")
    @ManyToOne
    private Person person;
    
    @Transient
    private String donationDate;
    
    @Column(name = "COD_BLOODTYPE")
    private String bloodType;
    
    @Column(name = "COD_DONATIONKIND")
    private String donationKind;
    
    public Donation(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonationNumber() {
        return donationNumber;
    }

    public void setDonationNumber(String donationNumber) {
        this.donationNumber = donationNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimStart() {
        return timStart;
    }

    public void setTimStart(String timStart) {
        this.timStart = timStart;
    }

    public String getTimDonation() {
        return timDonation;
    }

    public void setTimDonation(String timDonation) {
        this.timDonation = timDonation;
    }

    public DonationType getDonationType() {
        return donationType;
    }

    public void setDonationType(DonationType donationType) {
        this.donationType = donationType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDonationKind() {
        return donationKind;
    }

    public void setDonationKind(String donationKind) {
        this.donationKind = donationKind;
    }
    
    
}
