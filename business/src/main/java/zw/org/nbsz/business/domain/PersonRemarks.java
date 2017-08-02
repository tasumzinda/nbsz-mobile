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
@Table(name = "personremarks")
public class PersonRemarks implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_PERSONREMARKS")
    private Long id;
    
    @Column(name = "MEM_PERSONREMARKS")
    private String personRemarks;
    
    //TODO
    //Missing variable

    public PersonRemarks() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonRemarks() {
        return personRemarks;
    }

    public void setPersonRemarks(String personRemarks) {
        this.personRemarks = personRemarks;
    }
    
    
}
