package modelo;

public class RenglonDeMenus {
    
    private int nroRenglon;
    private double cantidadGrs;
    private int subtotalCalorias;
    private int conComida;

    public RenglonDeMenus() {
    }

    public RenglonDeMenus(double cantidadGrs, int subtotalCalorias, int conComida) {
        this.conComida = conComida;
        this.cantidadGrs = cantidadGrs;
        this.subtotalCalorias = subtotalCalorias;
    }

    public RenglonDeMenus(int nroRenglon, double cantidadGrs, int subtotalCalorias, int conComida) {
        this.nroRenglon = nroRenglon;
        this.cantidadGrs = cantidadGrs;
        this.subtotalCalorias = subtotalCalorias;
        this.conComida = conComida;
    }

    public int getConComida() {
        return conComida;
    }

    public void setConComida(int conComida) {
        this.conComida = conComida;
    }

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }


    public double getCantidadGrs() {
        return cantidadGrs;
    }

    public void setCantidadGrs(double cantidadGrs) {
        this.cantidadGrs = cantidadGrs;
    }

    public int getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(int subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }

    @Override
    public String toString() {
        return "RenglonDeMenus{" + "nroRenglon=" + nroRenglon  + ", cantidadGrs=" + cantidadGrs + ", subtotalCalorias=" + subtotalCalorias + '}';
    }
    
}
