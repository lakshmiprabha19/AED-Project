/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CareGiverRole;

import Business.Caregiver.CaregiverDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.VictimRole.ProfileInformationJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Lakshmi
 */
public class CareGiverWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    /**
     * Creates new form CareGiverWorkAreaJPanel
     */
    public CareGiverWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btmEmergency = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area - Caregiver Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton1.setText("Manage Requests");
        jButton1.setActionCommand("Manage Approval Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 250, -1));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton2.setText("Update Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 250, -1));

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton3.setText("Manage Household");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 250, -1));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 160, 130));

        btmEmergency.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btmEmergency.setText("Emergency Requests");
        btmEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEmergencyActionPerformed(evt);
            }
        });
        add(btmEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 473, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageRequestsJPanel manageRequestJPanel = new ManageRequestsJPanel(userProcessContainer, userAccount, organization, enterprise, organization.getCareGiverDirectory());
        userProcessContainer.add("manageRequestJPanel", manageRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UpdateInformationJPanel updateInformationJPanel = new UpdateInformationJPanel(userProcessContainer, userAccount, organization.getCareGiverDirectory());
        userProcessContainer.add("updateInformationJPanel", updateInformationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ManageHouseholdJPanel houseJPanel = new ManageHouseholdJPanel(userProcessContainer, userAccount, organization.getCareGiverDirectory());
        userProcessContainer.add("houseJPanel", houseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btmEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEmergencyActionPerformed
        // TODO add your handling code here:
        EmergencyRequestsJPanel emergencyJPanel = new EmergencyRequestsJPanel(userProcessContainer, userAccount, organization, enterprise, organization.getCareGiverDirectory());
        userProcessContainer.add("emergencyJPanel", emergencyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btmEmergencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmEmergency;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
