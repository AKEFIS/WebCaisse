/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.PointDeVente;
import DAO.EstClientDeDAO;
import DAO.ConsommateurDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Consommateur;
import model.EstClientDe;

/**
 *
 * @author c.denys
 */
public class MesConsommateurs extends javax.swing.JFrame {

    /**
     * Creates new form Statistiques
     */
    private final PointDeVente pointDeVente;

    public MesConsommateurs(PointDeVente pointDeVente) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ConsommateursTable = new javax.swing.JTable();
        TitreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ConsommateursTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prénom", "Adresse Mail", "Adresse", "Code postal", "Ville", "Points de fidélité"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ConsommateursTable);

        TitreLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitreLabel.setText("Mes consommateurs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(TitreLabel)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TitreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        EstClientDeDAO estClientDeDAO = new EstClientDeDAO();
        EstClientDe estClientDe;
        ConsommateurDAO consommateurDAO = new ConsommateurDAO();
        Consommateur consommateur;

        List<EstClientDe> LesEstClientDe = estClientDeDAO.getAllEstClientDeFromPointDeVente(pointDeVente);
        int nbConsommateurs = LesEstClientDe.size();
        if (nbConsommateurs != 0) {
            for (int i = 0; i < nbConsommateurs; i++) {
                estClientDe = LesEstClientDe.get(i);
                consommateur = consommateurDAO.read(estClientDe.getIDConsommateur());

                // Obtenez le modèle de tableau par défaut
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ConsommateursTable.getModel();

                // Ajoutez une nouvelle ligne avec les valeurs spécifiées
                model.addRow(new Object[]{consommateur.getIdConsommateur(), consommateur.getNom(), consommateur.getPrenom(), consommateur.getAdresseMail(), consommateur.getAdresse(), consommateur.getCodePostal(), consommateur.getVille(), estClientDe.getNbPointsDeFidelite()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Aucun consommateur pour le point de vente", "Erreur", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MesConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesConsommateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(PointDeVente pointDeVente) {
                new MesConsommateurs(pointDeVente).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ConsommateursTable;
    private javax.swing.JLabel TitreLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
