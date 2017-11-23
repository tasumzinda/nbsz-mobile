/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.service;

import zw.org.nbsz.business.domain.SpecialNotes;

/**
 *
 * @author tasu
 */
public interface SpecialNotesService extends GenericService<SpecialNotes>{
    
    public SpecialNotes getByName(String name);
   
   public Boolean checkDuplicate(SpecialNotes current, SpecialNotes old);
   
   public void delete(SpecialNotes t);
}
