/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author franc
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
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

        botonPacientes = new javax.swing.JButton();
        botonDoctores = new javax.swing.JButton();
        botonHospitales = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/patient-64.png"))); // NOI18N
        botonPacientes.setText("Pacientes");
        botonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(botonPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 67, 171, -1));

        botonDoctores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDoctores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/doctor-64.png"))); // NOI18N
        botonDoctores.setText("Doctores");
        botonDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDoctoresActionPerformed(evt);
            }
        });
        getContentPane().add(botonDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 171, -1));

        botonHospitales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonHospitales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hospital-64.png"))); // NOI18N
        botonHospitales.setText("Hospitales");
        botonHospitales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHospitalesActionPerformed(evt);
            }
        });
        getContentPane().add(botonHospitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        botonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salir.gif"))); // NOI18N
        botonCerrarSesion.setText("Cerrar Sesión ");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Fondo/fondo inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientesActionPerformed
        // Se crea la logica parair a la pantalla de pacientes:
        
            setVisible(false);
            new pacientes().setVisible(true); 
    
    }//GEN-LAST:event_botonPacientesActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        // Boton para cerrar sesion
        // boton para ir a la pantalla de hospitales:
         setVisible(false);
         new login().setVisible(true); 
        
        
        
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDoctoresActionPerformed
        // Boton para ir a la pantalla de doctores
            setVisible(false);
            new doctores().setVisible(true); 
    }//GEN-LAST:event_botonDoctoresActionPerformed

    private void botonHospitalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHospitalesActionPerformed
        // boton para ir a la pantalla de hospitales:
            setVisible(false);
            new hospitales().setVisible(true); 
    }//GEN-LAST:event_botonHospitalesActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonDoctores;
    private javax.swing.JButton botonHospitales;
    private javax.swing.JButton botonPacientes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
