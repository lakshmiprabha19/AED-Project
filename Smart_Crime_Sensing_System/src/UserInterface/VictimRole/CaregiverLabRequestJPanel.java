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
import static Business.Organization.Organization.Type.Caregiver;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CaregiverWorkRequest;
import Business.WorkQueue.CrimeWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lakshmi
 */
public class CaregiverLabRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private PersonDirectory personDirectory;
    private Enterprise enterprise;
    private Person person;
    private Caregiver careGiver;
    /**
     * Creates new form CaregiverLabRequestJPanel
     */
    public CaregiverLabRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.personDirectory = personDirectory;
        this.enterprise = enterprise;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) careGivertbl.getModel();
        
        model.setRowCount(0);
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof CaregiverOrganization){
                for (UserAccount account : o.getUserAccountDirectory().getUserAccountList()){
                    Object[] row = new Object[2];
                    row[0] = account;
                    row[1] = account.getRole();

                    model.addRow(row);
                }       
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
        requestTestJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        careGivertbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setText("Request for Caregiver");

        requestTestJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        requestTestJButton.setText("Send Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel2.setText("Message");

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        careGivertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caregiver Name", "Person Name"
            }
        ));
        jScrollPane1.setViewportView(careGivertbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(73, 73, 73)
                .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(backJButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(requestTestJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(backJButton))
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRow = careGivertbl.getSelectedRow();
        for(Person p: personDirectory.getPersonList()){
            if(p.getFirstName().equals(userAccount.getEmployee().getName())){
                person = p;
            }
        }
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an entry from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            if(messageJTextField.equals("")){
                JOptionPane.showMessageDialog(this, "Please enter message", "Error", JOptionPane.ERROR_MESSAGE);
            }        
            else
            {
                UserAccount account = (UserAccount) careGivertbl.getValueAt(selectedRow, 0);
                for (Organization o: enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof CaregiverOrganization){
                        for(Caregiver c: o.getCareGiverDirectory().getCareGiverList()){
                            if(c.getCareGiverfirstName().equals(account.getEmployee().getName())){
                                careGiver = c;
                            }
                        }
                    }
                }

                String message = messageJTextField.getText();

                CaregiverWorkRequest request = new CaregiverWorkRequest();
                request.setMessage(message);
                request.setSender(userAccount);
                request.setReceiver(account);
                request.setCaregiver(careGiver);
                request.setPerson(person);
            

                request.setStatus("Sent");

                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof CaregiverOrganization){
                        org = organization;
                        break;
                    }
                }
                if (org!=null){
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CareGiverInformationJPanel dwjp = (CareGiverInformationJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable careGivertbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}