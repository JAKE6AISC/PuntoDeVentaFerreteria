package jake_optimizacion_venta;

import javax.swing.JOptionPane;

/**
 *
 * @author Juanez
 */
public class FRM_AltaProductos extends javax.swing.JFrame {
    public FRM_AltaProductos() {
        initComponents();
    }
    BaseDeDatos mBD = new BaseDeDatos();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_Clasificacion = new javax.swing.JTextField();
        BTN_Atras = new javax.swing.JButton();
        TXT_Id_Proveedor = new javax.swing.JTextField();
        TXT_NombreProducto = new javax.swing.JTextField();
        LBL_Nombre_Producto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBL_Clasificacion = new javax.swing.JLabel();
        LBL_Tipo = new javax.swing.JLabel();
        TXT_Tipo = new javax.swing.JTextField();
        BTN_Salir = new javax.swing.JButton();
        TXT_Precio = new javax.swing.JTextField();
        TXT_Id_Producto = new javax.swing.JTextField();
        LBL_Id_Proveedor = new javax.swing.JLabel();
        BTN_Agegar = new javax.swing.JButton();
        LBL_Precio = new javax.swing.JLabel();
        LBL_Id_Producto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TXT_Clasificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_ClasificacionFocusLost(evt);
            }
        });

        BTN_Atras.setText("Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        TXT_Id_Proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_Id_ProveedorFocusLost(evt);
            }
        });

        TXT_NombreProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_NombreProductoFocusLost(evt);
            }
        });

        LBL_Nombre_Producto.setText("Nombre");

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alta Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        LBL_Clasificacion.setText("Clasificacion");

        LBL_Tipo.setText("Tipo");

        TXT_Tipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_TipoFocusLost(evt);
            }
        });

        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        TXT_Precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_PrecioFocusLost(evt);
            }
        });

        TXT_Id_Producto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_Id_ProductoFocusLost(evt);
            }
        });

        LBL_Id_Proveedor.setText("Id_Proovedor");

        BTN_Agegar.setText("Agregar");
        BTN_Agegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgegarActionPerformed(evt);
            }
        });

        LBL_Precio.setText("Precio");

        LBL_Id_Producto.setText("Id_Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBL_Id_Proveedor)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LBL_Id_Producto)
                                    .addComponent(LBL_Nombre_Producto)
                                    .addComponent(LBL_Clasificacion)
                                    .addComponent(LBL_Tipo)
                                    .addComponent(LBL_Precio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_NombreProducto)
                                    .addComponent(TXT_Id_Producto)
                                    .addComponent(TXT_Clasificacion)
                                    .addComponent(TXT_Tipo)
                                    .addComponent(TXT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Atras)
                        .addGap(68, 68, 68)
                        .addComponent(BTN_Agegar)
                        .addGap(47, 47, 47)
                        .addComponent(BTN_Salir)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_Id_Producto))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_Nombre_Producto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_Clasificacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_Tipo))
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBL_Precio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_Id_Proveedor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Atras)
                    .addComponent(BTN_Agegar)
                    .addComponent(BTN_Salir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_ClasificacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_ClasificacionFocusLost
        if(ValidarClasificacion()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_Clasificacion.requestFocus();
        }
    }//GEN-LAST:event_TXT_ClasificacionFocusLost

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        FRM_CatalogoProductos FormCP = new FRM_CatalogoProductos();
        FormCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void TXT_Id_ProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_Id_ProveedorFocusLost
        if(ValidarIdProveedor()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_Id_Proveedor.requestFocus();
        }
    }//GEN-LAST:event_TXT_Id_ProveedorFocusLost

    private void TXT_NombreProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_NombreProductoFocusLost
        if(ValidarNombreProducto()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_NombreProducto.requestFocus();
        }
    }//GEN-LAST:event_TXT_NombreProductoFocusLost

    private void TXT_TipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_TipoFocusLost
        if(ValidarTipo()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_Tipo.requestFocus();
        }
    }//GEN-LAST:event_TXT_TipoFocusLost

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void TXT_PrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_PrecioFocusLost
        if(ValidarTipo()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_Tipo.requestFocus();
        }
    }//GEN-LAST:event_TXT_PrecioFocusLost

    private void TXT_Id_ProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_Id_ProductoFocusLost
        if(ValidarId_Producto()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_Id_Producto.requestFocus();
        }
    }//GEN-LAST:event_TXT_Id_ProductoFocusLost

    private void BTN_AgegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgegarActionPerformed
        Producto mProducto = new Producto();
        BaseDeDatos mBD = new BaseDeDatos();
        mProducto.setId_Producto(Integer.parseInt(TXT_Id_Producto.getText()));
        mProducto.setNombre(TXT_NombreProducto.getText());
        mProducto.setClasificacion(TXT_Clasificacion.getText());
        mProducto.setTipo(TXT_Tipo.getText());
        mProducto.setPrecio(Float.parseFloat(TXT_Precio.getText()));
        mProducto.setId_Proveedor(Integer.parseInt(TXT_Id_Proveedor.getText()));
        if(mBD.conectar()) {
            if (mBD.agregarProducto(mProducto)) {
                JOptionPane.showMessageDialog(null, "Producto Agregado Exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.desconectar();
        }
    }//GEN-LAST:event_BTN_AgegarActionPerformed

    //metodos para valiadar cajas de texto es uno para cada caja de texto... Juanes
    // Id_Producto
    public boolean ValidarId_Producto(){
        if(TXT_Id_Producto.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    // Nombre del producto
    public boolean ValidarNombreProducto(){
        if(TXT_NombreProducto.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    //Clsificacion
    public boolean ValidarClasificacion(){
        if(TXT_Clasificacion.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    //Tipo de producto
    public boolean ValidarTipo(){
        if(TXT_Tipo.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    ///Precio "Float"
    public boolean ValidarPrecio(){
        if(TXT_Precio.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    public boolean ValidarIdProveedor(){
        if(TXT_Id_Proveedor.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
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
            java.util.logging.Logger.getLogger(FRM_AltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_AltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_AltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_AltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_AltaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Agegar;
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JLabel LBL_Clasificacion;
    private javax.swing.JLabel LBL_Id_Producto;
    private javax.swing.JLabel LBL_Id_Proveedor;
    private javax.swing.JLabel LBL_Nombre_Producto;
    private javax.swing.JLabel LBL_Precio;
    private javax.swing.JLabel LBL_Tipo;
    private javax.swing.JTextField TXT_Clasificacion;
    private javax.swing.JTextField TXT_Id_Producto;
    private javax.swing.JTextField TXT_Id_Proveedor;
    private javax.swing.JTextField TXT_NombreProducto;
    private javax.swing.JTextField TXT_Precio;
    private javax.swing.JTextField TXT_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
