package modelo;

import java.time.LocalDate;
import java.util.List;

public class Dieta{
    private int codDieta;
    private String nombreD;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private float pesoFinal;
    private boolean estado;
    private int totalCalorias;
    private Paciente paciente;

    public Dieta(int codDieta, String nombreD, LocalDate fechaIni, LocalDate fechaFin, Paciente paciente) {
        this.codDieta = codDieta;
        this.nombreD = nombreD;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.paciente = paciente;
    }

    public int getCodDieta(){
        return codDieta;
    }

    public void setCodDieta(int codDieta){
        this.codDieta = codDieta;
    }

    public String getNombreD(){
        return nombreD;
    }

    public void setNombreD(String nombreD){
        this.nombreD = nombreD;
    }

    public LocalDate getFechaIni(){
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni){
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin(){
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin){
        this.fechaFin = fechaFin;
    }

    public float getPesoFinal(){
        return pesoFinal;
    }

    public void setPesoFinal(float pesoFinal){
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public int getTotalCalorias(){
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias){
        this.totalCalorias = totalCalorias;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public void cargarPesoYFinalizar(float pesoFinal){
        this.pesoFinal = pesoFinal;
        this.estado = true;
    }
}
