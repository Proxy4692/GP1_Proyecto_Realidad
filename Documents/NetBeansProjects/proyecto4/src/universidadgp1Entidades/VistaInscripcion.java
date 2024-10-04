/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgp1Entidades;

import java.util.HashSet;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author elsap
 */
class VistaInscripcion  extends JInternalFrame{
      private HashSet<Alumno> alumnosSet;
    private HashSet<Materia> materiasSet;

    public VistaInscripcion(HashSet<Alumno> alumnosSet, HashSet<Materia> materiasSet) {
        super("Vista Inscripcion", true, true, true, true);
        this.alumnosSet = alumnosSet;
        this.materiasSet = materiasSet;
        setSize(400, 300);  // Establecer tamaño de la ventana

        // Crear un JTextArea para mostrar la inscripcion de alumnos en materias
        JTextArea textArea = new JTextArea(15, 30);
        textArea.append("Inscripcion de alumnos en materias:\n");
        for (Alumno alumno : alumnosSet) {
            textArea.append("Alumno: " + alumno.toString() + "\n");
            for (Materia materia : materiasSet) {
                textArea.append("  - Materia: " + materia.toString() + "\n");
            }
            textArea.append("\n");
        }
        add(new JScrollPane(textArea));
    }
    
}
