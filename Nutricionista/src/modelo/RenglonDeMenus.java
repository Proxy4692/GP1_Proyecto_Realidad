package modelo;

public class RenglonDeMenus{
    
    private int nroRenglon;
    private Comidas alimento;
    private double cantidadGrs;
    private int subtotalCalorias;

    public RenglonDeMenus(){
    }

    public RenglonDeMenus(int nroRenglon, Comidas alimento, double cantidadGrs, int subtotalCalorias) {
        this.nroRenglon = nroRenglon;
        this.alimento = alimento;
        this.cantidadGrs = cantidadGrs;
        this.subtotalCalorias = subtotalCalorias;
    }

    public int getNroRenglon(){
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon){
        this.nroRenglon = nroRenglon;
    }

    public Comidas getAlimento(){
        return alimento;
    }

    public void setAlimento(Comidas alimento){
        this.alimento = alimento;
    }

    public double getCantidadGrs(){
        return cantidadGrs;
    }

    public void setCantidadGrs(double cantidadGrs){
        this.cantidadGrs = cantidadGrs;
    }

    public int getSubtotalCalorias(){
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(int subtotalCalorias){
        this.subtotalCalorias = subtotalCalorias;
    }

    @Override
    public String toString(){
        return "RenglonDeMenus{" + "nroRenglon=" + nroRenglon + ", alimento=" + alimento + ", cantidadGrs=" + cantidadGrs + ", subtotalCalorias=" + subtotalCalorias + '}';
    }
}