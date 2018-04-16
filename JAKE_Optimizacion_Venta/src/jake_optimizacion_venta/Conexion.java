package jake_optimizacion_venta;
import java.sql.*;
/**
 * se añadio esta clase para guaradr actalizaciones enrte ventanas
 * @author Juanez
 */
public class Conexion {
    
    static private Connection conexion;
    static private Statement instruccion;

    @SuppressWarnings("empty-statement")
    static public boolean Conectar(String BD, String User, String Password) throws Exception {
        boolean con;

        try {
           // DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
           
            Conexion.conexion = DriverManager.getConnection("jdbc:mysql://" + BD ,  User , Password);
            Conexion.instruccion = conexion.createStatement();

            con = true;
        } catch (SQLException exc) {
            System.out.println("Error "+exc.toString());
            con = false;
        };

        return con;
    }

    static public ResultSet EjecutarConsulta(String instruccionQL) throws SQLException {

        ResultSet resultado = Conexion.instruccion.executeQuery(instruccionQL);

        return resultado;
    }

    static public int ejecutarActualizacion(String instruccionDML) throws SQLException {
        int i;
        i = Conexion.instruccion.executeUpdate(instruccionDML);
        System.out.println(instruccionDML + " Ejecutada");
        return i;

    }
}
