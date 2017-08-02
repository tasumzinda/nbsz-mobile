/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class PwdKey implements Serializable {

    private static final long serialVersionUID = 1L;
    private volatile int hashValue = 0;
    private User usr;

    public User getUsr() {
        return this.usr;
    }

    public void setUsr(User paramUsr) {
        this.usr = paramUsr;
    }

    @Override
    public boolean equals(Object paramObject) {
        if (paramObject == null) {
            return false;
        }
        if (!(paramObject instanceof PwdKey)) {
            return false;
        }
        PwdKey localPwdKey = (PwdKey) paramObject;

        if ((getUsr() == null) || (localPwdKey.getUsr() == null)) {
            return false;
        }
        if (!getUsr().equals(localPwdKey.getUsr())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.hashValue == 0) {
            int i = 17;
            int j = getUsr() == null ? 0 : getUsr().hashCode();
            i = i * 37 + j;
            this.hashValue = i;
        }
        return this.hashValue;
    }
}
