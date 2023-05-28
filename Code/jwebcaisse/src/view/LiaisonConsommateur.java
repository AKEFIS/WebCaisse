/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.EstClientDeDAO;
import javax.swing.JOptionPane;
import java.sql.*;
import model.PointDeVente;
import model.EstClientDe;
import java.util.*;
import technic.ConnectDB;

/**
 *
 * @author c.denys
 */
public class LiaisonConsommateur extends javax.swing.JFrame {
    
    private final PointDeVente pointDeVente;

    /**
     * Creates new form connection
     */
    public LiaisonConsommateur(PointDeVente pointDeVente) {
        this.pointDeVente = pointDeVente;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoRetour = new javax.swing.JLabel();
        LabelRetour = new javax.swing.JLabel();
        IDConsommateurLabel = new javax.swing.JLabel();
        PointsDeFideliteLabel = new javax.swing.JLabel();
        PointsDeFideliteTextField = new javax.swing.JTextField();
        IDConsommateurTextField = new javax.swing.JTextField();
        LiaisonConsommateurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        LogoRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        LogoRetour.setMaximumSize(new java.awt.Dimension(20, 22));
        LogoRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoRetourMouseClicked(evt);
            }
        });
        getContentPane().add(LogoRetour);
        LogoRetour.setBounds(10, 10, 20, 20);

        LabelRetour.setText("Retour");
        getContentPane().add(LabelRetour);
        LabelRetour.setBounds(40, 10, 37, 16);

        IDConsommateurLabel.setText("ID du consommateur : ");
        getContentPane().add(IDConsommateurLabel);
        IDConsommateurLabel.setBounds(20, 60, 130, 16);

        PointsDeFideliteLabel.setText("Points de fidélités : ");
        getContentPane().add(PointsDeFideliteLabel);
        PointsDeFideliteLabel.setBounds(20, 100, 110, 16);

        PointsDeFideliteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsDeFideliteTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PointsDeFideliteTextField);
        PointsDeFideliteTextField.setBounds(160, 100, 64, 22);
        getContentPane().add(IDConsommateurTextField);
        IDConsommateurTextField.setBounds(160, 60, 64, 22);

        LiaisonConsommateurButton.setText("Lier le consommateur");
        LiaisonConsommateurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiaisonConsommateurButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LiaisonConsommateurButton);
        LiaisonConsommateurButton.setBounds(20, 150, 200, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoRetourMouseClicked
        this.dispose();
    }//GEN-LAST:event_LogoRetourMouseClicked

    private void PointsDeFideliteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsDeFideliteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PointsDeFideliteTextFieldActionPerformed

    private void LiaisonConsommateurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiaisonConsommateurButtonActionPerformed
        EstClientDeDAO estClientDeDAO = new EstClientDeDAO();
        
        EstClientDe estClientDe = new EstClientDe();
        estClientDe.setIDConsommateur(Integer.parseInt(IDConsommateurTextField.getText()));
        estClientDe.setIDPointDeVente(pointDeVente.getIdPointDeVente());
        estClientDe.setNbPointsDeFidelite(Integer.parseInt(PointsDeFideliteTextField.getText()));
        
        estClientDeDAO.create(estClientDe);
        
        JOptionPane.showMessageDialog(this, "Consommateur lié", "Succès", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_LiaisonConsommateurButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LiaisonConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiaisonConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiaisonConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiaisonConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(PointDeVente pointDeVente) {
                new LiaisonConsommateur(pointDeVente).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDConsommateurLabel;
    private javax.swing.JTextField IDConsommateurTextField;
    private javax.swing.JLabel LabelRetour;
    private javax.swing.JButton LiaisonConsommateurButton;
    private javax.swing.JLabel LogoRetour;
    private javax.swing.JLabel PointsDeFideliteLabel;
    private javax.swing.JTextField PointsDeFideliteTextField;
    // End of variables declaration//GEN-END:variables
}
