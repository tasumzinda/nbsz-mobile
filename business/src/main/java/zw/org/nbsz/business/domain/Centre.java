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
@Table(name = "centre")
public class Centre implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_CENTRE")
    private Long id;
    
    @Column(name = "COD_CENTRE")
    private String name;
    
    @Column(name = "DES_CENTRE")
    private String description;
    
    @Column(name = "COD_AREA")
    private String area;
    
    @Column(name = "COD_COMPLEX")
    private String complex;
    
    @Column(name = "DES_LOGO")
    private String logo;
    
    @Column(name = "DES_LABEL")
    private String label;
    
    @Column(name = "DES_SIGNATURE1")
    private String signature1;
    
    @Column(name = "DES_SIGNATURE2")
    private String signature2;

    public Centre() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getComplex() {
        return complex;
    }

    public void setComplex(String complex) {
        this.complex = complex;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSignature1() {
        return signature1;
    }

    public void setSignature1(String signature1) {
        this.signature1 = signature1;
    }

    public String getSignature2() {
        return signature2;
    }

    public void setSignature2(String signature2) {
        this.signature2 = signature2;
    }
    
}
