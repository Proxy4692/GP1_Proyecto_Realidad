package modelo;



public class RenglonDeMenus{
    
   private int nroRenglon;        
    private int codComida;         
    private int cantidadEnGramos;  
    private int subtotalCalorias;

    public RenglonDeMenus(){
        
    }

    public RenglonDeMenus(int nroRenglon, int codComida, int cantidadEnGramos, int subtotalCalorias) {
        this.nroRenglon = nroRenglon;
        this.codComida = codComida;
        this.cantidadEnGramos = cantidadEnGramos;
        this.subtotalCalorias = subtotalCalorias;
    }

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }

    public int getCodComida() {
        return codComida;
    }

    public void setCodComida(int codComida) {
        this.codComida = codComida;
    }

    public int getCantidadEnGramos() {
        return cantidadEnGramos;
    }

    public void setCantidadEnGramos(int cantidadEnGramos) {
        this.cantidadEnGramos = cantidadEnGramos;
    }

    public int getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(int subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }
    
    
    public void calcularSubtotalCalorias(int caloriasPor100g) {
        this.subtotalCalorias = (int)((cantidadEnGramos * caloriasPor100g) / 100.0);
    }

    
    public int operar() {
    return this.subtotalCalorias;  
    
    
    }  

    @Override
    public String toString() {
        return "RenglonDeMenus{" + "nroRenglon=" + nroRenglon + ", codComida=" + codComida + ", cantidadEnGramos=" + cantidadEnGramos + ", subtotalCalorias=" + subtotalCalorias + '}';
    }
}

    