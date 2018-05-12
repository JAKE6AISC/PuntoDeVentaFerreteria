/*
 * José Andrés Chávez Hernández
 * Formulario para generar el reporte de ventas
 */
package jake_optimizacion_venta;

<<<<<<< HEAD
import java.util.ArrayList;
import javax.swing.JOptionPane;
=======
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andy
 */
public class FRM_ReporteVentas extends javax.swing.JFrame {
    BaseDeDatos mBD = new BaseDeDatos();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    /**
     * Creates new form FRM_ReporteVentas
     */
    public FRM_ReporteVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    DefaultTableModel ModeloTabla = new DefaultTableModel();
      BaseDeDatos mBaseDeDatos= new BaseDeDatos();
    Producto mProducto = new Producto();
    Proveedor mProveedor = new Proveedor();
    Venta mVenta = new Venta();
    FRM_Venta mFRMV = new FRM_Venta();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Atras = new javax.swing.JButton();
        BTN_GenerarReporte = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
<<<<<<< HEAD
        TXTTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BTNMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reporte = new javax.swing.JTable();
=======
        TXT_Fecha = new javax.swing.JTextField();
        LBL_Fecha = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXT_Fech2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_Atras.setText("Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        BTN_GenerarReporte.setText("Generar");
        BTN_GenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GenerarReporteActionPerformed(evt);
            }
        });

        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Total");
=======
        LBL_Fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBL_Fecha.setText("Fecha: ");
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setForeground(new java.awt.Color(51, 255, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reporte De Ventas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ferretería Juanes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
<<<<<<< HEAD
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BTNMostrar.setText("Mostrar");
        BTNMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMostrarActionPerformed(evt);
            }
        });

        Reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Reporte);
