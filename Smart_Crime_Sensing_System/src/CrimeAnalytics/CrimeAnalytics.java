/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrimeAnalytics;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class CrimeAnalytics {
    private ArrayList<Analytics> analyticList;
    
    public CrimeAnalytics(){
        analyticList = new ArrayList<>();
    }

    public ArrayList<Analytics> getAnalyticList() {
        return analyticList;
    }

    public void setAnalyticList(ArrayList<Analytics> analyticList) {
        this.analyticList = analyticList;
    }
    
    public Analytics addAnalytics(){
        Analytics a = new Analytics();
        analyticList.add(a);
        return a;
    }
}
