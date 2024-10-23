package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD:GP1_Proyecto_Realidad/src/conexion/DatabaseConnection.java
public class DatabaseConnection{
    private static final String URL = "jdbc:mariadb://localhost:3306/nutricionista"; // Incluye el puerto y la base de datos
=======
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost:3306/GP1_nutricionista_DB"; // Incluye el puerto y la base de datos
>>>>>>> 44b76d64233f944206d212638f0c8e30e7c204b2:GP1_Proyecto_Realidad/src/conexion/Conexion.java
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
