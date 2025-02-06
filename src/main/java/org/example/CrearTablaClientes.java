import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablaClientes {
    public static void main(String[] args) {

        String sql = "CREATE TABLE IF NOT EXISTS clientes (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nombre VARCHAR(100) NOT NULL, " +
                     "email VARCHAR(100) NOT NULL, UNIQUE," +
                     "correo VARCHAR(100) UNIQUE, " +
                     "telefono VARCHAR(15), " +
                     "fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                     ")";
    }

}
