/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vitalsign;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class VitalsignHistory {
    private ArrayList<Vitalsign> vitalSignList;
    
    public VitalsignHistory(){
        vitalSignList = new ArrayList<>();
    }

    public ArrayList<Vitalsign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<Vitalsign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public Vitalsign addVitalsign(){
        Vitalsign vs = new Vitalsign();
        vitalSignList.add(vs);
        return vs;
    }
    
    public String VitalSignStatus(int patientAge, Vitalsign vitalSign) {
        String vitalSignStatus = "Normal";

        int respirationRate = vitalSign.getRespiratoryRate();
        int heartRate = vitalSign.getHeartRate();
        int bloodPressure = vitalSign.getBloodPressure();

        if (patientAge >= 1 && patientAge <= 3) {
            if ((respirationRate < 20 || respirationRate > 30) 
                    || (heartRate < 80 || heartRate > 130) 
                    || (bloodPressure < 80 || bloodPressure > 110)){ 
                vitalSignStatus = "Abnormal";   
            }
        }

        if (patientAge >= 4 && patientAge <= 5) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 80 || heartRate > 120)
                    || (bloodPressure < 80 || bloodPressure > 110)) {
                vitalSignStatus = "Abnormal";
            }
        }

        if (patientAge >= 6 && patientAge <= 12) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 70 || heartRate > 110)
                    || (bloodPressure < 80 || bloodPressure > 120)) {
                vitalSignStatus = "Abnormal";
            }
        }

        if (patientAge >= 13) {
            if ((respirationRate < 12 || respirationRate > 20)
                    || (heartRate < 55 || heartRate > 105)
                    || (bloodPressure < 110 || bloodPressure > 120)) {
                vitalSignStatus = "Abnormal";
            }
        }
        return vitalSignStatus;
    }
}
