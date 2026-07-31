
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionBD {
    
    public static Connection conectar() {

        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/centro_ad",
                    "root",
                    "Nirvana251#"
            );

            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }

        return conexion;
    }
    
}
