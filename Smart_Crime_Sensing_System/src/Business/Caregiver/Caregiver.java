/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Caregiver;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Lakshmi
 */
public class Caregiver extends Employee{
    private Person person;
    private String careGiverId;
    private String relationship;
    private String careGiverfirstName;
    private String careGiverlastName;
    private int careGiverssn;
    private int careGivercontactNumber;
    private String careGiveremail;
    private String careGiveruserName;
    private String careGiverpassword;
    private int careGiveremergencyContactNumber;
    private UserAccount policeOfficer;
    private String ProfilePic;

    public String getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(String ProfilePic) {
        this.ProfilePic = ProfilePic;
    }

    public UserAccount getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(UserAccount policeOfficer) {
        this.policeOfficer = policeOfficer;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String getCareGiverfirstName() {
        return careGiverfirstName;
    }

    public void setCareGiverfirstName(String careGiverfirstName) {
        this.careGiverfirstName = careGiverfirstName;
    }

    public String getCareGiverlastName() {
        return careGiverlastName;
    }

    public void setCareGiverlastName(String careGiverlastName) {
        this.careGiverlastName = careGiverlastName;
    }

    public int getCareGiverssn() {
        return careGiverssn;
    }

    public void setCareGiverssn(int careGiverssn) {
        this.careGiverssn = careGiverssn;
    }

    public int getCareGivercontactNumber() {
        return careGivercontactNumber;
    }

    public void setCareGivercontactNumber(int careGivercontactNumber) {
        this.careGivercontactNumber = careGivercontactNumber;
    }

    public String getCareGiveremail() {
        return careGiveremail;
    }

    public void setCareGiveremail(String careGiveremail) {
        this.careGiveremail = careGiveremail;
    }

    public String getCareGiveruserName() {
        return careGiveruserName;
    }

    public void setCareGiveruserName(String careGiveruserName) {
        this.careGiveruserName = careGiveruserName;
    }

    public String getCareGiverpassword() {
        return careGiverpassword;
    }

    public void setCareGiverpassword(String careGiverpassword) {
        this.careGiverpassword = careGiverpassword;
    }

    public int getCareGiveremergencyContactNumber() {
        return careGiveremergencyContactNumber;
    }

    public void setCareGiveremergencyContactNumber(int careGiveremergencyContactNumber) {
        this.careGiveremergencyContactNumber = careGiveremergencyContactNumber;
    }
   
    public String getCareGiverId() {
        return careGiverId;
    }   

    public void setCareGiverId(String careGiverId) {
        this.careGiverId = careGiverId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    @Override
    public String toString() {
        return careGiverfirstName;
    }
    
}
