package servicios;

import static conexion.Conexion.getConexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.MenuDiarios;
import modelo.RenglonDeMenus;

public class MenuDiariosService{
    private Connection connection;
    
    public MenuDiariosService(Connection connection){
        this.connection = connection;
    }
    
    public void alterarDietaDiaria(MenuDiarios menuDiarios) throws SQLException{
        String sql = "UPDATE menu_diario SET fecha = ? WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setDate(1, Date.valueOf(menuDiarios.getFecha()));
            statement.setInt(2, menuDiarios.getId());
            statement.executeUpdate();
        }
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
