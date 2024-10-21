package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_dietas";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña";
    
    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos.");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos.");
        }
        return connection;
    }
}