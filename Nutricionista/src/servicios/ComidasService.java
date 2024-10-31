package servicios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.util.List;
import modelo.Alimentos;
import modelo.Comidas;

public class ComidasService{
    private Connection con = null;

    public ComidasService(){
        con = getConexion();
    }

    public void cargarAlimentos(Alimentos alimento){
        String sql = "INSERT INTO alimento (codAlimento, nombreA, selA) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alimento.getCodAlimento());
            ps.setString(2, alimento.getNombreA());
            ps.setBoolean(3, alimento.isSelA());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if(mg.next()){
                System.out.println("Alimento guardado: "+alimento.getNombreA());
            }else{
                System.out.println("Alimento no guardado: "+alimento.getNombreA());
            }
                ps.close();
            }catch(SQLException ex){
                System.out.println("Error al guardar el alimento: " + ex.getMessage());
        }
    }    
    
    
    public void cargarComidas(Comidas comida){
        String sql = "INSERT INTO comida (conComida, nombre, tipoComida, caloriasPor100g, detalle, baja) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comida.getCodComida()  );
            ps.setString(2, comida.getNombre());
            ps.setString(3, comida.getTipoComida());
            ps.setInt(4, comida.getCaloriasPor100g());
            ps.setString(5, comida.getDetalle());
            ps.setBoolean(6, comida.isBaja());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if(mg.next()){
                System.out.println("Comida guardada: "+comida.getNombre());
            }else{
                System.out.println("Comida no guardada: "+comida.getNombre());
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la comida: " + ex.getMessage());
        }
    }        
    
    
    public void cargarComidaAlimento(int codCom, int codAli){
        String sql = "INSERT INTO comidaalimento (conComida, codAlimento) VALUES (?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, codCom);
            ps.setInt(2,codAli);
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                System.out.println("Comida guardada: ");
            }else{
                System.out.println("Comida no guardada: ");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la comida: " + ex.getMessage());
        }
    }   
    
    public void cargarSelecCaloria(int diaNro, int k5850, int k7000, int k8050, int k9450, int k10500){
        String sql = "INSERT INTO comidaalimento (conComida, codAlimento) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, diaNro);
            ps.setInt(2, k5850);
            ps.setInt(3,k7000);
            ps.setInt(4, k8050);
            ps.setInt(5,k9450);
            ps.setInt(6,k10500);
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                System.out.println("Caloria guardada: ");
            }else{
                System.out.println("Caloria no guardada: ");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la caloria: " + ex.getMessage());
        }
    }   
       
    
    public void cargarDietasPosibles(int opcion, int kcalS, int desayuno, int almuerzo, int merienda, int colacion, int cena, boolean estado){
        String sql = "INSERT INTO dietasposibles (opcion, kcalS, desayuno, almuerzo, merienda, colacion, cena, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, opcion);
            ps.setInt(2, kcalS);
            ps.setInt(3,desayuno);
            ps.setInt(4, almuerzo);
            ps.setInt(5,merienda);
            ps.setInt(6,colacion);
            ps.setInt(7,cena);
            ps.setBoolean(8,estado);
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                System.out.println("Dieta guardada: ");
            }else{
                System.out.println("Dieta no guardada: ");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la dieta: " + ex.getMessage());
        }
    }   
        
    
    public void guardarAlimento(Alimentos alimento){
        String sql = "INSERT INTO alimento (codAlimento, nombre, caloriasPor100g) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alimento.getCodAlimento());
            ps.setString(2, alimento.getNombreA());
            ps.setBoolean(3, alimento.isSelA());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                System.out.println("Alimento guardado: "+alimento.getNombreA());
            }else{
                System.out.println("Alimento no guardado: "+alimento.getNombreA());
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar el alimento: " + ex.getMessage());
        }
    }
        
    public List<Alimentos> listarAlimento(){
        List<Alimentos> alimentos = new ArrayList<>();
        String sql = "SELECT codAlimento, nombre, caloriasPor100g FROM alimento;";
        try{
                PreparedStatement ps = con.prepareStatement (sql);
                ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                Alimentos alimento = new Alimentos();
                alimento.setCodAlimento (ml.getInt ("codAlimento"));
                alimento.setNombreA (ml.getString ("nombre"));
                alimento.setSelA (ml.getBoolean ("selA"));
                alimentos.add(alimento);
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar los alimentos: " + ex.getMessage ());
        }
        return alimentos;
    }
    
    public void cambiarPesoDeseado(int peso){
        
    }
    
    public void actualizarPesoAct(int peso){
        
    }
    
//    public boolean seAcercaAlPeso(Dietas dieta){
//        return true;
//    }
//    
//    public List<Pacientes> listarLosQueLlegaron(){
//        List<Pacientes> pac= null;
//        return pac;
//    }
    public List<Alimentos> filtrarxIngred(int ingrediente){
        List<Alimentos> alim= null;
        return alim;
    }
    
    public List<Alimentos> filtrarNombre(String nombre){
        List<Alimentos> alim= null;
        return alim;
    }
    
    public List<Alimentos> filtrarxCalorias100(int calorias){
        List<Alimentos> alim= null;
        return alim;
    }
    
    public void modificarAlimento(Comidas comida){
        
    }
}
