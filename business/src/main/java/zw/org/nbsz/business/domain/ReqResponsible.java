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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tasu
 */
@Entity
@Table(name = "reqresponsible")
public class ReqResponsible implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_REQRESPONSIBLE")
    private Long id;
    
    @JoinColumn(name = "ID_CENTRE")
    @ManyToOne
    private Centre centre;
    
    @Column(name = "COD_REQRESPONSIBLE")
    private String code;
    
    @Column(name = "DES_REQRESPONSIBLE")
    private String name;

    public ReqResponsible() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
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
    
    
}
