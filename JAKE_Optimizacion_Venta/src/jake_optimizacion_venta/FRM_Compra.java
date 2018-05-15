/*
 * Kevin Fabián Cruz Gómez
 * Formulario para la compra de productos
 */
package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCruz
 */
public class FRM_Compra extends javax.swing.JFrame {

    BaseDeDatos mBD = new BaseDeDatos();
    Compra mCompra = new Compra();
    Producto mProducto = new Producto();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    ArrayList mListaProductos = new ArrayList();
    private float Total;
    private int Cantidad;
    private float Precio;

    /**
     * Creates new form FRM_Compra
     */
    public FRM_Compra() {
        initComponents();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Clasificación");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Precio");
        Total = 0;
        Cantidad = 0;
        Precio = 0;
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

        jLabel2 = new javax.swing.JLabel();
        BTN_Atras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LBL_date = new javax.swing.JLabel();
        BTN_Salir = new javax.swing.JButton();
        BTN_Comprar = new javax.swing.JButton();
        TXT_Cantidad = new javax.swing.JTextField();
        LBL_Total = new javax.swing.JLabel();
        TXT_Costo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_prod = new javax.swing.JTable();
        LBL_producto = new javax.swing.JLabel();
        BTN_Agregar = new javax.swing.JButton();
        LBL_Cantidad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LBL_Sub = new javax.swing.JLabel();
        TXT_Nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LBL_ID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setText("Total: ");

        BTN_Atras.setText("Atrás");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ferretería Juanes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Compra de Productos");

