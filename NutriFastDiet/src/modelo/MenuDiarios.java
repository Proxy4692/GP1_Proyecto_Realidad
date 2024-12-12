package modelo;

import java.util.List;

public class MenuDiarios {
    
    private int codMenu;
    private int codDieta;
    private int diaNro;
    private int desayuno;
    private int almuerzo;
    private int colacion;
    private int merienda;
    private int cena;
    private String txdesayuno;
    private String txalmuerzo;
    private String txcolacion;
    private String txmerienda;
    private String txcena;
    private int kcalTotal;
    private List comidas;
    private boolean estado;

    public MenuDiarios() {
    }


    public MenuDiarios(int codDieta, int diaNro, int desayuno, int almuerzo, int colacion, int merienda, int cena, boolean estado) {
        this.codDieta = codDieta;
        this.diaNro = diaNro;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.colacion = colacion;
        this.merienda = merienda;
        this.cena = cena;
        this.estado = estado;
    }
     
    public MenuDiarios(int codDieta, int diaNro, String txdesayuno, String txalmuerzo, String txcolacion, String txmerienda, String txcena, int kcalTotal, boolean estado) {
        this.codDieta = codDieta;
        this.diaNro = diaNro;
        this.txdesayuno = txdesayuno;
        this.txalmuerzo = txalmuerzo;
        this.txcolacion = txcolacion;
        this.txmerienda = txmerienda;
        this.txcena = txcena;
        this.kcalTotal = kcalTotal;
        this.estado = estado;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public int getDiaNro() {
        return diaNro;
    }

    public void setDiaNro(int diaNro) {
        this.diaNro = diaNro;
    }

    public int getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(int desayuno) {
        this.desayuno = desayuno;
    }

    public int getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(int almuerzo) {
        this.almuerzo = almuerzo;
    }

    public int getColacion() {
        return colacion;
    }

    public void setColacion(int colacion) {
        this.colacion = colacion;
    }

    public int getMerienda() {
        return merienda;
    }

    public void setMerienda(int merienda) {
        this.merienda = merienda;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getTxdesayuno() {
        return txdesayuno;
    }

    public void setTxdesayuno(String txdesayuno) {
        this.txdesayuno = txdesayuno;
    }

    public String getTxalmuerzo() {
        return txalmuerzo;
    }

    public void setTxalmuerzo(String txalmuerzo) {
        this.txalmuerzo = txalmuerzo;
    }

    public String getTxcolacion() {
        return txcolacion;
    }

    public void setTxcolacion(String txcolacion) {
        this.txcolacion = txcolacion;
    }

    public String getTxmerienda() {
        return txmerienda;
    }

    public void setTxmerienda(String txmerienda) {
        this.txmerienda = txmerienda;
    }

    public String getTxcena() {
        return txcena;
    }

    public void setTxcena(String txcena) {
        this.txcena = txcena;
    }

    public int getKcalTotal() {
        return kcalTotal;
    }

    public void setKcalTotal(int kcalTotal) {
        this.kcalTotal = kcalTotal;
    }

    public List getComidas() {
        return comidas;
    }

    public void setComidas(List comidas) {
        this.comidas = comidas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "MenuDiarios{" + "codMenu=" + codMenu + ", codDieta=" + codDieta + ", diaNro=" + diaNro + ", desayuno=" + desayuno + ", almuerzo=" + almuerzo + ", colacion=" + colacion + ", merienda=" + merienda + ", cena=" + cena + ", txdesayuno=" + txdesayuno + ", txalmuerzo=" + txalmuerzo + ", txcolacion=" + txcolacion + ", txmerienda=" + txmerienda + ", txcena=" + txcena + ", kcalTotal=" + kcalTotal + ", comidas=" + comidas + ", estado=" + estado + '}';
    }


}
