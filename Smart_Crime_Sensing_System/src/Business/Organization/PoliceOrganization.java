/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PoliceOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class PoliceOrganization extends Organization{
    public PoliceOrganization() {
        super(Type.Police.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PoliceOfficerRole());
        return roles;
    }

    
}
