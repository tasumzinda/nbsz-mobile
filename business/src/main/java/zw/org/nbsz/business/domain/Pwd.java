/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import javax.persistence.Entity;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Entity
public class Pwd extends AbstractPwd{
    
private static final long serialVersionUID = 1L;

  public Pwd()
  {
  }

  public Pwd(User paramUsr)
  {
    super(paramUsr);
  }
}
