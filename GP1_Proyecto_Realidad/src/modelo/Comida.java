/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author elsap
 */
public class Comida {
    
    private String codComida;
    private String nombreCompleto; 
    private int caloriasPorPorcion; 
    private String tipo; 
    private String detalle;

    public Comida(String codComida, String nombreCompleto, int caloriasPorPorcion, String tipo, String detalle) {
        this.codComida = codComida;
        this.nombreCompleto = nombreCompleto;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public String getCodComida() {
        return codComida;
    }

    public void setCodComida(String codComida) {
        this.codComida = codComida;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }

    public void setCaloriasPorPorcion(int caloriasPorPorcion) {
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Comida{" + "codComida=" + codComida + ", nombreCompleto=" + nombreCompleto + ", caloriasPorPorcion=" + caloriasPorPorcion + ", tipo=" + tipo + ", detalle=" + detalle + '}';
    }
    
    
    
    
    
    
    
}
