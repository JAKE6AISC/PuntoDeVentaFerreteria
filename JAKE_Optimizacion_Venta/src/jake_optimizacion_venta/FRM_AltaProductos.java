package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Luis Osvaldo Juanez Hinojosa Formulario de alta de productos
 *
 * @author Juanez
 */
public class FRM_AltaProductos extends javax.swing.JFrame {

    int[] Datos;
    boolean Id_Prov_existe;
    BaseDeDatos mBD = new BaseDeDatos();
    BaseDeDatos mDB = new BaseDeDatos();

    public FRM_AltaProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        BaseDeDatos.conect();
        jComboBox1.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = BaseDeDatos.getIdProv();
        for (int i = 0; i < lista.size(); i++) {
            jComboBox1.addItem(lista.get(i));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_Clasificacion = new javax.swing.JTextField();
        BTN_Atras = new javax.swing.JButton();
        TXT_NombreProducto = new javax.swing.JTextField();
        LBL_Nombre_Producto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LBL_Clasificacion = new javax.swing.JLabel();
        LBL_Tipo = new javax.swing.JLabel();
        TXT_Tipo = new javax.swing.JTextField();
        TXT_Precio = new javax.swing.JTextField();
        LBL_Id_Proveedor = new javax.swing.JLabel();
        BTN_Agregar = new javax.swing.JButton();
        LBL_Precio = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_Atras.setText("Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        LBL_Nombre_Producto.setText("Nombre");

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alta Productos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ferretería Juanes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBL_Clasificacion.setText("Clasificacion");

        LBL_Tipo.setText("Tipo");

        TXT_Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PrecioKeyTyped(evt);
            }
        });

        LBL_Id_Proveedor.setText("Id_Proovedor");

        BTN_Agregar.setText("Agregar");
        BTN_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarActionPerformed(evt);
            }
        });

        LBL_Precio.setText("Precio");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_Nombre_Producto)
                            .addComponent(LBL_Clasificacion)
                            .addComponent(LBL_Tipo)
                            .addComponent(LBL_Precio))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LBL_Id_Proveedor)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(BTN_Agregar))
                    .addComponent(TXT_NombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_Clasificacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_Tipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_Precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_Id_Proveedor)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Atras)
                    .addComponent(BTN_Agregar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        FRM_CatalogoProductos FormCP = new FRM_CatalogoProductos();
        FormCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarActionPerformed
        Producto mProducto = new Producto();
        Proveedor mProveedor = new Proveedor();
        BaseDeDatos mBD = new BaseDeDatos();

        if (mBD.conectar()) {
            if (ValidarClasificacion() && ValidarPrecio()
                    && ValidarNombreProducto() && ValidarTipo()) {
                int idtemp = mBD.obtenerIDprov(jComboBox1.getSelectedItem().toString());
                mProducto.setNombre(TXT_NombreProducto.getText());
                mProducto.setClasificacion(TXT_Clasificacion.getText());
                mProducto.setTipo(TXT_Tipo.getText());
                mProducto.setPrecio(Float.parseFloat(TXT_Precio.getText()));
                mProducto.setId_Proveedor(idtemp);
                if (mBD.conectar()) {
                    if (mBD.agregarProducto(mProducto)) {
                        int IdP = mBD.getIdProducto();
                        mBD.agregarExistenciaProducto(IdP);
                        JOptionPane.showMessageDialog(null, "Producto Agregado Exitosamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                    mBD.desconectar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor completa los campos que faltan");
            }
            /*  }else {
             JOptionPane.showMessageDialog(null, "Proveedor inexistente");
        }*/

        }
        Limpiar();
    }//GEN-LAST:event_BTN_AgregarActionPerformed

    private void TXT_PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PrecioKeyTyped
        if (TXT_Precio.getText().contains(".")) {
            char caracter = evt.getKeyChar();
            if (caracter < '0' || caracter > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_TXT_PrecioKeyTyped

    // Nombre del producto
    public boolean ValidarNombreProducto() {
        if (TXT_NombreProducto.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    //Clsificacion
    public boolean ValidarClasificacion() {
        if (TXT_Clasificacion.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    //Tipo de producto
    public boolean ValidarTipo() {
        if (TXT_Tipo.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    ///Precio "Float"
    public boolean ValidarPrecio() {
        if (TXT_Precio.getText().equals("")) {
            return false;
        } else {
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
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JLabel LBL_Clasificacion;
    private javax.swing.JLabel LBL_Id_Proveedor;
    private javax.swing.JLabel LBL_Nombre_Producto;
    private javax.swing.JLabel LBL_Precio;
    private javax.swing.JLabel LBL_Tipo;
    private javax.swing.JTextField TXT_Clasificacion;
    private javax.swing.JTextField TXT_NombreProducto;
    private javax.swing.JTextField TXT_Precio;
    private javax.swing.JTextField TXT_Tipo;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        TXT_NombreProducto.setText("");
        TXT_Clasificacion.setText("");
        TXT_Tipo.setText("");
        TXT_Precio.setText("");
    }
}
