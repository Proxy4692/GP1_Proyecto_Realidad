package modelo;

import java.time.LocalDate;
import java.util.List;

public class Dietas {
    private int codDieta;
    private String nombreD;
    private List menus;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private double pesoFinal;
    private boolean estado;
    private int totalCalorias;
    private Pacientes paciente;

    public Dietas() {
    }

    public Dietas(String nombreD, List menus, LocalDate fechaIni, LocalDate fechaFin, double pesoFinal, boolean estado, int totalCalorias, Pacientes paciente) {
        this.nombreD = nombreD;
        this.menus = menus;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
    }

    public Dietas(int codDieta, String nombreD, List menus, LocalDate fechaIni, LocalDate fechaFin, float pesoFinal, boolean estado, int totalCalorias, Pacientes paciente) {
        this.codDieta = codDieta;
        this.nombreD = nombreD;
        this.menus = menus;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public List getMenus() {
        return menus;
    }

    public void setMenus(List menus) {
        this.menus = menus;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Dietas{" + "codDieta=" + codDieta + ", nombreD=" + nombreD + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", pesoFinal=" + pesoFinal + ", estado=" + estado + ", totalCalorias=" + totalCalorias + ", paciente=" + paciente + '}';
    }
    
}
