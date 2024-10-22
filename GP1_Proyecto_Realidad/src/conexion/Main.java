/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import modelo.Comida;
import modelo.Comida.ComidaDAO;

/**
 *
 * @author elsap
 */
public class Main {
    
     public static void main(String[] args) {
        Connection conn = DatabaseConnection.getConnection();
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
    
     
     
      Scanner scanner = new Scanner(System.in);
        ComidaDAO comidaDAO = null;

        while (true) {
            System.out.println("1. Mostrar todas las comidas");
            System.out.println("2. Buscar comida");
            System.out.println("3. Agregar comida");
            System.out.println("4. Actualizar comida");
            System.out.println("5. Borrar comida");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    List<Comida> comidas = comidaDAO.obtenerTodos();
                    for (Comida comida : comidas) {
                        System.out.println(comida);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el codigo de la comida: ");
                    String codBuscar = scanner.nextLine();
                    Comida comida = comidaDAO.buscar(codBuscar);
                    System.out.println(comida != null ? comida : "Comida no encontrada.");
                    break;
                case 3:
                    // Agregar logica para ingresar datos de comida
                    break;
                case 4:
                    // Agregar logica para actualizar comida
                    break;
                case 5:
                    // Agregar logica para borrar comida
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }

   
    }
    }


    
    

