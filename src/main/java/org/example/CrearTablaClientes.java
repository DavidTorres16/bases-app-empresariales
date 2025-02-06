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

        String[] clientes = {
                    "INSERT INTO clientes (nombre, email, telefono) VALUES ('Santiago Arias', 'santiago@email.com', '123456789')",
                    "INSERT INTO clientes (nombre, email, telefono) VALUES ('Juan Pérez', 'juan@email.com', '987654321')",
                    "INSERT INTO clientes (nombre, email, telefono) VALUES ('María López', 'maria@email.com', '456123789')",
                    "INSERT INTO clientes (nombre, email, telefono) VALUES ('Carlos Gómez', 'carlos@email.com', '741852963')",
                    "INSERT INTO clientes (nombre, email, telefono) VALUES ('Ana Torres', 'ana@email.com', '369258147')"
                    };

        System.out.println("5 clientes registrados exitosamente.");

    }

}
