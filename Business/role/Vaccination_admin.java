/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;

/**
 *
 * @author Rucha Mangalekar
 */
public class Vaccination_admin extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CustomerAreaJPanel(userProcessContainer, account, business);
    }
    
}
