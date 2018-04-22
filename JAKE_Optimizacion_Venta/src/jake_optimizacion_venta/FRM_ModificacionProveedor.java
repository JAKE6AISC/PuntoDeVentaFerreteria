package jake_optimizacion_venta;
import javax.swing.JOptionPane;
/**
 * Formulario Modificacion Proveedor agregada por Juanes
 * @author Juanez
 */
public class FRM_ModificacionProveedor extends javax.swing.JFrame {

    public FRM_ModificacionProveedor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_Id_Proveedor = new javax.swing.JTextField();
        TXT_NuevoNombreProveedor = new javax.swing.JTextField();
        TXT_NuevaEmpresa = new javax.swing.JTextField();
        LBL_Id_Proveedor = new javax.swing.JLabel();
        LBL_NuevoNombreProveedor = new javax.swing.JLabel();
        LBL_NuevaEmpresaProveedor = new javax.swing.JLabel();
        TXT_ModificarProveedor = new javax.swing.JButton();
        TXT_Salir = new javax.swing.JButton();
        BTN_Atras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FRM_ModificacionProveedores");
        setName("Modificacion Proveedor"); // NOI18N

        TXT_Id_Proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_Id_ProveedorFocusLost(evt);
            }
        });

        TXT_NuevoNombreProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_NuevoNombreProveedorFocusLost(evt);
            }
        });

        TXT_NuevaEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_NuevaEmpresaFocusLost(evt);
            }
        });

        LBL_Id_Proveedor.setText("Id_Proveedor");

        LBL_NuevoNombreProveedor.setText("Nuevo Nombre");

        LBL_NuevaEmpresaProveedor.setText("Nueva Empresa");

        TXT_ModificarProveedor.setText("Modificar");
        TXT_ModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ModificarProveedorActionPerformed(evt);
            }
        });

        TXT_Salir.setText("Salir");
        TXT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_SalirActionPerformed(evt);
            }
        });

        BTN_Atras.setText("Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificacion de proveedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBL_NuevaEmpresaProveedor)
                                .addComponent(LBL_NuevoNombreProveedor))
                            .addComponent(LBL_Id_Proveedor))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Atras)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(TXT_ModificarProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TXT_Id_Proveedor)
                    .addComponent(TXT_NuevoNombreProveedor)
                    .addComponent(TXT_NuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_Id_Proveedor))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NuevoNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_NuevoNombreProveedor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_NuevaEmpresaProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_ModificarProveedor)
                    .addComponent(TXT_Salir)
                    .addComponent(BTN_Atras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_ModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ModificarProveedorActionPerformed
        BaseDeDatos mBD = new BaseDeDatos();
        Proveedor mProveedor = new Proveedor();// necesitamos de los datos originales el id
        Proveedor mNuevoProveedor = new Proveedor(); // y los nuevos datos nombre y empresa
        // se asigna los nuevos valores con el id para la busueda
        mProveedor.setId_proveedor(Integer.parseInt(this.TXT_Id_Proveedor.getText()));
        mNuevoProveedor.setNombre(this.TXT_NuevoNombreProveedor.getText());
        mNuevoProveedor.setEmpresa(this.TXT_NuevaEmpresa.getText());

        if (mBD.conectar()) {// se realiza primero la conexion
            if (mBD.modificarProveedor(mProveedor,mNuevoProveedor)) {// mandamos llamar el metodo modificar perteneciente 
                                                                     //  a la clase base de datos
                JOptionPane.showMessageDialog(null, "Proveedor Modificados Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.desconectar();// se desconecta
        }
    }//GEN-LAST:event_TXT_ModificarProveedorActionPerformed

    private void TXT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_SalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_TXT_SalirActionPerformed

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        FRM_CatalogoProveedor FormCP = new FRM_CatalogoProveedor();
        FormCP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void TXT_Id_ProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_Id_ProveedorFocusLost
        if(ValidarId_Proveedor()){
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_Id_Proveedor.requestFocus();
       }
    }//GEN-LAST:event_TXT_Id_ProveedorFocusLost

    private void TXT_NuevoNombreProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_NuevoNombreProveedorFocusLost
        if(ValidarNuevoNombreProveedor()){
    
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_NuevoNombreProveedor.requestFocus();
       }
    }//GEN-LAST:event_TXT_NuevoNombreProveedorFocusLost

    private void TXT_NuevaEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_NuevaEmpresaFocusLost
         if(ValidarNuevaEmpresa()){
            
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXT_NuevaEmpresa.requestFocus();
       }
    }//GEN-LAST:event_TXT_NuevaEmpresaFocusLost
    //metodos para valiadar cajas de texto es uno para cada caja de texto... Juanes
    // Id_Proveedor
    public boolean ValidarId_Proveedor(){
        if(TXT_Id_Proveedor.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    // Nuevo Nombre Proveedor
    public boolean ValidarNuevoNombreProveedor(){
        if(TXT_NuevoNombreProveedor.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
    //Nueva Empresa
    public boolean ValidarNuevaEmpresa(){
        if(TXT_NuevaEmpresa.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
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
            java.util.logging.Logger.getLogger(FRM_ModificacionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ModificacionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ModificacionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ModificacionProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ModificacionProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JLabel LBL_Id_Proveedor;
    private javax.swing.JLabel LBL_NuevaEmpresaProveedor;
    private javax.swing.JLabel LBL_NuevoNombreProveedor;
    private javax.swing.JTextField TXT_Id_Proveedor;
    private javax.swing.JButton TXT_ModificarProveedor;
    private javax.swing.JTextField TXT_NuevaEmpresa;
    private javax.swing.JTextField TXT_NuevoNombreProveedor;
    private javax.swing.JButton TXT_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
