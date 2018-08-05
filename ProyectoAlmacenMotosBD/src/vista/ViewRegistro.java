/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Gustavo Davila
 */
public class ViewRegistro extends javax.swing.JFrame {

    /**
     * Creates new form ViewRegistro
     */
    public ViewRegistro() {
        initComponents();
        this.setLocationRelativeTo(null); 
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
        caja_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caja_password = new javax.swing.JPasswordField();
        caja_confirmar_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        caja_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        caja_apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        caja_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        caja_correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        caja_tipo_emp = new javax.swing.JTextField();
        registrar_emp_boton = new javax.swing.JButton();
        cancelar_reg_boton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cedula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 60, 20));

        caja_codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caja_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(caja_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("<html>Confirmar contraseña</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 80, -1));

        caja_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(caja_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 210, -1));

        caja_confirmar_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(caja_confirmar_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        caja_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(caja_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 210, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        caja_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(caja_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        caja_telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caja_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(caja_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, 20));

        caja_correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(caja_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo empleado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        caja_tipo_emp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caja_tipo_emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_tipo_empKeyTyped(evt);
            }
        });
        getContentPane().add(caja_tipo_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 210, -1));

        registrar_emp_boton.setBackground(new java.awt.Color(0, 0, 0));
        registrar_emp_boton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrar_emp_boton.setForeground(new java.awt.Color(255, 255, 255));
        registrar_emp_boton.setText("Registrar");
        getContentPane().add(registrar_emp_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 110, -1));

        cancelar_reg_boton.setBackground(new java.awt.Color(0, 0, 0));
        cancelar_reg_boton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar_reg_boton.setForeground(new java.awt.Color(255, 255, 255));
        cancelar_reg_boton.setText("Cancelar");
        getContentPane().add(cancelar_reg_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 110, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField1.setText("Los campos con * son obligatorios");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 230, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("1 - Administrador ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("2 - Empleado");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/motocross.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_codigoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume();
    }//GEN-LAST:event_caja_codigoKeyTyped

    private void caja_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_telefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_caja_telefonoKeyTyped

    private void caja_tipo_empKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_tipo_empKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '1' || c>'2')evt.consume(); 
    }//GEN-LAST:event_caja_tipo_empKeyTyped

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
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField caja_apellido;
    public javax.swing.JTextField caja_codigo;
    public javax.swing.JPasswordField caja_confirmar_password;
    public javax.swing.JTextField caja_correo;
    public javax.swing.JTextField caja_nombre;
    public javax.swing.JPasswordField caja_password;
    public javax.swing.JTextField caja_telefono;
    public javax.swing.JTextField caja_tipo_emp;
    public javax.swing.JButton cancelar_reg_boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JButton registrar_emp_boton;
    // End of variables declaration//GEN-END:variables
}
