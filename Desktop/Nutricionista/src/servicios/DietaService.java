package servicios;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Dieta;

public class DietaService {
    
    
    
     private int codDieta;
    private String nombreD;  
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private float pesoFinal;
    private boolean estado;
    private int totalCalorias;
    private int pacienteNroPaciente;
    private final Connection connection;

    public DietaService(int codDieta, String nombreD, LocalDate fechaIni, LocalDate fechaFin, float pesoFinal, boolean estado, int totalCalorias, int pacienteNroPaciente, Connection connection) {
        this.codDieta = codDieta;
        this.nombreD = nombreD;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.pacienteNroPaciente = pacienteNroPaciente;
        this.connection = connection;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(float pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public int getPacienteNroPaciente() {
        return pacienteNroPaciente;
    }

    public void setPacienteNroPaciente(int pacienteNroPaciente) {
        this.pacienteNroPaciente = pacienteNroPaciente;
    }
    
    public String getNombre() {
    return nombreD;
}
    
    public void crearDieta(DietaService dieta) {
        String sql = "INSERT INTO Dieta (codDieta, nombreD, fechaIni, fechaFin, pesoFinal, estado, totalCalorias, paciente_nroPaciente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, dieta.getCodDieta());
            statement.setString(2, dieta.getNombreD());

        
            statement.setDate(3, java.sql.Date.valueOf(dieta.getFechaIni()));
            statement.setDate(4, java.sql.Date.valueOf(dieta.getFechaFin()));

            statement.setFloat(5, dieta.getPesoFinal());
            statement.setBoolean(6, dieta.isEstado());
            statement.setInt(7, dieta.getTotalCalorias());
            statement.setInt(8, dieta.getPacienteNroPaciente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void eliminarDieta(int codDieta) {
        String sql = "DELETE FROM Dieta WHERE codDieta = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, codDieta);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dieta obtenerDietaPorCodigo(int codDieta) throws SQLException {
    String sql = "SELECT * FROM Dieta WHERE codDieta = ?";
    Dieta dieta = null;

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, codDieta);  
        ResultSet resultSet = statement.executeQuery();  
       
        if (resultSet.next()) {
            dieta = new Dieta(
                resultSet.getInt("codDieta"),                
                resultSet.getString("nombreD"),              
                resultSet.getDate("fechaIni").toLocalDate(), 
                resultSet.getDate("fechaFin").toLocalDate(), 
                resultSet.getFloat("pesoFinal"),             
                resultSet.getBoolean("estado"),             
                resultSet.getInt("totalCalorias"),           
                resultSet.getInt("paciente_nroPaciente")     
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();  
    }

    return dieta;  

    

   public List<Dieta> obtenerTodasLasDietas() throws SQLException {
    String sql = "SELECT * FROM Dieta";
    List<Dieta> dietas = new ArrayList<>();

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql)) {

        while (resultSet.next()) {
            // Verificar si las fechas son NULL
            java.sql.Date fechaIniSQL = resultSet.getDate("fechaIni");
            java.sql.Date fechaFinSQL = resultSet.getDate("fechaFin");

            // Convertir las fechas SQL a LocalDate si no son NULL
            LocalDate fechaIni = (fechaIniSQL != null) ? fechaIniSQL.toLocalDate() : null;
            LocalDate fechaFin = (fechaFinSQL != null) ? fechaFinSQL.toLocalDate() : null;

       
            Dieta dieta = new Dieta(
                resultSet.getInt("codDieta"),
                resultSet.getString("nombreD"),
                fechaIni,        
                fechaFin,        
                resultSet.getFloat("pesoFinal"),
                resultSet.getBoolean("estado"),
                resultSet.getInt("totalCalorias"),
                resultSet.getInt("paciente_nroPaciente")
            );

 
            dietas.add(dieta);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return dietas;
}
   
  
}

    
    
    
    
