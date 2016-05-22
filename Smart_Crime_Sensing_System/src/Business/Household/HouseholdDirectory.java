/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Household;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class HouseholdDirectory {
    private ArrayList<Household> houseHoldList;
    
    public HouseholdDirectory(){
        houseHoldList = new ArrayList<>();
    }

    public ArrayList<Household> getHouseHoldList() {
        return houseHoldList;
    }

    public void setHouseHoldList(ArrayList<Household> houseHoldList) {
        this.houseHoldList = houseHoldList;
    }
    
    public Household addHousehold(){
        Household h = new Household();
        houseHoldList.add(h);
        return h;
    }
}
