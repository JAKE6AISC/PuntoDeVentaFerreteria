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
 * @author Juanez
 */
public class FRM_Venta extends javax.swing.JFrame {

    //Instancias
    BaseDeDatos mBD = new BaseDeDatos();
    Venta mVenta = new Venta();
    DefaultTableModel TablasJuanes = new DefaultTableModel();
    Producto mProducto = new Producto();
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    Calendar fecha = Calendar.getInstance();
    ArrayList<Integer> ArregloIdProd = new ArrayList<>();
    ArrayList<Float> ArregloPrecios = new ArrayList<>();

    // Variables licales
    String lugar;
    String cp;
    String id_ultim;
    private String hora_string;
    private String ruta;
    int id_venta;
    private int anterior;
    private int year;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private int consulta_exist;
    private int contador;
    float efectivo = 0, cambio = 0;
    private float ganancia;
    private float total;
    private String fecha_actual;

    public FRM_Venta() {
        ganancia = 0;
        ruta = "";
        hora_string = "";
        lugar = "Río Grande Zacatecas";
        cp = "98403";
        id_ultim = "";
        id_venta = 0;
        anterior = 0;
        year = 0;
        mes = 0;
        dia = 0;
        hora = 0;
        minutos = 0;
        consulta_exist = 0;
        contador = 0;
        total = 0;
        fecha_actual = year + "-" + mes + "-" + dia;
        TablasJuanes.addColumn("Codigo de barras");
        TablasJuanes.addColumn("Nombre");
        TablasJuanes.addColumn("Precio");
        TablasJuanes.addColumn("Cantidad");
        TablasJuanes.addColumn("Sub Total");
        initComponents();
        ObternerIdVtas();
        Fecha();
        LBL_ID_Venta.setText(id_ultim);
        LBL_Hora.setText(hora_string);
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

        BTN_Atras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTN_Atras.setText("<< Atras");
        BTN_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AtrasActionPerformed(evt);
            }
        });

        BTN_RealizarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                .addContainerGap(694, Short.MAX_VALUE))
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

        TXT_Efectivo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        TXT_Efectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_EfectivoFocusLost(evt);
            }
        });
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 469, Short.MAX_VALUE)
                .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_ID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_Fecha)
                        .addGap(31, 31, 31)
                        .addComponent(LBL_Hora)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BTN_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_RealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LBL_Efectivo)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_Total)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TXT_Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBL_Cambio_1)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_Cambio)
                        .addContainerGap())))
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
                    .addComponent(BTN_AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Escaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Total)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Efectivo)
                    .addComponent(TXT_Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Cambio_1)
                    .addComponent(LBL_Cambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Atras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_RealizarVenta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObternerIdVtas() {
        if (mBD.conectar()) {
            anterior = mBD.getIdSiguienteVenta() + 1;
            int var = anterior;
            id_ultim = var + "";
        }
        mBD.desconectar();
    }

    private void Fecha() {
        year = fecha.get(Calendar.YEAR);
        mes = fecha.get(Calendar.MONTH) + 1;
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        hora = fecha.get(Calendar.HOUR);
        minutos = fecha.get(Calendar.MINUTE);
        fecha_actual = year + "-" + mes + "-" + dia;
        LBL_Fecha.setText(dia + "/" + mes + "/" + year);
        hora_string = hora + ":" + minutos;
    }
    private void BTN_AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarProductoActionPerformed
        if (TXT_Escaner.getText().equals("")) {
            JOptionPane.showMessageDialog(null ,"Ingresa el código del producto");
        }else {
        float costo = 0;
        int idDetCom = 0;
        if (mBD.conectar()) {
            ArrayList ListaProductoss = mBD.listaProductos(TXT_Escaner.getText());
            consulta_exist = mBD.consultaExistencias(Integer.parseInt(TXT_Escaner.getText()));
            if (consulta_exist > 0) {
                String[] DatosTabla;
                for (Object ListaProductos : ListaProductoss) {
                    DatosTabla = new String[5];
                    mProducto = (Producto) ListaProductos;
                    DatosTabla[0] = mProducto.getId_Producto() + "";
                    DatosTabla[1] = mProducto.getNombre();
                    DatosTabla[2] = mProducto.getPrecio() + "";
                    DatosTabla[3] = "1";
                    DatosTabla[4] = mProducto.getPrecio() + "";
                    mBD.modificarExistencias(mProducto.getId_Producto());
                    ArregloIdProd.add(mProducto.getId_Producto());
                    ArregloPrecios.add(mProducto.getPrecio());
                    total = total + mProducto.getPrecio();
                    LBL_Total.setText(total + "");
                    TablasJuanes.addRow(DatosTabla);
                    contador++;
                    idDetCom = mBD.consultarUltimoIDdetcom(mProducto.getId_Producto());
                    costo = mBD.ObtenerDetCosto(idDetCom);
                    ganancia = ganancia + (mProducto.getPrecio() - costo);
                    mVenta.setGanancia(ganancia);
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
            } else if (consulta_exist <= 0) {
                JOptionPane.showMessageDialog(null, "El producto "
                        + "especificado no tiene piezas disponibles en existencia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error de conexion en la base de datos");
        }

        mBD.desconectar();

        }
    }//GEN-LAST:event_BTN_AgregarProductoActionPerformed

    private void BTN_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AtrasActionPerformed
        Menu FormMenu = new Menu();
        FormMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_AtrasActionPerformed

    private void BTN_RealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RealizarVentaActionPerformed
        if (contador > 0) {
        
        if ("".equals(TXT_Efectivo.getText())) {
            JOptionPane.showMessageDialog(null, "Ingresa el efectivo");
        }else {
                LBL_ID_Venta.setText(id_ultim);
                mVenta.setFecha(fecha_actual);
                mVenta.setId_Venta(Integer.parseInt(id_ultim));
                mVenta.setTotal((float) total);
                efectivo = Float.parseFloat(TXT_Efectivo.getText());
                if (efectivo >= total) {
                    cambio = efectivo - total;
                    LBL_Cambio.setText(String.valueOf(cambio));
                    if (mBD.conectar()) {
                        if (mBD.realizarVenta(mVenta)) {
                            contador = 0;
                            int id_vta = mVenta.getId_Venta();
                            int id_prod;
                            float precio;
                            for (int j = 0; j < ArregloPrecios.size(); j++) {
                                id_prod = ArregloIdProd.get(j);
                                
                                precio = ArregloPrecios.get(j);
                                mBD.agregarDetalleVenta(precio, id_prod, id_vta);
                                
                            }
                            
                            mBD.agregarTicket(id_vta, fecha_actual, hora_string, lugar, cp, total, efectivo, cambio);
                            try {
                                ruta = "Tickets\\Ticket_venta_" + id_ultim + ".txt";
                                GenerarTicketTxt(ruta, lugar, cp, id_ultim, dia, mes, year, hora_string, total, efectivo, cambio);
                                JOptionPane.showMessageDialog(null, "Venta Realizada\nTicket de venta numero " + id_ultim + " Guardado");
                            } catch (HeadlessException e) {
                                JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
                            } catch (IOException ex) {
                                Logger.getLogger(FRM_Venta.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            VaciarCampos();
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Error");
                            mBD.desconectar();
                        }
                        ObternerIdVtas();
                        LBL_ID_Venta.setText(id_ultim);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El efectivo debe ser mayor al total");
                }
                
            } 
             //String path = "C:\\Users\\Juanez\\Documents\\Github\\PuntoDeVenta\\14\\PuntoDeVentaFerreteria\\JAKE_Optimizacion_Venta\\src\\jake_optimizacion_venta\\ReporteDeVentas.jasper";
             String path = "/Users/KevinCruz/PV/PuntoDeVentaFerreteria/JAKE_Optimizacion_Venta/src/jake_optimizacion_venta/ReporteDeVentas.jasper";
            JasperReport jr = null;
            Map parametros = new HashMap();
            
            try {
            parametros.put("ID", mVenta.getId_Venta());
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            //jr = (JasperReport) JRLoader.loadObject(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, mBD.conectare());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle(path);
            } catch (JRException ex) {
            Logger.getLogger(FRM_ReporteVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
                JOptionPane.showMessageDialog(null, "No se puede realizar una venta vacia");
            }
    }//GEN-LAST:event_BTN_RealizarVentaActionPerformed
    public void GenerarTicketTxt(String ruta, String lugar, String cp, String id_ultim, int dia, int mes, int year, String hora_string, float total, float efectivo, float cambio) throws IOException {
        try (BufferedWriter ArchivoTXT = new BufferedWriter(new FileWriter(ruta))) {
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
            ArchivoTXT.write("Lugar de expedicion: " + lugar + "  Código postal: " + cp);
            ArchivoTXT.newLine();
            ArchivoTXT.newLine();
            ArchivoTXT.newLine();
            ArchivoTXT.write("No. Venta " + id_ultim + "  \tFecha " + dia + "/" + mes + "/" + year + "\t Hora " + hora_string);
            ArchivoTXT.newLine();
            ArchivoTXT.newLine();
            ArchivoTXT.newLine();
            ArchivoTXT.write("Codigo\t\tDescrip\t\tPrecio\t\tCantid\t\tSubtotal");
            ArchivoTXT.newLine();
            ArchivoTXT.write("\n══════════════════════════════════════════════");
            ArchivoTXT.newLine();
            String tam = "";
            for (int i = 0; i < TablasJuanes.getRowCount(); i++) {
                for (int j = 0; j < TablasJuanes.getColumnCount(); j++) {
                    if (((String) (TablasJuanes.getValueAt(i, j))).length() > 6) {
                        tam = (String) (TablasJuanes.getValueAt(i, j)).toString().substring(0, 5);
                        ArchivoTXT.write(tam);
                        if (j < TablasJuanes.getColumnCount() - 1) {
                            ArchivoTXT.write("\t\t");
                        }
                    } else {
                        ArchivoTXT.write((String) (TablasJuanes.getValueAt(i, j)));
                        if (j < TablasJuanes.getColumnCount() - 1) {
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
            ArchivoTXT.write("\t\t\t \t   \t   Total a pagar: $" + total + " MXN");
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

    }
    private void TXT_EfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_EfectivoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!= '.')  
        {
            evt.consume();
        }
        if(evt.getKeyChar() == '.' && TXT_Efectivo.getText().contains("."))
        {
	
        evt.consume();

        }
    }//GEN-LAST:event_TXT_EfectivoKeyTyped

    private void TXT_EscanerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_EscanerKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_TXT_EscanerKeyTyped

    private void TXT_EscanerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_EscanerKeyPressed

    }//GEN-LAST:event_TXT_EscanerKeyPressed

    private void TXT_EscanerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_EscanerFocusLost
       /* if (ValidarEscanner()) {
        } else {
           // JOptionPane.showMessageDialog(null, "Ingrese codigo de barras primero");
            TXT_Escaner.requestFocus();
        }*/
    }//GEN-LAST:event_TXT_EscanerFocusLost

    private void TXT_EfectivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_EfectivoFocusLost
     /*   if (ValidarEfectivo()) {
        } else {
           // JOptionPane.showMessageDialog(null, "Ingrese efevtivo primero");
            TXT_Efectivo.requestFocus();
        }*/
    }//GEN-LAST:event_TXT_EfectivoFocusLost
    private void VaciarCampos() {
        TXT_Escaner.setText("");
        LBL_Total.setText("00.00");
        TXT_Efectivo.setText("");
        LBL_Cambio.setText("00.00");

        for (int i = 0; i < TBL_Venta.getRowCount(); i++) {
            TablasJuanes.removeRow(i);
            i -= 1;
        }
    }

    public boolean ValidarEscanner() {
        if (TXT_Escaner.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidarEfectivo() {
        if (TXT_Efectivo.getText().equals("")) {
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

}
