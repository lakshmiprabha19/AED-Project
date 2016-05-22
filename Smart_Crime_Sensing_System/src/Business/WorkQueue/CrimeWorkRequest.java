/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Lakshmi
 */
public class CrimeWorkRequest extends WorkRequest{
    private String crimeType;
    private String crimeLocation;
    private String crimeOccuredAt;
    private String crimeReportedAt;

    public String getCrimeReportedAt() {
        return crimeReportedAt;
    }

    public void setCrimeReportedAt(String crimeReportedAt) {
        this.crimeReportedAt = crimeReportedAt;
    }
    
    public String getCrimeOccuredAt() {
        return crimeOccuredAt;
    }

    public void setCrimeOccuredAt(String crimeOccuredAt) {
        this.crimeOccuredAt = crimeOccuredAt;
    }
    private String result;
    private int crimeReportId;
    
    public CrimeWorkRequest(){
        ++crimeReportId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCrimeReportId() {
        return crimeReportId;
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
}
