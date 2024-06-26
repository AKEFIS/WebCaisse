/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ConsommateurDAO;
import javax.swing.JOptionPane;
import java.sql.*;
import model.Consommateur;

/**
 *
 * @author c.denys
 */
public class AjoutConsommateur extends javax.swing.JFrame {

    /**
     * Creates new form connection
     */
    public AjoutConsommateur() {
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

        jPanel2 = new javax.swing.JPanel();
        Nom = new javax.swing.JTextField();
        Prenom = new javax.swing.JTextField();
        AjoutConsommateur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AdresseMail = new javax.swing.JTextField();
        CodePostal = new javax.swing.JTextField();
        Ville = new javax.swing.JTextField();
        Adresse = new javax.swing.JTextField();
        LogoRetour = new javax.swing.JLabel();
        LabelRetour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Nom.setText("Nom");
        Nom.setToolTipText("");
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        Prenom.setText("Prénom");

        AjoutConsommateur.setText("Ajouter le consommateur");
        AjoutConsommateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutConsommateurActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/user-img_20.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(20, 22));

        AdresseMail.setText("Adresse mail");
        AdresseMail.setToolTipText("");
        AdresseMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdresseMailActionPerformed(evt);
            }
        });

        CodePostal.setText("Code postal");
        CodePostal.setToolTipText("");
        CodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodePostalActionPerformed(evt);
            }
        });

        Ville.setText("Ville");

        Adresse.setText("Adresse");
        Adresse.setToolTipText("");
        Adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdresseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdresseMail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Prenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addComponent(Adresse)
                    .addComponent(CodePostal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ville, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AjoutConsommateur)
                .addGap(250, 250, 250))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(Nom)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AjoutConsommateur)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(411, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 40, 670, 480);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void AdresseMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdresseMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdresseMailActionPerformed

    private void CodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodePostalActionPerformed

    private void AdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdresseActionPerformed

    private void LogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoRetourMouseClicked
        this.dispose();
    }//GEN-LAST:event_LogoRetourMouseClicked

    private void AjoutConsommateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutConsommateurActionPerformed
        // Récupération des données du formulaire
        String nom = Nom.getText();
        String prenom = Prenom.getText();
        String adresseMail = AdresseMail.getText();
        String adresse = Adresse.getText();
        int codePostal = Integer.parseInt(CodePostal.getText());
        String ville = Ville.getText();

        // Création d'un objet Consommateur
        Consommateur consommateur = new Consommateur(0, nom, prenom, adresseMail, adresse, codePostal, ville);

        // Insertion du consommateur dans la base de données
        try {
            ConsommateurDAO consommateurDAO = new ConsommateurDAO();
            consommateurDAO.create(consommateur);
        } catch (Exception e) {
            // Affichage d'une popup en cas d'erreur d'inscription
            JOptionPane.showMessageDialog(this, "Erreur lors de l'inscription : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        // Fermeture de la fenêtre
        JOptionPane.showMessageDialog(this, "Consommateur ajouté", "Succès", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_AjoutConsommateurActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutConsommateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutConsommateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adresse;
    private javax.swing.JTextField AdresseMail;
    private javax.swing.JButton AjoutConsommateur;
    private javax.swing.JTextField CodePostal;
    private javax.swing.JLabel LabelRetour;
    private javax.swing.JLabel LogoRetour;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Prenom;
    private javax.swing.JTextField Ville;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
