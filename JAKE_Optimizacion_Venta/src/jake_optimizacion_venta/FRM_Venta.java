package jake_optimizacion_venta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanez
 */
public class FRM_Venta extends javax.swing.JFrame {
    DefaultTableModel Tabla = new DefaultTableModel();
    BaseDeDatos mBD = new BaseDeDatos();
   // Producto mProducto = new Producto();
    double Total = 0;
    double SubTotal = 0;
    Producto mProducto;
    List < Producto> ListaProductos;
     private Connection conexion;
     String Precio = "", Nombre="";
     int Cantidad = 1;
    public FRM_Venta() {
        Tabla.addColumn("Nombre");
        Tabla.addColumn("Precio");
        Tabla.addColumn("Cantidad");
        Tabla.addColumn("Sub Total");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Venta = new javax.swing.JTable();
        TXT_Escaner = new javax.swing.JTextField();
        TXT_Total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTN_AgregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBL_Venta.setModel(Tabla);
        jScrollPane1.setViewportView(TBL_Venta);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Total   $");

        BTN_AgregarProducto.setText("Agregar Producto");
        BTN_AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_AgregarProducto)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_AgregarProducto)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarProductoActionPerformed
        try {
            AgregarProducto();
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenarTabla();
    }//GEN-LAST:event_BTN_AgregarProductoActionPerformed
     public void AgregarProducto() throws SQLException{
        String Id = TXT_Escaner.getText();
        Statement consulta;
        ResultSet resultado;
            consulta = conexion.createStatement();
            if (mBD.conectar()) {
              resultado = consulta.executeQuery("select * from puntoventa.producto " + 
                    "where id_producto = '" + Id + "';");
               if (resultado.next()) {
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setPrecio(resultado.getInt("precio"));
                ListaProductos.add(mProducto);
            }
         }
    }
      public void LlenarTabla(){
       
        Object[][] Matriz = new Object [ListaProductos.size()][4];

        for(int i =0; i<ListaProductos.size();i++){
            Matriz[i][0] = ListaProductos.get(i).getNombre();
            Matriz[i][1] = ListaProductos.get(i).getPrecio();
            Matriz[i][2] = "1";
            Matriz[i][3] = ListaProductos.get(i).getPrecio();
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
            java.util.logging.Logger.getLogger(FRM_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AgregarProducto;
    private javax.swing.JTable TBL_Venta;
    private javax.swing.JTextField TXT_Escaner;
    private javax.swing.JTextField TXT_Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
