/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@MappedSuperclass
public class AbstractPwd implements Serializable {

    private int hashValue = 0;
    @Id
    private PwdKey id;
    private String desPwd;
    @JoinColumn(name = "ID_USR")
    @OneToOne
    private User user;

    public AbstractPwd() {
    }

    public AbstractPwd(User paramUsr) {
        setId(this.id);
    }

    public PwdKey getId() {
        return this.id;
    }

    public void setId(PwdKey paramPwdKey) {
        this.hashValue = 0;
        this.id = paramPwdKey;
    }

    public String getDesPwd() {
        return this.desPwd;
    }

    public void setDesPwd(String paramString) {
        this.desPwd = paramString;
    }

    @Override
    public boolean equals(Object paramObject) {
        if (paramObject == null) {
            return false;
        }
        if (!(paramObject instanceof Pwd)) {
            return false;
        }
        Pwd localPwd = (Pwd) paramObject;
        if ((getId() != null) && (localPwd.getId() != null)) {
            if (!getId().equals(localPwd.getId())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (this.hashValue == 0) {
            int i = 17;
            int j = getId() == null ? 0 : getId().hashCode();
            i = i * 37 + j;
            this.hashValue = i;
        }
        return this.hashValue;
    }
}