=======
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("al");
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(TXTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BTN_Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(BTN_ImprimirReporte)
                        .addGap(154, 154, 154)
                        .addComponent(BTN_Salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BTNMostrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBL_Fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Fech2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_Atras))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_GenerarReporte)
                    .addComponent(BTN_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
<<<<<<< HEAD
                .addComponent(BTNMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
=======
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Fecha)
                    .addComponent(TXT_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_GenerarReporte)
                    .addComponent(TXT_Fech2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
<<<<<<< HEAD
                .addGap(24, 24, 24)
=======
                .addGap(62, 62, 62)
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Salir)
                    .addComponent(BTN_Atras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void BTN_ImprimirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImprimirReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ImprimirReporteActionPerformed

    private void BTNMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMostrarActionPerformed
         
        float Cantidad = 0;
        float Total = 0;
        float PrecioUnitario;
        float SubTotal = 0;
        
    
       ModeloTabla.setColumnCount(0);
       ModeloTabla.setRowCount(0);
       mBaseDeDatos.desconectar();
        if(mBaseDeDatos.conectar()){
            String [] Datos;
            
           ModeloTabla.addColumn("Fecha");
           ModeloTabla.addColumn("Codigo");
           ModeloTabla.addColumn("Clasificacion");
           ModeloTabla.addColumn("Cantidad");
           ModeloTabla.addColumn("P.Unitario");
           ModeloTabla.addColumn("SubTotal");
                  
                Datos = new String[6];
           
                Datos[0] = "" + (mVenta.getFecha());
                Datos[1] = "" + (mFRMV.TXT_Escaner());
                Datos[2] = mProducto.getClasificacion();
                Datos[3] = "" + (Integer.ParseInt(mFRMV.TXT_Cant.getText()));
                Datos[4] = Float.toString(mProducto.getPrecio());
                Datos[5] = Float.toString(SubTotal);
                SubTotal = (Integer.ParseInt(mFRMV.TXT_Cant.getText())) * Float.toString(mProducto.getPrecio());
                ModeloTabla.addRow(Datos);

            this.Reporte = new javax.swing.JTable();
            this.Reporte.setModel(ModeloTabla);
            this.Reporte.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Reporte.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Reporte.getColumnModel().getColumn(2).setPreferredWidth(150);
            this.Reporte.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.Reporte.getColumnModel().getColumn(4).setPreferredWidth(250);
            this.Reporte.getColumnModel().getColumn(5).setPreferredWidth(300);
            

            if (this.Reporte.getRowCount() > 0)
            {
                this.Reporte.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
        } 
        
    }//GEN-LAST:event_BTNMostrarActionPerformed
    
    
    public void Llenado(){
       
        
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
      float SubTotal = 0;
        ArrayList ListaProductos;
        ModeloTabla.setColumnCount(0);
        ModeloTabla.setRowCount(0);
        mBaseDeDatos.desconectar();
        if(mBaseDeDatos.conectar()){
            ArrayList CatalogoBD = null;
            String [] Datos;
 
            
           ModeloTabla.addColumn("Fecha");
           ModeloTabla.addColumn("Codigo");
           ModeloTabla.addColumn("Clasificacion");
           ModeloTabla.addColumn("Cantidad");
           ModeloTabla.addColumn("P.Unitario");
           ModeloTabla.addColumn("SubTotal");
           
                Datos = new String[6];
                ListaProductos = mBaseDeDatos.consultarProductos();
                for(int i=0; i<ListaProductos.size(); i++) { 
                    mProducto = (Producto)ListaProductos.get(i);
                
                   Datos[0] = "" + (mVenta.getFecha());
                Datos[1] = "" + (mFRMV.TXT_Escaner());
                Datos[2] = mProducto.getClasificacion();
                Datos[3] = "" + (Integer.ParseInt(mFRMV.TXT_Cant));
                Datos[4] = "" + Float.toString(mProducto.getPrecio());
                Datos[5] = Float.toString(SubTotal);
                SubTotal = (Integer.ParseInt(mFRMV.TXT_Cant)) * Float.toString(mProducto.getPrecio());
                
                    
                    
                
                    ModeloTabla.addRow(Datos);
                }

            this.Reporte = new javax.swing.JTable();
            this.Reporte.setModel(ModeloTabla);
            this.Reporte.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Reporte.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Reporte.getColumnModel().getColumn(2).setPreferredWidth(150);
            this.Reporte.getColumnModel().getColumn(3).setPreferredWidth(200);
            this.Reporte.getColumnModel().getColumn(4).setPreferredWidth(250);
            this.Reporte.getColumnModel().getColumn(5).setPreferredWidth(300);
            
            

            if (this.Reporte.getRowCount() > 0)
            {
                this.Reporte.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
        }
    }    
    
   
=======
    private void BTN_GenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GenerarReporteActionPerformed
        String path = "/Users/KevinCruz/OP/PuntoDeVentaFerreteria/JAKE_Optimizacion_Venta/src/jake_optimizacion_venta/ReporteDeVentas.jasper";
        JasperReport jr = null;
        Map parametros = new HashMap();
        
        try {
            parametros.put("fech", TXT_Fecha.getText());
            parametros.put("fech2", TXT_Fech2.getText());
            jr = (JasperReport) JRLoader.loadObjectFromLocation(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, mBD.conectare());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle(path);
        } catch (JRException ex) {
            Logger.getLogger(FRM_ReporteVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_GenerarReporteActionPerformed

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        Menu mMenu = new Menu();
        mMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_SalirActionPerformed
        
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3
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
            java.util.logging.Logger.getLogger(FRM_ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ReporteVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNMostrar;
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_GenerarReporte;
    private javax.swing.JButton BTN_Salir;
<<<<<<< HEAD
    private javax.swing.JTable Reporte;
    private javax.swing.JTextField TXTTotal;
=======
    private javax.swing.JLabel LBL_Fecha;
    private javax.swing.JTextField TXT_Fech2;
    private javax.swing.JTextField TXT_Fecha;
>>>>>>> 548000ba39a0dddd71cb38ae9d0a0eb3069e2ea3
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
