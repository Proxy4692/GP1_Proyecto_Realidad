package servicios;

import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.util.List;
import modelo.MenuDiarios;
import modelo.RenglonDeMenus;

public class MenuDiariosService {
    
    private Connection con = null;

    public MenuDiariosService(){
        con = getConexion();
    }
    
    public void alterarDietaDiaria(){
        
    }
    
    public List<MenuDiarios> generarDietaDiaria(){
        List<MenuDiarios> menu= null;
        return menu;
    }
    
    public List<MenuDiarios> armarDietaDiaria(){
        List<MenuDiarios> menu= null;
        return menu;
    }
    
    public void addRenglon(RenglonDeMenus renglon){
        
    }
    
    public int calcularCaloriasDelDia(){
        int cal=0;
        return cal;
    }
    
    public void imprimirMenuDiario(){
        
    }
}
