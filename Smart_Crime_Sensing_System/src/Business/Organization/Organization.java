/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Caregiver.CaregiverDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Household.HouseholdDirectory;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import CrimeAnalytics.CrimeAnalytics;
import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private PersonDirectory personDirectory;
    private HouseholdDirectory householdDirectory;
    private int organizationID;
    private CaregiverDirectory careGiverDirectory;
    private CrimeAnalytics analytics;
    private static int counter;

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        personDirectory = new PersonDirectory();
        careGiverDirectory = new CaregiverDirectory();
        householdDirectory = new HouseholdDirectory();
        analytics = new CrimeAnalytics();
        organizationID = counter;
        ++counter;
    }
    
    public enum Type{
        Admin("Admin Organization"), 
        Police("Police Organization"), Household("Household Organization"), Caregiver("Caregiver Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public CrimeAnalytics getAnalytics() {
        return analytics;
    }

    public void setAnalytics(CrimeAnalytics analytics) {
        this.analytics = analytics;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public CaregiverDirectory getCareGiverDirectory() {
        return careGiverDirectory;
    }

    public void setCareGiverDirectory(CaregiverDirectory careGiverDirectory) {
        this.careGiverDirectory = careGiverDirectory;
    }
        
    public HouseholdDirectory getHouseholdDirectory() {
        return householdDirectory;
    }

    public void setHouseholdDirectory(HouseholdDirectory householdDirectory) {
        this.householdDirectory = householdDirectory;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return name;
    }
}