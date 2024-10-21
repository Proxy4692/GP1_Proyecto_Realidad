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

    public void cargarPesoYFinalizar(float pesoFinal) {
        this.pesoFinal = pesoFinal;
        this.estado = true;
    }
}