
package Interfaces;

import javax.swing.JOptionPane;

public class formularioConsultaYModificacionPacientes extends javax.swing.JFrame {


    public formularioConsultaYModificacionPacientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
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
        etiquetaID = new javax.swing.JLabel();
        textoIDdeBusqueda = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        activo = new javax.swing.JCheckBox();
        imagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etiquetaTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trabajadores.png"))); // NOI18N
        etiquetaTitulo.setText("Modificar y Cosultar Pacientes");
        getContentPane().add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, 610, 80));

        etiquetaCedulaID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCedulaID.setText("Cedula(ID)");
        getContentPane().add(etiquetaCedulaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre");
        getContentPane().add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        etiquetaApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaApellidos.setText("Apellidos");
        getContentPane().add(etiquetaApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        etiquetaCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCorreoElectronico.setText("Correo Electronico");
        getContentPane().add(etiquetaCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        etiquetaEstadoCivil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaEstadoCivil.setText("Estado Civil");
        getContentPane().add(etiquetaEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        internado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        internado.setText("Internado");
        getContentPane().add(internado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

        etiquetaIDHospital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaIDHospital.setText("ID Hospital");
        getContentPane().add(etiquetaIDHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));
        getContentPane().add(textoEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 150, -1));
        getContentPane().add(textoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 150, -1));
        getContentPane().add(textoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, -1));
        getContentPane().add(textoCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 150, -1));
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 150, -1));
        getContentPane().add(textoIDHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 150, -1));

        botonDeRegreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salir.gif"))); // NOI18N
        botonDeRegreso.setText("Regresar");
        botonDeRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeRegresoActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        botonDeGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        botonDeGuardar.setText("Guardar");
        botonDeGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        etiquetaID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiquetaID.setText("Digite el ID del paciente que desea buscar");
        getContentPane().add(etiquetaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        textoIDdeBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(textoIDdeBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 130, -1));

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonBuscar.setText("Buscar");
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        activo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activo.setText("Activo");
        getContentPane().add(activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        imagenDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Fondo/fondo inicio.jpg"))); // NOI18N
        imagenDeFondo.setText("jLabel9");
        getContentPane().add(imagenDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDeGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeGuardarActionPerformed
        // Se guardan los datos almacenados:
        
        JOptionPane.showMessageDialog(null, "Usuario se modifico con exito");
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioAgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(() -> {
            new formularioAgregarPaciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activo;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonDeGuardar;
    private javax.swing.JButton botonDeRegreso;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCedulaID;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaEstadoCivil;
    private javax.swing.JLabel etiquetaID;
    private javax.swing.JLabel etiquetaIDHospital;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel imagenDeFondo;
    private javax.swing.JCheckBox internado;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textoApellidos;
    private javax.swing.JTextField textoCedula;
    private javax.swing.JTextField textoCorreoElectronico;
    private javax.swing.JTextField textoEstadoCivil;
    private javax.swing.JTextField textoIDHospital;
    private javax.swing.JTextField textoIDdeBusqueda;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
