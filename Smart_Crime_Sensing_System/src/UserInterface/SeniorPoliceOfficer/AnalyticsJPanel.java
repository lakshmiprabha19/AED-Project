/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SeniorPoliceOfficer;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import CrimeAnalytics.Analytics;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Lakshmi
 */
public class AnalyticsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    /**
     * Creates new form AnalyticsJPanle
     */
    public AnalyticsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        populateComboPolice();
        displayChart();
    }
    
    private void displayChart(){
        Organization org = (Organization)comboPoliceOrganization.getSelectedItem();
        organization = org;
        calculateData(org);                        
    }
    
    private void populateComboPolice(){
        for(UserAccount userAccount: enterprise.getUserAccountDirectory().getUserAccountList()){
            if(userAccount.getEmployee().getName().equals(account.getEmployee().getName())){
                for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
                    comboPoliceOrganization.addItem(o);
                } 
            }
        }
        
    }

    private void createChart(PieDataset dataset){
        System.out.println("inside chart");
        JFreeChart chart = ChartFactory.createPieChart(
            "Category Wise Crime for Police Organization - "+organization.getName(),  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        ChartPanel chart1=new ChartPanel(chart);
        chartPanel2.removeAll();
        chartPanel2.add(chart1,BorderLayout.CENTER);
        chartPanel2.validate();       
        
    }
    
    private void calculateData(Organization o){
        DefaultPieDataset dataset = new DefaultPieDataset();
        int noOfBurglary =0 ;
        int noOfKidnappingCrimes = 0;
        int noOfSexualCrimes =0;
        int noOfAccidents = 0;
        int noOfChildCrimes = 0;
        int noOfForgery = 0;
        int noOfmurderCrimes = 0;
        int totalCrimes = 0;
        for(Analytics a: o.getAnalytics().getAnalyticList()){
            if(a != null){
                if(a.getCrimeType().equals("BURGLARY")){
                    noOfBurglary = noOfBurglary+1;                
                }
                else if(a.getCrimeType().equals("KIDNAPPING"))
                {
                    noOfKidnappingCrimes = noOfKidnappingCrimes+1;
                }
                else if(a.getCrimeType().equals("SEXUAL ASSAULT"))
                {
                    noOfSexualCrimes = noOfSexualCrimes+1;
                }
                else if(a.getCrimeType().equals("ACCIDENT"))
                {
                    noOfAccidents = noOfAccidents+1;
                }
                else if(a.getCrimeType().equals("CHILD ABUSE"))
                {
                    noOfChildCrimes = noOfChildCrimes+1;
                }
                else if(a.getCrimeType().equals("FORGERY"))
                {
                    noOfForgery = noOfForgery+1;
                }
                else if(a.getCrimeType().equals("MURDER"))
                {
                    noOfmurderCrimes = noOfmurderCrimes+1;
                }
                totalCrimes = noOfAccidents+noOfChildCrimes+noOfForgery+noOfKidnappingCrimes+noOfSexualCrimes+noOfBurglary+noOfmurderCrimes;             
                dataset.setValue("BURGLARY", ((noOfBurglary/totalCrimes)*100));
                dataset.setValue("KIDNAPPING", ((noOfKidnappingCrimes/totalCrimes)*100));
                dataset.setValue("SEXUAL ASSAULT", ((noOfSexualCrimes/totalCrimes)*100));
                dataset.setValue("ACCIDENT", ((noOfAccidents/totalCrimes)*100));
                dataset.setValue("CHILD ABUSE", ((noOfChildCrimes/totalCrimes)*100));
                dataset.setValue("FORGERY", ((noOfForgery/totalCrimes)*100));
                dataset.setValue("MURDER", ((noOfmurderCrimes/totalCrimes)*100));
            }
        }
        
        createChart(dataset);
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
        jPanel1 = new javax.swing.JPanel();
        chartPanel2 = new javax.swing.JPanel();
        comboPoliceOrganization = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reporting");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 32, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        chartPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(chartPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(chartPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 780, 470));

        comboPoliceOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPoliceOrganizationActionPerformed(evt);
            }
        });
        add(comboPoliceOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 100, 20));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel2.setText("Select Police Organization");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void comboPoliceOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPoliceOrganizationActionPerformed
        // TODO add your handling code here:
        displayChart();
    }//GEN-LAST:event_comboPoliceOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartPanel2;
    private javax.swing.JComboBox comboPoliceOrganization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
