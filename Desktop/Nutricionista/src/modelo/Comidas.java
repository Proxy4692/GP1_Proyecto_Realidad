package modelo;

import java.util.ArrayList;
import java.util.List;

public class Comidas {
    private int codComida;
    private String nombre;
    private String tipoComida;
    private int caloriasPor100g; 
    private String detalle;
    private boolean baja; 
    private List<Alimentos> alimentos;
    
   public Comidas(Alimentos alimento) {
        alimentos = new ArrayList<>();
        if (alimento != null) {
            alimentos.add(alimento);
        }
    }

    public Comidas() {
        alimentos = new ArrayList<>();
    }
   
   
   

    public Comidas(int codComida, String nombre, String tipoComida, int caloriasPor100g, boolean baja) {
        this.codComida = codComida;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPor100g = caloriasPor100g;
        this.baja = baja;
    }

    public Comidas(int codComida, String nombre, String tipoComida, int caloriasPor100g, String detalle, boolean baja) {
        this.codComida = codComida;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPor100g = caloriasPor100g;
        this.baja = baja;
        this.alimentos = new ArrayList<>();
           
    }

    public int getCodComida() {
        return codComida;
    }

    public void setCodComida(int codComida) {
        this.codComida = codComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getCaloriasPor100g() {
        return caloriasPor100g;
    }

    public void setCaloriasPor100g(int caloriasPor100g) {
        this.caloriasPor100g = caloriasPor100g;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    
    
    public void agregarAlimento(Alimentos alimento) {
        this.alimentos.add(alimento);
    }

    public void eliminarAlimento(Alimentos alimento) {
        this.alimentos.remove(alimento);
    }

    public List<Alimentos> getAlimentos() {
        return alimentos;
    }

    
     public void guardarAlimento(Alimentos alimento) {
        alimentos.add(alimento);
    }

   
    public void listarAlimentos() {
       if (alimentos.isEmpty()) {
            System.out.println("No hay alimentos en la lista.");
        } else {
            for (Alimentos alimento : alimentos) {
                System.out.println(alimento.toString());
            }
        }
    }
}
    
    
    
    
    

    
   

   

    

