package view;


import java.sql.SQLException;
import java.util.ArrayList;

import controller.Controlador;
import model.vo.Lider;
import model.vo.Proyecto;

public class Vista {

    public static final Controlador controlador = new Controlador();

    public static void vista_requerimiento_1() {
        String mensaje = "";

        try {
            ArrayList<Proyecto> proyectos = controlador.Solucionar_requerimiento_1();
            for (int i = 0; i < proyectos.size(); i++) {
                mensaje = "Fecha_Inicio: " + proyectos.get(i).getFecha_inicio();
                mensaje += " - Numero_Habitaciones: " + proyectos.get(i).getNum_habitaciones();
                mensaje += " - Numero_Banos: " + proyectos.get(i).getNum_banios();
                System.out.println(mensaje);
        }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void vista_requerimiento_2() {
        String mensaje = "";

        try {
            ArrayList<Proyecto> proyectos = controlador.Solucionar_requerimiento_2();
            for (int i = 0; i < proyectos.size(); i++){
                mensaje = "Fecha_Inicio: " + proyectos.get(i).getFecha_inicio();
                mensaje += " - Numero_Habitaciones: " + proyectos.get(i).getNum_habitaciones();
                mensaje += " - Numero_Banos: " + proyectos.get(i).getNum_banios();
                mensaje += " - Nombre_Lider: " + proyectos.get(i).getNombre();
                mensaje += " - Apellido_Lider: " + proyectos.get(i).getApellido();
                mensaje += " - Estrato_Proyecto: " + proyectos.get(i).getEstrato_proyecto();
                System.out.println(mensaje);
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

 public static void vista_requerimiento_3() {
        try {

            ArrayList<Proyecto> proyectos = controlador.Solucionar_requerimiento_3();
            for (int i = 0; i < proyectos.size(); i++) {
                String info = "Total_Habitaciones: " + proyectos.get(i).getNum_habitaciones();
                info += " - Constructora: " + proyectos.get(i).getNombre_constructora();
                System.out.println(info);
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }

    }


   public static void vista_requerimiento_4() {
        try {

            ArrayList<Lider> lideres = controlador.Solucionar_requerimiento_4();
            for (int i = 0; i < lideres.size(); i++) {
                String info = "Nombre_Lider: " + lideres.get(i).getNombre() + " - Apellido_Lider: "
                        + lideres.get(i).getApellido();
                System.out.println(info);
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }

    }

    public static void vista_requerimiento_5() {
        try {

            ArrayList<Proyecto> proyectos = controlador.Solucionar_requerimiento_5();
            for (int i = 0; i < proyectos.size(); i++) {
                String info = "Total_Habitaciones: " + proyectos.get(i).getNum_habitaciones();
                info += " - Constructora: " + proyectos.get(i).getNombre_constructora();
                System.out.println(info);
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }

    }
}