/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.report.api;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class GenericReportModel implements Serializable{
    
    private List<String> row;

    public GenericReportModel() {
    }

    public GenericReportModel(List<String> row) {
        this.row = row;
    }

    public List<String> getRow() {
        return row;
    }

    public void setRow(List<String> row) {
        this.row = row;
    }
    
    public Boolean noData(List<?> items){
        if(items.size() <=0) return Boolean.TRUE;
        return Boolean.FALSE;
    }

    @Override
    public String toString() {
        return "GenericReportModel{" + "row=" + row + '}';
    }
}
