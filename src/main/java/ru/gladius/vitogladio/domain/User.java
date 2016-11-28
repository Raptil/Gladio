/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.gladius.vitogladio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Алексей
 */
@Entity
@Table(name="User")
public class User {
    
    @GeneratedValue(generator="increment")
    @Id
    private int id_user;
    
    @Column
    private String userName;
    
    @Column
    private String userPassword;
    
    @Column
    private String userCity;
    
    @Column
    private int userProperty;
    
    @Column
    private int userPrestige;
    
    @Column
    private int userCountWars;
    
    @Column
    private int userCountWins;
    
    @Column
    private int userCountLose;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public int getUserProperty() {
        return userProperty;
    }

    public void setUserProperty(int userProperty) {
        this.userProperty = userProperty;
    }

    public int getUserPrestige() {
        return userPrestige;
    }

    public void setUserPrestige(int userPrestige) {
        this.userPrestige = userPrestige;
    }

    public int getUserCountWars() {
        return userCountWars;
    }

    public void setUserCountWars(int userCountWars) {
        this.userCountWars = userCountWars;
    }

    public int getUserCountWins() {
        return userCountWins;
    }

    public void setUserCountWins(int userCountWins) {
        this.userCountWins = userCountWins;
    }

    public int getUserCountLose() {
        return userCountLose;
    }

    public void setUserCountLose(int userCountLose) {
        this.userCountLose = userCountLose;
    }
    
    

    
    
}
