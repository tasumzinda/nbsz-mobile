/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tasu
 */
@Entity
@Table(name = "donationtype")
public class DonationType implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_DONATIONTYPE")
    private Long id;
    
    @Column(name = "DES_DONATIONTYPE")
    private String name;
    
    @Column(name = "SRT_DONATIONTYPE")
    private String srtDonationType;

    public DonationType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrtDonationType() {
        return srtDonationType;
    }

    public void setSrtDonationType(String srtDonationType) {
        this.srtDonationType = srtDonationType;
    }
    
    
}