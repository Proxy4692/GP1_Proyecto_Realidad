package servicios;

import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import modelo.Dietas;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class DietasService {
    
    private Connection con = null;

    public DietasService(){
        con = getConexion();
    }
    
    public void guardarDieta(Dietas dieta){
        String sql = "INSERT INTO dieta (nroPaciente, nombreD, cantMenu, kcalSelec, fechaIni, fechaFin) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dieta.getNroPaciente());
            ps.setString(2, dieta.getNombreD());
            ps.setInt(3, dieta.getCantMenu());
            ps.setString(4, dieta.getKcalSelec());
            LocalDate ldIni = dieta.getFechaIni(); 
            Date dtIni= Date.from(ldIni.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
           java.sql.Date FechIni = new java.sql.Date(dtIni.getTime()); 
            ps.setDate(5, FechIni);
            LocalDate ldFin = dieta.getFechaFin(); 
            Date dtFin= Date.from(ldFin.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
           java.sql.Date FechFin = new java.sql.Date(dtIni.getTime());             
            ps.setDate(6,FechFin);
            
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                    dieta.setCodDieta(mg.getInt(1));
                    JOptionPane.showMessageDialog(null, "La dieta del paciente "+dieta.getNroPaciente()
                            +" ha sido guardado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La dieta no pudo ser guardada");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar dieta: " + ex.getMessage());
        }
    }
    
    public void modificarDieta(Dietas dieta){
        String sql = "UPDATE dieta SET nroPaciente = ?, nombreD = ?, cantMenu = ?, kcalSelec = ?, fechaIni = ?, fechaFin = ? WHERE codDieta = ?";
        try{
            PreparedStatement ps = con.prepareStatement (sql);
            ps.setInt(1, dieta.getNroPaciente());
            ps.setString(2, dieta.getNombreD());
            ps.setInt(3, dieta.getCantMenu());
            ps.setString(4, dieta.getKcalSelec());
            LocalDate ldIni = dieta.getFechaIni(); 
            Date dtIni= Date.from(ldIni.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
            java.sql.Date FechIni = new java.sql.Date(dtIni.getTime()); 
            ps.setDate(5, FechIni);
            LocalDate ldFin = dieta.getFechaFin(); 
            Date dtFin= Date.from(ldFin.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
            java.sql.Date FechFin = new java.sql.Date(dtIni.getTime());             
            ps.setDate(6,FechFin);
            ps.setInt(7, dieta.getCodDieta());
            
            int mm=ps.executeUpdate();
            if (mm == 1){
                JOptionPane.showMessageDialog(null, "La dieta del paciente " +dieta.getNroPaciente()
                        +" fue modificado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La dieta del paciente " +dieta.getNroPaciente()
                        +" no fue modificado");
            }
            
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al modificar dieta: " + ex.getMessage());
        }
    }
    
        public void eliminarDieta(int id){
        String sql = "DELETE FROM dieta WHERE codDieta = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int me=ps.executeUpdate();
            if(me == 1){
                JOptionPane.showMessageDialog(null, "La Dieta " +id
                        +" ha sido eliminada");
            ps.close();
            }
        }catch(SQLException ex){
            System.out.println("Error al eliminar dieta: " + ex.getMessage());
        }
    }
        
        
        public Dietas buscarDieta(int id){
        Dietas dieta = null;
        String sql = "SELECT * FROM dieta WHERE codDieta = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet mb = ps.executeQuery();
            if (mb.next()) {
                dieta = new Dietas();
                dieta.setCodDieta (mb.getInt("codDieta"));
                dieta.setNroPaciente (mb.getInt("nroPaciente"));
                dieta.setNombreD (mb.getString("nombreD"));
                dieta.setCantMenu (mb.getInt("cantMenu"));
                dieta.setKcalSelec (mb.getString("kcalSelec"));
                java.util.Date fi = mb.getDate("fechaIni");
                LocalDate fdI= fi.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                dieta.setFechaIni (fdI);
                java.util.Date ff = mb.getDate("fechaFin");
                LocalDate fdF= ff.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                dieta.setFechaFin (fdF);
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar dieta: " + ex.getMessage());
        }
        return dieta;
    }
        
        public Dietas buscarDietaPorPaciente(int nroP){
        Dietas dieta = null;
        String sql = "SELECT * FROM dieta WHERE nroPaciente = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroP);
            ResultSet mb = ps.executeQuery();
            if (mb.next()) {
                dieta = new Dietas();
                dieta.setCodDieta (mb.getInt("codDieta"));
                dieta.setNroPaciente (mb.getInt("nroPaciente"));
                dieta.setNombreD (mb.getString("nombreD"));
                dieta.setCantMenu (mb.getInt("cantMenu"));
                dieta.setKcalSelec (mb.getString("kcalSelec"));
                java.util.Date fi = mb.getDate("fechaIni");
                LocalDate fdI= fi.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                dieta.setFechaIni (fdI);
                java.util.Date ff = mb.getDate("fechaFin");
                LocalDate fdF= ff.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                dieta.setFechaFin (fdF);
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar el paciente: " + ex.getMessage());
        }
        return dieta;
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
    
    public void cargarSeleccionCaloria(int diaNro, int k5850, int k7000, int k8050, int k9450, int k10500){
        String sql = "INSERT INTO seleccaloria (diaNro, k5850, k7000, k8050, k9450, k10500) VALUES (?, ?, ?, ?, ?, ?)";
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
                System.out.println("Seleccion caloria guardada: "+diaNro);
            }else{
                System.out.println("Seleccion caloria no guardada: "+diaNro);
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la seleccion caloria: " + ex.getMessage());
        }
    }   
    
    public Integer kcalSemanal(int kcalCol, int diaNro){
        Integer kcalSemanal = null;
        try{
            String sql;
            switch(kcalCol){ 
            case 1:
                sql = "SELECT k5850 AS kcalS FROM `seleccaloria` WHERE diaNro = ?;"; 
                break;
            case 2:
                sql = "SELECT k7000 AS kcalS FROM `seleccaloria` WHERE diaNro = ?;";
                break;
            case 3:
                sql = "SELECT k8050 AS kcalS FROM `seleccaloria` WHERE diaNro = ?;";
                break;
            case 4:
                sql = "SELECT k9450 AS kcalS FROM `seleccaloria` WHERE diaNro = ?;";
                break;
            case 5:
                sql = "SELECT k10500 AS kcalS FROM `seleccaloria` WHERE diaNro = ?;";
                break;
            default:
                sql = "SELECT k8050 AS kcalS FROM `seleccaloria` WHERE diaNro = ?;";
                break;
            }
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, diaNro);
            ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                kcalSemanal= ml.getInt ("kcalS");
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar Kcal Semanales: " + ex.getMessage ());
        }
        return kcalSemanal;
    }
    
    
    public void cargarPesoYFinalizar(double peso){
        
    }
    
    public void imprimirDietaCompleta(){
        
    }
    
    public int calcularDiferDePeso(int peso){
        int pesoFin=0;
        return pesoFin;
    }
}
