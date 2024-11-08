package servicios;

import static conexion.Conexion.getConexion;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import modelo.Comidas;
import modelo.RenglonDeMenus;
import java.sql.PreparedStatement;

public class RenglonDeMenusService{
    private Connection connection;

    public RenglonDeMenusService(Connection connection){
        this.connection = connection;
    }
    
    public RenglonDeMenus modificarRenglon(RenglonDeMenus renglon) throws SQLException{
        String sql = "UPDATE RenglonDeMenu SET cantidadGrs = ?, subtotalCalorias = ?, menuDiario_codMenu = ?, alimento_codComida = ?, WHERE nroRenglon = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            statement.setDouble(1, renglon.getCantidadGrs());
            statement.setInt(2, renglon.getSubtotalCalorias());
            statement.setInt(3, renglon.getMenuDiarioCodMenu());
            statement.setString(4, renglon.getAlimentoCodComida());
            statement.setInt(5, renglon.getNroRenglon());
            statement.executeUpdate();
        }
        return null;
    }
    
    public void imprimirRenglon(RenglonDeMenus renglon) throws SQLException{
        String sql = "INSERT INTO ResnglonDeMenu (nroRenglon, cantidadGrs, subtotalCalorias, menuDiario_codMenu, alimento_codComida) VALUES (?, ?, ? , ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, renglon.getNroRenglon());
            statement.setDouble(2, renglon.getCantidadGrs());
            statement.setInt(3, renglon.getSubtotalCalorias());
            statement.setInt(4, renglon.getMenuDiarioCodMenu());
            statement.setInt(5, renglon.getAlimentoCodComida());
            statement.executeUpdate();
        }
    }
    
    public void eliminarRenglon(int nroRenglon) throws SQLException{
        String sql = "DELETE FROM RenglonDeMenu WHERE nroRenglon = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, nroRenglon);
            statement.executeUpdate();
        }
    }
    
    public List<RenglonDeMenus> obtenerRenglonPorNum(int nroRenglon) throws SQLException{
        List<RenglonDeMenu> renglones = new ArrayList<>();
        String sql = "SELECT * FROM RenglonDeMenu WHERE nroRenglon = ?";
        RenglonDeMenus renglon = null;
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, nroRenglon);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                RenglonDeMenus renglon = new RenglonDeMenus();
                        resultSet.getInt("nroRenglon");
                        resultSet.getDouble("cantidadGrs");
                        resultSet.getInt("subtotalCalorias");
                        resultSet.getInt("menuDiario_codMenu");
                        resultSet.getInt("alimento_codComida");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<RenglonDeMenus> obtenerRenglonesPorMenu(int menuDiarioCodMenu) throws SQLException{
        String sql = "SELECT * FROM RenglonDeMenu WHERE menuDiario_codMenu = ?";
        List<RenglonDeMenus> renglones = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, menuDiarioCodMenu);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                RenglonDeMenus renglon = new RenglonDeMenus();
                renglon.setId(resultSet.getInt("id"));
                renglon.setMenuDiarioId(resultSet.getInt("menu_diario_id"));
                renglon.setComida(resultSet.getString("comida"));
                renglon.setCantidad(resultSet.getInt("cantidad"));
                renglones.add(renglon);
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
