package modelo;

import java.time.LocalDate;
import java.util.List;

public class Dietas {
    private int nroPaciente;
    private int codDieta;
    private String nombreD;
    private List menus;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private double pesoFinal;
    private boolean estado;
    private int totalCalorias;
    private int cantMenu;
    private String kcalSelec;

    public Dietas() {
    }

    public Dietas(Integer nroPaciente, String nombreD, LocalDate fechaIni, LocalDate fechaFin, int cantMenu, String kcalSelec) {
        this.nroPaciente = nroPaciente;
        this.nombreD = nombreD;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantMenu = cantMenu;
        this.kcalSelec = kcalSelec;
    }
    
    public Dietas(Integer codDieta, Integer nroPaciente, String nombreD, LocalDate fechaIni, LocalDate fechaFin, int cantMenu, String kcalSelec) {
        this.codDieta = codDieta;
        this.nroPaciente = nroPaciente;
        this.nombreD = nombreD;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantMenu = cantMenu;
        this.kcalSelec = kcalSelec;
    }

    public int getNroPaciente() {
        return nroPaciente;
    }

    public void setNroPaciente(int nroPaciente) {
        this.nroPaciente = nroPaciente;
    }

    public int getCantMenu() {
        return cantMenu;
    }

    public void setCantMenu(int cantMenu) {
        this.cantMenu = cantMenu;
    }

    public String getKcalSelec() {
        return kcalSelec;
    }

    public void setKcalSelec(String KcalSelec) {
        this.kcalSelec = KcalSelec;
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

    @Override
    public String toString() {
        return "Dietas{" + "nroPaciente=" + nroPaciente + ", codDieta=" + codDieta + ", nombreD=" + nombreD + ", menus=" + menus + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", pesoFinal=" + pesoFinal + ", estado=" + estado + ", totalCalorias=" + totalCalorias + ", cantMenu=" + cantMenu + ", KcalSelec=" + kcalSelec + '}';
    }


    
}
