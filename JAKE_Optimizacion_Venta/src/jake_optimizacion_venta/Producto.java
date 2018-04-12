package jake_optimizacion_venta;

/**
 * Creacion de la clase Producto hecha por Juanes si falta algun dato
 *
 * @author Juanez
 */
public class Producto {

    private int Id_Producto;
    private String Nombre;
    private String Clasificacion;
    private String Tipo;
    private float Precio;

    public Producto() {
        Id_Producto = 0;
        Nombre = "";
        Clasificacion = "";
        Tipo = "";
        Precio = 0;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

}
