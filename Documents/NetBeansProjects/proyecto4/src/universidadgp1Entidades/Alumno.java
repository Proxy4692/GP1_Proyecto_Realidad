/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgp1Entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author elsap
 */
public class Alumno {
    
    private int nrolegajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias;

    public Alumno(int nrolegajo, String apellido, String nombre) {
        this.nrolegajo = nrolegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }
    
       
     public boolean agregarMateria(Materia materia) {
        return materias.add(materia);
    }
    
     public int cantidadMaterias(){
     return materias.size();
     }
    
     public int getNroLegajo(){
     return getNroLegajo();
     }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nrolegajo=" + nrolegajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
    }
     
}
