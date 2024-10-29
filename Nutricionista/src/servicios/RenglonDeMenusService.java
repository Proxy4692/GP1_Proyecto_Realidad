package servicios;

import static conexion.Conexion.getConexion;
import java.sql.Connection;
import modelo.Comidas;
import modelo.RenglonDeMenus;

public class RenglonDeMenusService {
    
    private Connection con = null;

    public RenglonDeMenusService(){
        con = getConexion();
    }
    
    public RenglonDeMenus modificarRenglon(){
        RenglonDeMenus renglon= new RenglonDeMenus();
        return renglon;
    }
    
    public void imprimirRenglon(){
        
    }
    
    public void addAlimento(Comidas comida){
        
    }
    
    public int subtotalCalorias(){
        int subCal=0;
        return subCal;
    }
    
}
