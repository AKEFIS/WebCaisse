/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ConsommateurDAO;
import javax.swing.JOptionPane;
import model.Client;
import model.Consommateur;
import model.PointDeVente;

/**
 *
 * @author c.denys
 */
public class GestionConsommateurs extends javax.swing.JFrame {

    /**
     * Creates new form Statistiques
     */
    private final Client client;
    private final PointDeVente pointDeVente;

    public GestionConsommateurs(Client client, PointDeVente pointDeVente) {
        this.client = client;
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

        ajoutConsommateurButton = new javax.swing.JButton();
        liaisonConsommateurButton = new javax.swing.JButton();
        chercherIDLabel = new javax.swing.JLabel();
        adresseMailConsommateurTextField = new javax.swing.JTextField();
        chercherConsommaterButton = new javax.swing.JButton();
        voirMesConsommateursButton = new javax.swing.JButton();
        gestionPointsDeFideliteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 530));

        ajoutConsommateurButton.setText("Ajouter un consommateur");
        ajoutConsommateurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutConsommateurButtonActionPerformed(evt);
            }
        });

        liaisonConsommateurButton.setText("Lier un consommateur à mon point de vente");
        liaisonConsommateurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liaisonConsommateurButtonActionPerformed(evt);
            }
        });

        chercherIDLabel.setText("Chercher un consommateur  :");

        adresseMailConsommateurTextField.setText("Adresse mail du consommateur");

        chercherConsommaterButton.setText("Chercher");
        chercherConsommaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherConsommaterButtonActionPerformed(evt);
            }
        });

        voirMesConsommateursButton.setText("Voir mes consommateurs");
        voirMesConsommateursButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voirMesConsommateursButtonActionPerformed(evt);
            }
        });

        gestionPointsDeFideliteButton.setText("Gérer les points de fidélités");
        gestionPointsDeFideliteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionPointsDeFideliteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ajoutConsommateurButton)
                            .addComponent(chercherIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adresseMailConsommateurTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chercherConsommaterButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(liaisonConsommateurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(voirMesConsommateursButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gestionPointsDeFideliteButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chercherIDLabel)
                    .addComponent(adresseMailConsommateurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chercherConsommaterButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutConsommateurButton)
                    .addComponent(liaisonConsommateurButton)
                    .addComponent(voirMesConsommateursButton))
                .addGap(18, 18, 18)
                .addComponent(gestionPointsDeFideliteButton)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajoutConsommateurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutConsommateurButtonActionPerformed
        // Créer une instance de la fenêtre "AjoutConsommateur"
        AjoutConsommateur ajoutConsommateur = new AjoutConsommateur();

        // Afficher la nouvelle fenêtre
        ajoutConsommateur.setVisible(true);
    }//GEN-LAST:event_ajoutConsommateurButtonActionPerformed

    private void liaisonConsommateurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liaisonConsommateurButtonActionPerformed
        // Créer une instance de la fenêtre "LiaisonConsommateur"
        LiaisonConsommateur liaisonConsommateur = new LiaisonConsommateur(pointDeVente);

        // Afficher la nouvelle fenêtre
        liaisonConsommateur.setVisible(true);
    }//GEN-LAST:event_liaisonConsommateurButtonActionPerformed

    private void chercherConsommaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherConsommaterButtonActionPerformed
        ConsommateurDAO consommateurDAO = new ConsommateurDAO();
        Consommateur consommateur;
        
        consommateur = consommateurDAO.getConsommateurWithMail(adresseMailConsommateurTextField.getText());
        
        String finalString = String.format("ID : %d | Nom : %s | Prénom : %s | Adresse mail : %s | Adresse : %s | Code postal : %d | Ville : %s ", consommateur.getIdConsommateur(), consommateur.getNom(), consommateur.getPrenom(), consommateur.getAdresseMail(), consommateur.getAdresse(), consommateur.getCodePostal(), consommateur.getVille());
        
        JOptionPane.showMessageDialog(this, finalString, "Informations du consommateur", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_chercherConsommaterButtonActionPerformed

    private void voirMesConsommateursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voirMesConsommateursButtonActionPerformed
        // Créer une instance de la fenêtre "LiaisonConsommateur"
        MesConsommateurs mesConsommateurs = new MesConsommateurs(pointDeVente);

        // Afficher la nouvelle fenêtre
        mesConsommateurs.setVisible(true);
    }//GEN-LAST:event_voirMesConsommateursButtonActionPerformed

    private void gestionPointsDeFideliteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionPointsDeFideliteButtonActionPerformed
        // Créer une instance de la fenêtre "LiaisonConsommateur"
        GestionPointFidelite gestionPointFidelite = new GestionPointFidelite(pointDeVente);

        // Afficher la nouvelle fenêtre
        gestionPointFidelite.setVisible(true);
    }//GEN-LAST:event_gestionPointsDeFideliteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Client client, PointDeVente pointDeVente) {
                new ChangerFormule(client, pointDeVente).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresseMailConsommateurTextField;
    private javax.swing.JButton ajoutConsommateurButton;
    private javax.swing.JButton chercherConsommaterButton;
    private javax.swing.JLabel chercherIDLabel;
    private javax.swing.JButton gestionPointsDeFideliteButton;
    private javax.swing.JButton liaisonConsommateurButton;
    private javax.swing.JButton voirMesConsommateursButton;
    // End of variables declaration//GEN-END:variables
}
