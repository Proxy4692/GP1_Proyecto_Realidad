package modelo;

import java.util.ArrayList;
import java.util.List;

public class MenuDiarios {
    
    private int codMenu;         
    private int codDieta;        
    private int dia;             
    private int caloriasDelMenu; 
    private String detalle;      
    private String estado;  
     private List<RenglonDeMenus> reglones;
 
    
     public MenuDiarios() {
        this.reglones = new ArrayList<>();  
    }

     
     public MenuDiarios(int codMenu, int codDieta, int dia, int caloriasDelMenu, String detalle, String estado) {
        this.codMenu = codMenu;
        this.codDieta = codDieta;
        this.dia = dia;
        this.caloriasDelMenu = caloriasDelMenu;
        this.detalle = detalle;
        this.estado = estado;
        this.reglones = new ArrayList<>(); 
    }

    
    public void agregarReglon(RenglonDeMenus reglón) {
        reglones.add(reglón);  
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getCaloriasDelMenu() {
        return caloriasDelMenu;
    }

    public void setCaloriasDelMenu(int caloriasDelMenu) {
        this.caloriasDelMenu = caloriasDelMenu;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public void calcularCaloriasDelMenu() {
        this.caloriasDelMenu = 0;  
        for (RenglonDeMenus reglón : reglones) {  
            this.caloriasDelMenu += reglón.getSubtotalCalorias();  
        }
    }
}
     
     

   