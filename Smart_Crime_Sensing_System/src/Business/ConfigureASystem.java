/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Household.Household;
import Business.Network.Network;
import Business.Organization.HouseholdOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.Role.VictimRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Lakshmi
 */
public class ConfigureASystem {
    public static CrimeSystem configure(){        
        CrimeSystem system = CrimeSystem.getInstance();        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());        
        //populateValues(system);
        return system;
    }
    
//    private static void populateValues(CrimeSystem system){
//        for(Network n:system.getNetworkList()){
//            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
//                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
//                    if(o instanceof HouseholdOrganization){
//                        Person person = o.getPersonDirectory().createPerson();
//                        person.setEmail("lakshmiprabha19@gmail.com");
//                        person.setContactNumber(8577072257L);
//                        person.setFirstName("Lakshmi");
//                        person.setLastName("Prabha");
//                        person.setSsn(12345754);
//                        person.setUserName("victim");
//                        person.setPassword("victim");
//                        for(UserAccount u: system.getUserAccountDirectory().getUserAccountList()){
//                            
//                        }
//                        Employee e1= o.getEmployeeDirectory().createEmployee(person.getFirstName());
//                        UserAccount ua = o.getUserAccountDirectory().createUserAccount("victim", "victim", e1, new VictimRole());
//                        System.out.println("employee victim"+ua.getEmployee().getName());
//                        System.out.println("victim police"+person.getPoliceOfficer());
//                    }
//                }
//            }
//        }
//    }
}
