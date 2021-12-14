
package Interfaces;

import javax.swing.JOptionPane;

public class formularioAgregarPaciente extends javax.swing.JFrame {


    public formularioAgregarPaciente() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etiquetaCedulaID = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaCorreoElectronico = new javax.swing.JLabel();
        etiquetaEstadoCivil = new javax.swing.JLabel();
        internado = new javax.swing.JCheckBox();
        etiquetaIDHospital = new javax.swing.JLabel();
        textoEstadoCivil = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JTextField();
        textoCedula = new javax.swing.JTextField();
        textoCorreoElectronico = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoIDHospital = new javax.swing.JTextField();
        botonDeRegreso = new javax.swing.JButton();
        botonDeGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trabajadores.png"))); // NOI18N
        jLabel1.setText("Ingreso de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 13, 417, 80));

        etiquetaCedulaID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCedulaID.setText("Cedula(ID)");
        getContentPane().add(etiquetaCedulaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 106, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre");
        getContentPane().add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 106, -1, -1));

        etiquetaApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaApellidos.setText("Apellidos");
        getContentPane().add(etiquetaApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 106, -1, -1));

        etiquetaCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCorreoElectronico.setText("Correo Electronico");
        getContentPane().add(etiquetaCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 106, -1, -1));

        etiquetaEstadoCivil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaEstadoCivil.setText("Estado Civil");
        getContentPane().add(etiquetaEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 246, -1, -1));

        internado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        internado.setText("Internado");
        getContentPane().add(internado, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 284, -1, -1));

        etiquetaIDHospital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaIDHospital.setText("ID Hospital");
        getContentPane().add(etiquetaIDHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 246, -1, -1));
        getContentPane().add(textoEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 288, 150, -1));
        getContentPane().add(textoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 159, 150, -1));
        getContentPane().add(textoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 159, 150, -1));
        getContentPane().add(textoCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 159, 150, -1));
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 159, 150, -1));
        getContentPane().add(textoIDHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 288, 150, -1));

        botonDeRegreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salir.gif"))); // NOI18N
        botonDeRegreso.setText("Regresar");
        botonDeRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeRegresoActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        botonDeGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        botonDeGuardar.setText("Guardar");
        botonDeGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 284, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Fondo/fondo inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDeGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeGuardarActionPerformed
        // Boton para guardar los datos ingresados:
        
        JOptionPane.showMessageDialog(null, "Usuario se ingreso con exito");
    }//GEN-LAST:event_botonDeGuardarActionPerformed

    private void botonDeRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeRegresoActionPerformed
                // boton para regresar a la pantalla de pacientes:
        setVisible(false);
        new pacientes().setVisible(true);
    }//GEN-LAST:event_botonDeRegresoActionPerformed

  
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioAgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioAgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioAgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioAgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioAgregarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDeGuardar;
    private javax.swing.JButton botonDeRegreso;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCedulaID;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaEstadoCivil;
    private javax.swing.JLabel etiquetaIDHospital;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JCheckBox internado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textoApellidos;
    private javax.swing.JTextField textoCedula;
    private javax.swing.JTextField textoCorreoElectronico;
    private javax.swing.JTextField textoEstadoCivil;
    private javax.swing.JTextField textoIDHospital;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
