/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Police.getValue())){
            organization = new PoliceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Household.getValue())){
            organization = new HouseholdOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Caregiver.getValue())){
            organization = new CaregiverOrganization();
            organizationList.add(organization);
        }
        return organization;
    }   
}
