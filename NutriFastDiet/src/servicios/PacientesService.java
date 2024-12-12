package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.util.List;
import modelo.Dietas;
import modelo.Pacientes;

public class PacientesService {
    
    private Connection con = null;

    public PacientesService(){
        con = getConexion();
    }
    
    public void guardarPaciente(Pacientes paciente){
        String sql = "INSERT INTO paciente (nombre, edad, altura, pesoActual, pesoBuscado) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setDouble(3, paciente.getAltura());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoBuscado());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                    paciente.setNroPaciente(mg.getInt(1));
                    JOptionPane.showMessageDialog(null, "El paciente "+paciente.getNombre()
                            +" ha sido guardado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "El paciente no pudo ser guardado");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar el paciente: " + ex.getMessage());
        }
    }
    
    public void modificarPaciente(Pacientes paciente){
        String sql = "UPDATE paciente SET nombre = ?, edad = ?, altura = ?, pesoActual = ?, pesoBuscado = ? WHERE nroPaciente = ?";
        try{
            PreparedStatement ps = con.prepareStatement (sql);
            ps.setString(1, paciente. getNombre ());
            ps.setInt(2, paciente. getEdad ());
            ps.setDouble(3, paciente.getAltura());
            ps.setDouble(4, paciente. getPesoActual ());
            ps.setDouble(5, paciente. getPesoBuscado ());
            ps.setInt(6, paciente. getNroPaciente ());
            int mm=ps.executeUpdate();
            if (mm == 1){
                JOptionPane.showMessageDialog(null, "El paciente " +paciente.getNombre()
                        +" fue modificado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "El paciente " +paciente.getNombre()
                        +" no fue modificado");
            }
            
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al modificar el paciente: " + ex.getMessage());
        }
    }
    
    public void eliminarPaciente(int id){
        String sql = "DELETE FROM paciente WHERE nroPaciente = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int me=ps.executeUpdate();
            if(me == 1){
                JOptionPane.showMessageDialog(null, "El paciente " +id
                        +" ha sido eliminado");
            ps.close();
            }
        }catch(SQLException ex){
            System.out.println("Error al eliminar el paciente: " + ex.getMessage());
        }
    }
        
        
        public Pacientes buscarPaciente(int id){
        Pacientes paciente = null;
        String sql = "SELECT * FROM paciente WHERE nroPaciente = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet mb = ps.executeQuery();
            if (mb.next()) {
                paciente = new Pacientes();
                paciente.setNroPaciente (mb.getInt("nroPaciente"));
                paciente.setNombre (mb.getString("nombre"));
                paciente.setEdad (mb.getInt("edad"));
                paciente.setAltura (mb.getFloat("altura"));
                paciente.setPesoActual (mb.getFloat("pesoActual"));
                paciente.setPesoBuscado (mb.getFloat("pesoBuscado"));
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar el paciente: " + ex.getMessage());
        }
        return paciente;
    }
        
        public Pacientes buscarPacientePorNombre(String nombre){
        Pacientes paciente = null;
        String sql = "SELECT * FROM paciente WHERE nombre = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet mb = ps.executeQuery();
            if (mb.next()) {
                paciente = new Pacientes();
                paciente.setNroPaciente (mb.getInt("nroPaciente"));
                paciente.setNombre (mb.getString("nombre"));
                paciente.setEdad (mb.getInt("edad"));
                paciente.setAltura (mb.getFloat("altura"));
                paciente.setPesoActual (mb.getFloat("pesoActual"));
                paciente.setPesoBuscado (mb.getFloat("pesoBuscado"));
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar el paciente: " + ex.getMessage());
        }
        return paciente;
    }
        
        public List<Pacientes> listarPacientes(){
        List<Pacientes> pacientes = new ArrayList<>();
        String sql = "SELECT nroPaciente, nombre, edad, altura, pesoActual, pesoBuscado FROM paciente;";
        try{
                PreparedStatement ps = con.prepareStatement (sql);
                ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                Pacientes paciente = new Pacientes();
                paciente.setNroPaciente (ml.getInt ("nroPaciente"));
                paciente.setNombre (ml.getString ("nombre"));
                paciente.setEdad (ml.getInt ("edad"));
                paciente.setAltura (ml.getFloat ("altura"));
                paciente.setPesoActual (ml.getFloat ("pesoActual"));
                paciente.setPesoBuscado (ml.getFloat ("pesoBuscado"));
                pacientes.add(paciente);
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar los pacientes: " + ex.getMessage ());
        }
        return pacientes;
    }
    
    public void cambiarPesoDeseado(int peso){
        
    }
    
    public void actualizarPesoAct(int peso){
        
    }
    
    public boolean seAcercaAlPeso(Dietas dieta){
        return true;
    }
    
    public List<Pacientes> listarLosQueLlegaron(){
        List<Pacientes> pac= null;
        return pac;
    }
    
}
