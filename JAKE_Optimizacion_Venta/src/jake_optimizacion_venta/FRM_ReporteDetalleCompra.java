/*
 * Kevin Fabián Cruz Gómez
 * Formulario de Reporte de Ventas
 */
package jake_optimizacion_venta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author KevinCruz
 */
public class FRM_ReporteDetalleCompra extends javax.swing.JFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    BaseDeDatos mBD = new BaseDeDatos();
    Compra mCompra = new Compra();

    /**
     * Creates new form FRM_ReporteDetalleCompra
     */
    public FRM_ReporteDetalleCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        modeloTabla.addColumn("Id_Compra");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Total");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        BTNseleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        BTNatras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNsalir = new javax.swing.JButton();
        TXT_IDCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel3.setText("ID Compra: ");

        BTNseleccionar.setText("Seleccionar Compra");
        BTNseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNseleccionarActionPerformed(evt);
            }
        });

        tblCompras.setModel(modeloTabla);
        jScrollPane1.setViewportView(tblCompras);

        BTNatras.setText("Atrás");
        BTNatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNatrasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ferretería Juanes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle de Compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        BTNsalir.setText("Salir");
        BTNsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsalirActionPerformed(evt);
            }
        });

        TXT_IDCompra.setText("   ");
        TXT_IDCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_IDCompraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_IDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTNseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNatras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNsalir)))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_IDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BTNseleccionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNsalir)
                    .addComponent(BTNatras))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNseleccionarActionPerformed
        String path = "/Users/KevinCruz/PV/PuntoDeVentaFerreteria/JAKE_Optimizacion_Venta/src/jake_optimizacion_venta/ReporteDetCompra.jasper";
        JasperReport jr = null;
        Map parametros = new HashMap();

        try {
            parametros.put("ID", TXT_IDCompra.getText());
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, mBD.conectare());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle(path);
        } catch (JRException ex) {
            Logger.getLogger(FRM_ReporteDetalleCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNseleccionarActionPerformed

    private void BTNatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNatrasActionPerformed
        Menu mMenu = new Menu();
        mMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNatrasActionPerformed

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTNsalirActionPerformed

    private void TXT_IDCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_IDCompraKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_IDCompraKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.TXT_IDCompra.setText("");
        modeloTabla = (DefaultTableModel) tblCompras.getModel();
        int a = modeloTabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
        }
        if (mBD.conectar()) {
            String[] dato;

            dato = new String[5];
            ArrayList mListaCompras = mBD.consultarCompras();
            for (Object mListaCompra : mListaCompras) {
                mCompra = (Compra) mListaCompra;
                dato[0] = "" + (mCompra.getId_Compra());
                dato[1] = mCompra.getFecha();
                dato[2] = "" + (mCompra.getTotal());

                modeloTabla.addRow(dato);
            }

            this.tblCompras.setModel(modeloTabla);
            this.tblCompras.getColumnModel().getColumn(0).setPreferredWidth(200);
            this.tblCompras.getColumnModel().getColumn(1).setPreferredWidth(200);
            this.tblCompras.getColumnModel().getColumn(2).setPreferredWidth(200);

            if (this.tblCompras.getRowCount() > 0) {
                this.tblCompras.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en la Base de Datos");
        }
        mBD.desconectar();
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
            java.util.logging.Logger.getLogger(FRM_ReporteDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ReporteDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ReporteDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ReporteDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ReporteDetalleCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNatras;
    private javax.swing.JButton BTNsalir;
    private javax.swing.JButton BTNseleccionar;
    private javax.swing.JTextField TXT_IDCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCompras;
    // End of variables declaration//GEN-END:variables
}
