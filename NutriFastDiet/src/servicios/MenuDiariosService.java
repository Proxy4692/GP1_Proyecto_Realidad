package servicios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import modelo.MenuDiarios;
import modelo.RenglonDeMenus;

public class MenuDiariosService {
    
    private Connection con = null;

    public MenuDiariosService(){
        con = getConexion();
    }
    
    public List<MenuDiarios> listarMenusSemanal(int kcalCol){
        List<MenuDiarios> menuDiario = new ArrayList<>();
        String sql = "SELECT diaNro, ? FROM seleccaloria;";
        try{
            String kcalS;
            switch(kcalCol){ 
            case 1:
                kcalS = "k5850";
                break;
            case 2:
                kcalS = "k7000";
                break;
            case 3:
                kcalS = "k8050";
                break;
            case 4:
                kcalS = "k9450";
                break;
            case 5:
                kcalS = "k10500";
                break;
            default:
                kcalS = "k8050";
                break;
            }
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, kcalS);
            ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                MenuDiarios menu = new MenuDiarios();
                menu.setDiaNro(ml.getInt ("diaNro"));
                menu.setKcalTotal(ml.getInt (kcalS));
                menuDiario.add(menu);
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar los Menus Posibles: " + ex.getMessage ());
        }
        return menuDiario;
    }
    
        public void guardarReceta(int nroPaciente, String tipoComida){
        String sql = "INSERT INTO recetas (nroPaciente, tipoComida) VALUES (?, ?)";
        try(Connection con = conexion.Conexion.getConexion();
                PreparedStatement statement = con.prepareCall(sql)){
            statement.setInt(1, nroPaciente);
            statement.setString(2, tipoComida);
            System.out.println("Receta guardada");
        }catch(SQLException ex){
            System.err.println("Error al guardar la receta: " + ex.getMessage());
        }
    }
    
        public List<MenuDiarios> listarMenusDiario(int kcalCol, int opcion){
        List<MenuDiarios> menuDiario = new ArrayList<>();
        try{
            String sql;
            switch(kcalCol){ 
            case 1:
                sql = "SELECT s.diaNro, d.desayuno, d.almuerzo, d.colacion, d.merienda, d.cena, d.kcalS FROM `dietasposibles` d JOIN `seleccaloria` s WHERE d.opcion = ? AND d.kcalS = s.k5850;";
                break;
            case 2:
                sql = "SELECT s.diaNro, d.desayuno, d.almuerzo, d.colacion, d.merienda, d.cena, d.kcalS FROM `dietasposibles` d JOIN `seleccaloria` s WHERE d.opcion = ? AND d.kcalS = s.k7000;";
                break;
            case 3:
                sql = "SELECT s.diaNro, d.desayuno, d.almuerzo, d.colacion, d.merienda, d.cena, d.kcalS FROM `dietasposibles` d JOIN `seleccaloria` s WHERE d.opcion = ? AND d.kcalS = s.k8050;";
                break;
            case 4:
                sql = "SELECT s.diaNro, d.desayuno, d.almuerzo, d.colacion, d.merienda, d.cena, d.kcalS FROM `dietasposibles` d JOIN `seleccaloria` s WHERE d.opcion = ? AND d.kcalS = s.k9450;";
                break;
            case 5:
                sql = "SELECT s.diaNro, d.desayuno, d.almuerzo, d.colacion, d.merienda, d.cena, d.kcalS FROM `dietasposibles` d JOIN `seleccaloria` s WHERE d.opcion = ? AND d.kcalS = s.k10500;";
                break;
            default:
                sql = "SELECT s.diaNro, d.desayuno, d.almuerzo, d.colacion, d.merienda, d.cena, d.kcalS FROM `dietasposibles` d JOIN `seleccaloria` s WHERE d.opcion = ? AND d.kcalS = s.k8050;";
                break;
            }
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, opcion);
            ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                MenuDiarios menu = new MenuDiarios();
                menu.setDiaNro(ml.getInt ("diaNro"));
                menu.setDesayuno(ml.getInt ("desayuno"));
                menu.setAlmuerzo(ml.getInt ("almuerzo"));
                menu.setColacion(ml.getInt ("colacion"));
                menu.setMerienda(ml.getInt ("merienda"));
                menu.setCena(ml.getInt ("cena"));
                menu.setKcalTotal(ml.getInt ("kcalS"));
                menuDiario.add(menu);
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar los Menus Posibles: " + ex.getMessage ());
        }
        return menuDiario;
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
