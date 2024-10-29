package modelo;

public class Alimentos {
    
    private int codAlimento;
    private String nombreA;
    private boolean selA;

    public Alimentos(){};
    
    public Alimentos(int codAlimento, String nombre, boolean selA) {
        this.codAlimento = codAlimento;
        this.nombreA = nombre;
        this.selA = selA;
    }

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



    @Override
    public String toString() {
        return "codAlimento=" + codAlimento + ", nombre=" + nombreA ;
    }
    
}
