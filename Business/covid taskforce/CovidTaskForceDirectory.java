/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.covidtaskforce;

import Business.pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author maury
 */
public class CovidTaskForceDirectory {
    ArrayList<CovidTaskForce> a =new ArrayList<CovidTaskForce>();
    
    public void addpharmacy(CovidTaskForce c)
    {        
       a.add(c);
    }

    public ArrayList<CovidTaskForce> getA() {
        return a;
    }

    public void setA(ArrayList<CovidTaskForce> a) {
        this.a = a;
    }

    
    
    public void removepharmacy(CovidTaskForce customer){
        a.remove(customer);
    }
    
}
