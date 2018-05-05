/*
 * Kevin Fabián Cruz Gómez
 *
 * Clase Proveedor
 *
 */
package jake_optimizacion_venta;

/**
 *
 * @author KevinCruz
 */
public class Proveedor {
    private int Id_proveedor;
    private String Empresa;
    private String Nombre;
    
    public Proveedor() {
        Id_proveedor = 0;
        Empresa = "";
        Nombre = "";
    }

    public int getId_proveedor() {
        return Id_proveedor;
    }

    public void setId_proveedor(int Id_proveedor) {
        this.Id_proveedor = Id_proveedor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
