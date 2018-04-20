/*
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

    public ArrayList realizarVenta(String Id, int cant) {
        ArrayList mLista = new ArrayList<>();
        Producto mProducto = null;
        Statement consulta;
        ResultSet resultado;
        ResultSet resultado2;
        // List <Producto> CatalogoBD = new ArrayList<>();
        try {
            mProducto = new Producto();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from puntoventa.producto "
                    + "where id_producto = '" + Id + "';");
            if (resultado.next()) {
                mProducto.setNombre(resultado.getString("nombre"));
                mProducto.setPrecio(resultado.getInt("precio"));
                mLista.add(mProducto);
            }

            resultado2 = consulta.executeQuery("update detalle_venta set "
                    + "cantidad = cantidad - '" + cant + "';");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mLista;
    }

    public ArrayList ListaProductos(String Id) {
        ArrayList ListaProductos = new ArrayList();
        Producto mProducto = null;
        Statement Consulta;
        ResultSet Resultado;
        try {
            Consulta = conexion.createStatement();
             Resultado =  Consulta.executeQuery("select * from productos " +
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
}
