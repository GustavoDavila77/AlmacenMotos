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
public class ViewMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenu
     */
    public ViewMenuAdmin() {
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

        modificar_prod_Boton = new javax.swing.JButton();
        ingresar_user = new javax.swing.JButton();
        salir_menu_admin_boton = new javax.swing.JButton();
        estadisticas_boton = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificar_prod_Boton.setText("Modificar Producto");
        getContentPane().add(modificar_prod_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, -1));

        ingresar_user.setText("Regisrar Empleado");
        getContentPane().add(ingresar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 170, -1));

        salir_menu_admin_boton.setText("Salir");
        getContentPane().add(salir_menu_admin_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 70, -1));

        estadisticas_boton.setText("Estadisticas");
        getContentPane().add(estadisticas_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/motogp.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton estadisticas_boton;
    public javax.swing.JButton ingresar_user;
    private javax.swing.JLabel jLabelFondo;
    public javax.swing.JButton modificar_prod_Boton;
    public javax.swing.JButton salir_menu_admin_boton;
    // End of variables declaration//GEN-END:variables
}