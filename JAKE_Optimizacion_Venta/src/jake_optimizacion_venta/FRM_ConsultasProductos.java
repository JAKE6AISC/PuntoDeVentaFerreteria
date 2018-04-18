/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//María Eneida Salas Martínez
//Se añadio el formulario FRM_ConsultasProducto solo Diseño
//***Se agrego la codificación del Botón Buscar tanto para busueda por el nombre como por el tipo
//***Se agrego el evento activar ventana para mostrar la lista de productos
package jake_optimizacion_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ene
 */
public class FRM_ConsultasProductos extends javax.swing.JFrame {
DefaultTableModel ModeloTabla = new DefaultTableModel();
 BaseDeDatos mBaseDeDatos= new BaseDeDatos();
 Producto mProducto = new Producto();
    /**
     * Creates new form FRM_ConsultasProductos
     */
    public FRM_ConsultasProductos() {
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

        TXT_Tipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_Nombre = new javax.swing.JTextField();
        BTN_Buscar = new javax.swing.JButton();
        BTN_Atras = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Nombre Producto");

        jLabel2.setText("Tipo");

        BTN_Buscar.setText("Buscar");
        BTN_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_BuscarMouseClicked(evt);
            }
        });
        BTN_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarActionPerformed(evt);
            }
        });

        BTN_Atras.setText("Atras");

        BTN_Salir.setText("Salir");

        jScrollPane1.setViewportView(JTableProductos);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ferretería Juanes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consulta de Producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(TXT_Tipo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(BTN_Atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_Salir)))
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Buscar)
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Atras)
                    .addComponent(BTN_Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_BuscarMouseClicked
        // TODO add your handling code here:
       String nombre = (TXT_Nombre.getText().toUpperCase());
       String tipo = (TXT_Tipo.getText().toUpperCase());
       ModeloTabla.setColumnCount(0);
       ModeloTabla.setRowCount(0);
       mBaseDeDatos.desconectar();
        if(mBaseDeDatos.conectar()){
            ArrayList CatalogoBD = null;
            String [] Dato;
            
           ModeloTabla.addColumn("id_producto");
           ModeloTabla.addColumn("precio");
           ModeloTabla.addColumn("nombre");
           ModeloTabla.addColumn("tipo");
           ModeloTabla.addColumn("clasificacion");
           
            
                  
                Dato = new String[5];
           
                mProducto = mBaseDeDatos.consultarProducto(nombre);
                mProducto = mBaseDeDatos.consultarProducto2(tipo);
                
                Dato[0] = "" + (mProducto.getId_Producto());
                Dato[1] = "" + (mProducto.getPrecio());
                Dato[2] = mProducto.getNombre();
                Dato[3] = mProducto.getTipo();
                Dato[4] = mProducto.getClasificacion();
               
                
                ModeloTabla.addRow(Dato);

            this.JTableProductos = new javax.swing.JTable();
            this.JTableProductos.setModel(ModeloTabla);
            this.JTableProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.JTableProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.JTableProductos.getColumnModel().getColumn(2).setPreferredWidth(150);
            this.JTableProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.JTableProductos.getColumnModel().getColumn(4).setPreferredWidth(250);
            
            

            if (this.JTableProductos.getRowCount() > 0)
            {
                this.JTableProductos.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
        } 


    }//GEN-LAST:event_BTN_BuscarMouseClicked

    private void BTN_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_BuscarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ArrayList ListaProductos;
        ModeloTabla.setColumnCount(0);
        ModeloTabla.setRowCount(0);
        mBaseDeDatos.desconectar();
        if(mBaseDeDatos.conectar()){
            ArrayList CatalogoBD = null;
            String [] Dato;
 
            
           ModeloTabla.addColumn("id_producto");
           ModeloTabla.addColumn("precio");
           ModeloTabla.addColumn("nombre");
           ModeloTabla.addColumn("tipo");
           ModeloTabla.addColumn("clasificacion");
           
            
                  
                Dato = new String[5];
                ListaProductos = mBaseDeDatos.consultarProductos();
                for(int i=0; i<ListaProductos.size(); i++) { 
                    mProducto = (Producto)ListaProductos.get(i);
                
                    Dato[0] = "" + (mProducto.getId_Producto());
                    Dato[1] = "" + (mProducto.getPrecio());
                    Dato[2] = mProducto.getNombre();
                    Dato[3] = mProducto.getTipo();
                    Dato[4] = mProducto.getClasificacion();
                    
                    
                
                    ModeloTabla.addRow(Dato);
                }

            this.JTableProductos= new javax.swing.JTable();
            this.JTableProductos.setModel(ModeloTabla);
            this.JTableProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.JTableProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.JTableProductos.getColumnModel().getColumn(2).setPreferredWidth(150);
            this.JTableProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.JTableProductos.getColumnModel().getColumn(4).setPreferredWidth(250);
            
            
            

            if (this.JTableProductos.getRowCount() > 0)
            {
                this.JTableProductos.setRowSelectionInterval(0, 0);
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
            java.util.logging.Logger.getLogger(FRM_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ConsultasProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JTable JTableProductos;
    private javax.swing.JTextField TXT_Nombre;
    private javax.swing.JTextField TXT_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}