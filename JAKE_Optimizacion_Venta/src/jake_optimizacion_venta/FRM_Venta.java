package jake_optimizacion_venta;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Juanez
 */
public class FRM_Venta extends javax.swing.JFrame {
    BaseDeDatos mBD = new BaseDeDatos();
    Venta mVenta = new Venta();
    DefaultTableModel TablasJuanes = new DefaultTableModel();
    Producto mProducto = new Producto();
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    Calendar fecha = Calendar.getInstance();
    float Total = 0,SubTotal = 0;
    String Precio = "", Nombre="",Id_Ultim = "";
    int Cant = 0;int Id_Venta = 0,Cont = 1, Anterior = 0;
    int year = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH) + 1;
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    int hora =fecha.get(Calendar.HOUR);
    int minutos =fecha.get(Calendar.MINUTE);
    String FechaActual = year + "-" + mes + "-" + dia;
    String Hora = hora + ":" + minutos;
    String Ruta = ""; 
    int ConsultaEx =0; 
    public FRM_Venta() {
        TablasJuanes.addColumn("Codigo de barras");
        TablasJuanes.addColumn("Nombre");
        TablasJuanes.addColumn("Precio");
        TablasJuanes.addColumn("Cantidad");
        TablasJuanes.addColumn("Sub Total");
        initComponents();
        ObternerId_Vtas();
        LBL_ID_Venta.setText(Id_Ultim);
        LBL_Fecha.setText(dia + "/" + mes + "/" + year);
        LBL_Hora.setText(Hora);
        
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
        TXT_Cant = new javax.swing.JTextField();
        BTN_Atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BTN_RealizarVenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LBL_Hora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LBL_ID_Venta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LBL_Fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBL_Venta.setModel(TablasJuanes);
        jScrollPane1.setViewportView(TBL_Venta);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Total   $");

        BTN_AgregarProducto.setText("Agregar Producto");
        BTN_AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarProductoActionPerformed(evt);
            }
        });

        TXT_Cant.setText(" ");

        BTN_Atras.setText("<< Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantiad de articulos");

        BTN_RealizarVenta.setText("Realizar Venta");
        BTN_RealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RealizarVentaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Fecha");

        LBL_Hora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LBL_Hora.setText("00:00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("No. Venta");

        LBL_ID_Venta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LBL_ID_Venta.setText(" ");

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 52));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ferretería Juanes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(641, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        LBL_Fecha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LBL_Fecha.setText("0000-00-00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_AgregarProducto)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48)
                                .addComponent(TXT_Cant, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BTN_RealizarVenta)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TXT_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(LBL_ID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_Fecha)
                        .addGap(31, 31, 31)
                        .addComponent(LBL_Hora)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Hora)
                    .addComponent(jLabel3)
                    .addComponent(LBL_ID_Venta)
                    .addComponent(jLabel4)
                    .addComponent(LBL_Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_AgregarProducto)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_RealizarVenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BTN_Atras)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObternerId_Vtas() {
      if(mBD.conectar()) {
            ArrayList ListaVentas = mBD.listaVentas();
            String [] DatosVenta;
        for (Object ListaVentasss : ListaVentas) {
            DatosVenta = new String[1];
            mVenta = (Venta)ListaVentasss;
            DatosVenta[0] = "" + mVenta.getId_Venta();
        } 
           Anterior = mVenta.getId_Venta() + 1;
           Id_Ultim = "" +  Anterior;
         }
      mBD.desconectar();
}
    private void BTN_AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarProductoActionPerformed
         if(mBD.conectar()){
            ArrayList ListaProductoss = mBD.listaProductos(TXT_Escaner.getText());
            ConsultaEx =  mBD.ConsultaExistencias(Integer.parseInt(TXT_Escaner.getText()));
            if (ConsultaEx > 0) {
                String [] DatosTabla;
                for (Object ListaProductos : ListaProductoss) {
                    DatosTabla = new String[5];
                    mProducto = (Producto)ListaProductos;
                    DatosTabla[0] = mProducto.getId_Producto() + "";
                    DatosTabla[1] = mProducto.getNombre();
                    DatosTabla[2] = mProducto.getPrecio() + "";
                    DatosTabla[3] = "1";
                    DatosTabla[4] = mProducto.getPrecio()+ "";
                    mBD.ModificarExistencias(mProducto.getId_Producto());
                    Total = Total + mProducto.getPrecio();
                    TXT_Total.setText(Total + "");
                    Cant = Cant + Integer.parseInt(DatosTabla[3]);
                    TXT_Cant.setText(Cant + "");
                    TablasJuanes.addRow(DatosTabla);
                    Cont++;
                }    
        
                this.TBL_Venta = new javax.swing.JTable();
                this.TBL_Venta.setModel(TablasJuanes);
                this.TBL_Venta.getColumnModel().getColumn(0).setPreferredWidth(50);
                this.TBL_Venta.getColumnModel().getColumn(1).setPreferredWidth(100);
                this.TBL_Venta.getColumnModel().getColumn(2).setPreferredWidth(150);
                this.TBL_Venta.getColumnModel().getColumn(3).setPreferredWidth(250);
                if (this.TBL_Venta.getRowCount() > 0) {
                    this.TBL_Venta.setRowSelectionInterval(0, 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto "
                + "especificado no tiene piezas disponibles en el Inventario");
            }
        }else {
            JOptionPane.showMessageDialog(null, ".....Error.....");
        }
     mBD.desconectar();
     
     
    }//GEN-LAST:event_BTN_AgregarProductoActionPerformed

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        Menu FormMenu = new Menu();
        FormMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_RealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RealizarVentaActionPerformed
        if (false) {
            JOptionPane.showMessageDialog(null, "Error imposible realizar venta\n"
                    + "el producto" + mProducto.getNombre() + " contiene " + 0 + " piezas"
                    + "en el inventario, si desea continuar con la compra no incluya este articulo");
        }else {
            LBL_ID_Venta.setText(Id_Ultim);
            mVenta.setFecha(FechaActual);
            mVenta.setId_Venta(Integer.parseInt(Id_Ultim));
            mVenta.setTotal((float)Total);
            if(mBD.conectar()) {
                if (mBD.realizarVenta(mVenta)) {
                    try {
                        Ruta = "tickets\\Ticket_venta_" + Id_Ultim + ".txt";
                        BufferedWriter ArchivoTXT = new BufferedWriter(new FileWriter(Ruta));
                        ArchivoTXT.write("Ferreteria Juanes ");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("!!!Gracias por su preferencia!!!");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("Rio Grande\tZacateas\tMexico\t");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("No. Venta " + Id_Ultim + "  \tFecha " + dia +"/"+mes+"/"+year + "\t Hora " + Hora);
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("Codigo\t\tDescrip\t\tPrecio\t\tCantid\t\tSubtotal");
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("\n____________________________________________________________________________");
                        ArchivoTXT.newLine();
                        String Tam = "";
                        for (int i = 0 ; i < TablasJuanes.getRowCount(); i++){ //realiza un barrido por filas.
                            for(int j = 0 ; j < TablasJuanes.getColumnCount();j++){ 
                                if (((String)(TablasJuanes.getValueAt(i,j))).length() > 6) {
                                    Tam =(String)(TablasJuanes.getValueAt(i,j)).toString().substring(0,5);
                                    ArchivoTXT.write(Tam);
                                    if (j < TablasJuanes.getColumnCount() -1) { //agrega separador "→" 
                                        ArchivoTXT.write("\t\t");
                                    }
                                }else{
                                    ArchivoTXT.write((String)(TablasJuanes.getValueAt(i,j)));
                                    if (j < TablasJuanes.getColumnCount() -1) { //agrega separador "→" 
                                        ArchivoTXT.write("\t\t");
                                    }
                                }
                                
                            }
                                ArchivoTXT.newLine();
                                ArchivoTXT.newLine();
                        }
                         ArchivoTXT.write("\n____________________________________________________________________________");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("\t\t\t\t   \tTotal a pagar: $" + Total + " MXN");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("Version del Software 1.0 todos los derechos reservados a JAKE\n\n");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("Software realizado por la organizacion JAKE\n\n");
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.newLine();
                        ArchivoTXT.write("!!! Gracias por su compra esperamos verlos pronto!!!");
                        ArchivoTXT.close(); //cierra archivo!
                        JOptionPane.showMessageDialog(null,"Venta Realizada\nTicket " + Id_Ultim + " Guardado");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage());
                    } 
                    VaciarCampos();
                
                } else {
                     JOptionPane.showMessageDialog(null, "Error");
        }
             mBD.desconectar();
             }
                ObternerId_Vtas();
                LBL_ID_Venta.setText(Id_Ultim);
        }
        
    }//GEN-LAST:event_BTN_RealizarVentaActionPerformed
     private void VaciarCampos() {
        TXT_Cant.setText("");
        TXT_Escaner.setText(""); 
        TXT_Total.setText("");
       for (int i = 0; i < TBL_Venta.getRowCount(); i++) {
                TablasJuanes.removeRow(i);
                i-=1;
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
    private javax.swing.JButton BTN_Atras;
    private javax.swing.JButton BTN_RealizarVenta;
    private javax.swing.JLabel LBL_Fecha;
    private javax.swing.JLabel LBL_Hora;
    private javax.swing.JLabel LBL_ID_Venta;
    private javax.swing.JTable TBL_Venta;
    private javax.swing.JTextField TXT_Cant;
    private javax.swing.JTextField TXT_Escaner;
    private javax.swing.JTextField TXT_Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
