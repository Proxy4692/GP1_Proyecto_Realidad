package modelo;

import java.util.List;

public class MenuDiarios {
    
    private int codMenu;
    private int diaNro;
    private List comidas;
    private boolean estado;
    private Dietas dieta;

    public MenuDiarios() {
    }

    public MenuDiarios(int diaNro, List comidas, boolean estado, Dietas dieta) {
        this.diaNro = diaNro;
        this.comidas = comidas;
        this.estado = estado;
        this.dieta = dieta;
    }

    public MenuDiarios(int codMenu, int diaNro, List comidas, boolean estado, Dietas dieta) {
        this.codMenu = codMenu;
        this.diaNro = diaNro;
        this.comidas = comidas;
        this.estado = estado;
        this.dieta = dieta;
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
        return dieta;
    }

    public void setDieta(Dietas dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "MenuDiarios{" + "codMenu=" + codMenu + ", diaNro=" + diaNro + ", comidas=" + comidas + ", estado=" + estado + ", dieta=" + dieta + '}';
    }
    
}
