/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Vitalsign.Vitalsign;

/**
 *
 * @author Lakshmi
 */
public class EmergencyRequest extends WorkRequest{
    private Vitalsign vs;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Vitalsign getVs() {
        return vs;
    }

    public void setVs(Vitalsign vs) {
        this.vs = vs;
    }
}
