/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jake_optimizacion_venta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Juanez
 */
public class FRM_Grafica extends javax.swing.JFrame {

    BaseDeDatos mBD = new BaseDeDatos();
    private String Fecha;
    private String Fecha2;
   

    /**
     * Creates new form FRM_Grafica
     */
    public FRM_Grafica() {
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

        JChart = new javax.swing.JPanel();
        BTN_Graficar = new javax.swing.JButton();
        DateChooser1 = new com.toedter.calendar.JDateChooser();
        DateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        FI = new javax.swing.JLabel();
        FF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JChart.setBackground(new java.awt.Color(0, 153, 153));
        JChart.setLayout(new java.awt.BorderLayout());

        BTN_Graficar.setText("Graficar");
        BTN_Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GraficarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        FI.setText("Fecha: ");

        FF.setText("Fecha: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JChart, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Graficar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Graficar)
                    .addComponent(DateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FI)
                    .addComponent(FF))
                .addGap(23, 23, 23)
                .addComponent(JChart, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GraficarActionPerformed
        Fecha = new SimpleDateFormat("yyyy-MM-dd").format(DateChooser1.getDate());
        Fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(DateChooser2.getDate());
        
        FI.setText(Fecha);
        FF.setText(Fecha2);
        
        float Rango = mBD.getTotal(Fecha, Fecha2);
        //int Ran = (int)Rango;
        DefaultCategoryDataset barCharData = new DefaultCategoryDataset();

        barCharData.setValue(Rango, "Fecha", "Lunes");
      /*  barCharData.setValue(15000, "Fecha", "Martes");
        barCharData.setValue(30000, "Fecha", "Miercoles");
        barCharData.setValue(25000, "Fecha", "Jueves");
        barCharData.setValue(40000, "Fecha", "Viernes");
        barCharData.setValue(40000, "Fecha", "Sabado");
        barCharData.setValue(40000, "Fecha", "Domingo");*/

        JFreeChart barChart = ChartFactory.createBarChart("Ferreteria Juanes", "Día", "Ventas", barCharData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.BLACK);

        ChartPanel barPanel = new ChartPanel(barChart);
        JChart.removeAll();
        JChart.add(barPanel, BorderLayout.CENTER);
        JChart.validate();

    }//GEN-LAST:event_BTN_GraficarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Grafica().setVisible(true);
            }
        });
    }

    /*public static void generarBarras(){
        String ValorT = "";
        try{
            BaseDeDatos mBD = new BaseDeDatos();
            Venta mVenta = new Venta();
            
            FRM_Venta mV = new FRM_Venta();
            Connection Ca =  mBD.conectar();
            
            ResultSet rs = null;
            PreparedStatement ps = null;
           
                
            ps = Ca.prepareStatement("select * from ventas where fecha between 2018/05/01 and 2018/05/31" );
            rs = ps.executeQuery();
            
            
            
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            while(rs.next()){
            ds.addValue(rs.getInt(1),rs.getString(2), rs.getString(2));
            }
            JFreeChart jf = ChartFactory.createBarChart3D("Ventas", "Dias", "Venta Total Dia",
            ds, PlotOrientation.VERTICAL, true, true, true);
        
           
            ChartFrame f = new ChartFrame("Ventas Total Dia", jf);
            f.setSize(1000,600);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
           ps.close();
           rs.close();
           mBD.desconectar();
            
    }catch(Exception e){
        System.out.println("Error" + e);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Graficar;
    private com.toedter.calendar.JDateChooser DateChooser1;
    private com.toedter.calendar.JDateChooser DateChooser2;
    private javax.swing.JLabel FF;
    private javax.swing.JLabel FI;
    private javax.swing.JPanel JChart;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
