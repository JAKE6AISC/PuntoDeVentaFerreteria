package jake_optimizacion_venta;
/**
 *
 * @author Juanez
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_CatalogoProductos = new javax.swing.JButton();
        BTN_CatalogoProveedores = new javax.swing.JButton();
        BTN_Venta = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
        BTN_GeneradorReportes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTN_Compra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setName("Menu"); // NOI18N

        BTN_CatalogoProductos.setText("Catalogo de Productos");
        BTN_CatalogoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CatalogoProductosActionPerformed(evt);
            }
        });

        BTN_CatalogoProveedores.setText("Catalogo de Proveedores");
        BTN_CatalogoProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CatalogoProveedoresActionPerformed(evt);
            }
        });

        BTN_Venta.setText("Venta");
        BTN_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VentaActionPerformed(evt);
            }
        });

        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        BTN_GeneradorReportes.setText("Generador de reportes");

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ferretería Juanes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        BTN_Compra.setText("Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_CatalogoProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_GeneradorReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_CatalogoProveedores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_Salir)
                    .addComponent(BTN_Compra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_GeneradorReportes)
                    .addComponent(BTN_Venta))
                .addGap(4, 4, 4)
                .addComponent(BTN_Compra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_CatalogoProductos)
                    .addComponent(BTN_CatalogoProveedores))
                .addGap(18, 18, 18)
                .addComponent(BTN_Salir)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void BTN_CatalogoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CatalogoProductosActionPerformed
        FRM_CatalogoProductos FormCP = new FRM_CatalogoProductos();
        FormCP.setEnabled(true);
    }//GEN-LAST:event_BTN_CatalogoProductosActionPerformed

    private void BTN_CatalogoProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CatalogoProveedoresActionPerformed
        FRM_CatalogoProveedor FormCPV = new FRM_CatalogoProveedor();
        FormCPV.setEnabled(true);
    }//GEN-LAST:event_BTN_CatalogoProveedoresActionPerformed

    private void BTN_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VentaActionPerformed
        FRM_Venta FormVTA = new FRM_Venta();
        FormVTA.show();
    }//GEN-LAST:event_BTN_VentaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CatalogoProductos;
    private javax.swing.JButton BTN_CatalogoProveedores;
    private javax.swing.JButton BTN_Compra;
    private javax.swing.JButton BTN_GeneradorReportes;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JButton BTN_Venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
