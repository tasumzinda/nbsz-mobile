/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.util.dto;

import java.io.Serializable;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class NameIdDTO implements Serializable{
    
    private String name;
    private Long id;

    public NameIdDTO() {
    }

    public NameIdDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
