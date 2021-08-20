package model.dao;

//Estructura de datos
import java.util.ArrayList;

import model.vo.Lider;
import model.vo.Proyecto;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

public class ProyectoDao {

    public ArrayList<Proyecto> query_requerimiento_1() throws SQLException {

        ArrayList<Proyecto> respuesta = new ArrayList<Proyecto>();
        Connection conn = JDBCUtilities.getConnection();

        try {
            String consulta1 = "SELECT Fecha_Inicio, Numero_Habitaciones, Numero_Banos FROM Proyecto WHERE Constructora = 'Pegaso'";
            PreparedStatement stmt = conn.prepareStatement(consulta1);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Proyecto requerimientoQuery1 = new Proyecto();
                requerimientoQuery1.setFecha_inicio(rs.getString("Fecha_Inicio"));
                requerimientoQuery1.setNum_habitaciones(rs.getInt("Numero_habitaciones"));
                requerimientoQuery1.setNum_banios(rs.getInt("Numero_Banos"));
                respuesta.add(requerimientoQuery1);
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error en consulta1 query requerimientoVo_1.");
        }
        finally{
            if(conn != null){
                conn.close();
            }
        }
        return respuesta;


    }

    public ArrayList<Proyecto> query_requerimiento_2() throws SQLException {

        ArrayList<Proyecto> respuesta = new ArrayList<Proyecto>();
        Connection conn = JDBCUtilities.getConnection();

        try {
            String consulta2 = "SELECT p.Fecha_Inicio , p.Numero_Habitaciones , p.Numero_Banos, l.Nombre, Primer_Apellido, Estrato as Estrato" +
            " FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider  = l.ID_Lider INNER JOIN Tipo t ON p.ID_Tipo  = t.ID_Tipo WHERE Constructora  = 'Pegaso' LIMIT 50";
            PreparedStatement stmt = conn.prepareStatement(consulta2);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Proyecto requerimientoQuery2 = new Proyecto();
                requerimientoQuery2.setFecha_inicio(rs.getString("Fecha_inicio"));
                requerimientoQuery2.setNum_habitaciones(rs.getInt("Numero_habitaciones"));
                requerimientoQuery2.setNum_banios(rs.getInt("Numero_Banos"));
                requerimientoQuery2.setNombre(rs.getString("Nombre"));
                requerimientoQuery2.setApellido(rs.getString("Primer_Apellido"));
                requerimientoQuery2.setEstrato_proyecto(rs.getInt("Estrato"));
                respuesta.add(requerimientoQuery2);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en consulta2 query requerimientoVo_2.");
        }
        finally{
            if(conn != null){
                conn.close();
            }
        }
        return respuesta;
    }// Fin del método query_requerimiento_2


 public ArrayList<Proyecto> query_requerimiento_3() throws SQLException {
        Connection conexion = JDBCUtilities.getConnection();
        // Crea arreglo para almacenar objetos tipo Proyecto
        ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
        // Consultas
        try {            
            // Ejecuta el query
            ResultSet query = conexion.createStatement().executeQuery(
                    "SELECT SUM(Numero_Habitaciones) as Total_Habitaciones, Constructora FROM Proyecto p GROUP BY Constructora");
            // Recorre los resultados del query
            while (query.next()) {
                // Almacena los resultados del query en un objeto Proyecto
                Proyecto objProyecto = new Proyecto();
                objProyecto.setNum_habitaciones(query.getInt("Total_Habitaciones"));
                objProyecto.setNombre_constructora(query.getString("Constructora"));
                // añadir el objeto al array
                proyectos.add(objProyecto);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return proyectos;
    }// Fin del método query_requerimiento_3

public ArrayList<Proyecto> query_requerimiento_5() throws SQLException{
        Connection conexion = JDBCUtilities.getConnection();
        // Crea arreglo para almacenar objetos tipo Proyecto
        ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
        // Consultas
        try {            
            // Ejecuta el query
            ResultSet query = conexion.createStatement().executeQuery(
                    "SELECT SUM(Numero_Habitaciones) as Total_Habitaciones, Constructora FROM Proyecto p GROUP BY Constructora HAVING Total_Habitaciones > 200.0 ORDER BY Total_Habitaciones ASC");
            // Recorre los resultados del query
            while (query.next()) {
                // Almacena los resultados del query en un objeto Proyecto
                Proyecto objProyecto = new Proyecto();
                objProyecto.setNum_habitaciones(query.getInt("Total_Habitaciones"));
                objProyecto.setNombre_constructora(query.getString("Constructora"));
                // añadir el objeto al array
                proyectos.add(objProyecto);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return proyectos;
    }// Fin del método query_requerimiento_4


}