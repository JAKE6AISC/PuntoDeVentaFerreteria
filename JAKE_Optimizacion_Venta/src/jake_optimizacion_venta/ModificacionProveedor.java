package jake_optimizacion_venta;
/**
 * // Clase Modificacion Proveedor agregada por Juanes
 * @author Juanez
 */
public class ModificacionProveedor {
    String NombreProveedor;
    String Empresa;
    int Id_Proveedor;
    //BaseDatos BD;
    public ModificacionProveedor() {
        NombreProveedor = "";
        Empresa = "";
        Id_Proveedor = 0;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }
    
    public void ModificarProveedor(){
        
    }
}

