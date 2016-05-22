/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.CrimeSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PoliceOfficerRole.PoliceOfficerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Lakshmi
 */
public class PoliceOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, CrimeSystem system) {
        return new PoliceOfficerWorkAreaJPanel(userProcessContainer, enterprise, account, organization, system);
    }
    
}
