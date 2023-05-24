/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Client;
import model.PointDeVente;
import DAO.PointDeVenteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author c.denys
 */
public class GestionPointsDeVente extends javax.swing.JFrame {

    /**
     * Creates new form accueil
     */
    private final Client client;

    public GestionPointsDeVente(Client client) {
        this.client = client;
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

        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 530));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestions des points de vente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 40, 330, 28);

        UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserName.setText(client.getNom() + " " + client.getPrenom());
        getContentPane().add(UserName);
        UserName.setBounds(30, 20, 110, 16);

        Logout.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Logout.setText("Se déconnecter");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(30, 40, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PointDeVenteDAO pointDeVenteDAO = new PointDeVenteDAO();
        List<PointDeVente> pointsDeVente = pointDeVenteDAO.getAllPointDeVenteByIDClient(client.getIdClient());
        int nbPointsDeVente = pointsDeVente.size();
        for (int i = 0; i < nbPointsDeVente; i++) {
            int index = i;
            JPanel panel = new JPanel();
            int IDPointDeVente = pointsDeVente.get(i).getIdPointDeVente();
            int IDFormuleFidelisation = pointsDeVente.get(i).getIdFormuleFidelisation();
            int IDClient = pointsDeVente.get(i).getIdClient();

            panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            panel.setLayout(null);

            JLabel adresseLabel = new JLabel("Adresse : ");
            JLabel codePostalLabel = new JLabel("Code postal :");
            JLabel villeLabel = new JLabel("Ville : ");
            JLabel nomLabel = new JLabel("Nom : ");
            JLabel formuleLabel = new JLabel("Formule : ");

            JTextField adresseTextField = new JTextField(pointsDeVente.get(i).getAdresse());
            JTextField codePostalTextField = new JTextField(String.valueOf(pointsDeVente.get(i).getCodePostal()));
            JTextField villeTextField = new JTextField(pointsDeVente.get(i).getVille());
            JTextField nomTextField = new JTextField(pointsDeVente.get(i).getNomPointDeVente());
            JTextField formuleTextField = new JTextField(String.valueOf(pointsDeVente.get(i).getIdFormuleFidelisation()));

            JButton changerFormuleButton = new JButton("Changer la formule de fidélisation");
            panel.add(changerFormuleButton);
            changerFormuleButton.setBounds(290, 90, 220, 27);

            //Gestion clients
            JButton gestionClientsButton = new JButton(new javax.swing.ImageIcon(getClass().getResource("/ressources/user-img_20.png")));
            gestionClientsButton.setToolTipText("Gestion des clients");
            panel.add(gestionClientsButton);
            gestionClientsButton.setBounds(520, 90, 30, 27);

            JButton editButton = new JButton(new javax.swing.ImageIcon(getClass().getResource("/ressources/pencil_20.png")));
            editButton.setToolTipText("Modifier");
            panel.add(editButton);
            editButton.setBounds(560, 90, 30, 27);

            JButton saveButton = new JButton(new javax.swing.ImageIcon(getClass().getResource("/ressources/valid_20.png")));
            saveButton.setToolTipText("Sauvegarder");
            saveButton.setEnabled(false);
            panel.add(saveButton);
            saveButton.setBounds(600, 90, 30, 27);

            JButton deleteButton = new JButton(new javax.swing.ImageIcon(getClass().getResource("/ressources/minus_20.png")));
            deleteButton.setToolTipText("Supprimer");
            panel.add(deleteButton);
            deleteButton.setBounds(640, 90, 30, 27);

            panel.add(adresseLabel);
            adresseLabel.setBounds(10, 10, 70, 30);

            panel.add(codePostalLabel);
            codePostalLabel.setBounds(10, 50, 90, 30);

            panel.add(villeLabel);
            villeLabel.setBounds(360, 10, 37, 30);

            panel.add(nomLabel);
            nomLabel.setBounds(360, 50, 60, 30);

            panel.add(formuleLabel);
            formuleLabel.setBounds(10, 90, 70, 30);

            panel.add(adresseTextField);
            adresseTextField.setBounds(90, 10, 240, 30);
            adresseTextField.setEditable(false);

            panel.add(codePostalTextField);
            codePostalTextField.setBounds(90, 50, 240, 30);
            codePostalTextField.setEditable(false);

            panel.add(villeTextField);
            villeTextField.setBounds(400, 10, 270, 30);
            villeTextField.setEditable(false);

            panel.add(nomTextField);
            nomTextField.setBounds(400, 50, 270, 30);
            nomTextField.setEditable(false);

            panel.add(formuleTextField);
            formuleTextField.setBounds(90, 90, 180, 30);
            formuleTextField.setEditable(false);

            getContentPane().add(panel);
            panel.setBounds(10, i * 120 + 90, 690, 120);

            deleteButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Supression du pdv ID : " + IDPointDeVente);
                }
            });

            editButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Code pour l'édition
                    saveButton.setEnabled(true);
                    adresseTextField.setEditable(true);
                    codePostalTextField.setEditable(true);
                    villeTextField.setEditable(true);
                    nomTextField.setEditable(true);
                }
            });

            saveButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Code pour la sauvegarde
                    saveButton.setEnabled(false);
                    adresseTextField.setEditable(false);
                    codePostalTextField.setEditable(false);
                    villeTextField.setEditable(false);
                    nomTextField.setEditable(false);

                    PointDeVente updatePointDeVente = new PointDeVente();
                    updatePointDeVente.setIdPointDeVente(IDPointDeVente);
                    updatePointDeVente.setIdFormuleFidelisation(IDFormuleFidelisation);
                    updatePointDeVente.setIdClient(IDClient);
                    updatePointDeVente.setAdresse(adresseTextField.getText());
                    updatePointDeVente.setCodePostal(Integer.parseInt(codePostalTextField.getText()));
                    updatePointDeVente.setVille(villeTextField.getText());
                    updatePointDeVente.setNomPointDeVente(nomTextField.getText());

                    pointDeVenteDAO.update(updatePointDeVente);
                }
            });

            changerFormuleButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Créer une instance de la fenêtre "ChangerFormule"
                    ChangerFormule changerFormule = new ChangerFormule(client, pointsDeVente.get(index));

                    // Afficher la nouvelle fenêtre
                    changerFormule.setVisible(true);
                }
            });

            gestionClientsButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Créer une instance de la fenêtre "GestionConsommateurs"
                    GestionConsommateurs gestionConsommateurs = new GestionConsommateurs(client, pointsDeVente.get(index));

                    // Afficher la nouvelle fenêtre
                    gestionConsommateurs.setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_formWindowOpened

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(GestionPointsDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPointsDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPointsDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPointsDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            public void run(Client client) {
                new GestionPointsDeVente(client).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
