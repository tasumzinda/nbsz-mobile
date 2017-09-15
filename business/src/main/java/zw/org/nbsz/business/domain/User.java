/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import zw.org.nbsz.business.domain.util.UserRole;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Entity
@Table(name = "usr")
public class User implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "ID_USR")
    private Long id;
    
    @Column(name = "DES_USR")
    private String name;
    
    @Column(name = "SRT_USR")
    private String srt;
    
    @Column(name = "DES_USERID")
    private String userId;
    
    @ManyToOne
    @JoinColumn(name = "ID_CENTRE")
    private Centre centre;
    
    private String userName;
    
    private String password;
    
    @Transient
    private String confirmPassword;
    
    @Enumerated
    private UserRole userRole;
    
    @Column(name = "LOG_ACTIVE")
    private String active;
    
    public User(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrt() {
        return srt;
    }

    public void setSrt(String srt) {
        this.srt = srt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
    
}
