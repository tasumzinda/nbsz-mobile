/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.org.nbsz.report.api.service;

import java.io.Serializable;
import java.util.List;
import zw.org.nbsz.business.util.dto.SearchDTO;

/**
 *
 * @author Tasunungurwa Muzinda
 * 
 * @param <T>
 */
public interface GenericReportService<T extends Serializable>{

    public List<T> getDefaultReport(SearchDTO dto);
}
