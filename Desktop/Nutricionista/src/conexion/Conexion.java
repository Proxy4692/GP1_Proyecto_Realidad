package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion{
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB ="nutricionista";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static  Connection connection;
    
  private Conexion(){}    
    public static Connection getConexion(){
    
    if(connection ==null){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);           
            JOptionPane.showMessageDialog(null,"Conectado");
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar los driver: "+ex.getMessage());
            
            
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, "Error al cargar la Base de Datos: "+ex.getMessage());
            }
        }
        return connection;
    }
}
