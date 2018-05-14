package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Se hizo el metodo Modificacion del producto José Andrés Chávez Hernández
 *
 * @author Andy
 */
public class FRM_ModificacionProducto extends javax.swing.JFrame {
    int Seleccionada = 0;
    BaseDeDatos mBD = new BaseDeDatos();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    Producto mProducto = new Producto();
    public FRM_ModificacionProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        modeloTabla.addColumn("Id producto");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Clasificación");
        modeloTabla.addColumn("Precio");
    }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProveedor = new javax.swing.JTable();
        TXT_Busqueda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Id_Producto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo");

        jLabel4.setText("Clasificacion");

        jLabel5.setText("Precio");

        TXTNuevo_PrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNuevo_PrecioProductoKeyTyped(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ferretería Juanes");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modificacion De Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTableProveedor.setModel(modeloTabla);
        JTableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableProveedor);

        TXT_Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_BusquedaKeyPressed(evt);
            }
        });

        jLabel8.setText("Filtrar Resultados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNModificar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(TXTId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTNuevo_TipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(TXTNuevo_ClasificacionProducto)
                                    .addComponent(TXTNuevo_PrecioProducto))
                                .addComponent(TXTNuevo_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTId_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXTNuevo_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TXTNuevo_TipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TXTNuevo_ClasificacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TXTNuevo_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNModificar)
                            .addComponent(BTNAtras)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        BaseDeDatos mBD = new BaseDeDatos();
        Producto mProducto = new Producto();
        Producto mNuevoProducto = new Producto();

        if (ValidarIdProducto() && ValidarProducto() && ValidarTipo() 
                && ValidarClasificacion() && ValidarPrecio()) {
            mProducto.setId_Producto(Integer.parseInt(this.TXTId_Producto.getText()));
            mNuevoProducto.setNombre(this.TXTNuevo_NombreProducto.getText());
            mNuevoProducto.setTipo(this.TXTNuevo_TipoProducto.getText());
            mNuevoProducto.setClasificacion(this.TXTNuevo_ClasificacionProducto.getText());
            mNuevoProducto.setPrecio(Float.parseFloat(this.TXTNuevo_PrecioProducto.getText()));

            if (mBD.conectar()) {// se realiza primero la conexion
                if (mBD.modificacionProducto(mProducto, mNuevoProducto)) {// mandamos llamar el metodo modificar perteneciente 
                    //  a la clase base de datos
                    JOptionPane.showMessageDialog(null, "Datos del Producto Modificados Exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                mBD.desconectar();// se desconecta
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor completa los campos");
        }
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAtrasActionPerformed
        FRM_CatalogoProductos FormCP = new FRM_CatalogoProductos();
        FormCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNAtrasActionPerformed

    private void JTableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableProveedorMouseClicked
        TXTId_Producto.setText("");
        TXTId_Producto.setEditable(false);
        TXTNuevo_NombreProducto.setText("");
        TXTNuevo_TipoProducto.setText("");
        TXTNuevo_ClasificacionProducto.setText("");
        TXTNuevo_PrecioProducto.setText("");
        
        Seleccionada = JTableProveedor.rowAtPoint(evt.getPoint());
        TXTId_Producto.setEditable(true);
        TXTId_Producto.setText(JTableProveedor.getModel().getValueAt(Seleccionada,0).toString());
        TXTId_Producto.setEditable(false);
        TXTNuevo_NombreProducto.setText(JTableProveedor.getModel().getValueAt(Seleccionada,1).toString());
        TXTNuevo_TipoProducto.setText(JTableProveedor.getModel().getValueAt(Seleccionada,2).toString());
        TXTNuevo_ClasificacionProducto.setText(JTableProveedor.getModel().getValueAt(Seleccionada,3).toString());
        TXTNuevo_PrecioProducto.setText(JTableProveedor.getModel().getValueAt(Seleccionada,4).toString());
    }//GEN-LAST:event_JTableProveedorMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        modeloTabla = (DefaultTableModel) JTableProveedor.getModel();
        int a = modeloTabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
        }

        if (mBD.conectar()) {
            ArrayList mListaProductos = mBD.consultarProductos();
            String[] Datos;
            
            for (Object mListaProveedor : mListaProductos) {
                Datos = new String[5];
                mProducto = (Producto) mListaProveedor;
                Datos[0] = "" + mProducto.getId_Producto();
                Datos[1] = mProducto.getNombre();
                Datos[2] = mProducto.getTipo();
                Datos[3] = mProducto.getClasificacion();
                Datos [4] = "" + mProducto.getPrecio();

                modeloTabla.addRow(Datos);
            }
            this.JTableProveedor = new javax.swing.JTable();
            this.JTableProveedor.setModel(modeloTabla);
            this.JTableProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.JTableProveedor.getColumnModel().getColumn(1).setPreferredWidth(300);
            this.JTableProveedor.getColumnModel().getColumn(2).setPreferredWidth(300);
            this.JTableProveedor.getColumnModel().getColumn(3).setPreferredWidth(300);
            this.JTableProveedor.getColumnModel().getColumn(4).setPreferredWidth(300);
            if (this.JTableProveedor.getRowCount() > 0) {
                this.JTableProveedor.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar proveedor");
        }
        mBD.desconectar();
    }//GEN-LAST:event_formWindowActivated

    private void TXT_BusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_BusquedaKeyPressed
               if (TXT_Busqueda.getText().equals("")) {
            
        }else {
        modeloTabla.setColumnCount(0);
        modeloTabla.setRowCount(0);
        
      
        if (mBD.conectar()) {
            
            if (mBD.conectar()) {
                
                String[] Dato;

                modeloTabla.addColumn("Id producto");
                modeloTabla.addColumn("Nombre");
                modeloTabla.addColumn("Tipo");
                modeloTabla.addColumn("Clasificación");
                modeloTabla.addColumn("Precio");

                Dato = new String[5];
             
                 mProducto = mBD.consultarProductoFiltro(TXT_Busqueda.getText());
               
                
                Dato[0] = "" + mProducto.getId_Producto();
                Dato[1] = mProducto.getNombre();
                Dato[2] = mProducto.getTipo();
                Dato[3] = mProducto.getClasificacion();
                Dato[4] = "" + mProducto.getPrecio();

                modeloTabla.addRow(Dato);

                this.JTableProveedor.setModel(modeloTabla);
                this.JTableProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
                this.JTableProveedor.getColumnModel().getColumn(1).setPreferredWidth(100);
                this.JTableProveedor.getColumnModel().getColumn(2).setPreferredWidth(150);
                this.JTableProveedor.getColumnModel().getColumn(3).setPreferredWidth(150);
                this.JTableProveedor.getColumnModel().getColumn(4).setPreferredWidth(150);

                if (this.JTableProveedor.getRowCount() > 0) {
                    this.JTableProveedor.setRowSelectionInterval(0, 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
            }
            mBD.desconectar();
        }   
       }
    }//GEN-LAST:event_TXT_BusquedaKeyPressed

    private void TXTNuevo_PrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNuevo_PrecioProductoKeyTyped
         char caracter  = evt.getKeyChar();
            if (caracter < '0' || caracter > '9') {
                evt.consume();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_TXTNuevo_PrecioProductoKeyTyped

    public boolean ValidarIdProducto() {
        if (TXTId_Producto.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidarProducto() {
        if (TXTNuevo_NombreProducto.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidarTipo() {
        if (TXTNuevo_TipoProducto.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidarClasificacion() {
        if (TXTNuevo_ClasificacionProducto.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidarPrecio() {
        if (TXTNuevo_PrecioProducto.getText().equals("")) {
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
    private javax.swing.JTable JTableProveedor;
    private javax.swing.JTextField TXTId_Producto;
    private javax.swing.JTextField TXTNuevo_ClasificacionProducto;
    private javax.swing.JTextField TXTNuevo_NombreProducto;
    private javax.swing.JTextField TXTNuevo_PrecioProducto;
    private javax.swing.JTextField TXTNuevo_TipoProducto;
    private javax.swing.JTextField TXT_Busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
