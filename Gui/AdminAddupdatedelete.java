package Gui;

import company.customer;

public class AdminAddupdatedelete extends javax.swing.JFrame {

    /**
     * Creates new form AdminAddupdatedelete
     */
    public AdminAddupdatedelete() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonsearch = new javax.swing.JButton();
        jTextFieldsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldnationalid = new javax.swing.JTextField();
        jTextFieldrejion = new javax.swing.JTextField();
        jTextFieldcopy = new javax.swing.JTextField();
        jTextFieldphone = new javax.swing.JTextField();
        jTextFieldAdress = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelresult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonsearch.setText("Search");
        jButtonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 73, -1));
        getContentPane().add(jTextFieldsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, -1));

        jLabel1.setText("Name: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 67, -1, -1));

        jLabel2.setText("National  ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 98, -1, -1));

        jLabel3.setText("Rejion: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 139, -1, -1));

        jLabel4.setText("Copy:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 177, -1, -1));

        jLabel5.setText("phone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 215, -1, -1));

        jLabel6.setText("Adress:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 253, -1, -1));

        jLabel7.setText("Email:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 293, -1, -1));
        getContentPane().add(jTextFieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 64, 260, -1));
        getContentPane().add(jTextFieldnationalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 95, 260, -1));
        getContentPane().add(jTextFieldrejion, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 136, 260, -1));
        getContentPane().add(jTextFieldcopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 260, -1));
        getContentPane().add(jTextFieldphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 212, 260, -1));
        getContentPane().add(jTextFieldAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 260, -1));
        getContentPane().add(jTextFieldemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 290, 260, -1));

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 70, -1));
        getContentPane().add(jLabelresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        if (!jTextFieldname.getText().equals("") && !jTextFieldnationalid.getText().equals("")
                && !jTextFieldrejion.getText().equals("") && !jTextFieldcopy.getText().equals("")
                && !jTextFieldphone.getText().equals("") && !jTextFieldAdress.getText().equals("")
                && !jTextFieldemail.getText().equals("")) {

            customer x = new customer();
            x.setFName(jTextFieldname.getText());
            x.setRegion(jTextFieldrejion.getText());
            x.setAddress(jTextFieldAdress.getText());
            x.setEmail(jTextFieldemail.getText());
            x.setPhone(jTextFieldphone.getText());
            x.setNationalID(jTextFieldnationalid.getText());
            x.setmetercode(Integer.parseInt(jTextFieldsearch.getText()));

            if (x.updateCustomer()) {
                jLabelresult.setText("Updated Successfully ... !");
                resetPanelData();
            } else {
                jLabelresult.setText("Failed to Update ... !");
            }
        } else {
            jLabelresult.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }

    }// GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonsearchActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldsearch.getText().equals("")) {
            customer x = new customer();
            x = x.searchBymetercode(Integer.parseInt(jTextFieldsearch.getText()));
            if (x.getmetercode() > 0) {
                setPanelData(x);
                jLabelresult.setText("Found ...!");
            } else {
                jLabelresult.setText("Not Found ...!");
            }
        } else {
            jLabelresult.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }

    }// GEN-LAST:event_jButtonsearchActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldsearch.getText().equals("")) {
            customer x = new customer();
            setPanelData(x);
            x.deleteCustomer(Integer.parseInt(jTextFieldsearch.getText()));
            // بيمسح بالترتيب
            resetPanelData();
        }

    }// GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        if (!(jTextFieldname.getText().equals("")) && !(jTextFieldrejion.getText().equals(""))
                && !(jTextFieldAdress.getText().equals("")) && !(jTextFieldemail.getText().equals(""))
                && !(jTextFieldphone.getText().equals("")) && !(jTextFieldAdress.getText().equals(""))
                && !(jTextFieldcopy.getText().equals(""))) {
            customer x = new customer();
            x.setFName(jTextFieldname.getText());
            x.setRegion(jTextFieldrejion.getText());
            x.setAddress(jTextFieldAdress.getText());
            x.setEmail(jTextFieldemail.getText());
            x.setPhone(jTextFieldphone.getText());
            x.setNationalID(jTextFieldAdress.getText());
            x.setmetercode((Integer.parseInt(jTextFieldnationalid.getText())) - 1);

            if (x.addCustomer()) {
                jTextFieldname.setText("");
                jTextFieldnationalid.setText("");
                jTextFieldrejion.setText("");
                jTextFieldcopy.setText("");
                jTextFieldphone.setText("");
                jTextFieldAdress.setText("");
                jTextFieldemail.setText("");

            } else {
                jLabelresult.setText("There is somthing wrong...!");
            }
        } else
            jLabelresult.setText("Misseing data...!");
    }// GEN-LAST:event_jButtonAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminAddupdatedelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddupdatedelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddupdatedelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddupdatedelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddupdatedelete().setVisible(true);
            }
        });
    }

    protected void setPanelData(customer x) {
        jTextFieldname.setText("" + x.getFName());
        jTextFieldnationalid.setText("" + x.getNationalID());
        jTextFieldrejion.setText("" + x.getLName());
        jTextFieldcopy.setText("protected");
        jTextFieldphone.setText("" + x.getPhone());
        jTextFieldAdress.setText("" + x.getAddress());
        jTextFieldemail.setText("" + x.getEmail());

    }

    protected void resetPanelData() {
        jTextFieldname.setText("");
        jTextFieldnationalid.setText("");
        jTextFieldrejion.setText("");
        jTextFieldcopy.setText("");
        jTextFieldphone.setText("");
        jTextFieldAdress.setText("");
        jTextFieldemail.setText("");
        jTextFieldsearch.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelresult;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldcopy;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldnationalid;
    private javax.swing.JTextField jTextFieldphone;
    private javax.swing.JTextField jTextFieldrejion;
    private javax.swing.JTextField jTextFieldsearch;
    // End of variables declaration//GEN-END:variables
}