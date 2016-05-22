/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Business.Vitalsign.VitalsignHistory;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Lakshmi
 */
public class Person extends Employee{
    private int personId;
    private String firstName;
    private String lastName;
    private int ssn;
    private long contactNumber;

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    private String email;
    private String userName;
    private String password;
    private static final Random RANDOM = new SecureRandom();
    public static final int PASSWORD_LENGTH = 8;
    private static int count = 1;
    private int emergencyContactNumber;
    private String parent;
    private String gender;
    private String aptNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String workLocation;
    private String morningTime;
    private String eveningTime;
    private String dob;
    private int age;
    private float latitude;
    private float longitude;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
        
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private String bloodGroup;
    private String modeOfTransport;
    private String profilePic;
    private UserAccount policeOfficer;
    private VitalsignHistory vitalSignHistory;
    
    public Person(){
        personId = count;
        count++;
        vitalSignHistory = new VitalsignHistory();
    }
    
    public VitalsignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalsignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public UserAccount getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(UserAccount policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
    
    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getMorningTime() {
        return morningTime;
    }

    public void setMorningTime(String morningTime) {
        this.morningTime = morningTime;
    }

    public String getEveningTime() {
        return eveningTime;
    }

    public void setEveningTime(String eveningTime) {
        this.eveningTime = eveningTime;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(int emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
    
    @Override
    public String toString() {
        return firstName;
    }
}
