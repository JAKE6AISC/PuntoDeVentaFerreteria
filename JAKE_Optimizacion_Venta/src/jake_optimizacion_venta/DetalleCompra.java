/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jake_optimizacion_venta;

/**
 *
 * @author KevinCruz
 */
public class DetalleCompra {

    private int Id_detalle_compra;
    private float Costo;
    private int Id_Compra;
    private int Id_Producto;

    public DetalleCompra() {
        Id_detalle_compra = 0;
        Costo = 0;
        Id_Compra = 0;
        Id_Producto = 0;
    }

    public int getId_detalle_compra() {
        return Id_detalle_compra;
    }

    public void setId_detalle_compra(int Id_detalle_compra) {
        this.Id_detalle_compra = Id_detalle_compra;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }
}
