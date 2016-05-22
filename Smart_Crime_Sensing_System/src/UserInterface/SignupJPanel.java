/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Caregiver.Caregiver;
import Business.Caregiver.CaregiverDirectory;
import Business.CrimeSystem;
import Business.Email.EmailSender;
import Business.Employee.Employee;
import Business.Enterprise.CommunityEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PoliceEnterprise;
import Business.Network.Network;
import Business.Organization.CaregiverOrganization;
import Business.Organization.HouseholdOrganization;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.CaregiverRole;
import Business.Role.Role;
import Business.Role.VictimRole;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lakshmi
 */
public class SignupJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private CrimeSystem system;
    private Organization organization;
    private PersonDirectory personDirectory;
    private CaregiverDirectory caregiverDirectory;
    /**
     * Creates new form SignupJPanel
     */
    public SignupJPanel(JPanel userProcessContainer, CrimeSystem system, PersonDirectory personDirectory, CaregiverDirectory caregiverDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.personDirectory = personDirectory;
        this.caregiverDirectory = caregiverDirectory;
        populateRoleCombo();
        populatePoliceCombo();
    }
    
    private void populatePoliceCombo(){
        for(Network n: system.getNetworkList()){
            for(Enterprise en:n.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o: en.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof PoliceOrganization){
                        for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
                            comboPoliceOfficer.addItem(ua);
                        }
                    }
                }
            }

        }
    }

    private void populateRoleCombo(){
        roleJComboBox.removeAllItems();
        for(Network net: system.getNetworkList()){
            for (Enterprise e: net.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof CommunityEnterprise){
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                        if((o instanceof HouseholdOrganization) || (o instanceof CaregiverOrganization)){
                            for (Role role : o.getSupportedRole()){
                                roleJComboBox.addItem(role);
                            }
                        }
                    }
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboPoliceOfficer = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setText("SIGN UP");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, 40));

        txtLastName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 140, -1));

        btnSignup.setBackground(new java.awt.Color(255, 255, 153));
        btnSignup.setFont(new java.awt.Font("Mangal", 1, 12)); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 115, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("Social Security Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        txtSsn.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        add(txtSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 150, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Contact Number");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        txtContactNumber.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 150, -1));

        lblEmail.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, 30));

        txtEmail.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 140, -1));

        roleJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 240, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setText("Select your role");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        comboPoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPoliceOfficerActionPerformed(evt);
            }
        });
        add(comboPoliceOfficer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 240, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel9.setText("Select Police Station");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 110, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel10.setText("Username");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel11.setText("Password");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        txtPassword.setText("jPasswordField1");
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        try{
            if(checkEmpty())
            {
                Person person;
                UserAccount ua;
                Caregiver careGiver;
                Employee personEmployee;
                Employee careGiverEmployee;
                String email = txtEmail.getText();
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                int ssn = (Integer.parseInt(txtSsn.getText()));
                String username = txtUsername.getText();
                int contactNumber = (Integer.parseInt(txtContactNumber.getText()));
                char[] passwordCharArray = txtPassword.getPassword();
                String password = String.valueOf(passwordCharArray);
                Role role = (Role)roleJComboBox.getSelectedItem();
                UserAccount policeUser = (UserAccount)comboPoliceOfficer.getSelectedItem();
                if(role instanceof VictimRole){  
                    for(Network n: system.getNetworkList()){
                        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                            if(e instanceof CommunityEnterprise){
                                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                                    if(o instanceof HouseholdOrganization){
                                        organization = o;
                                    }
                                }
                            }
                        }
                    }
                    person = organization.getPersonDirectory().createPerson();
                    person.setEmail(email);
                    person.setContactNumber(contactNumber);
                    person.setFirstName(firstName);
                    person.setLastName(lastName);
                    person.setSsn(ssn);
                    person.setUserName(username);
                    person.setPassword(password);
                    person.setPoliceOfficer(policeUser);
                    personEmployee = organization.getEmployeeDirectory().createEmployee(person.getFirstName());
                    ua = organization.getUserAccountDirectory().createUserAccount(username, password, personEmployee, new VictimRole());
                    ua.setUsername(username);
                    ua.setPassword(password);
                }
                else if(role instanceof CaregiverRole){
                    for(Network n: system.getNetworkList()){
                        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                            if(e instanceof CommunityEnterprise){
                                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                                    if(o instanceof CaregiverOrganization){
                                        System.out.println("inside housejold");
                                        organization = o;
                                    }
                                }
                            }
                        }
                    }
                    careGiver = organization.getCareGiverDirectory().createCaregiver();
                    careGiver.setCareGiverfirstName(firstName);
                    careGiver.setCareGiverlastName(lastName);
                    careGiver.setCareGiverssn(ssn);
                    careGiver.setCareGiveremergencyContactNumber(contactNumber);
                    careGiver.setCareGiveremail(email);
                    careGiver.setPoliceOfficer(policeUser);
                    careGiver.setCareGiveruserName(username);
                    careGiver.setCareGiverpassword(password);
                    careGiverEmployee = organization.getEmployeeDirectory().createEmployee(careGiver.getCareGiverfirstName());
                    ua = organization.getUserAccountDirectory().createUserAccount(username, password, careGiverEmployee, new CaregiverRole());
                    ua.setPassword(password);
                    ua.setUsername(username);
                }

                String message = "Your Username is "+username+" and your password is "+password;
//Substitue the sender's email address and password
                EmailSender.sendMail("", "", message, email);
                JOptionPane.showMessageDialog(this, "Username and Password are sent in email for your reference.","Information",JOptionPane.INFORMATION_MESSAGE);
                resetFields();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please enter all values", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter correct values", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSignupActionPerformed
    
    private Boolean checkEmpty()
    {
        if(txtFirstName.getText().length()==0
            ||txtLastName.getText().length()==0
            ||txtSsn.getText().length()==0
            ||txtEmail.getText().length()==0
            ||txtContactNumber.getText().length() ==0
            || txtUsername.getText().length() == 0
            || (!(txtContactNumber.getText().matches("\\d+"))))
            {
                return false;
            }
            else{
                return true;
        }
    }
    
    
    private void resetFields(){
        txtEmail.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtSsn.setText("");
        txtContactNumber.setText("");
        txtPassword.setText("");
        txtUsername.setText("");
    }
    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void comboPoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPoliceOfficerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPoliceOfficerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox comboPoliceOfficer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
