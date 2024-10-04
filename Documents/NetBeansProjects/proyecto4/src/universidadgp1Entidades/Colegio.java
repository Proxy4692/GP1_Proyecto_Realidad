/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgp1Entidades;

import java.sql.Connection;
import universidadgp1accesoADatos.Conexion;

/**
 *
 * @author elsap
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        //Materia inglesI = new Materia(1, "Ingles I", 1);
        //Materia matematicas = new Materia(2, "Matemáticas", 1);
        //Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);
        
        //Alumno alumno1 = new Alumno(1001, "Lopez", "Martin");
        //Alumno alumno2 = new Alumno(1002, "Martinez", "Brenda");
       
        //alumno1.agregarMateria(inglesI);
        //alumno1.agregarMateria(matematicas);
        //alumno1.agregarMateria(laboratorio1);

        
        //alumno2.agregarMateria(inglesI);
      //alumno2.agregarMateria(matematicas);
       //alumno2.agregarMateria(laboratorio1);
      //alumno2.agregarMateria(laboratorio1); // No se agregará porque ya existe en el conjunto

        // 5. Visualizar la cantidad de materias a las que está inscripto cada alumno
        //System.out.println("Cantidad de materias inscritas de López Martin: " + alumno1.cantidadMaterias());
        //System.out.println("Cantidad de materias inscritas de Martínez Brenda: " + alumno2.cantidadMaterias());

        // Mostrar detalles de los alumnos
        //System.out.println(alumno1);
       // System.out.println(alumno2);
    }//
    
  Connection con=Conexion.getConexion(); 
    
}

