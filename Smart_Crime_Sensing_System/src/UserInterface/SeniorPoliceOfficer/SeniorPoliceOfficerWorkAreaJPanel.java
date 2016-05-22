/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SeniorPoliceOfficer;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Lakshmi
 */
public class SeniorPoliceOfficerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount account;
    /**
     * Creates new form SeniorPoliceOfficerWorkAreaJPanel
     */
    public SeniorPoliceOfficerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.account = account;
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
        btnManageOrganization = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnMeetingReport = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setText("Senior Police Officer Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        btnManageOrganization.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton1.setText("Analytics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 197, -1));

        btnMeetingReport.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnMeetingReport.setText("Meeting Reports List");
        btnMeetingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeetingReportActionPerformed(evt);
            }
        });
        add(btnMeetingReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 197, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 197, -1));

        userJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 197, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnMeetingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeetingReportActionPerformed
        // TODO add your handling code here:
        MeetingRequestsJPanel meetingReportJPanel = new MeetingRequestsJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("meetingReportJPanel", meetingReportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMeetingReportActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AnalyticsJPanel analytics = new AnalyticsJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("analytics", analytics);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnMeetingReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}