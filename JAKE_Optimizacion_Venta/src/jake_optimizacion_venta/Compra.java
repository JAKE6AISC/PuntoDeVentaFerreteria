/*
 * Kevin Fabián Cruz Gómez
 * Clase compra
 */
package jake_optimizacion_venta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author KevinCruz
 */
public class Compra {
    private int Id_Compra;
    private float Total;
    private String Fecha;
    private ArrayList Productos;
    Calendar c2 = new GregorianCalendar();
    
    public Compra() {
        Id_Compra = 0;
        Total = 0;
        Fecha = Integer.toString(c2.get(Calendar.YEAR)) + "/" + Integer.toString(c2.get(Calendar.MONTH)+1) +
                "/" + Integer.toString(c2.get(Calendar.DATE));
    }

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public ArrayList getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList Productos) {
        this.Productos = Productos;
    }
}
