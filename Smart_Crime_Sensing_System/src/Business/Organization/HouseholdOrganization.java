/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CaregiverRole;
import Business.Role.Role;
import Business.Role.VictimRole;
import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class HouseholdOrganization extends Organization{

    public HouseholdOrganization() {
        super(Type.Household.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VictimRole());
        return roles;
    }    
}
