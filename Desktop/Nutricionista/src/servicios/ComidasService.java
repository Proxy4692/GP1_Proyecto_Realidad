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
import modelo.Pacientes;

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
            if(mg.next()){
                System.out.println("Comida guardada: ");
            }else{
                System.out.println("Comida no guardada: ");
            }
                ps.close();
            }catch(SQLException ex){
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
            if(mg.next()){
                System.out.println("Caloria guardada: ");
            }else{
                System.out.println("Caloria no guardada: ");
            }
                ps.close();
            }catch(SQLException ex){
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
            if(mg.next()){
                System.out.println("Dieta guardada: ");
            }else{
                System.out.println("Dieta no guardada: ");
            }
                ps.close();
            }catch(SQLException ex){
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
    
   public void cambiarPesoDeseado(int pacienteId, int nuevoPesoDeseado) {
    String sql = "UPDATE pacientes SET pesoBuscado = ? WHERE idPaciente = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, nuevoPesoDeseado);
        ps.setInt(2, pacienteId);
        ps.executeUpdate();
        System.out.println("Peso deseado actualizado.");
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}
    
public void actualizarPesoAct(Pacientes paciente, double nuevoPesoActual) {
    String sql = "UPDATE pacientes SET pesoActual = ? WHERE nroPaciente = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setDouble(1, nuevoPesoActual);  // Actualiza el peso
        ps.setInt(2, paciente.getNroPaciente());  
        ps.executeUpdate();
        paciente.setPesoActual(nuevoPesoActual);  
        System.out.println("Peso actualizado para el paciente con ID: " + paciente.getNroPaciente());
    } catch (SQLException ex) {
        System.out.println("Error al actualizar el peso: " + ex.getMessage());
    }
}
public boolean seAcercaAlPeso(int pesoInicial, int pesoFinal, int pesoBuscado) {
    int diferenciaInicial = pesoInicial - pesoBuscado;
    int diferenciaFinal = pesoFinal - pesoBuscado;

    return diferenciaFinal < diferenciaInicial;
}


public List<Pacientes> listarLosQueLlegaron() {
    List<Pacientes> pacientes = new ArrayList<>();
    String sql = "SELECT p.idPaciente, p.nombre, p.pesoActual, p.pesoBuscado FROM pacientes p WHERE p.pesoActual <= p.pesoBuscado";

    try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            Pacientes paciente = new Pacientes();
            paciente.setIdPaciente(rs.getInt("idPaciente"));
            paciente.setNombre(rs.getString("nombre"));
            paciente.setPesoActual(rs.getInt("pesoActual"));
            paciente.setPesoBuscado(rs.getInt("pesoBuscado"));
            pacientes.add(paciente);
        }
    } catch (SQLException ex) {
        System.out.println("Error al listar los pacientes que han llegado a su peso: " + ex.getMessage());
    }

    return pacientes;
}

    
    public List<Alimentos> filtrarxIngred(int ingredienteId) {
    List<Alimentos> alimentos = new ArrayList<>();
    String sql = "SELECT a.codAlimento, a.nombre, a.caloriasPor100g FROM alimento a " +
                 "JOIN comidaalimento ca ON a.codAlimento = ca.codAlimento " +
                 "WHERE ca.codComida = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, ingredienteId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Alimentos alimento = new Alimentos();
            alimento.setCodAlimento(rs.getInt("codAlimento"));
            alimento.setNombreA(rs.getString("nombre"));
            alimento.setCaloriasPor100g(rs.getInt("caloriasPor100g"));
            alimentos.add(alimento);
        }
    } catch (SQLException ex) {
        System.out.println("Error al filtrar alimentos por ingrediente: " + ex.getMessage());
    }

    return alimentos;
}

    
   public List<Alimentos> filtrarNombre(String nombre) {
    List<Alimentos> alimentos = new ArrayList<>();
    String sql = "SELECT codAlimento, nombre, caloriasPor100g FROM alimento WHERE nombre LIKE ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, "%" + nombre + "%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Alimentos alimento = new Alimentos();
            alimento.setCodAlimento(rs.getInt("codAlimento"));
            alimento.setNombreA(rs.getString("nombre"));
            alimento.setCaloriasPor100g(rs.getInt("caloriasPor100g"));
            alimentos.add(alimento);
        }
    } catch (SQLException ex) {
        System.out.println("Error al filtrar alimentos por nombre: " + ex.getMessage());
    }

    return alimentos;
}

    
    public List<Alimentos> filtrarxCalorias100(int calorias) {
    List<Alimentos> alimentos = new ArrayList<>();
    String sql = "SELECT codAlimento, nombre, caloriasPor100g FROM alimento WHERE caloriasPor100g < ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, calorias);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Alimentos alimento = new Alimentos();
            alimento.setCodAlimento(rs.getInt("codAlimento"));
            alimento.setNombreA(rs.getString("nombre"));
            alimento.setCaloriasPor100g(rs.getInt("caloriasPor100g"));
            alimentos.add(alimento);
        }
    } catch (SQLException ex) {
        System.out.println("Error al filtrar alimentos por calorías: " + ex.getMessage());
    }

    return alimentos;
}

    
    public void modificarAlimento(Alimentos alimento) {
    String sql = "UPDATE alimento SET nombre = ?, caloriasPor100g = ?, selA = ? WHERE codAlimento = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, alimento.getNombreA());
        ps.setInt(2, alimento.getCaloriasPor100g());
        ps.setBoolean(3, alimento.isSelA());
        ps.setInt(4, alimento.getCodAlimento());
        ps.executeUpdate();
        System.out.println("Alimento actualizado: " + alimento.getNombreA());
    } catch (SQLException ex) {
        System.out.println("Error al modificar el alimento: " + ex.getMessage());
    }
}
}