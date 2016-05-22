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
import javax.swing.JPanel;

/**
 *
 * @author Lakshmi
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Mayor("Mayor"),
        PoliceOfficer("Police Officer"),
        HospitalAdmin("Hospital Admin"),
        CommunityAdmin("Community Admin"),
        Victim("Victim"),
        Caregiver("Caregiver"),
        SeniorPoliceOfficer("Senior Police Officer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        } ;

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
        UserAccount account, 
        Organization organization, 
        Enterprise enterprise,
        CrimeSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
