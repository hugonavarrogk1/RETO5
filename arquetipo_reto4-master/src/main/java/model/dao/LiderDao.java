package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Lider;

public class LiderDao {

    public ArrayList<Lider> query_requerimiento_4() throws SQLException {
        Connection conexion = JDBCUtilities.getConnection();
        // Crea arreglo para almacenar objetos tipo Proyecto
        ArrayList<Lider> lideres = new ArrayList<Lider>();
        try {
            String consulta4 = "SELECT l.Nombre, Primer_Apellido" +
            " FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider  = l.ID_Lider WHERE Constructora  = 'Pegaso' ";
            PreparedStatement stmt = conexion.prepareStatement(consulta4);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Lider requerimientQuery4 = new Lider();
                requerimientQuery4.setNombre(rs.getString("Nombre"));
                requerimientQuery4.setApellido(rs.getString("Primer_Apellido"));
                lideres.add(requerimientQuery4);
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error en consulta4 query requerimientoVo_4.");
        }
        finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return lideres;
    }// Fin del método query_requerimiento_4

}