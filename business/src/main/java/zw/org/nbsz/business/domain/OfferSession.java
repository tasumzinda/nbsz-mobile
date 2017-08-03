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
@Table(name = "offersession")
public class OfferSession implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_OFFERSESSION")
    private Long id;
    
    @Column(name = "COD_OFFERSESSION")
    private String code;
    
    @Column(name = "DES_OFFERSESSION")
    private String name;
    
    @Column(name = "NUM_SHIFTS")
    private Integer numberOfShifts;

    public OfferSession() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfShifts() {
        return numberOfShifts;
    }

    public void setNumberOfShifts(Integer numberOfShifts) {
        this.numberOfShifts = numberOfShifts;
    }
    
    
}
