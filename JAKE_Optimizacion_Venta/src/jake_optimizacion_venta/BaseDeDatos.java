/*
 **Kevin Fabian Cruz Gómez
 **Clase Base de datos para la conexión 
 */
package jake_optimizacion_venta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BaseDeDatos {
    private Connection conexion;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/puntoventa", "", "");
            if (conexion != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void desconectar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean agregarProveedor(Proveedor mProveedor){
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute ( "insert into proveedor "  +
                             "(Id_Proveedor, Nombre, Empresa ) " +
                             "values ('" + mProveedor.getId_proveedor() +
                             "'" + mProveedor.getNombre() + "," +
                             "'" + mProveedor.getEmpresa() + "');");
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

   

    
    public boolean eliminarProveedor(Proveedor mProveedor) {

        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from proveedor "
                    + " where id_proveedor = " + mProveedor.getId_proveedor() + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    

        public boolean modificarProveedor(Proveedor mProveedor, Proveedor mNuevoProveedor)
        {
           Statement consulta;
            try
            {
                consulta = conexion.createStatement();
                consulta.execute("update proveedor set " + 
                "nombre = '" + mNuevoProveedor.getNombre() + "'," + "empresa = " + mNuevoProveedor.getEmpresa() + 
                "' where id_proveedor = '" + mProveedor.getId_proveedor() + "';");
                return true;
            }
            catch (Exception e)
            {
               e.printStackTrace();
                return false;
            }
        }
        
            public boolean agregarProducto(Producto mProducto)
        {
           Statement consulta;
            try
            {
                consulta = conexion.createStatement();
                consulta.execute("insert into producto " +
                            "(id_producto,precio,nombre,tipo,clasificacion) " +
                            "values ('"
                            + mProducto.getId_Producto() + "','" + mProducto.getPrecio() + "'," + mProducto.getNombre()+ ",'"
                            + mProducto.getTipo() + "','" 
                            + mProducto.getClasificacion() + "');");
                return true;
            }
            catch (Exception e)
            {
               e.printStackTrace();
                return false;
            }
        }

}
