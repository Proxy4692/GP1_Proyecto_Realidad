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
    private int kcalTotal;
    private List comidas;
    private boolean estado;
    private Dietas dietas;


    public MenuDiarios() {
    }

    public MenuDiarios(int diaNro, List comidas, boolean estado, Dietas dietas, int kcalTotal, int desayuno, int almuerzo, int colacion, int merienda, int cena) {
        this.diaNro = diaNro;
        this.comidas = comidas;
        this.estado = estado;
        this.dietas = dietas;
        this.kcalTotal = kcalTotal;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.colacion = colacion;
        this.merienda = merienda;
        this.cena = cena;
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

    public MenuDiarios(int diaNro, List comidas, boolean estado, Dietas dieta) {
        this.diaNro = diaNro;
        this.comidas = comidas;
        this.estado = estado;
        this.dietas = dieta;
    }

    public MenuDiarios(int codMenu, int diaNro, List comidas, boolean estado, Dietas dieta) {
        this.codMenu = codMenu;
        this.diaNro = diaNro;
        this.comidas = comidas;
        this.estado = estado;
        this.dietas = dieta;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
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

    public int getKcalTotal() {
        return kcalTotal;
    }

    public void setKcalTotal(int kcalTotal) {
        this.kcalTotal = kcalTotal;
    }

    public Dietas getDietas() {
        return dietas;
    }

    public void setDietas(Dietas dietas) {
        this.dietas = dietas;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public int getDiaNro() {
        return diaNro;
    }

    public void setDiaNro(int diaNro) {
        this.diaNro = diaNro;
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

    public Dietas getDieta() {
        return dietas;
    }

    public void setDieta(Dietas dieta) {
        this.dietas = dieta;
    }

    @Override
    public String toString() {
        return "MenuDiarios{" + "codMenu=" + codMenu + ", diaNro=" + diaNro + ", comidas=" + comidas + ", estado=" + estado + ", dieta=" + dietas + '}';
    }
    
}
