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
import modelo.RenglonDeMenus;

public class RenglonDeMenusService{
    
    private Connection con = null;

    public RenglonDeMenusService(){
        con = getConexion();
    }
    
    public RenglonDeMenus modificarRenglon(){
        RenglonDeMenus renglon= new RenglonDeMenus();
        return renglon;
    }
    
    public void crearRenglonDeMenus(Comidas comida, int kcalDia){
        String sql = "INSERT INTO renglondemenu (cantidadGrs, subtotalCalorias, conComida) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int g= (Integer)kcalDia *100/ comida.getCaloriasPor100g();
            ps.setInt(1, g  );
            ps.setInt(2, kcalDia);
            ps.setInt(3, comida.getCodComida());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if(mg.next()){
                System.out.println("Menú guardado: "+comida.getNombre());
            }else{
                System.out.println("Menú no guardado: "+comida.getNombre());
            }
                ps.close();
            }catch(SQLException ex){
                System.out.println("Error al guardar Menú: " + ex.getMessage());
        }
    }        
    
    public RenglonDeMenus buscarRenglonDeMenu(int conComida){
        RenglonDeMenus renglon= null;
        String sql = "SELECT nroRenglon, cantidadGrs, subtotalCalorias, conComida FROM renglondemenu WHERE conComida = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, conComida);
            ResultSet ab = ps.executeQuery();
            if(ab.next()){
                renglon = new RenglonDeMenus();
                renglon.setNroRenglon(ab.getInt("nroRenglon"));
                renglon.setCantidadGrs(ab.getInt("cantidadGrs"));
                renglon.setSubtotalCalorias(ab.getInt("subtotalCalorias"));
                renglon.setConComida(ab.getInt("conComida"));
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return renglon;
    }
        
    public void actualizarGramosRenglon(RenglonDeMenus renglon, double gramos){
        String sql = "UPDATE renglondemenu SET cantidadGrs = ? , subtotalCalorias = ? WHERE nroRenglon = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setDouble(1, gramos);
            ComidasService comG= new ComidasService();
            Comidas comida= comG.buscarComida(renglon.getConComida());
            int kcalActual= comida.getCaloriasPor100g();
            Double subtotal= kcalActual * gramos/100;
            ps.setInt(2, subtotal.intValue());
            ps.setInt(3, renglon.getNroRenglon());
            int am=ps.executeUpdate();
            if(am==1){
                System.out.println("El Renglon fue actualizado :"+renglon.getNroRenglon());
            }else{
                System.out.println("El Renglon no fue actualizado :"+renglon.getNroRenglon());
            }
        }catch(SQLException ex){
            System.out.println("Error al acceder a la tabla Renglones " + ex.getMessage());
        }
    }

    public void borrarRenglonDeMenus(int conComida){
        String sql = "DELETE FROM renglondemenu WHERE conComida = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, conComida);
            int bi = ps.executeUpdate();
            if(bi == 1){
                System.out.println("Renglon borrado");
            }else{
                System.out.println("Renglon no borrado");
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al acceder a la tabla Renglon de Menus");
        }
    }        
    
    public void eliminarTodosRenglones(){
        try{
            String sql = "DELETE FROM renglondemenu";
            PreparedStatement ps = con.prepareStatement(sql);

            int bi = ps.executeUpdate();
            if(bi == 1){
                System.out.println("Los rnglones de Menú fueron borrados");
            }else{
                System.out.println("Los rnglones de Menú no se borraron");
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al acceder a la tabla inscripcion");
        }
    }
    
    public List<RenglonDeMenus> listarRenglones(){
        List<RenglonDeMenus> renglones = new ArrayList<>();
        String sql = "SELECT nroRenglon, cantidadGrs, subtotalCalorias, conComida FROM renglondemenu;";
        try{
                PreparedStatement ps = con.prepareStatement (sql);
                ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                RenglonDeMenus renglon = new RenglonDeMenus();
                renglon.setNroRenglon(ml.getInt ("nroRenglon"));
                renglon.setCantidadGrs(ml.getDouble ("cantidadGrs"));
                renglon.setSubtotalCalorias(ml.getInt ("subtotalCalorias"));
                renglon.setConComida(ml.getInt ("conComida"));
                renglones.add(renglon);
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar los renglones: " + ex.getMessage ());
        }
        return renglones;
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
