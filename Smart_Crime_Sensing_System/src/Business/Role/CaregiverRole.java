/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.CrimeSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CareGiverRole.CareGiverWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Lakshmi
 */
public class CaregiverRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, CrimeSystem system) {
        return new CareGiverWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
    
}
