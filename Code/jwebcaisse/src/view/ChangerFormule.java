/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.PointDeVenteDAO;
import model.Client;
import model.PointDeVente;

/**
 *
 * @author c.denys
 */
public class ChangerFormule extends javax.swing.JFrame {

    /**
     * Creates new form changerformule
     */
    
    private final Client client;
    private final PointDeVente pointDeVente;
    
    public ChangerFormule(Client client, PointDeVente pointDeVente) {
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

        Formule1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SelectionF1 = new javax.swing.JToggleButton();
        F1 = new javax.swing.JLabel();
        Fonctionnalité1F1 = new javax.swing.JLabel();
        Fonctionnalité3F1 = new javax.swing.JLabel();
        Fonctionnalité2F1 = new javax.swing.JLabel();
        Formule3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        SelectionF3 = new javax.swing.JToggleButton();
        F3 = new javax.swing.JLabel();
        Fonctionnalité1F3 = new javax.swing.JLabel();
        Fonctionnalité3F3 = new javax.swing.JLabel();
        Fonctionnalité2F3 = new javax.swing.JLabel();
        Formule2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        SelectionF2 = new javax.swing.JToggleButton();
        F2 = new javax.swing.JLabel();
        Fonctionnalité1F2 = new javax.swing.JLabel();
        Fonctionnalité3F2 = new javax.swing.JLabel();
        Fonctionnalité2F2 = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        LabelRetour = new javax.swing.JLabel();
        LogoRetour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 530));
        setResizable(false);

        jTextArea1.setColumns(10);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean justo ligula,\n vestibulum a pulvinar sed, vehicula sodales massa. Nunc ac ante a tellus porta fringilla. \nPhasellus molestie, arcu vitae consequat pretium, lacus nisl posuere velit,\n vel molestie nulla magna ut nisl. Fusce malesuada libero vel orci facilisis faucibus.\n Curabitur id felis id nibh varius vestibulum. Sed sodales, enim ac tincidunt consectetur, \nmauris ipsum gravida justo, in consequat tortor ligula quis urna. Maecenas ornare scelerisque convallis. \nAenean nunc lorem, consectetur ac arcu vitae, cursus molestie dolor.\n Pellentesque at metus vel ligula venenatis accumsan.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(jTextArea1);

        SelectionF1.setText("Selectionner");
        SelectionF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionF1ActionPerformed(evt);
            }
        });

        F1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        F1.setText("Formule 1");

        Fonctionnalité1F1.setText("Fonctionnalité 1");
        Fonctionnalité1F1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Fonctionnalité3F1.setText("Fonctionnalité 3");
        Fonctionnalité3F1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Fonctionnalité2F1.setText("Fonctionnalité 2");
        Fonctionnalité2F1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout Formule1Layout = new javax.swing.GroupLayout(Formule1);
        Formule1.setLayout(Formule1Layout);
        Formule1Layout.setHorizontalGroup(
            Formule1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Formule1Layout.createSequentialGroup()
                .addGroup(Formule1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Formule1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(Formule1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Formule1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fonctionnalité3F1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fonctionnalité2F1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fonctionnalité1F1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Formule1Layout.createSequentialGroup()
                        .addGroup(Formule1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Formule1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(F1))
                            .addGroup(Formule1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(SelectionF1)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Formule1Layout.setVerticalGroup(
            Formule1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Formule1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(F1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fonctionnalité1F1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fonctionnalité2F1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fonctionnalité3F1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelectionF1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTextArea5.setColumns(10);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean justo ligula,\n vestibulum a pulvinar sed, vehicula sodales massa. Nunc ac ante a tellus porta fringilla. \nPhasellus molestie, arcu vitae consequat pretium, lacus nisl posuere velit,\n vel molestie nulla magna ut nisl. Fusce malesuada libero vel orci facilisis faucibus.\n Curabitur id felis id nibh varius vestibulum. Sed sodales, enim ac tincidunt consectetur, \nmauris ipsum gravida justo, in consequat tortor ligula quis urna. Maecenas ornare scelerisque convallis. \nAenean nunc lorem, consectetur ac arcu vitae, cursus molestie dolor.\n Pellentesque at metus vel ligula venenatis accumsan.");
        jTextArea5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane5.setViewportView(jTextArea5);

        SelectionF3.setText("Selectionner");
        SelectionF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionF3ActionPerformed(evt);
            }
        });

        F3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        F3.setText("Formule 3");

        Fonctionnalité1F3.setText("Fonctionnalité 1");
        Fonctionnalité1F3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Fonctionnalité3F3.setText("Fonctionnalité 3");
        Fonctionnalité3F3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Fonctionnalité2F3.setText("Fonctionnalité 2");
        Fonctionnalité2F3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout Formule3Layout = new javax.swing.GroupLayout(Formule3);
        Formule3.setLayout(Formule3Layout);
        Formule3Layout.setHorizontalGroup(
            Formule3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Formule3Layout.createSequentialGroup()
                .addGroup(Formule3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Formule3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(Formule3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Formule3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fonctionnalité3F3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fonctionnalité2F3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fonctionnalité1F3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Formule3Layout.createSequentialGroup()
                        .addGroup(Formule3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Formule3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(F3))
                            .addGroup(Formule3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(SelectionF3)))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Formule3Layout.setVerticalGroup(
            Formule3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Formule3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(F3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fonctionnalité1F3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fonctionnalité2F3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fonctionnalité3F3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelectionF3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTextArea4.setColumns(10);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean justo ligula,\n vestibulum a pulvinar sed, vehicula sodales massa. Nunc ac ante a tellus porta fringilla. \nPhasellus molestie, arcu vitae consequat pretium, lacus nisl posuere velit,\n vel molestie nulla magna ut nisl. Fusce malesuada libero vel orci facilisis faucibus.\n Curabitur id felis id nibh varius vestibulum. Sed sodales, enim ac tincidunt consectetur, \nmauris ipsum gravida justo, in consequat tortor ligula quis urna. Maecenas ornare scelerisque convallis. \nAenean nunc lorem, consectetur ac arcu vitae, cursus molestie dolor.\n Pellentesque at metus vel ligula venenatis accumsan.");
        jTextArea4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane4.setViewportView(jTextArea4);

        SelectionF2.setText("Selectionner");
        SelectionF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionF2ActionPerformed(evt);
            }
        });

        F2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        F2.setText("Formule 2");

        Fonctionnalité1F2.setText("Fonctionnalité 1");
        Fonctionnalité1F2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Fonctionnalité3F2.setText("Fonctionnalité 3");
        Fonctionnalité3F2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Fonctionnalité2F2.setText("Fonctionnalité 2");
        Fonctionnalité2F2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout Formule2Layout = new javax.swing.GroupLayout(Formule2);
        Formule2.setLayout(Formule2Layout);
        Formule2Layout.setHorizontalGroup(
            Formule2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Formule2Layout.createSequentialGroup()
                .addGroup(Formule2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Formule2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(Formule2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Formule2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fonctionnalité3F2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fonctionnalité2F2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fonctionnalité1F2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Formule2Layout.createSequentialGroup()
                        .addGroup(Formule2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Formule2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(F2))
                            .addGroup(Formule2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(SelectionF2)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Formule2Layout.setVerticalGroup(
            Formule2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Formule2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(F2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fonctionnalité1F2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fonctionnalité2F2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fonctionnalité3F2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelectionF2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserName.setText(client.getNom() + " " + client.getPrenom());

        Logout.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Logout.setText("Se déconnecter");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        LabelRetour.setText("Retour");

        LogoRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        LogoRetour.setMaximumSize(new java.awt.Dimension(20, 22));
        LogoRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoRetourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Formule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(Formule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(LabelRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Formule3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserName)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRetour))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Formule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Formule3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Formule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectionF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionF1ActionPerformed
        PointDeVenteDAO pointDeVenteDAO = new PointDeVenteDAO();
        pointDeVente.setIdFormuleFidelisation(1);
        pointDeVenteDAO.update(pointDeVente);
        this.dispose();
    }//GEN-LAST:event_SelectionF1ActionPerformed

    private void SelectionF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionF2ActionPerformed
        PointDeVenteDAO pointDeVenteDAO = new PointDeVenteDAO();
        pointDeVente.setIdFormuleFidelisation(2);
        pointDeVenteDAO.update(pointDeVente);
        this.dispose();
    }//GEN-LAST:event_SelectionF2ActionPerformed

    private void SelectionF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionF3ActionPerformed
        PointDeVenteDAO pointDeVenteDAO = new PointDeVenteDAO();
        pointDeVente.setIdFormuleFidelisation(3);
        pointDeVenteDAO.update(pointDeVente);
        this.dispose();
    }//GEN-LAST:event_SelectionF3ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void LogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoRetourMouseClicked
        this.dispose();
    }//GEN-LAST:event_LogoRetourMouseClicked

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
            java.util.logging.Logger.getLogger(ChangerFormule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangerFormule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangerFormule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangerFormule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel Fonctionnalité1F1;
    private javax.swing.JLabel Fonctionnalité1F2;
    private javax.swing.JLabel Fonctionnalité1F3;
    private javax.swing.JLabel Fonctionnalité2F1;
    private javax.swing.JLabel Fonctionnalité2F2;
    private javax.swing.JLabel Fonctionnalité2F3;
    private javax.swing.JLabel Fonctionnalité3F1;
    private javax.swing.JLabel Fonctionnalité3F2;
    private javax.swing.JLabel Fonctionnalité3F3;
    private javax.swing.JPanel Formule1;
    private javax.swing.JPanel Formule2;
    private javax.swing.JPanel Formule3;
    private javax.swing.JLabel LabelRetour;
    private javax.swing.JLabel LogoRetour;
    private javax.swing.JButton Logout;
    private javax.swing.JToggleButton SelectionF1;
    private javax.swing.JToggleButton SelectionF2;
    private javax.swing.JToggleButton SelectionF3;
    private javax.swing.JLabel UserName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
