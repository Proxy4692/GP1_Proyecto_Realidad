/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgp1Entidades;

import java.awt.BorderLayout;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author elsap
 */
public class VistaPrincipal extends JFrame{

   public static HashSet<Alumno> alumnosSet = new HashSet<>();
    public static HashSet<Materia> materiasSet = new HashSet<>();

   
 
      
  public VistaPrincipal() {
    initComponents();
    setTitle("Vista Principal");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
}

private void initComponents() {
    // Crear un JDesktopPane
    JDesktopPane desktopPane = new JDesktopPane();
    add(desktopPane, BorderLayout.CENTER);

    // Crear botones
    JButton btnAlumnos = new JButton("Alumnos");
    JButton btnMaterias = new JButton("Materias");
    JButton btnInscripcion = new JButton("Inscripción");

    // Crear panel de botones y agregar los botones
    JPanel panelBotones = new JPanel();
    panelBotones.add(btnAlumnos);
    panelBotones.add(btnMaterias);
    panelBotones.add(btnInscripcion);
    add(panelBotones, BorderLayout.NORTH);

    // Acciones de los botones
    btnAlumnos.addActionListener(e -> {
        //abrir VistaAlumnos
    });

   btnMaterias.addActionListener(e -> {
        //abrir VistaMaterias
    });


    btnInscripcion.addActionListener(e -> {
        // abrir VistaInscripcion
    });
}
}
 
