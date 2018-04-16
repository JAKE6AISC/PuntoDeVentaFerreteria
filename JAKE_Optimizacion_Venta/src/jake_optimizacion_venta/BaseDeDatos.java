/*
 **Kevin Fabian Cruz Gómez
 **Métodos agregados por los integrantes del equipo
 **Clase Base de datos para la conexión 
 */
//Maria Eneida Salas Martínez
// Se agrego el metodo consultarProveedor 
//Se agrego el metodo consultaProveedor para hacer una consulta general

package jake_optimizacion_venta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public boolean agregarProveedor(Proveedor mProveedor) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into proveedor "
                    + "(Id_Proveedor, Nombre, Empresa ) "
                    + "values ('" + mProveedor.getId_proveedor()
                    + "'" + mProveedor.getNombre() + ","
                    + "'" + mProveedor.getEmpresa() + "');");
            return true;
        } catch (Exception e) {
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

    public boolean modificarProveedor(Proveedor mProveedor, Proveedor mNuevoProveedor) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update proveedor set "
                    + "nombre = '" + mNuevoProveedor.getNombre() + "'," + "empresa = " + mNuevoProveedor.getEmpresa()
                    + "' where id_proveedor = '" + mProveedor.getId_proveedor() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean agregarProducto(Producto mProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into producto "
                    + "(id_producto,precio,nombre,tipo,clasificacion) "
                    + "values ('" + mProducto.getId_Producto() + "','" + mProducto.getPrecio()
                    + "'," + mProducto.getNombre() + ",'"
                    + mProducto.getTipo() + "','"
                    + mProducto.getClasificacion() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarProducto(Producto mProducto) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from productos "
                    + " where id_producto = " + mProducto.getId_Producto() + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
<<<<<<< HEAD:JAKE_Optimizacion_Venta/src/BaseDeDatos.java
        
        public boolean modificacionProducto(Producto mProducto, Producto mNuevoProducto){
            
            Statement consulta;
            try {
                consulta = conexion.createStatement();
                consulta.execute("update producto set" + 
                        "nombre = '" + mNuevoProducto.getNombre() + "tipo = '" + mNuevoProducto.getTipo() + 
                        "clasificacion = '" + mNuevoProducto.getClasificacion() + "Precio = " + mNuevoProducto.getPrecio() +
                        "' where id_producto = '" + mProducto.getId_Producto() + "';");
                
                return true;
            }catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
            
        }
=======
    }
>>>>>>> 8c617dc54a2a1aadf392f511748fdb042e518a34:JAKE_Optimizacion_Venta/src/jake_optimizacion_venta/BaseDeDatos.java

    public Proveedor consultarProveedor(int id_proveedor) {
        Proveedor mProveedor = null;
        Statement consulta;
        ResultSet resultado;
        List<Proveedor> CatalogoBD = new ArrayList<>();

        try {
            mProveedor = new Proveedor();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from proveedor "
                    + "where id_proveedor = '" + id_proveedor + "';");
            if (resultado.next()) {
                mProveedor.setId_proveedor(resultado.getInt("id_proveedor"));
                mProveedor.setNombre(resultado.getString("nombre"));
                mProveedor.setEmpresa(resultado.getString("empresa"));
                CatalogoBD.add(mProveedor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
            
        return mProveedor;        
    }   
    public ArrayList consultarProveedor(){
        Proveedor mProveedor = null;
        Statement consulta;
        ResultSet resultado;
       
        ArrayList mListaProveedor = new ArrayList();
        try {
           mProveedor = new Proveedor();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from proveedor;");
            
              while(resultado.next()){
                mProveedor = new Proveedor();              
                mProveedor.setId_proveedor(resultado.getInt("id_proveedor"));
                mProveedor.setNombre(resultado.getString("nombre"));
                mProveedor.setEmpresa(resultado.getString("empresa"));
              
                mListaProveedor.add(mProveedor);
           
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
          return mListaProveedor;  
            
    }   
  
=======

        return mProveedor;
    }
    
    
>>>>>>> c0ad0641e3bcaad7e92c657831d35e2c371309a4
}
