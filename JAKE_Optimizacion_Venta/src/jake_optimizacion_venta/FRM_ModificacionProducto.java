
package jake_optimizacion_venta;

import javax.swing.JOptionPane;

/**
 Se hizo el metodo Modificacion del producto
 * José Andrés Chávez Hernández
 * @author Andy
 */
public class FRM_ModificacionProducto extends javax.swing.JFrame {

    /**
     * Creates new form FRM_ModificacionProducto
     */
    public FRM_ModificacionProducto() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTId_Producto = new javax.swing.JTextField();
        TXTNuevo_NombreProducto = new javax.swing.JTextField();
        TXTNuevo_TipoProducto = new javax.swing.JTextField();
        TXTNuevo_ClasificacionProducto = new javax.swing.JTextField();
        TXTNuevo_PrecioProducto = new javax.swing.JTextField();
        BTNAtras = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id_Producto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo");

        jLabel4.setText("Clasificacion");

        jLabel5.setText("Precio");

        BTNAtras.setText("Atras");
        BTNAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAtrasActionPerformed(evt);
            }
        });

        BTNModificar.setText("Modificar");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNSalir.setText("Salir");
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificacion De Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(TXTId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNuevo_TipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(TXTNuevo_ClasificacionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(TXTNuevo_PrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(TXTNuevo_NombreProducto)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(BTNAtras)
                        .addGap(65, 65, 65)
                        .addComponent(BTNModificar)
                        .addGap(40, 40, 40)
                        .addComponent(BTNSalir)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TXTNuevo_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TXTNuevo_TipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TXTNuevo_ClasificacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTNuevo_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNAtras)
                    .addComponent(BTNModificar)
                    .addComponent(BTNSalir))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        BaseDeDatos mBD = new BaseDeDatos();
        Producto mProducto = new Producto();
        Producto mNuevoProducto = new Producto(); 
        
        mProducto.setId_Producto(Integer.parseInt(this.TXTId_Producto.getText()));
        mNuevoProducto.setNombre(this.TXTNuevo_NombreProducto.getText());
        mNuevoProducto.setTipo(this.TXTNuevo_TipoProducto.getText());
        mNuevoProducto.setClasificacion(this.TXTNuevo_ClasificacionProducto.getText());
        mNuevoProducto.setPrecio(Float.parseFloat(this.TXTNuevo_PrecioProducto.getText()));
        
         if (mBD.conectar()) {// se realiza primero la conexion
            if (mBD.modificacionProducto(mProducto,mNuevoProducto)) {// mandamos llamar el metodo modificar perteneciente 
                                                                     //  a la clase base de datos
                JOptionPane.showMessageDialog(null, "Datos del Producto Modificados Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
            mBD.desconectar();// se desconecta
        }
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
      setVisible(false);
    }//GEN-LAST:event_BTNSalirActionPerformed

    private void BTNAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAtrasActionPerformed
         FRM_CatalogoProveedor FormCP = new FRM_CatalogoProveedor();
        FormCP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNAtrasActionPerformed

     private void TXT_IdProductoFocusLost(java.awt.event.FocusEvent evt) {                                                   
        if(ValidarIdProducto()){
            //JOptionPane.showMessageDialog(null,"Valido");
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXTId_Producto.requestFocus();
       }
    } 
     
      private void TXT_NombreProductoFocusLost(java.awt.event.FocusEvent evt) {                                                   
        if(ValidarProducto()){
            //JOptionPane.showMessageDialog(null,"Valido");
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXTNuevo_NombreProducto.requestFocus();
       }
    }
       private void TXT_TipoProductoFocusLost(java.awt.event.FocusEvent evt) {                                                   
        if(ValidarTipo()){
            //JOptionPane.showMessageDialog(null,"Valido");
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXTNuevo_TipoProducto.requestFocus();
       }
    } 
        private void TXT_ClasificacionProductoFocusLost(java.awt.event.FocusEvent evt) {                                                   
        if(ValidarClasificacion()){
            //JOptionPane.showMessageDialog(null,"Valido");
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXTNuevo_ClasificacionProducto.requestFocus();
       }
    } 
         private void TXT_PrecioProductoFocusLost(java.awt.event.FocusEvent evt) {                                                   
        if(ValidarPrecio()){
            //JOptionPane.showMessageDialog(null,"Valido");
        }else{
            JOptionPane.showMessageDialog(null,"Campo obligatorio");
            TXTNuevo_PrecioProducto.requestFocus();
       }
    } 
     public boolean ValidarIdProducto(){
        if(TXTId_Producto.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
       public boolean ValidarProducto(){
        if(TXTNuevo_NombreProducto.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
       
       public boolean ValidarTipo(){
        if(TXTNuevo_TipoProducto.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
     public boolean ValidarClasificacion(){
        if(TXTNuevo_ClasificacionProducto.getText().equals("")){
            return false;
        }else {
            return true;
        }
    }
     
     public boolean ValidarPrecio(){
        if(TXTNuevo_PrecioProducto.getText().equals("")){
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
            java.util.logging.Logger.getLogger(FRM_ModificacionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ModificacionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ModificacionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ModificacionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ModificacionProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAtras;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JTextField TXTId_Producto;
    private javax.swing.JTextField TXTNuevo_ClasificacionProducto;
    private javax.swing.JTextField TXTNuevo_NombreProducto;
    private javax.swing.JTextField TXTNuevo_PrecioProducto;
    private javax.swing.JTextField TXTNuevo_TipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
