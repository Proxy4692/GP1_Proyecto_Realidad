package servicios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import modelo.Comidas;
import modelo.MenuDiarios;
import modelo.RenglonDeMenus;

public class MenuDiariosService {
    
    private Connection con = null;

    public MenuDiariosService(){
        con = getConexion();
    }
    
    public void guardarMenus(MenuDiarios menu){
        String sql = "INSERT INTO menudiario (diaNro, desayuno, almuerzo, colacion, merienda, cena, kcalTotal, estado, codDieta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, menu.getDiaNro()  );
            ps.setString(2, menu.getTxdesayuno());
            ps.setString(3, menu.getTxalmuerzo());
            ps.setString(4, menu.getTxcolacion());
            ps.setString(5, menu.getTxmerienda());
            ps.setString(6, menu.getTxcena());
            ps.setInt(7, menu.getKcalTotal());
            ps.setBoolean(8,menu.isEstado());
            ps.setInt(9, menu.getCodDieta());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                menu.setCodMenu(mg.getInt(1));
                System.out.println("Menú guardado: "+menu.getCodMenu());
            }else{
                System.out.println("Menú no guardado");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar Menú: " + ex.getMessage());
        }
    }       
    
    public void eliminarMenu(int diaNro, int codDieta){
        String sql = "DELETE FROM menudiario WHERE diaNro = ? AND codDieta = ? ;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, diaNro);
            ps.setInt(2, codDieta);
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al eliminar el paciente: " + ex.getMessage());
        }
    }
    
    public MenuDiarios buscarMenus(int diaNro, int codDieta){        
        MenuDiarios menu = null;
        String sql = "SELECT * FROM menudiario WHERE diaNro = ? AND codDieta = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, diaNro);
            ps.setInt(2, codDieta);
            ResultSet mb = ps.executeQuery();
            if (mb.next()) {
                menu = new MenuDiarios();
                menu.setCodMenu (mb.getInt("codMenu"));
                menu.setDiaNro(mb.getInt("diaNro"));
                menu.setTxdesayuno(mb.getString("desayuno"));
                menu.setTxalmuerzo(mb.getString("almuerzo"));
                menu.setTxcolacion(mb.getString("colacion"));
                menu.setTxmerienda(mb.getString("merienda"));
                menu.setTxcena(mb.getString("cena"));
                menu.setKcalTotal(mb.getInt("kcalTotal"));
                menu.setCodDieta(mb.getInt("codDieta"));
                
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar el menu: " + ex.getMessage());
        }
        return menu;
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
