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
@Table(name = "counsellor")
public class Counsellor implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_COUNSELLOR")
    private Long id;
    
    @Column(name = "COD_COUNSELLOR")
    private String code;
    
    @Column(name = "DES_COUNSELLOR")
    private String name;
    
    @Column(name = "DES_ADDRESS")
    private String address;
    
    @Column(name = "DES_PHONE")
    private String phoneNumber;

    public Counsellor() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
