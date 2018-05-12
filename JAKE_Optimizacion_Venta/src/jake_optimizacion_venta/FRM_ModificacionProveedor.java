package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Formulario Modificacion Proveedor agregada por Juanes
 *
 * @author Juanez
 */
public class FRM_ModificacionProveedor extends javax.swing.JFrame {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    Proveedor mProveedor = new Proveedor();
    BaseDeDatos mBD = new BaseDeDatos();
    
    public FRM_ModificacionProveedor() {
        initComponents();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Clasificación");
        this.setLocationRelativeTo(null);
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProveedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FRM_ModificacionProveedores");
        setName("Modificacion Proveedor"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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
        jLabel1.setText("Ferretería Juanes");

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
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTableProveedor.setModel(modeloTabla);
        jScrollPane1.setViewportView(JTableProveedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBL_Id_Proveedor)
                        .addGap(49, 49, 49)
                        .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_NuevaEmpresaProveedor)
                            .addComponent(LBL_NuevoNombreProveedor)
                            .addComponent(BTN_Atras))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TXT_ModificarProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXT_NuevoNombreProveedor)
                            .addComponent(TXT_NuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_Id_Proveedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_NuevoNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_NuevoNombreProveedor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_NuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_NuevaEmpresaProveedor))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_Atras)
                            .addComponent(TXT_ModificarProveedor)
                            .addComponent(TXT_Salir))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_ModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ModificarProveedorActionPerformed
        BaseDeDatos mBD = new BaseDeDatos();
        Proveedor mProveedor = new Proveedor();// necesitamos de los datos originales el id
        Proveedor mNuevoProveedor = new Proveedor(); // y los nuevos datos nombre y empresa
        // se asigna los nuevos valores con el id para la busueda
        if (ValidarId_Proveedor() && ValidarNuevoNombreProveedor() && ValidarNuevaEmpresa()) {
            mProveedor.setId_proveedor(Integer.parseInt(this.TXT_Id_Proveedor.getText()));
            mNuevoProveedor.setNombre(this.TXT_NuevoNombreProveedor.getText());
            mNuevoProveedor.setEmpresa(this.TXT_NuevaEmpresa.getText());

            if (mBD.conectar()) {// se realiza primero la conexion
                if (mBD.modificarProveedor(mProveedor, mNuevoProveedor)) {// mandamos llamar el metodo modificar perteneciente 
                    //  a la clase base de datos
                    JOptionPane.showMessageDialog(null, "Proveedor Modificados Exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                mBD.desconectar();// se desconecta
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor completa los campos");
            TXT_Id_Proveedor.requestFocus();
        }
    }//GEN-LAST:event_TXT_ModificarProveedorActionPerformed

    private void TXT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_TXT_SalirActionPerformed
   
    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        FRM_CatalogoProveedor FormCP = new FRM_CatalogoProveedor();
        FormCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        modeloTabla = (DefaultTableModel) JTableProveedor.getModel();
        int a = modeloTabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
        }

        if (mBD.conectar()) {
            ArrayList mListaProveedores = mBD.consultarProveedores();
            String[] Datos;

            for (Object mListaProveedor : mListaProveedores) {
                Datos = new String[3];
                mProveedor = (Proveedor) mListaProveedor;
                Datos[0] = "" + mProveedor.getId_proveedor();
                Datos[1] = mProveedor.getNombre();
                Datos[2] = mProveedor.getEmpresa();

                modeloTabla.addRow(Datos);
            }
            this.JTableProveedor = new javax.swing.JTable();
            this.JTableProveedor.setModel(modeloTabla);
            this.JTableProveedor.getColumnModel().getColumn(0).setPreferredWidth(100);
            this.JTableProveedor.getColumnModel().getColumn(1).setPreferredWidth(300);
            this.JTableProveedor.getColumnModel().getColumn(2).setPreferredWidth(300);
            if (this.JTableProveedor.getRowCount() > 0) {
                this.JTableProveedor.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar proveedor");
        }
        mBD.desconectar();
    }//GEN-LAST:event_formWindowActivated
    //metodos para valiadar cajas de texto es uno para cada caja de texto... Juanes
    // Id_Proveedor
    public boolean ValidarId_Proveedor() {
        if (TXT_Id_Proveedor.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    // Nuevo Nombre Proveedor
    public boolean ValidarNuevoNombreProveedor() {
        if (TXT_NuevoNombreProveedor.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    //Nueva Empresa
    public boolean ValidarNuevaEmpresa() {
        if (TXT_NuevaEmpresa.getText().equals("")) {
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
    private javax.swing.JTable JTableProveedor;
    private javax.swing.JLabel LBL_Id_Proveedor;
    private javax.swing.JLabel LBL_NuevaEmpresaProveedor;
    private javax.swing.JLabel LBL_NuevoNombreProveedor;
    private javax.swing.JTextField TXT_Id_Proveedor;
    private javax.swing.JButton TXT_ModificarProveedor;
    private javax.swing.JTextField TXT_NuevaEmpresa;
    private javax.swing.JTextField TXT_NuevoNombreProveedor;
    private javax.swing.JButton TXT_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
