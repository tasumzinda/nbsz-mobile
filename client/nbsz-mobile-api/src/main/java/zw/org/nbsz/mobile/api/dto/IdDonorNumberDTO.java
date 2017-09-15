/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.mobile.api.dto;

import java.io.Serializable;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class IdDonorNumberDTO implements Serializable{
    
    private Long id;
    
    private String donorNumber;
    
    public IdDonorNumberDTO(Long id, String donorNumber){
        this.id = id;
        this.donorNumber = donorNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonorNumber() {
        return donorNumber;
    }

    public void setDonorNumber(String donorNumber) {
        this.donorNumber = donorNumber;
    }
    
    
}
