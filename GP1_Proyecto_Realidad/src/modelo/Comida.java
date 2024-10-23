/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Comida {
    
    private String codComida;
    private String nombreCompleto; 
    private int caloriasPorPorcion; 
    private String tipo; 
    private String detalle;

    public Comida(String codComida, String nombreCompleto, int caloriasPorPorcion, String tipo, String detalle) {
        this.codComida = codComida;
        this.nombreCompleto = nombreCompleto;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public String getCodComida() {
        return codComida;
    }

    public void setCodComida(String codComida) {
        this.codComida = codComida;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }

    public void setCaloriasPorPorcion(int caloriasPorPorcion) {
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Comida{" + "codComida=" + codComida + ", nombreCompleto=" + nombreCompleto + ", caloriasPorPorcion=" + caloriasPorPorcion + ", tipo=" + tipo + ", detalle=" + detalle + '}';
    }
    
    
    
    public class ComidaDAO {

    public void altaLogica(Comida comida) {
        // agrega una comida 
    }

    public void bajaLogica(String codComida) {
       
    }

    public Comida buscar(String codComida) {
        //  busca una comida por codigo
        return null;
    }

    public void actualizar(Comida comida) {
        // actualiza la informacion de una comida
    }

    public void borrar(String codComida) {
        // borra una comida de la base de datos
    }

    public List<Comida> obtenerTodos() {
        List<Comida> comidas = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM comidas")) {
            while (rs.next()) {
                Comida comida = new Comida(
                        rs.getString("codComida"),
                        rs.getString("nombreCompleto"),
                        rs.getInt("caloriasPorPorcion"),
                        rs.getString("tipo"),
                        rs.getString("detalle")
                );
                comidas.add(comida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comidas;
    }
}
    
    
    
}