        LBL_date.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        LBL_date.setText("                        ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                        .addComponent(LBL_date, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LBL_date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        BTN_Comprar.setText("Comprar");
        BTN_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ComprarActionPerformed(evt);
            }
        });

        TXT_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_CantidadKeyTyped(evt);
            }
        });

        LBL_Total.setText("    ");

        TXT_Costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_CostoKeyTyped(evt);
            }
        });

        TBL_prod.setModel(modeloTabla);
        jScrollPane1.setViewportView(TBL_prod);

        LBL_producto.setText("Nombre:");

        BTN_Agregar.setText("Agregar");
        BTN_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarActionPerformed(evt);
            }
        });

        LBL_Cantidad.setText("Cantidad: ");

        jLabel5.setText("Subtotal: ");

        jLabel1.setText("Costo: ");

        LBL_Sub.setText(" ");

        TXT_Nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_NomFocusLost(evt);
            }
        });

        jLabel6.setText("ID:");

        LBL_ID.setText("*****");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBL_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBL_Cantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TXT_Cantidad)
                        .addComponent(TXT_Costo)
                        .addComponent(LBL_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBL_Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXT_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBL_ID))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BTN_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(113, 113, 113)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTN_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_Comprar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(23, 23, 23)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(TXT_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LBL_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_producto)
                            .addComponent(TXT_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXT_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LBL_Cantidad)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LBL_Sub))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LBL_Total))))
                .addGap(0, 154, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_Agregar)
                        .addComponent(BTN_Comprar))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_Atras)
                        .addComponent(BTN_Salir))
                    .addGap(13, 13, 13)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        Menu mMenu = new Menu();
        mMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void BTN_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ComprarActionPerformed
        if (mBD.conectar()) {
            if (ValidarCajas()) {
                if (mBD.realizarCompra(mCompra)) {
                    if (mBD.realizarDetalleCompra(mProducto, Cantidad)) {
                        if (mBD.incrementarProductos(mListaProductos)) {
                            JOptionPane.showMessageDialog(null, "Compra realizada con éxito!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al comprar");
                        }
                    }
                }
                mBD.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor llena los campos para comprar");
            }
        }
    }//GEN-LAST:event_BTN_ComprarActionPerformed

    private void BTN_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarActionPerformed
        int idtemp = 0;
        float costo = 0;
        float totaltemp = 0;
        mProducto = new Producto();

        if (ValidarCajas()) {
            if (Precio > Float.parseFloat(TXT_Costo.getText()) && (Float.parseFloat(TXT_Costo.getText()) > 0)) {
                costo = (Float.parseFloat(TXT_Costo.getText())) * (Integer.parseInt(TXT_Cantidad.getText()));
                LBL_Sub.setText(String.valueOf(costo));
                Cantidad = Integer.parseInt(TXT_Cantidad.getText());
                idtemp = Integer.parseInt(LBL_ID.getText());

                mProducto.setId_Producto(idtemp);
                mProducto.setPrecio(Float.parseFloat(TXT_Costo.getText()));
                mProducto.setExistencias(Cantidad);
                mListaProductos.add(mProducto);
                mCompra.setProductos(mListaProductos);

                totaltemp = Float.parseFloat(String.valueOf(LBL_Sub.getText()));
                Total = Total + totaltemp;
                LBL_Total.setText(String.valueOf(String.format("%.2f", Total)));

                mCompra.setTotal(Total);
            } else {
                JOptionPane.showMessageDialog(null, "Atención el costo de compra no \n"
                        + "puede ser mayor al precio del producto");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Porfavor completa los campos");
        }
        consultarTabla();
    }//GEN-LAST:event_BTN_AgregarActionPerformed

    public boolean ValidarCajas() {
        return !(TXT_Nom.getText().equals("") && TXT_Costo.getText().equals("")
                && TXT_Cantidad.getText().equals(""));
    }

    private void TXT_NomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_NomFocusLost
        modeloTabla = (DefaultTableModel) TBL_prod.getModel();
        int a = modeloTabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
        }
        if (mBD.conectar()) {

            String[] Datos = new String[5];

            mProducto = mBD.consultarProducto(TXT_Nom.getText(), "");

            Datos[0] = "" + mProducto.getId_Producto();
            LBL_ID.setText(String.valueOf(mProducto.getId_Producto()));
            Datos[1] = mProducto.getNombre();
            Datos[2] = mProducto.getClasificacion();
            Datos[3] = mProducto.getTipo();
            Datos[4] = "" + mProducto.getPrecio();
            Precio = mProducto.getPrecio();

            modeloTabla.addRow(Datos);

            this.TBL_prod = new javax.swing.JTable();
            this.TBL_prod.setModel(modeloTabla);
            this.TBL_prod.getColumnModel().getColumn(0).setPreferredWidth(100);
            this.TBL_prod.getColumnModel().getColumn(1).setPreferredWidth(200);
            this.TBL_prod.getColumnModel().getColumn(2).setPreferredWidth(400);
            this.TBL_prod.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.TBL_prod.getColumnModel().getColumn(4).setPreferredWidth(300);
            if (this.TBL_prod.getRowCount() > 0) {
                this.TBL_prod.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar producto");
        }
    }//GEN-LAST:event_TXT_NomFocusLost

    public void consultarTabla() {
        LBL_date.setText(mCompra.getFecha());
        modeloTabla = (DefaultTableModel) TBL_prod.getModel();
        int a = modeloTabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
        }
        if (mBD.conectar()) {

            ArrayList mLista = mBD.consultarProductos();
            String[] Datos;

            for (Object mListaProducto : mLista) {
                Datos = new String[5];
                mProducto = (Producto) mListaProducto;
                Datos[0] = "" + mProducto.getId_Producto();
                Datos[1] = mProducto.getNombre();
                Datos[2] = mProducto.getClasificacion();
                Datos[3] = mProducto.getTipo();
                Datos[4] = "" + mProducto.getPrecio();

                modeloTabla.addRow(Datos);
            }
            this.TBL_prod = new javax.swing.JTable();
            this.TBL_prod.setModel(modeloTabla);
            this.TBL_prod.getColumnModel().getColumn(0).setPreferredWidth(100);
            this.TBL_prod.getColumnModel().getColumn(1).setPreferredWidth(200);
            this.TBL_prod.getColumnModel().getColumn(2).setPreferredWidth(400);
            this.TBL_prod.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.TBL_prod.getColumnModel().getColumn(4).setPreferredWidth(300);
            if (this.TBL_prod.getRowCount() > 0) {
                this.TBL_prod.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar producto");
        }
    }
    private void TXT_CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_CantidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_CantidadKeyTyped

    private void TXT_CostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_CostoKeyTyped
        if (TXT_Costo.getText().contains(".")) {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_TXT_CostoKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        LBL_date.setText(mCompra.getFecha());
        modeloTabla = (DefaultTableModel) TBL_prod.getModel();
        int a = modeloTabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
        }
        if (mBD.conectar()) {

            ArrayList mLista = mBD.consultarProductos();
            String[] Datos;

            for (Object mListaProducto : mLista) {
                Datos = new String[5];
                mProducto = (Producto) mListaProducto;
                Datos[0] = "" + mProducto.getId_Producto();
                Datos[1] = mProducto.getNombre();
                Datos[2] = mProducto.getClasificacion();
                Datos[3] = mProducto.getTipo();
                Datos[4] = "" + mProducto.getPrecio();

                modeloTabla.addRow(Datos);
            }
            this.TBL_prod = new javax.swing.JTable();
            this.TBL_prod.setModel(modeloTabla);
            this.TBL_prod.getColumnModel().getColumn(0).setPreferredWidth(100);
            this.TBL_prod.getColumnModel().getColumn(1).setPreferredWidth(200);
            this.TBL_prod.getColumnModel().getColumn(2).setPreferredWidth(400);
            this.TBL_prod.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.TBL_prod.getColumnModel().getColumn(4).setPreferredWidth(300);
            if (this.TBL_prod.getRowCount() > 0) {
                this.TBL_prod.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar producto");
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FRM_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_Comprar;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JLabel LBL_Cantidad;
    private javax.swing.JLabel LBL_ID;
    private javax.swing.JLabel LBL_Sub;
    private javax.swing.JLabel LBL_Total;
    private javax.swing.JLabel LBL_date;
    private javax.swing.JLabel LBL_producto;
    private javax.swing.JTable TBL_prod;
    private javax.swing.JTextField TXT_Cantidad;
    private javax.swing.JTextField TXT_Costo;
    private javax.swing.JTextField TXT_Nom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
