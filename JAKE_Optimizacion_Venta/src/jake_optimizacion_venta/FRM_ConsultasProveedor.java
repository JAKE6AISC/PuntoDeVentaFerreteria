/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//María Eneida Salas Martínez 
//El diseño del formulario FRM_ConsultasProveedores
//***Se agrego la codificación del Botón Buscar
//***Se agrego el evento activar ventana para mostrar la lista de proveedores 
package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ene
 */
public class FRM_ConsultasProveedor extends javax.swing.JFrame {

    DefaultTableModel ModeloTabla = new DefaultTableModel();
    BaseDeDatos mBaseDeDatos = new BaseDeDatos();
    Proveedor mProveedor = new Proveedor();

    /**
     * Creates new form FRM_ConsultasProveedor
     */
    public FRM_ConsultasProveedor() {
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

        TXT_Id_Proveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTN_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProveedor = new javax.swing.JTable();
        BTN_Atras = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TXT_Id_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Id_ProveedorActionPerformed(evt);
            }
        });

        jLabel1.setText("id_Proveedor");

        BTN_Buscar.setText("Buscar");
        BTN_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarActionPerformed(evt);
            }
        });

        JTableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTableProveedor);

        BTN_Atras.setText("Atras");

        BTN_Salir.setText("Salir");

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ferretería Juanes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consulta de Proveedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(BTN_Buscar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(BTN_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(BTN_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Id_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Atras)
                    .addComponent(BTN_Salir))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_Id_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Id_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Id_ProveedorActionPerformed

    private void BTN_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarActionPerformed
       // Añadido para pruebas de commit de Eneida
       
        int id_proveedor = Integer.parseInt(TXT_Id_Proveedor.getText().toUpperCase());
       ModeloTabla.setColumnCount(0);
        ModeloTabla.setRowCount(0);
        if(mBaseDeDatos.conectar()){
        //int id_proveedor = Integer.parseInt(TXT_Id_Proveedor.getText().toUpperCase());
        if (mBaseDeDatos.conectar()) {
            ArrayList Catalogo = null;
            String[] Dato;

            ModeloTabla.addColumn("id_proveedor");
            ModeloTabla.addColumn("nombre");
            ModeloTabla.addColumn("empresa");

            Dato = new String[3];

            mProveedor = mBaseDeDatos.consultarProveedor(id_proveedor);

            Dato[0] = "" + (mProveedor.getId_proveedor());
            Dato[1] = mProveedor.getNombre();
            Dato[2] = mProveedor.getEmpresa();

            ModeloTabla.addRow(Dato);

            this.JTableProveedor = new javax.swing.JTable();
            this.JTableProveedor.setModel(ModeloTabla);
            this.JTableProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.JTableProveedor.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.JTableProveedor.getColumnModel().getColumn(2).setPreferredWidth(150);

            if (this.JTableProveedor.getRowCount() > 0) {
                this.JTableProveedor.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
        }
        mBaseDeDatos.desconectar();
        }
    }//GEN-LAST:event_BTN_BuscarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ArrayList ListaProveedores;
        ModeloTabla.setColumnCount(0);
        ModeloTabla.setRowCount(0);
        mBaseDeDatos.desconectar();
        if(mBaseDeDatos.conectar()){
            ArrayList CatalogoBD = null;
            String [] Dato;
 
            
           ModeloTabla.addColumn("id_proveedor");
           ModeloTabla.addColumn("nombre");
           ModeloTabla.addColumn("empresa");
           //ModeloTabla.addColumn("id_producto");
            
                  
                Dato = new String[3];
                ListaProveedores = mBaseDeDatos.consultarProveedores();
                for(int i=0; i<ListaProveedores.size(); i++) { 
                    mProveedor = (Proveedor)ListaProveedores.get(i);
                
                    Dato[0] = "" + (mProveedor.getId_proveedor());
                    Dato[1] = mProveedor.getNombre();
                    Dato[2] = mProveedor.getEmpresa();
                
                    ModeloTabla.addRow(Dato);
                }

            this.JTableProveedor  = new javax.swing.JTable();
            this.JTableProveedor.setModel(ModeloTabla);
            this.JTableProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.JTableProveedor.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.JTableProveedor.getColumnModel().getColumn(2).setPreferredWidth(150);
            
            

            if (this.JTableProveedor.getRowCount() > 0)
            {
                this.JTableProveedor.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
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
            java.util.logging.Logger.getLogger(FRM_ConsultasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ConsultasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ConsultasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ConsultasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ConsultasProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JTable JTableProveedor;
    private javax.swing.JTextField TXT_Id_Proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
