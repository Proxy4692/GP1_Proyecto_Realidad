package servicios;

import conexion.Conexion;
import modelo.Paciente;
import java.sql.*;

public class PacienteService{
    public void agregarPaciente(Paciente paciente) {
        String sql = "INSERT INTO Paciente (nombre, edad, altura, pesoActual, pesoBuscado) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, paciente.getNombre());
            pstmt.setInt(2, paciente.getEdad());
            pstmt.setFloat(3, paciente.getAltura());
            pstmt.setFloat(4, paciente.getPesoActual());
            pstmt.setFloat(5, paciente.getPesoBuscado());
            pstmt.executeUpdate();
            System.out.println("Paciente agregado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // metodos para actualizar, eliminar, y listar pacientes
}