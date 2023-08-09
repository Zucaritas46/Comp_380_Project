package com.example.comp_380_project;

import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.application.Platform;

public class JavaFxApplication extends javax.swing.JFrame {
    private  FileReader dataBase;
    private  PrelimMenu optionMenu;
    private  HotelRooms hotel;
    private  String[] args;
    
    public JavaFxApplication() {
        
    }
    
    public JavaFxApplication(FileReader dataBase, PrelimMenu optionMenu, HotelRooms hotel, String args[]) {
        this.dataBase = dataBase;
        this.optionMenu = optionMenu;
        this.hotel = hotel;
        this.args = args;
        
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        guestButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Welcome To Hotel Delfino!");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        guestButton.setBackground(new java.awt.Color(153, 153, 153));
        guestButton.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        guestButton.setText("Guest Login");
        guestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(153, 0, 0));
        registerButton.setFont(new java.awt.Font("Segoe UI", 3, 100)); // NOI18N
        registerButton.setText("Register User");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        managerButton.setBackground(new java.awt.Color(153, 153, 153));
        managerButton.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        managerButton.setText("Manager Login");
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(guestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(managerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestButtonActionPerformed
        String u = JOptionPane.showInputDialog(null, "Enter your username:", "Login", JOptionPane.PLAIN_MESSAGE); // username prompt
        
        if (u == null)
            return;
        
        if (!dataBase.verifyUsername(u))
                JOptionPane.showMessageDialog(null, "Username not found");
        else {
            while (true) {

                String p = JOptionPane.showInputDialog(null, "Enter your password:", "Login", JOptionPane.PLAIN_MESSAGE); // password prompt !! activates only if username is found

                if (!dataBase.verifyLogin(u,p)) {
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Welcome!");
                    dispose();
                    break;
                }
            }
        } 
    }//GEN-LAST:event_guestButtonActionPerformed

    private void managerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerButtonActionPerformed
        String u = JOptionPane.showInputDialog(null, "Enter your username:", "Login", JOptionPane.PLAIN_MESSAGE); // username prompt
        
        if (u == null)
            return;
        
        if (!u.equals("m"))
                JOptionPane.showMessageDialog(null, "Username not found");
        else {
            while (true) {
                String p = JOptionPane.showInputDialog(null, "Enter your password:", "Login", JOptionPane.PLAIN_MESSAGE); // password prompt !! activates only if username is found
            
                if (!p.equals("p")) {
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Welcome!");
                    dispose();
                    Main.unlocker = "t";
                    break;
                }
            }
        }    
    }//GEN-LAST:event_managerButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String u = JOptionPane.showInputDialog(null, "Choose Username:", "Register", JOptionPane.PLAIN_MESSAGE); // username prompt
        
        if (u == null)
            return;
        
        if(dataBase.verifyUsername(u) == true) {
            JOptionPane.showMessageDialog(null, "Username taken, please try another.");
        }
        else {
            String p = JOptionPane.showInputDialog(null, "Choose Password:", "Register", JOptionPane.PLAIN_MESSAGE); // username prompt
            dataBase.registerNewUser(u, p);
        }
    }//GEN-LAST:event_registerButtonActionPerformed



    public void startLoginMenu() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaFxApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaFxApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaFxApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaFxApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaFxApplication(dataBase, optionMenu, hotel, args).setVisible(true);
            }
        });  

        y();
    }

    public void y() {
       Scanner scnr = new Scanner(System.in);
       scnr.next();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guestButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managerButton;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
