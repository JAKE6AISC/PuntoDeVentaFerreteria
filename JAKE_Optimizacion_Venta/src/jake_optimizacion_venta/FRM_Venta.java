/*
 * Luis Osvaldo Juanes Hinojosa
 * Formulario para realizar la venta
*/
package jake_optimizacion_venta;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    float Total = 0;
    String Lugar = "Rio Grande Zacatecas", CP = "98403";
    String Id_Ultim = "";
    int Id_Venta = 0,Anterior = 0;
    int year = 0;
    int mes = 0;
    int dia = 0;
    int hora = 0;
    int minutos = 0;
    String FechaActual = year + "-" + mes + "-" + dia;
    String Hora = "";
    String Ruta = ""; 
    int ConsultaEx =0; 
    float efectivo,cambio;
    int Contador = 0;
    ArrayList<Integer> ArregloIdProd = new ArrayList<>();
    ArrayList<Float> ArregloPrecios = new ArrayList<>(); 
    public FRM_Venta() {
        TablasJuanes.addColumn("Codigo de barras");
        TablasJuanes.addColumn("Nombre");
        TablasJuanes.addColumn("Precio");
        TablasJuanes.addColumn("Cantidad");
        TablasJuanes.addColumn("Sub Total");
        initComponents();
        ObternerId_Vtas();
        Fecha();
        LBL_ID_Venta.setText(Id_Ultim);
        LBL_Hora.setText(Hora);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Venta = new javax.swing.JTable();
        TXT_Escaner = new javax.swing.JTextField();
        LBL_Efectivo = new javax.swing.JLabel();
        BTN_AgregarProducto = new javax.swing.JButton();
        BTN_Atras = new javax.swing.JButton();
        BTN_RealizarVenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LBL_Hora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LBL_ID_Venta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LBL_Fecha = new javax.swing.JLabel();
        LBL_Total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_Efectivo = new javax.swing.JTextField();
        LBL_Cambio = new javax.swing.JLabel();
        LBL_Cambio_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBL_Venta.setModel(TablasJuanes);
        jScrollPane1.setViewportView(TBL_Venta);

        TXT_Escaner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_EscanerFocusLost(evt);
            }
        });
        TXT_Escaner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_EscanerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_EscanerKeyTyped(evt);
            }
        });

        LBL_Efectivo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBL_Efectivo.setText("Efectivo $");

        BTN_AgregarProducto.setText("+");
        BTN_AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarProductoActionPerformed(evt);
            }
        });

        BTN_Atras.setText("<< Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        LBL_Fecha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LBL_Fecha.setText("0000-00-00");

        LBL_Total.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBL_Total.setText("00.00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Total      $");

        TXT_Efectivo.setText(" ");
        TXT_Efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_EfectivoKeyTyped(evt);
            }
        });

        LBL_Cambio.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBL_Cambio.setText("00.00");

        LBL_Cambio_1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBL_Cambio_1.setText("Cambio   $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(LBL_ID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(LBL_Fecha)
                .addGap(31, 31, 31)
                .addComponent(LBL_Hora)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(BTN_AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LBL_Efectivo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXT_Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBL_Cambio_1)
                                .addComponent(jLabel2))
                            .addGap(223, 223, 223))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LBL_Cambio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_Total))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BTN_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                        .addComponent(BTN_RealizarVenta)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_AgregarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Total)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LBL_Efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_Efectivo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LBL_Cambio_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_Cambio)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Atras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_RealizarVenta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObternerId_Vtas() {
       if(mBD.conectar()) {
           Anterior = mBD.getIdSiguienteVenta() + 1;
           int var = Anterior;
           Id_Ultim = var + "";
         }
      mBD.desconectar();
}
    private void Fecha(){
        year = fecha.get(Calendar.YEAR);
        mes = fecha.get(Calendar.MONTH) + 1;
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        hora =fecha.get(Calendar.HOUR);
        minutos =fecha.get(Calendar.MINUTE);
        FechaActual = year + "-" + mes + "-" + dia;
        LBL_Fecha.setText(dia + "/" + mes + "/" + year);
        Hora = hora + ":" + minutos;
    }
    private void BTN_AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarProductoActionPerformed
     /*   if (TXT_Escaner.getText().contains("")){       
            JOptionPane.showMessageDialog(null,"Primero Ingresa algun producto");
        }else {*/
             if(mBD.conectar()){
            ArrayList ListaProductoss = mBD.listaProductos(TXT_Escaner.getText());
            ConsultaEx =  mBD.consultaExistencias(Integer.parseInt(TXT_Escaner.getText()));
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
                    mBD.modificarExistencias(mProducto.getId_Producto());
                    ArregloIdProd.add(mProducto.getId_Producto());
                    ArregloPrecios.add(mProducto.getPrecio());
                    Total = Total + mProducto.getPrecio();
                    LBL_Total.setText(Total + "");
                    TablasJuanes.addRow(DatosTabla);
                    Contador++;
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
            } else if (ConsultaEx <= 0){
                JOptionPane.showMessageDialog(null, "El producto "
                + "especificado no tiene piezas disponibles en existencia");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Error de conexion en la base de datos");
        }
     mBD.desconectar();
      // }
       
     
     
    }//GEN-LAST:event_BTN_AgregarProductoActionPerformed

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        Menu FormMenu = new Menu();
        FormMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_RealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RealizarVentaActionPerformed
           if (Contador > 0) {
             LBL_ID_Venta.setText(Id_Ultim);
            mVenta.setFecha(FechaActual);
            mVenta.setId_Venta(Integer.parseInt(Id_Ultim));
            mVenta.setTotal((float)Total);
            efectivo = Float.parseFloat(TXT_Efectivo.getText());
            if (efectivo >= Total) {
             cambio = efectivo  - Total;
            LBL_Cambio.setText(String.valueOf(cambio)); 
            if(mBD.conectar()) {
                if (mBD.realizarVenta(mVenta)) {
                    Contador = 0;
                    int id_vta = mVenta.getId_Venta();
                    int id_prod;
                    float precio;
                    for(int j = 0; j< ArregloPrecios.size(); j++){
                        id_prod = ArregloIdProd.get(j);
                        
                        precio = ArregloPrecios.get(j);
                        mBD.agregarDetalleVenta(precio, id_prod, id_vta);
                        
                    }
                   
                    mBD.agregarTicket(id_vta, FechaActual, Lugar , CP, Total, efectivo, cambio);
//                    GenerarReporteTicket(id_vta);
                    try {
                        Ruta = "Tickets\\Ticket_venta_" + Id_Ultim + ".txt";
                        try (BufferedWriter ArchivoTXT = new BufferedWriter(new FileWriter(Ruta))) {
                            ArchivoTXT.write("       ╬═══════════════════╬");
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("       ╬ Ferreteria Juanes ╬");
                             ArchivoTXT.newLine();
                            ArchivoTXT.write("       ╬═══════════════════╬");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("     !!!Gracias por su preferencia!!!");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("Lugar de expedicion: " + Lugar + "  Código postal: " + CP);
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("No. Venta " + Id_Ultim + "  \tFecha " + dia +"/"+mes+"/"+year + "\t Hora " + Hora);
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("Codigo\t\tDescrip\t\tPrecio\t\tCantid\t\tSubtotal");
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("\n══════════════════════════════════════════════");
                            ArchivoTXT.newLine();
                            String Tam = "";
                            for (int i = 0 ; i < TablasJuanes.getRowCount(); i++){
                                for(int j = 0 ; j < TablasJuanes.getColumnCount();j++){
                                    if (((String)(TablasJuanes.getValueAt(i,j))).length() > 6) {
                                        Tam =(String)(TablasJuanes.getValueAt(i,j)).toString().substring(0,5);
                                        ArchivoTXT.write(Tam);
                                        if (j < TablasJuanes.getColumnCount() -1) {
                                            ArchivoTXT.write("\t\t");
                                        }
                                    }else{
                                        ArchivoTXT.write((String)(TablasJuanes.getValueAt(i,j)));
                                        if (j < TablasJuanes.getColumnCount() -1) { 
                                            ArchivoTXT.write("\t\t");
                                        }
                                    }

                                }
                                ArchivoTXT.newLine();
                                ArchivoTXT.newLine();
                            }
                            ArchivoTXT.write("\n══════════════════════════════════════════════");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("\t\t\t \t   \t   Total a pagar: $" + Total + " MXN");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                             ArchivoTXT.write("\t\t\t \t   \t   Efectivo: $" + efectivo + " MXN");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                             ArchivoTXT.write("\t\t\t \t   \t   Cambio: $" + cambio + " MXN");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("   Version del Software 2.0 todos los derechos reservados a JAKE\n\n");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("   Software realizado por la organizacion JAKE\n\n");
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.newLine();
                            ArchivoTXT.write("   !!! Gracias por su compra esperamos verlos pronto!!!");
                            ArchivoTXT.close();
                        }
                        JOptionPane.showMessageDialog(null,"Venta Realizada\nTicket de venta numero " + Id_Ultim + " Guardado");
                    } catch (IOException | HeadlessException e) {
                        JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage());
                    } 
                    VaciarCampos();
                
                } else {
                     JOptionPane.showMessageDialog(null, "Error");
             mBD.desconectar();
             }
                ObternerId_Vtas();
                LBL_ID_Venta.setText(Id_Ultim);
        }
            }else{
                 JOptionPane.showMessageDialog(null, "El efectivo debe ser mayor al total");
            }
            
          }else{
               JOptionPane.showMessageDialog(null, "No se puede realizar una venta vacia");
           }
            
       
    }//GEN-LAST:event_BTN_RealizarVentaActionPerformed

    private void TXT_EfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_EfectivoKeyTyped
        char caracter  = evt.getKeyChar();
            if (caracter < '0' || caracter > '9') {
                evt.consume();
            }        
    }//GEN-LAST:event_TXT_EfectivoKeyTyped

    private void TXT_EscanerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_EscanerKeyTyped
            char caracter  = evt.getKeyChar();
            if (caracter < '0' || caracter > '9') {
                evt.consume();
            }
        
    }//GEN-LAST:event_TXT_EscanerKeyTyped

    private void TXT_EscanerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_EscanerKeyPressed
        
    }//GEN-LAST:event_TXT_EscanerKeyPressed

    private void TXT_EscanerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_EscanerFocusLost
         if(ValidarEscanner()){
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese codigo de barras primero");
            TXT_Escaner.requestFocus();
        }
    }//GEN-LAST:event_TXT_EscanerFocusLost
     private void VaciarCampos() {
        TXT_Escaner.setText(""); 
        LBL_Total.setText("00.00");
        TXT_Efectivo.setText("");
        LBL_Cambio.setText("00.00");
        
       for (int i = 0; i < TBL_Venta.getRowCount(); i++) {
                TablasJuanes.removeRow(i);
                i-=1;
        }
    }
      public boolean ValidarEscanner() {
        if (TXT_Escaner.getText().equals("")) {
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
    private javax.swing.JLabel LBL_Cambio;
    private javax.swing.JLabel LBL_Cambio_1;
    private javax.swing.JLabel LBL_Efectivo;
    private javax.swing.JLabel LBL_Fecha;
    private javax.swing.JLabel LBL_Hora;
    private javax.swing.JLabel LBL_ID_Venta;
    private javax.swing.JLabel LBL_Total;
    private javax.swing.JTable TBL_Venta;
    private javax.swing.JTextField TXT_Efectivo;
    private javax.swing.JTextField TXT_Escaner;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   public void GenerarReporteTicket(int ID){
    /*   String path = "\\src\\jake_optimizacion_venta\\ReporteTickets.jasper";
        JasperReport jr = null;
        Map parametros = new HashMap();
        
        try {
            parametros.put("ID", ID);
            jr = (JasperReport) JRLoader.loadObjectFromLocation(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, mBD.conectarJasper());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle(path);
        } catch (JRException ex) {
            Logger.getLogger(FRM_ReporteDetalleVenta.class.getName()).log(Level.SEVERE, null, ex);
        }*/
   }
}
