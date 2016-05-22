/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lakshmi
 */
public class CommunityEnterprise extends Enterprise{
   public CommunityEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Community);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }   
}
