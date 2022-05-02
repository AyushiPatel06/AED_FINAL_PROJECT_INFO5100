/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.covidtaskforce;

import Business.Role.CovidTaskForceAdmin;
import Business.Role.PharmacyAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author maury
 */
public class CovidTaskForce extends UserAccount{
    String name;
    String Location;
    String phonenumber;
    String userid;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        setUsername(userid);
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public CovidTaskForce(String name,  String userid, String password, String phonenumber,String location) {
        setUsername(userid);
        setPassword(password);
        setRole(new CovidTaskForceAdmin());
        this.name = name;
        this.phonenumber = phonenumber;
        this.Location = location;
        this.userid=userid;
        this.password=password;  
    }
    
}
