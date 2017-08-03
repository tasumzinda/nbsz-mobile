/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author tasu
 */
@MappedSuperclass
public class BaseEntity implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name ="ID_PERSON")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof BaseEntity)) {
            return false;
        }
        return this.getId().equals(((BaseEntity)obj).getId());
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
}
