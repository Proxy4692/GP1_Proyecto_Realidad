import java.time.LocalDate;
import java.util.Date;

public class Dietas {
    private int codDieta;
    private String nombreD;
    private LocalDate fechaIni;    
    private LocalDate fechaFin;    
    private boolean estado;
    private int totalCalorias;
    private int pacienteNroPaciente;

    public Dietas(int codDieta, String nombreD, LocalDate fechaIni, LocalDate fechaFin, boolean estado, int totalCalorias, int pacienteNroPaciente) {
        this.codDieta = codDieta;
        this.nombreD = nombreD;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.pacienteNroPaciente = pacienteNroPaciente;
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

    public int getPacienteNroPaciente() {
        return pacienteNroPaciente;
    }

    public void setPacienteNroPaciente(int pacienteNroPaciente) {
        this.pacienteNroPaciente = pacienteNroPaciente;
    }

  

    
    @Override
    public String toString() {
        return "Dietas{" + "codDieta=" + codDieta + ", nombreD=" + nombreD + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", estado=" + estado + ", totalCalorias=" + totalCalorias + ", pacienteNroPaciente=" + pacienteNroPaciente + '}';
    }

    }

