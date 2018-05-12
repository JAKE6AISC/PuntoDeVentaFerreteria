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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                    + "','" + mProveedor.getNombre() + "','" + mProveedor.getEmpresa() + "');");
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
            consulta.execute("insert into producto (precio,nombre,tipo,clasificacion,proveedor_id_proveedor) "
                    + "values (" + mProducto.getPrecio() + ",'" + mProducto.getNombre()
                    + "','" + mProducto.getTipo() + "','" + mProducto.getClasificacion() + "','"
                    + mProducto.getId_Proveedor() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean agregarExistenciaProducto(int ID) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into existencias (cantidad, producto_id_producto)"
                    + "values (0,'" + ID +"');");

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
            consulta.execute("delete from producto "
                    + " where id_producto = " + mProducto.getId_Producto() + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
     public boolean eliminarExistencia(int id) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from existencias "
                    + " where producto_id_producto = " + id + ";");
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
            consulta.execute("update producto set "
                    + "nombre = '" + mNuevoProducto.getNombre() + "',"
                    + "tipo = '" + mNuevoProducto.getTipo() + "',"
                    + "clasificacion = '" + mNuevoProducto.getClasificacion() + "',"
                    + "precio = " + mNuevoProducto.getPrecio() + " where id_producto = '" + mProducto.getId_Producto() + "';");

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
    public int getIdProveedores() {
         int sig = 0;
        Statement Consulta;
        ResultSet Resultado;
        try {
            Consulta = conexion.createStatement();
            Resultado = Consulta.executeQuery("select max(id_proveedor) as ultimo from proveedor;");
            if (Resultado.next()) {
                sig = (Resultado.getInt("ultimo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sig;
    }
    public ArrayList consultarProductos() {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaProductos = new ArrayList();
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
                mListaProductos.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProductos;
    }

    public Producto consultarProducto(String nombre, String tipo) {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        try {    
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto "
                    + "where nombre = '" + nombre + "' OR tipo = '" + tipo + "';");
            if (resultado.next()) {
                mProducto = new Producto();
                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setPrecio(resultado.getFloat("precio"));
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setTipo(resultado.getString("tipo"));
                mProducto.setClasificacion(resultado.getString("clasificacion"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mProducto;
    }

    public int consultarIDcompra() {
        Statement consulta;
        ResultSet resultado;
        int id = 0;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT MAX(id_compra) FROM compra;");
            while (resultado.next()) {
                id = resultado.getInt("MAX(id_compra)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public boolean realizarCompra(Compra mCompra) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into compra (id_compra, fecha, total) values "
                    + "(null, '" + mCompra.getFecha() + "'," + mCompra.getTotal() + ");");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean realizarDetalleCompra(Compra mCompra, Producto mProducto) {
        Statement consulta;
        ArrayList ListaProductos = mCompra.getProductos();
        try {
            for (Object ListaProducto : ListaProductos) {            
                mProducto = (Producto) ListaProducto;
                consulta = conexion.createStatement();
                consulta.execute("insert into detalle_compra (id_detalle_compra, costo,"
                        + " compra_id_compra, producto_id_producto) values "
                        + "(null, " + mProducto.getPrecio() + ", " + consultarIDcompra()
                        + ", " + mProducto.getId_Producto() + ");");
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean incrementarProductos(ArrayList ListaProductos) {
        Statement consulta;
        Producto mProducto = null;
        try {
            for (Object ListaProducto : ListaProductos) {
                mProducto = (Producto) ListaProducto;
                consulta = conexion.createStatement();
            consulta.execute("update existencias set cantidad = cantidad + "
                    + mProducto.getExistencias() + " where producto_id_producto = "
                    + mProducto.getId_Producto() + ";");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean realizarVenta(Venta mVenta) {//Sirve para guardar los datos de la
        // Venta en la base de datos
        Statement Consulta;
        try {
            Consulta = conexion.createStatement();
            Consulta.execute("insert into venta (id_venta, fecha, total) "
                    + "values ('" + mVenta.getId_Venta() + "','" + mVenta.getFecha() + "','" + mVenta.getTotal() + "');");
            return true;
        } catch (Exception e) {
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
            Resultado = Consulta.executeQuery("select * from producto "
                    + "where id_producto = '" + Id + "' OR nombre ='" + Id + "';");

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

    public boolean modificarExistencias(int ID_Prod) {//si se usa
        Statement Consulta;
        try {
            Consulta = conexion.createStatement();
            Consulta.execute("update existencias set "
                    + "cantidad = cantidad - 1 where producto_id_producto = '" + ID_Prod + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int consultaExistencias(int id_p) {// si se usa
        int cant = 0;
        Statement Consulta;
        ResultSet Resultado;
        try {
            Consulta = conexion.createStatement();
            Resultado = Consulta.executeQuery("select cantidad from existencias where producto_id_producto = '" + id_p + "';");
            while (Resultado.next()) {
                cant = (Resultado.getInt("cantidad"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cant;
    }

    public ArrayList consultarExistencias() {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;

        ArrayList mListaProducto = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto A inner join existencias B ON A.id_producto=B.producto_id_producto;");

            while (resultado.next()) {
                mProducto = new Producto();
                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setPrecio(resultado.getInt("precio"));
                mProducto.setExistencias(resultado.getInt("cantidad"));

                mListaProducto.add(mProducto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaProducto;
    }
    
    public int getIdSiguienteVenta() {// Si se usa
        int sig = 0;
        Statement Consulta;
        ResultSet Resultado;
        try {
            Consulta = conexion.createStatement();
            Resultado = Consulta.executeQuery("select max(id_venta) as ultimo from venta;");
            if (Resultado.next()) {
                sig = (Resultado.getInt("ultimo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sig;
    }
    
    public int getIdProducto() {// Si se usa
        int sig = 0;
        Statement Consulta;
        ResultSet Resultado;
        try {
            Consulta = conexion.createStatement();
            Resultado = Consulta.executeQuery("select max(id_producto) as ultimo from producto;");
            if (Resultado.next()) {
                sig = (Resultado.getInt("ultimo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sig;
    }


    public void agregarDetalleVenta(float pr, int id_v, int id_p) {
        Statement Consulta;
        try {
            Consulta = conexion.createStatement();
            Consulta.execute("insert into detalle_venta "
                    + "(precio, producto_id_producto, venta_id_venta) "
                    + "values (" + pr + "," + id_p + ","
                    + id_v + ");");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList consultarDetalleVenta() {
        DetalleVenta mDetalleVenta = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaVentas = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from detalle_venta;");
            while (resultado.next()) {
                mDetalleVenta = new DetalleVenta();
                mDetalleVenta.setId_venta(resultado.getInt("id_detalle_venta"));
                mDetalleVenta.setPrecio(resultado.getFloat("precio"));
                mDetalleVenta.setId_venta(resultado.getInt("id_venta"));
                mDetalleVenta.setId_producto(resultado.getInt("id_producto"));
                mListaVentas.add(mDetalleVenta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaVentas;
    }
    
    //Aquí va el método que vas a usar para poder conectar el iReport con tu bd.
    public String url = "jdbc:mysql://localhost:8889/puntoventa"; //aquí metes la dirección exacta de tu bd.
    public String user = "root";
    public String pass = "root";

    public Connection conectare() {
        Connection link = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return link;
    }
    
    
    public Proveedor consultarProveedorString(String Nombre) {
        Proveedor mProveedor = null;
        Statement consulta;
        ResultSet resultado;
        List<Proveedor> CatalogoBD = new ArrayList<>();

        try {
            mProveedor = new Proveedor();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from proveedor "
                    + "where nombre like= '%" + Nombre + "';");
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
}
