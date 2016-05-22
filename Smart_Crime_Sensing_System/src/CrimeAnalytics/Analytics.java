/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrimeAnalytics;

/**
 *
 * @author Lakshmi
 */
public class Analytics {
    
    private String crimeType;
    private String crimeLocation;
    private String crimeOccured;
    private String crimeReported;
    private int noOfCrimes;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getCrimeLocation() {
        return crimeLocation;
    }

    public void setCrimeLocation(String crimeLocation) {
        this.crimeLocation = crimeLocation;
    }

    public String getCrimeOccured() {
        return crimeOccured;
    }

    public void setCrimeOccured(String crimeOccured) {
        this.crimeOccured = crimeOccured;
    }

    public String getCrimeReported() {
        return crimeReported;
    }

    public void setCrimeReported(String crimeReported) {
        this.crimeReported = crimeReported;
    }

    public int getNoOfCrimes() {
        return noOfCrimes;
    }

    public void setNoOfCrimes(int noOfCrimes) {
        this.noOfCrimes = noOfCrimes;
    }
    
}
