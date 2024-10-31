package servicios;

import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Comidas;
import modelo.RenglonDeMenus;
import java.sql.PreparedStatement;

public class RenglonDeMenusService{
    private Connection con = null;

    public RenglonDeMenusService(){
        con = getConexion();
    }
    
    public RenglonDeMenus modificarRenglon(){
        String sql = "UPDATE RenglonDeMenu SET cantidadGrs = ?, subtotalCalorias = ?, menuDiario_codMenu = ?, alimento_codComida = ? WHERE nroRenglon = ?";
        try(Connection connection = MySQLConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setDouble(1, renglon.getCantidadGrs());
            statement.setInt(2, renglon.getSubtotalCalorias());
            statement.setInt(3, renglon.getMenuDiarioCodMenu());
            statement.setInt(4, renglon.getAlimentoCodComida());
            statement.setInt(5, renglon.getNroRenglon());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    //    RenglonDeMenus renglon= new RenglonDeMenus();
    //    return renglon;
    }
    
    public void imprimirRenglon(RenglonDeMenus renglon){
        String sql = "INSERT INTO ResnglonDeMenu (nroRenglon, cantidadGrs, subtotalCalorias, menuDiario_codMenu, alimento_codComida) VALUES (?, ?, ? , ?, ?)";
        try(Connection connection = MySQLConnection.getConnection();
                PreaparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1, renglon.getNroRenglon());
            statement.setDouble(2, renglon.getCantidadGrs());
            statement.setInt(3, renglon.getSubtotalCalorias());
            statement.setInt(4, renglon.getMenuDiarioCodMenu());
            statement.setInt(5, renglon.getAlimentoCodComida());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void eliminarRenglon(int nroRenglon){
        String sql = "DELETE FROM RenglonDeMenu WHERE nroRenglon = ?";
        try(Connection connection = MySQLConnection.getConnection();
                PreaparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1, nroRenglon);
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public RenglonDeMenus obtenerRenglonPorNum(int nroRenglon){
        String sql = "SELECT * FROM RenglonDeMenu WHERE nroRenglon = ?";
        RenglonDeMenu renglon = null;
        try(Connection connection = MySQLConnection.getConnection();
                PreaparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1, nroRenglon);
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next()){
                renglon = new RenglonDeMenus(
                        resultSet.getInt("nroRenglon"),
                        resultSet.getDouble("cantidadGrs"),
                        resultSet.getInt("subtotalCalorias"),
                        resultSet.getInt("menuDiario_codMenu"),
                        resultSet.getInt("alimento_codComida")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<RenglonDeMenus> obtenerRenglonesPorMenu(int menuDiarioCodMenu){
        String sql = "SELECT * FROM RenglonDeMenu WHERE menuDiario_codMenu = ?";
        List<RenglonDeMenus> renglones = new ArrayList<>();
        try(Connection connection = MySQLConnection.getConnection();
                PreaparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1, menuDiarioCodMenu);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                RenglonDeMenus renglon = new RenglonDeMenus(
                resultSet.getInt("nroRenglon"),
                resultSet.getDouble("cantidadGrs"),
                resultSet.getInt("subtotalCalorias"),
                resultSet.getInt("menuDiario_codMenu"),
                resultSet.getInt("alimento_codComida")
                );
                renglones.add(renglon);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return renglones;
    }
    
    public void addAlimento(Comidas comida){
        
    }
    
    public int subtotalCalorias(){
        int subCal=0;
        return subCal;
    }
    
}
