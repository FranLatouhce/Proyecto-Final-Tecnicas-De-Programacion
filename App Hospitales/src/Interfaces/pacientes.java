/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

public class pacientes extends javax.swing.JFrame {


    public pacientes() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonParaConsultarModificar = new javax.swing.JButton();
        botonParaAgregar = new javax.swing.JButton();
        botonPantallaEliminar = new javax.swing.JButton();
        botonDeCitas = new javax.swing.JButton();
        botonnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonParaConsultarModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonParaConsultarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/consulta.png"))); // NOI18N
        botonParaConsultarModificar.setText("Consultar/Modificar");
        botonParaConsultarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParaConsultarModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonParaConsultarModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 144, 190, 57));

        botonParaAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonParaAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agregar.png"))); // NOI18N
        botonParaAgregar.setText("Agregar");
        botonParaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParaAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonParaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 144, 153, -1));

        botonPantallaEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPantallaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar Usuario.png"))); // NOI18N
        botonPantallaEliminar.setText("Eliminar");
        botonPantallaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPantallaEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonPantallaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 144, 153, -1));

        botonDeCitas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cita.png"))); // NOI18N
        botonDeCitas.setText("Consultar Citas");
        botonDeCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeCitasActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 144, 200, -1));

        botonnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salir.gif"))); // NOI18N
        botonnRegresar.setText("Regresar");
        botonnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 332, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Fondo/fondo inicio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 430));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonParaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParaAgregarActionPerformed
        //Aqui se agrega el codigo para ir a la pantalla de agregar
            setVisible(false);
            new formularioAgregarPaciente().setVisible(true);
        
    }//GEN-LAST:event_botonParaAgregarActionPerformed

    private void botonParaConsultarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParaConsultarModificarActionPerformed
        //Aqui se agrega el codigo para ir a la pantalla de Consultar/Modificar
            setVisible(false);
            new formularioConsultaYModificacionPacientes().setVisible(true);
    }//GEN-LAST:event_botonParaConsultarModificarActionPerformed

    private void botonPantallaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPantallaEliminarActionPerformed
         //Aqui se agrega el codigo para ir a la pantalla de Eliminar
            setVisible(false);
            new formularioEliminarPaciente().setVisible(true);
      
    }//GEN-LAST:event_botonPantallaEliminarActionPerformed

    private void botonDeCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeCitasActionPerformed
            //Aqui se agrega el codigo para ir a la pantalla de Eliminar
            setVisible(false);
            new formularioCitas().setVisible(true);
    }//GEN-LAST:event_botonDeCitasActionPerformed

    private void botonnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonnRegresarActionPerformed
        // Codigo para regresar al inicio
            setVisible(false);
            new inicio().setVisible(true);
    }//GEN-LAST:event_botonnRegresarActionPerformed


    public static void main(String args[]) {
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(() -> {
            new pacientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDeCitas;
    private javax.swing.JButton botonPantallaEliminar;
    private javax.swing.JButton botonParaAgregar;
    private javax.swing.JButton botonParaConsultarModificar;
    private javax.swing.JButton botonnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
