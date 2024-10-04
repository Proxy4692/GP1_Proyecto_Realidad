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
class VistaMaterias extends JInternalFrame{
     private HashSet<Materia> materiasSet;

    public VistaMaterias(HashSet<Materia> materiasSet) {
        super("Vista Materias", true, true, true, true);
        this.materiasSet = materiasSet;
        setSize(300, 200);  // Establecer tamaño de la ventana

        // Crear un JTextArea para mostrar las materias
        JTextArea textArea = new JTextArea(10, 20);
        for (Materia materia : materiasSet) {
            textArea.append(materia.toString() + "\n");
        }
        add(new JScrollPane(textArea));
}
}