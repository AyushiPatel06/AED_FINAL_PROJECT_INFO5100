/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.cardiacemergency;

import Business.pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author Rucha Mangalekar
 */
public class CardiacEmergency_Directory {
    ArrayList<CardiacEmergency> a =new ArrayList<CardiacEmergency>();
    
    public void addpolice(CardiacEmergency c)
    {        
       a.add(c);
    }

    public ArrayList<CardiacEmergency> getA() {
        return a;
    }

    public void setA(ArrayList<CardiacEmergency> a) {
        this.a = a;
    }
    public void removepolice(CardiacEmergency customer){
        a.remove(customer);
    }
}
