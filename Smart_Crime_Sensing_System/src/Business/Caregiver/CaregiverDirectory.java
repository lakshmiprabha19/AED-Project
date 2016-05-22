/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Caregiver;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class CaregiverDirectory {
    private ArrayList<Caregiver> careGiverList;

    public ArrayList<Caregiver> getCareGiverList() {
        return careGiverList;
    }

    public CaregiverDirectory(){
        careGiverList = new ArrayList<>();
    }
    
    public Caregiver createCaregiver(){
        Caregiver careGiver = new Caregiver();
        careGiverList.add(careGiver);
        return careGiver;
    }
}
