/*
 * Kevin Fabián Cruz Gómez
 * Formulario para dar de baja un producto
 */
package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KevinCruz
 */
public class FRM_BajaProductos extends javax.swing.JFrame {
    Producto mProducto = new Producto();
    BaseDeDatos mBD = new BaseDeDatos();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    /**
     * Creates new form FRM_BajaProductos
     */
    public FRM_BajaProductos() {
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

        LBLid = new javax.swing.JLabel();
        TXT_idProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Bajas = new javax.swing.JTable();
        BTN_atras = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();
        BTN_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBLid.setText("ID_Producto: ");

        JTable_Bajas.setModel(modeloTabla);
        JTable_Bajas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTable_BajasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Bajas);

        BTN_atras.setText("Atrás");
        BTN_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_atrasActionPerformed(evt);
            }
        });

        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });

        BTN_salir.setText("Salir");
        BTN_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_atras)
                        .addGap(75, 75, 75)
                        .addComponent(BTN_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLid)
                    .addComponent(TXT_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_atras)
                    .addComponent(BTN_Eliminar)
                    .addComponent(BTN_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed
        mProducto.setId_Producto(Integer.parseInt(this.TXT_idProducto.getText())); //Se obtiene el id para eliminar el producto deseado
        if (mBD.conectar()) { //Método para conectar con la base de datos
            if (mBD.eliminarProducto(mProducto)) { //Método que recibe un entero y elimina el proveedor de la base de datos
                JOptionPane.showMessageDialog(null, "Producto Eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
            mBD.desconectar();
        }
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void JTable_BajasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTable_BajasKeyPressed
        if(mBD.conectar()){
           ArrayList mListaProductos = mBD.consultarProductos();  
            String [] Datos;
        
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Clasificación");
            modeloTabla.addColumn("Tipo");
            modeloTabla.addColumn("Precio");
            
            for (Object mListaProductos : mListaProductos) {
                Datos = new String[5];
                mProducto = (Producto)mListaProductos;
                Datos[0] = "" + mProducto.getId_Producto();
                Datos[1] = mProducto.getNombre();
                Datos[2] = mProducto.getClasificacion();
                Datos[3] = mProducto.getTipo();
                Datos[4] = "" + mProducto.getPrecio();
            
                modeloTabla.addRow(Datos);
            } 
            this.JTable_Bajas = new javax.swing.JTable();
            this.JTable_Bajas.setModel(modeloTabla);
            this.JTable_Bajas.getColumnModel().getColumn(0).setPreferredWidth(100);
            this.JTable_Bajas.getColumnModel().getColumn(1).setPreferredWidth(200);
            this.JTable_Bajas.getColumnModel().getColumn(2).setPreferredWidth(400);
            this.JTable_Bajas.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.JTable_Bajas.getColumnModel().getColumn(4).setPreferredWidth(300);
            if (this.JTable_Bajas.getRowCount() > 0) {
            this.JTable_Bajas.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar producto");
            }
        mBD.desconectar();
        
    }//GEN-LAST:event_JTable_BajasKeyPressed

    private void BTN_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_atrasActionPerformed
        FRM_CatalogoProductos FormCP = new FRM_CatalogoProductos();
        FormCP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_atrasActionPerformed

    private void BTN_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_salirActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_BTN_salirActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_BajaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_BajaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_BajaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_BajaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_BajaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_atras;
    private javax.swing.JButton BTN_salir;
    private javax.swing.JTable JTable_Bajas;
    private javax.swing.JLabel LBLid;
    private javax.swing.JTextField TXT_idProducto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
