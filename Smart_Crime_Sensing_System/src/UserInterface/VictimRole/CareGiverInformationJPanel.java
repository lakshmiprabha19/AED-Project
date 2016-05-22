/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VictimRole;

import Business.Caregiver.Caregiver;
import Business.Caregiver.CaregiverDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.CaregiverOrganization;
import Business.Organization.Organization;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CaregiverWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lakshmi
 */
public class CareGiverInformationJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private PersonDirectory personDirectory;
    private Enterprise enterprise;
    
    /**
     * Creates new form CareGiverInformationJPanel
     */
    public CareGiverInformationJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.personDirectory = personDirectory;
        this.enterprise = enterprise;
        System.out.println("care"+userAccount);
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof CaregiverWorkRequest){
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((CaregiverWorkRequest)request).getResult();
                row[3] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
        }
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
        btnSendRequest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Care Giver");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        btnSendRequest.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnSendRequest.setText("Send Request");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        workRequestJTable.setBackground(new java.awt.Color(255, 255, 102));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 465, 97));

        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        // TODO add your handling code here:
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof CaregiverWorkRequest){
                if(!(request.getStatus().isEmpty())){
                    JOptionPane.showMessageDialog(this, "Only once request can be sent to caregiver", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        CaregiverLabRequestJPanel careGiverJPanel = new CaregiverLabRequestJPanel(userProcessContainer, userAccount, enterprise, personDirectory);
        userProcessContainer.add("careGiverJPanel", careGiverJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}