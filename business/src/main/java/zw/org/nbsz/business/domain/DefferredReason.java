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
@Table(name = "deferredreason")
public class DefferredReason implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_DEFERREDREASON")
    private Long id;
    
    @Column(name = "COD_DEFERREDREASON")
    private String code;
    
    @Column(name = "DES_DEFERREDREASON")
    private String name;    

    public DefferredReason() {
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
    
    
}
