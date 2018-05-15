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

    static Connection connexion = null;
    static Statement sentencia;
    static ResultSet resultado;
    private Connection conexion;
    static Statement sentencia_idp;
    static ResultSet resultado_id_p;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/puntoventa", "root", "root");
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

    public boolean conectarWindows() {
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
                    + "(Nombre, Empresa ) "
                    + "values ('" + mProveedor.getNombre() + "','" + mProveedor.getEmpresa() + "');");
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
                    + "values (0,'" + ID + "');");

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

    public Proveedor consultarProveedor(int id_proveedor, String nombre) {
        Proveedor mProveedor = null;
        Statement consulta;
        ResultSet resultado;
        List<Proveedor> CatalogoBD = new ArrayList<>();

        try {
            mProveedor = new Proveedor();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from proveedor "
                    + "where id_proveedor = '" + id_proveedor + "' OR nombre = '" + nombre + "';");
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

    public int consultarUltimoIDdetcom(int IDproducto) {
        Statement consulta;
        ResultSet resultado;
        int id = 0;
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT MAX(id_detalle_compra) "
                    + "FROM detalle_compra WHERE producto_id_producto = " + IDproducto + ";");
            while (resultado.next()) {
                id = resultado.getInt("MAX(id_detalle_compra)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public float ObtenerDetCosto(int ID) {
        Statement consulta;
        ResultSet resultado;
        float costo = 0;
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT costo FROM detalle_compra "
                    + "WHERE id_detalle_compra = " + ID + ";");
            while (resultado.next()) {
                costo = resultado.getFloat("costo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return costo;
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
            Consulta.execute("insert into venta (id_venta, fecha, total, ganancia) "
                    + "values ('" + mVenta.getId_Venta() + "','" + mVenta.getFecha() + "','" + mVenta.getTotal() + "',"+ mVenta.getGanancia() +");");
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

    public void agregarDetalleVenta(float pr, int id_p, int id_v) {
        Statement Consulta;
        try {
            Consulta = conexion.createStatement();
            Consulta.execute("insert into detalle_venta "
                    + "(precio_producto, producto_id_producto, venta_id_venta) "
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
                mDetalleVenta.setPrecio(resultado.getFloat("precio_producto"));
                mDetalleVenta.setId_venta(resultado.getInt("id_venta"));
                mDetalleVenta.setId_producto(resultado.getInt("id_producto"));
                mListaVentas.add(mDetalleVenta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaVentas;
    }

    public ArrayList consultarVentas() {
        Venta mVenta = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaVentas = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from venta;");
            while (resultado.next()) {
                mVenta = new Venta();
                mVenta.setId_Venta(resultado.getInt("id_venta"));
                mVenta.setFecha(resultado.getString("fecha"));
                mVenta.setTotal(resultado.getFloat("total"));
                mListaVentas.add(mVenta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaVentas;
    }

    public ArrayList consultarCompras() {
        Compra mCompra = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaCompras = new ArrayList();
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from compra;");
            while (resultado.next()) {
                mCompra = new Compra();
                mCompra.setId_Compra(resultado.getInt("id_compra"));
                mCompra.setFecha(resultado.getString("fecha"));
                mCompra.setTotal(resultado.getFloat("total"));
                mListaCompras.add(mCompra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaCompras;
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

    public Proveedor consultarProveedorString(String Busqueda) {
        Proveedor mProveedor = null;
        Statement consulta;
        ResultSet resultado;
        List<Proveedor> CatalogoBD = new ArrayList<>();

        try {
            mProveedor = new Proveedor();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from proveedor where id_proveedor like '%" + Busqueda + "%' "
                    + "or nombre like '%" + Busqueda + "%' or empresa like '%" + Busqueda + "%';");
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

    public static ArrayList<String> getIdProv() {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            resultado = sentencia.executeQuery("select * from proveedor");
        } catch (Exception e) {

        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("id_proveedor"));
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public static void conect() {
        String ruta = "jdbc:mysql://localhost:8889/puntoventa";
        String user = "root";
        String pass = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection(ruta, user, pass);
            sentencia = connexion.createStatement();
            //System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException e) {
            // System.out.println("No conectado");
        }
    }

    public Producto consultarProductoFiltro(String Busqueda) {
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        List<Producto> ListaProd = new ArrayList<>();

        try {
            mProducto = new Producto();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from producto where id_producto like '%" + Busqueda + "%' "
                    + "or nombre like '%" + Busqueda + "%' or clasificacion like '%" + Busqueda + "%' or tipo like '%" + Busqueda + "%'"
                    + "or precio like '%" + Busqueda + "%';");
            if (resultado.next()) {
                mProducto.setId_Producto(resultado.getInt("id_producto"));
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setClasificacion(resultado.getString("clasificacion"));
                mProducto.setTipo(resultado.getString("tipo"));
                mProducto.setPrecio(resultado.getFloat("precio"));
                ListaProd.add(mProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mProducto;
    }

    public boolean agregarTicket(int id_venta, String fecha, String Lugar, String CP, float total, float efectivo, float cambio) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            /*insert into ticket (id_venta, fecha, lugar, codigopostal, total, efectivo,cambio) 
                values(1,'2018-04-24','Rio Grande Zacatecas', '98403', 120.00, 200.00, 80.00);*/
            consulta.execute("insert into ticket (id_venta, fecha, lugar, codigopostal, total, efectivo,cambio)"
                    + "values (" + id_venta + ",'" + fecha + "','" + Lugar + "','" + CP + "'," + total + "," + efectivo + "," + cambio + ");");

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Connection conectarJasper() {
        Connection link = null;
        String ruta = "jdbc:mysql://localhost/puntoventa";
        String u = "root";
        String p = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(ruta, u, p);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return link;
    }

}
