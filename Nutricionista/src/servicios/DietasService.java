package servicios;

import static conexion.Conexion.getConexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;

public class DietasService{
    
    private Connection con = null;

    public DietasService(){
        con = getConexion();
    }
    
    //Crear nueva dieta
    public void crearDieta(Dieta dieta){
        String sql = "INSERT INTO Dieta (codDieta, nombreD, fechaIni, fechaFin, pesoFinal, estado, totalCalorias, paciente_nroPaciente) VALUES (?, ?, ?, ?, ?, ? ,? ,?)";
        try(Connection connection = MariaDBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1, dieta.getCodDieta());
            statement.setInt(2, dieta.getNombreD());
            statement.setInt(3, dieta.getFechaIni());
            statement.setInt(4, dieta.getFechaFin());
            statement.setInt(5, dieta.getPesoFinal());
            statement.setInt(6, dieta.isEstado());
            statement.setInt(7, dieta.getTotalCalorias());
            statement.setInt(8, dieta.getPacienteNroPaciente());
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void eliminarDieta(int codDieta){
        String sql = "DELETE FROM Dieta WHERE codDieta = ?";
        try(Connection connection = MariaDBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1, codDieta);
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void actualizarDieta(Dieta dieta){
        String sql = "UPDATE Dieta SET nombreD = ?, fechaIni = ?, fechaFin = ?, pesoFinal = ?, estado = ?, totalCalorias = ?, paciente_nroPaciente = ?, WHERE codDieta = ?";
        try(Connection connection = MariaDBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setString(1, dieta.getNombreD());
            statement.setDate(2, dieta.getFechaIni());
            statement.setDate(3, dieta.getFechaFin());
            statement.setFloat(4, dieta.getPesoFinal());
            statement.setBoolean(5, dieta.isEstado());
            statement.setInt(6, dieta.getTotalCalorias());
            statement.setInt(7, dieta.getPacienteNroPaciente());
            statement.setInt(8, dieta.getCodDieta());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void obtenerDietaPorCodigo(int codDieta){
        String sql = "SELECT * FROM Dieta WHERE codDieta = ?";

        try(Connection connection = MariaDBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, codDieta);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                dieta = new Dieta(
                    resultSet.getInt("codDieta"),
                    resultSet.getString("nombreD"),
                    resultSet.getDate("fechaIni"),
                    resultSet.getDate("fechaFin"),
                    resultSet.getFloat("pesoFinal"),
                    resultSet.getBoolean("estado"),
                    resultSet.getInt("totalCalorias"),
                    resultSet.getInt("paciente_nroPaciente")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Dieta> obtenerTodasLasDietas(){
        String sql = "SELECT * FROM Dieta";
        List<Dieta> dietas = new ArrayList<>();

        try(Connection connection = MariaDBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)){

            while(resultSet.next()){
                Dieta dieta = new Dieta(
                    resultSet.getInt("codDieta"),
                    resultSet.getString("nombreD"),
                    resultSet.getDate("fechaIni"),
                    resultSet.getDate("fechaFin"),
                    resultSet.getFloat("pesoFinal"),
                    resultSet.getBoolean("estado"),
                    resultSet.getInt("totalCalorias"),
                    resultSet.getInt("paciente_nroPaciente")
                );
                dietas.add(dieta);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dietas;
    }
    
//    public void guardarDieta(Dietas dieta){
//        String sql = "INSERT INTO paciente (nombre, edad, altura, pesoActual, pesoBuscado) VALUES (?, ?, ?, ?, ?)";
//        try{
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, paciente.getNombre());
//            ps.setInt(2, paciente.getEdad());
//            ps.setDouble(3, paciente.getAltura());
//            ps.setDouble(4, paciente.getPesoActual());
//            ps.setDouble(5, paciente.getPesoBuscado());
//            ps.executeUpdate();
//            ResultSet mg = ps.getGeneratedKeys();
//            if (mg.next()) {
//                    paciente.setNroPaciente(mg.getInt(1));
//                    JOptionPane.showMessageDialog(null, "El paciente "+paciente.getNombre()
//                            +" ha sido guardado exitosamente");
//            }else{
//                JOptionPane.showMessageDialog(null, "El paciente no pudo ser guardado");
//            }
//                ps.close();
//            } catch (SQLException ex) {
//                System.out.println("Error al guardar el paciente: " + ex.getMessage());
//        }
//    }
//
//    public void modificarPaciente(Pacientes paciente){
//        String sql = "UPDATE paciente SET nombre = ?, edad = ?, altura = ?, pesoActual = ?, pesoBuscado = ? WHERE nroPaciente = ?";
//        try{
//            PreparedStatement ps = con.prepareStatement (sql);
//            ps.setString(1, paciente. getNombre ());
//            ps.setInt(2, paciente. getEdad ());
//            ps.setDouble(3, paciente.getAltura());
//            ps.setDouble(4, paciente. getPesoActual ());
//            ps.setDouble(5, paciente. getPesoBuscado ());
//            ps.setFloat(6, paciente. getNroPaciente ());
//            int mm=ps.executeUpdate();
//            if (mm == 1){
//                JOptionPane.showMessageDialog(null, "El paciente " +paciente.getNombre()
//                        +" fue modificado exitosamente");
//            }else{
//                JOptionPane.showMessageDialog(null, "El paciente " +paciente.getNombre()
//                        +" no fue modificado");
//            }
//
//            ps.close();
//        }catch(SQLException ex){
//            System.out.println("Error al modificar el paciente: " + ex.getMessage());
//        }
//    }
//
//        public void eliminarPaciente(int id){
//        String sql = "DELETE FROM paciente WHERE nroPaciente = ? ";
//        try{
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            int me=ps.executeUpdate();
//            if(me == 1){
//                JOptionPane.showMessageDialog(null, "El paciente " +id
//                        +" ha sido eliminado");
//            ps.close();
//            }
//        }catch(SQLException ex){
//            System.out.println("Error al eliminar el paciente: " + ex.getMessage());
//        }
//    }
//
//
//        public Pacientes buscarPaciente(int id){
//        Pacientes paciente = null;
//        String sql = "SELECT * FROM paciente WHERE nroPaciente = ?";
//        try{
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet mb = ps.executeQuery();
//            if (mb.next()) {
//                paciente = new Pacientes();
//                paciente.setNroPaciente (mb.getInt("nroPaciente"));
//                paciente.setNombre (mb.getString("nombre"));
//                paciente.setEdad (mb.getInt("edad"));
//                paciente.setAltura (mb.getFloat("altura"));
//                paciente.setPesoActual (mb.getFloat("pesoActual"));
//                paciente.setPesoBuscado (mb.getFloat("pesoBuscado"));
//            }
//            ps.close();
//        }catch(SQLException ex){
//            System.out.println("Error al buscar el paciente: " + ex.getMessage());
//        }
//        return paciente;
//    }
//
//        public List<Pacientes> listarPaciente(){
//        List<Pacientes> pacientes = new ArrayList<>();
//        String sql = "SELECT nroPaciente, nombre, edad, altura, pesoActual, pesoBuscado FROM paciente;";
//        try{
//                PreparedStatement ps = con.prepareStatement (sql);
//                ResultSet ml = ps.executeQuery ();
//            while (ml.next()) {
//                Pacientes paciente = new Pacientes();
//                paciente.setNroPaciente (ml.getInt ("nroPaciente"));
//                paciente.setNombre (ml.getString ("nombre"));
//                paciente.setEdad (ml.getInt ("edad"));
//                paciente.setAltura (ml.getFloat ("altura"));
//                paciente.setPesoActual (ml.getFloat ("pesoActual"));
//                paciente.setPesoBuscado (ml.getFloat ("pesoBuscado"));
//                pacientes.add(paciente);
//            }
//            ps.close ();
//        }catch(SQLException ex){
//            System.out.println ("Error al listar las materias: " + ex.getMessage ());
//        }
//        return pacientes;
//    }
        public void cargarPesoYFinalizar(double peso){
        
    }
    
    public void imprimirDietaCompleta(){
        
    }
    
    public int calcularDiferDePeso(int peso){
        int pesoFin=0;
        return pesoFin;
    }
}
