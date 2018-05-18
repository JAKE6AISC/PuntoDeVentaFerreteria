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
    private int Id_Proveedor;
    private int Existencias;
    public Producto() {
        Id_Producto = 0;
        Nombre = "";
        Clasificacion = "";
        Tipo = "";
        Precio = 0;
        Id_Proveedor = 0;
        Existencias = 0;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
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

    public int getExistencias() {
        return Existencias;
    }

    public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }
    
}
