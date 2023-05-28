/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import technic.ConnectDB;
import java.sql.*;
import javax.swing.JOptionPane;
import DAO.ClientDAO;
import model.Client;

/**
 *
 * @author c.denys
 */
public class Connection extends javax.swing.JFrame {

    /**
     * Creates new form connection
     */
    public Connection() {
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
        AdresseMail = new javax.swing.JTextField();
        MotDePasse = new javax.swing.JTextField();
        Connection = new javax.swing.JButton();
        LogoUser = new javax.swing.JLabel();
        LogoRetour = new javax.swing.JLabel();
        LabelRetour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        AdresseMail.setText("maxime@gmail.com");
        AdresseMail.setToolTipText("");
        AdresseMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdresseMailActionPerformed(evt);
            }
        });

        MotDePasse.setText("root");

        Connection.setText("Connection");
        Connection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectionActionPerformed(evt);
            }
        });

        LogoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/user-img_20.png"))); // NOI18N
        LogoUser.setMaximumSize(new java.awt.Dimension(20, 22));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(Connection)
                        .addComponent(AdresseMail)
                        .addComponent(MotDePasse)
                        .addComponent(LogoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LogoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(AdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Connection)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 140, 182, 190);

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

    private void AdresseMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdresseMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdresseMailActionPerformed

    private void LogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoRetourMouseClicked
        this.dispose();
    }//GEN-LAST:event_LogoRetourMouseClicked

    private void ConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectionActionPerformed
        // Récupération des identifiants
        String email = AdresseMail.getText();
        String password = MotDePasse.getText();
        ClientDAO clientDAO = new ClientDAO();
        Client client = new Client();

        // Connexion à la base de données
        try {
            ConnectDB db = new ConnectDB();
            java.sql.Connection con = db.getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Client WHERE AdresseMail = ? AND MotDePasse = ?");
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            // Vérification des identifiants
            if (rs.next()) {
                // Identifiants corrects : ouverture de la fenêtre AccueilPostLogin
                client = clientDAO.read(rs.getInt("IDClient"));
                AccueilPostLogin accueilPostLogin = new AccueilPostLogin(client);
                accueilPostLogin.setVisible(true);
                this.dispose();
            } else {
                // Identifiants incorrects : ouverture d'un popup
                JOptionPane.showMessageDialog(this, "Identifiants incorrects", "Erreur", JOptionPane.ERROR_MESSAGE);
            }

            // Fermeture de la connexion
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur de connexion à la base de données : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConnectionActionPerformed

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
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdresseMail;
    private javax.swing.JButton Connection;
    private javax.swing.JLabel LabelRetour;
    private javax.swing.JLabel LogoRetour;
    private javax.swing.JLabel LogoUser;
    private javax.swing.JTextField MotDePasse;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
