/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author maury
 */
public class request_device_directory {
    ArrayList<request_device> us = new ArrayList<request_device>();

    public ArrayList<request_device> getarray() {
        return us;
    }

    public void setarray(ArrayList<request_device> user) {
        this.us = user;
    }
    
    public void addrequest(request_device user){
        us.add(user);
    }
    
    public void removerequest(request_device user){
        us.remove(user);
    }
    
}
