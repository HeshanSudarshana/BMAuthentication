/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import BMAuthentication.Listener;
import BMAuthentication.Analyzer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Dilantha
 */
public class Interface extends javax.swing.JFrame {
    ArrayList<Integer[]> storePress;
    ArrayList<Integer[]> storeDiff;
    Listener regListener;
    Listener logListener;
    Analyzer analyzer;
    ArrayList<String> phrases;
    HashMap<String, Integer> users;
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        regListener = new Listener();
        logListener = new Listener();
        storePress = new ArrayList();
        storeDiff = new ArrayList();
        phrases = new ArrayList();
        users = new HashMap();
        regPhrase.addKeyListener(regListener);
        logPhrase.addKeyListener(logListener);
        analyzer = new Analyzer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        regPhrase = new javax.swing.JTextField();
        regButton = new javax.swing.JButton();
        regOut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logNameLabel = new javax.swing.JLabel();
        logPhraseLabel = new javax.swing.JLabel();
        logButton = new javax.swing.JButton();
        logName = new javax.swing.JTextField();
        logPhrase = new javax.swing.JTextField();
        logOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Passphrase");

        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regOut)
                    .addComponent(regButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regPhrase, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(regName))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regButton)
                .addGap(31, 31, 31)
                .addComponent(regOut)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        regName.getAccessibleContext().setAccessibleName("regName");

        jTabbedPane1.addTab("Register", jPanel1);

        logNameLabel.setText("Name");

        logPhraseLabel.setText("Passphrase");

        logButton.setText("Login");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOut)
                    .addComponent(logButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logNameLabel)
                            .addComponent(logPhraseLabel))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logName)
                            .addComponent(logPhrase, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logNameLabel)
                    .addComponent(logName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logPhraseLabel)
                    .addComponent(logPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logButton)
                .addGap(31, 31, 31)
                .addComponent(logOut)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        if (!regName.getText().isEmpty() && !regPhrase.getText().isEmpty() && !regListener.getPressedKeys().contains("Backspace")) {
            users.put(regName.getText(), users.size());
            phrases.add(regPhrase.getText());
            storePress.add(regListener.getPressed());
            storeDiff.add(regListener.getDifference());
            regListener.showInfo();
            regListener.clear();
            
            regOut.setText("User " + regName.getText()+ " added successfully");
            regName.setText("");
            regPhrase.setText("");
        } else {
            regListener.clear();
            regPhrase.setText("");
            regOut.setText("Please enter user details again");
        }// TODO add your handling code here:
    }//GEN-LAST:event_regButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        if (users.containsKey(logName.getText())) {
            int i = users.get(logName.getText());
            if(phrases.contains(logPhrase.getText())) {
                if(i == analyzer.analyze(logListener.getPressed(), logListener.getDifference(), storePress, storeDiff) - 1) {
                    logListener.clear();
                    
                    logOut.setText("User " + logName.getText() + " is authenticated");
                    logName.setText("");
                    logPhrase.setText("");
                } else {
                    logOut.setText("Try again");
                }
            } else {
                logListener.clear();
                logOut.setText("Enter phrase correctly");
            }
        } else {
            logOut.setText("Enter Name correctly");
        }
    }//GEN-LAST:event_logButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logButton;
    private javax.swing.JTextField logName;
    private javax.swing.JLabel logNameLabel;
    private javax.swing.JLabel logOut;
    private javax.swing.JTextField logPhrase;
    private javax.swing.JLabel logPhraseLabel;
    private javax.swing.JButton regButton;
    private javax.swing.JTextField regName;
    private javax.swing.JLabel regOut;
    private javax.swing.JTextField regPhrase;
    // End of variables declaration//GEN-END:variables
}
