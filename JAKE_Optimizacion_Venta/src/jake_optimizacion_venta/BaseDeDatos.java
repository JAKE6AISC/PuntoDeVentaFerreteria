/* NOTA: EXISTEN 3 Consultas de productos 2 de proveedor, por favor quiten lo inecesario
/// NOTA: Por motivos de funcionamiento Juanes Agrego 3 metodos que tienen sus 
// respectivas notas con su funcion 
 **JAKE
 **Métodos agregados por todos los integrantes del equipo
 **Clase Base de datos para la conexión 
 */
package jake_optimizacion_venta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BaseDeDatos {

    private Connection conexion;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/puntoventa", "root", "");
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
                    + "nombre = '" + mNuevoProveedor.getNombre() + "'," + "empresa = '" + mNuevoProveedor.getEmpresa()
                    + "' where id_proveedor = '" + mProveedor.getId_proveedor() + "';");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
    }

    public boolean agregarProducto(Producto mProducto) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
             consulta.execute("insert into producto (id_producto,precio,nombre,tipo,clasificacion,proveedor_id_proveedor) " +
             "values ('" + mProducto.getId_Producto() + "'," + mProducto.getPrecio() + ",'" + mProducto.getNombre()
                         + "','" + mProducto.getTipo() + "','" + mProducto.getClasificacion() + "','" 
                            + mProducto.getId_Proveedor() + "');");
           
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
    }

    public boolean modificacionProducto(Producto mProducto, Producto mNuevoProducto) {

        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update producto set"
                    + "nombre = '" + mNuevoProducto.getNombre() + "tipo = '" + mNuevoProducto.getTipo()
                    + "clasificacion = '" + mNuevoProducto.getClasificacion() + "Precio = " + mNuevoProducto.getPrecio()
                    + "' where id_producto = '" + mProducto.getId_Producto() + "';");

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

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

        return mProveedor;
    }

    public ArrayList consultarProveedores() {
        Proveedor mProveedor = null;
        Statement consulta;
        ResultSet resultado;

        ArrayList mListaProveedor = new ArrayList();
        try {
            mProveedor = new Proveedor();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from proveedor;");

            while (resultado.next()) {
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

    public ArrayList consultarProductos() {
        ArrayList mListaPrendas = new ArrayList();
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto;");
            while (resultado.next()) {
                mProducto = new Producto();
                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setPrecio(resultado.getFloat("precio"));
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setTipo(resultado.getString("tipo"));
                mProducto.setClasificacion(resultado.getString("clasificacion"));
                mListaPrendas.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaPrendas;
    }

    public Producto consultarProducto(String nombre) {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        List<Producto> CatalogoBD = new ArrayList<>();

        try {
            mProducto = new Producto();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto "
                    + "where nombre = '" + nombre + "';");
            if (resultado.next()) {

                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setPrecio(resultado.getInt("precio"));
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setTipo(resultado.getString("tipo"));
                mProducto.setClasificacion(resultado.getString("clasificacion"));

                CatalogoBD.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mProducto;
    }

    public Producto consultarProducto2(String tipo) {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        List<Producto> CatalogoBD = new ArrayList<>();

        try {
            mProducto = new Producto();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto "
                    + "where tipo = '" + tipo + "';");
            if (resultado.next()) {

                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setPrecio(resultado.getInt("precio"));
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setTipo(resultado.getString("tipo"));
                mProducto.setClasificacion(resultado.getString("clasificacion"));

                CatalogoBD.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mProducto;
    }

    public boolean realizarCompra(Compra mCompra, int Cant) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update detalle_compra set cantidad = cantidad +'" + Cant
                    + "', costo='" + mCompra.getPrecio() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

   
        public boolean realizarVenta(Venta mVenta){//Sirve para guardar los datos de la
                                                   // Venta en la base de datos
            Statement Consulta;
            try
            {
                Consulta = conexion.createStatement();
                Consulta.execute("insert into venta (id_venta, fecha, total) " +
                "values ('" + mVenta.Id_Venta + "','" + mVenta.Fecha + "','"+ mVenta.Total + "');");
                 return true;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }

    public ArrayList listaProductos(String Id) { // Hecho por Juanes No Borrar
                                                //Agregar prod x prod a la venta
        ArrayList ListaProductos = new ArrayList();
        Producto mProducto = null;
        Statement Consulta;
        ResultSet Resultado;
        try {
            Consulta = conexion.createStatement();
             Resultado =  Consulta.executeQuery("select * from producto " +
                        "where id_producto = '" + Id + "' OR nombre ='" + Id +"';");
            
            while (Resultado.next()) {
                mProducto = new Producto();
                mProducto.setNombre(Resultado.getString("nombre"));
                mProducto.setId_Producto(Resultado.getInt("id_producto"));
                mProducto.setPrecio(Float.parseFloat(Resultado.getString("precio")));
                mProducto.setClasificacion(Resultado.getString("clasificacion"));
                mProducto.setTipo(Resultado.getString("tipo"));
                ListaProductos.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return ListaProductos;
       }
    
    public ArrayList listaVentas() { // Para La venta Agregado por Juanes NO BORRAR
                                     // Obtiene el Id de la sig Venta
        ArrayList LVentas = new ArrayList();
        Venta mVenta;
        Statement Consulta;
        ResultSet Resultado;
        
        try {
            Consulta = conexion.createStatement();
            Resultado = Consulta.executeQuery("select * from venta;");
            while (Resultado.next()) {
                mVenta = new Venta();
                mVenta.setId_Venta(Resultado.getInt("id_venta"));
                LVentas.add(mVenta);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
        return LVentas;
    }
}
