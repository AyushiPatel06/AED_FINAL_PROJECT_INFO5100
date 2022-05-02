/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author maury
 */
public class devicebank_directory {
    ArrayList<DeviceBank> a =new ArrayList<DeviceBank>();
    
    public void addBloodBank(DeviceBank c)
    {        
       a.add(c);
    }

    public ArrayList<DeviceBank> getA() {
        return a;
    }

    public void setA(ArrayList<DeviceBank> a) {
        this.a = a;
    }

    
    
    public void removeBloodBank(DeviceBank customer){
        a.remove(customer);
    }
    
}
