/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.government;
//package org.jfree.chart.demo;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Covid19;
import Business.WorkQueue.Covid19_directory;
import Business.WorkQueue.vaccination_request;
import Business.WorkQueue.vaccination_request_directory;
import Business.governmentofficial.governmentofficial;
import Business.user.User;
import Business.user.User_directory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.loginpage;

/**
 *
 * @author maury
 */
public class government_main_frame extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form government_main_frame
     */
    public government_main_frame(JPanel container,EcoSystem system,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=system;
        this.userAccount=userAccount;
        governmentofficial g=(governmentofficial)userAccount;
        jLabel7.setText("Welcome "+g.getFirst_name());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1036, 539));
        setPreferredSize(new java.awt.Dimension(1036, 539));

        container1.setBackground(new java.awt.Color(0, 153, 153));
        container1.setPreferredSize(new java.awt.Dimension(770, 539));
        container1.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 39, 68));
        jLabel1.setText("Vaccination Request");
        jLabel1.setPreferredSize(new java.awt.Dimension(140, 30));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_new/Vaccination 35.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_new/Government .png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("Covid 19 Statstics");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("Vaccination Statstics");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_new/Covid Statics 35.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_new/Vaccination 35.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(158, 158, 158))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))))
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        vaccination();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        backAction();
        DB4OUtil.dB4OUtil.storeSystem(ecosystem);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Covid19_directory c=ecosystem.getCdd();
        ArrayList<Covid19> c1=c.getarray();
        int a=0;
        int b=0;
        for(int i=0;i<c1.size();i++)
        {
            
            Covid19 c2 = c1.get(i);
            if(c2.getResult().matches("Positive"))
            {
                a+=1;
            }
            else if(c2.getResult().matches("Negative"))
            {
                b+=1;
            }
            
        }
        
        
        DefaultPieDataset pie=new DefaultPieDataset();
        pie.setValue("Positive Case", a);
        pie.setValue("Negative Case", b);
        JFreeChart c2=ChartFactory.createPieChart("Covid-19 Statistics", pie,true,true,true);
        PiePlot p = (PiePlot)c2.getPlot();
        ChartFrame f=new ChartFrame("Pie Chart",c2);
        f.setVisible(false);
        f.setSize(300, 400);
        ChartPanel cp=new ChartPanel(c2);
        cp.setSize(500, 400);
        container1.removeAll();
        container1.add(cp);
        container1.updateUI();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        User_directory v =ecosystem.getUserdirectory();
        ArrayList<User> vaccination_org = v.getUser();
        int size=vaccination_org.size();
        
        
       vaccination_request_directory vrd= ecosystem.getVrd();
       int a1=0;
        ArrayList<vaccination_request> vr=vrd.getarray();
        for(int i=0;i<vr.size();i++ )
        {
            vaccination_request vr1=vr.get(i);
            if(vr1.getStatus().matches("Done"))
            {
                a1+=1;
            }
        }
        
        
        DefaultPieDataset pie=new DefaultPieDataset();
        pie.setValue("Vaccination", a1);
        pie.setValue("Non Vaccination ", size-a1);
        JFreeChart c2=ChartFactory.createPieChart("Vaccination Statistics", pie,true,true,true);
        PiePlot p = (PiePlot)c2.getPlot();
        ChartFrame f=new ChartFrame("Pie Chart",c2);
        f.setVisible(false);
        f.setSize(300, 400);
        ChartPanel cp=new ChartPanel(c2);
        cp.setSize(500, 400);
        container1.removeAll();
        container1.add(cp);
        container1.updateUI();
    }//GEN-LAST:event_jLabel6MouseClicked
    private void backAction() {
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        loginpage manageSuppliersJPanel = (loginpage) component;        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

    public void vaccination()
    {
        vaccination_request1 ur=new vaccination_request1(container,ecosystem);
        container1.add(ur);
        CardLayout layout = (CardLayout) container1.getLayout();
        layout.next(container1); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
