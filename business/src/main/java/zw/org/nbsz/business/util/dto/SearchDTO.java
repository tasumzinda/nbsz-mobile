/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.util.dto;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import zw.org.nbsz.business.domain.Centre;
import zw.org.nbsz.business.domain.CollectSite;
import zw.org.nbsz.business.util.DateUtil;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class SearchDTO implements Serializable{
    
    private Centre centre;
    
    private CollectSite collectSite;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date entryDate;
    
    public SearchDTO(){
        
    }
    
    public SearchDTO(Centre centre, CollectSite collectSite, Date entryDate){
        this.centre = centre;
        this.collectSite = collectSite;
        this.entryDate = entryDate;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public CollectSite getCollectSite() {
        return collectSite;
    }

    public void setCollectSite(CollectSite collectSite) {
        this.collectSite = collectSite;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
    
    public SearchDTO getInstance(SearchDTO dto){
        return new SearchDTO(dto.getCentre(), dto.getCollectSite(), dto.getEntryDate());
    }
    
    public String getQueryString(SearchDTO dto) {
        StringBuilder query = new StringBuilder("");
        int position = 0;
        if (dto.getCentre()!= null) {
            if (position == 0) {
                query.append("?centre=");
                query.append(dto.getCentre().getId());
                position++;
            } else {
                query.append("&centre=");
                query.append(dto.getCentre().getId());
            }
        }
        if (dto.getCollectSite()!= null) {
            if (position == 0) {
                query.append("?collectSite=");
                query.append(dto.getCollectSite().getId());
                position++;
            } else {
                query.append("&collectSite=");
                query.append(dto.getCollectSite().getId());
            }
        }
        if (dto.getEntryDate()!= null) {
            if (position == 0) {
                query.append("?entryDate=");
                query.append(DateUtil.getStringFromDate(dto.getEntryDate()));
                position++;
            } else {
                query.append("&entryDate=");
                query.append(DateUtil.getStringFromDate(dto.getEntryDate()));
            }
        }
        return query.toString();
    }
    
    public Boolean getSearch(SearchDTO dto){
        if(dto.getCentre() != null || dto.getCollectSite() != null || dto.getEntryDate() != null)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
