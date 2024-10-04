/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgp1Entidades;

import javax.swing.*; // Importar todos los componentes de Swing
import java.awt.*;    // Importar los componentes gráficos de AWT si es necesario
import java.util.HashSet;

/**
 *
 * @author elsap
 */
class VistaAlumnos extends JInternalFrame {
    
      private HashSet<Alumno> alumnosSet;

    public VistaAlumnos(HashSet<Alumno> alumnosSet) {
        // Inicializar el JInternalFrame con titulo y propiedades
        super("Vista Alumnos", true, true, true, true);
        this.alumnosSet = alumnosSet;
        setSize(300, 200);  // Establecer tamaño de la ventana

        // Crear un JTextArea para mostrar los alumnos
        JTextArea textArea = new JTextArea(10, 20);
        for (Alumno alumno : alumnosSet) {
            textArea.append(alumno.toString() + "\n");
        }
        add(new JScrollPane(textArea));  
   
    
}
}
