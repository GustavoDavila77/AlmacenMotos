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
public class ViewModificar extends javax.swing.JFrame {

    /**
     * Creates new form ViewModificar
     */
    public ViewModificar() {
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

        caja_idprod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caja_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        caja_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caja_ubicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        caja_existencias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caja_areadescrip = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        caja_garantia = new javax.swing.JTextField();
        buscar_boton = new javax.swing.JButton();
        modificar_boton = new javax.swing.JButton();
        eliminar_boton = new javax.swing.JButton();
        limpiar_boton = new javax.swing.JButton();
        salir_mod_boton = new javax.swing.JButton();
        agregarProd_boton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        caja_valcompra = new javax.swing.JTextField();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caja_idprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_idprodKeyTyped(evt);
            }
        });
        getContentPane().add(caja_idprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Id_Prod: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        getContentPane().add(caja_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Precio: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        caja_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_precioKeyTyped(evt);
            }
        });
        getContentPane().add(caja_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Ubicación: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        getContentPane().add(caja_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Existencias: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        caja_existencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_existenciasKeyTyped(evt);
            }
        });
        getContentPane().add(caja_existencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Descripción: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        caja_areadescrip.setColumns(20);
        caja_areadescrip.setRows(5);
        jScrollPane1.setViewportView(caja_areadescrip);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 240, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Garantia: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        caja_garantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_garantiaKeyTyped(evt);
            }
        });
        getContentPane().add(caja_garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 240, -1));

        buscar_boton.setText("Buscar");
        getContentPane().add(buscar_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 80, -1));

        modificar_boton.setText("Modificar");
        getContentPane().add(modificar_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 110, -1));

        eliminar_boton.setText("Eliminar");
        getContentPane().add(eliminar_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 100, -1));

        limpiar_boton.setText("Limpiar");
        getContentPane().add(limpiar_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 100, -1));

        salir_mod_boton.setText("Salir");
        getContentPane().add(salir_mod_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 90, -1));

        agregarProd_boton.setText("Agregar");
        getContentPane().add(agregarProd_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Val_Compra:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        caja_valcompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_valcompraKeyTyped(evt);
            }
        });
        getContentPane().add(caja_valcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 240, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/harley.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja_idprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_idprodKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_caja_idprodKeyTyped

    private void caja_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_precioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_caja_precioKeyTyped

    private void caja_existenciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_existenciasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_caja_existenciasKeyTyped

    private void caja_garantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_garantiaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_caja_garantiaKeyTyped

    private void caja_valcompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_valcompraKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c< '0' || c>'9')evt.consume(); 
    }//GEN-LAST:event_caja_valcompraKeyTyped

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
            java.util.logging.Logger.getLogger(ViewModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregarProd_boton;
    public javax.swing.JButton buscar_boton;
    public javax.swing.JTextArea caja_areadescrip;
    public javax.swing.JTextField caja_existencias;
    public javax.swing.JTextField caja_garantia;
    public javax.swing.JTextField caja_idprod;
    public javax.swing.JTextField caja_nombre;
    public javax.swing.JTextField caja_precio;
    public javax.swing.JTextField caja_ubicacion;
    public javax.swing.JTextField caja_valcompra;
    public javax.swing.JButton eliminar_boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton limpiar_boton;
    public javax.swing.JButton modificar_boton;
    public javax.swing.JButton salir_mod_boton;
    // End of variables declaration//GEN-END:variables
}
