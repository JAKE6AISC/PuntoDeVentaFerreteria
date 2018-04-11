/*
 **Kevin Fabian Cruz Gómez
 **Clase Base de datos para la conexión 
 */
package jake_optimizacion_venta;

import java.sql.Connection;
import java.sql.DriverManager;

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
}
