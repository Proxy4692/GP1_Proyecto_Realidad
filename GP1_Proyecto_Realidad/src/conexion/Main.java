/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author elsap
 */
public class Main {
    
     public static void main(String[] args) {
        Connection conn = Conexion.getConnection();
        if (conn != null) {
            System.out.println("Conexion a la base de datos  esta establecida.");
            try {
                conn.close();
                System.out.println("Conexion cerrada.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo establecer la conexion a su base de datos.");
        }
    }
}
    
    

