/*
 * Luis Osvaldo Juanes Hinojosa
 * Clase para el Detalle de venta
 */
package jake_optimizacion_venta;

/**
 *
 * @author Juanez
 */
public class DetalleVenta {

    private int Id_detalle_venta;
    private float Precio;
    private int Id_venta;
    private int Id_producto;

    public DetalleVenta() {
        Id_detalle_venta = 0;
        Precio = 0;
        Id_venta = 0;
        Id_producto = 0;
    }

    public int getId_detalle_venta() {
        return Id_detalle_venta;
    }

    public void setId_detalle_venta(int Id_detalle_venta) {
        this.Id_detalle_venta = Id_detalle_venta;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public int getId_producto() {
        return Id_producto;
    }

    public void setId_producto(int Id_producto) {
        this.Id_producto = Id_producto;
    }
}
