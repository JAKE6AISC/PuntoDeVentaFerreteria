/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jake_optimizacion_venta;

/**
 *
 * @author Juanez
 */
public class Detalle_Venta {
   int ID_Detalle_Venta;
   float Precio;
   int Venta_Id_Detalle_Venta;
   int Producto_Id_Producto;

    public int getID_Detalle_Venta() {
        return ID_Detalle_Venta;
    }

    public void setID_Detalle_Venta(int ID_Detalle_Venta) {
        this.ID_Detalle_Venta = ID_Detalle_Venta;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getVenta_Id_Detalle_Venta() {
        return Venta_Id_Detalle_Venta;
    }

    public void setVenta_Id_Detalle_Venta(int Venta_Id_Detalle_Venta) {
        this.Venta_Id_Detalle_Venta = Venta_Id_Detalle_Venta;
    }

    public int getProducto_Id_Producto() {
        return Producto_Id_Producto;
    }

    public void setProducto_Id_Producto(int Producto_Id_Producto) {
        this.Producto_Id_Producto = Producto_Id_Producto;
    }
   
   
}
