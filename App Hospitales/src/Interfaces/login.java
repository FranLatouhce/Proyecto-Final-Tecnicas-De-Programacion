
package Interfaces;

import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {


    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContrasena = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        textoConstrasena = new javax.swing.JPasswordField();
        botonDeIngresar = new javax.swing.JButton();
        botonDeCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaUsuario.setText("Usuario");
        getContentPane().add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 90, -1, -1));

        etiquetaContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaContrasena.setText("Contraseña");
        getContentPane().add(etiquetaContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 169, -1, -1));

        textoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 90, 292, -1));

        textoConstrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(textoConstrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 166, 292, -1));

        botonDeIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N
        botonDeIngresar.setText("Ingresar");
        botonDeIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDeIngresarMouseClicked(evt);
            }
        });
        botonDeIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 259, -1, -1));

        botonDeCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDeCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        botonDeCerrar.setText("Cerrar");
        botonDeCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonDeCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 259, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Fondo/login.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void botonDeIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDeIngresarMouseClicked

   
        
    }//GEN-LAST:event_botonDeIngresarMouseClicked

    private void botonDeIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeIngresarActionPerformed
        // Se toma el texto de los espacios de contraseña y usuario y se validan para ingresar a la pantalla de inicio :
        
            if(textoUsuario.getText().equals("admin") && textoConstrasena.getText().equals("admin")){
        
                setVisible(false);
                new inicio().setVisible(true);
            
        }else{
                
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
         
        }
        
    }//GEN-LAST:event_botonDeIngresarActionPerformed

    private void botonDeCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeCerrarActionPerformed
        // Se consulta al usuario si desea salir:
        
        int AdvertenciaSalir=JOptionPane.showConfirmDialog(null, "Desea salir del programa?");
        if(AdvertenciaSalir==0){
        
            System.exit(0);
        
        }
        
    }//GEN-LAST:event_botonDeCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDeCerrar;
    private javax.swing.JButton botonDeIngresar;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textoConstrasena;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
