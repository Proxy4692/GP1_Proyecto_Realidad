package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost:3306/nutricionista"; // Incluye el puerto y la base de datos
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion Exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        
        return connection;
    }
        return null;
    }
  }
