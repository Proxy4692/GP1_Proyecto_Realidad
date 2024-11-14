package modelo;

public class Alimentos {
    
    private int codAlimento;
    private String nombreA;
    private boolean selA;
     private int caloriasPor100g;

    public Alimentos() {
    }

     public Alimentos(int codAlimento, String nombreA, boolean selA, int caloriasPor100g) {
        this.codAlimento = codAlimento;
        this.nombreA = nombreA;
        this.selA = selA;
        this.caloriasPor100g = caloriasPor100g;
    }

    // Getters y setters
    public int getCodAlimento() {
        return codAlimento;
    }

    public void setCodAlimento(int codAlimento) {
        this.codAlimento = codAlimento;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public boolean isSelA() {
        return selA;
    }

    public void setSelA(boolean selA) {
        this.selA = selA;
    }

    
    public int getCaloriasPor100g() {
        return caloriasPor100g;
    }

    public void setCaloriasPor100g(int caloriasPor100g) {
        this.caloriasPor100g = caloriasPor100g;  
    }

    @Override
    public String toString() {
        return "Alimentos{" + "codAlimento=" + codAlimento + ", nombreA=" + nombreA + ", selA=" + selA + ", caloriasPor100g=" + caloriasPor100g + '}';
    }
}
    
    
    
    
    
