package model.vo;

public class Proyecto {

    private String fecha_inicio;
    private int num_habitaciones;
    private int num_banios;
    private String nombre_constructora;
    private int estrato_proyecto;
    private String nombre;
    private String apellido;
    private String Ciudad;
    private Lider lider;

    public Proyecto() {

    }

    public Proyecto(String fecha_inicio, int num_habitaciones, int num_banios, String nombre_constructora, int estrato_proyecto, Lider lider, String ciudad, String nombre, String apellido ){
        this.fecha_inicio = fecha_inicio;
        this.num_habitaciones = num_habitaciones;
        this.num_banios = num_banios;
        this.nombre_constructora = nombre_constructora;
        this.estrato_proyecto = estrato_proyecto;
        this.lider = lider;
        this.Ciudad = ciudad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /*******************************
     * Consultores y modificadores
     ********************************/

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public int getNum_banios() {
        return num_banios;
    }

    public void setNum_banios(int num_banios) {
        this.num_banios = num_banios;
    }

    public String getNombre_constructora() {
        return nombre_constructora;
    }

    public void setNombre_constructora(String nombre_constructora) {
        this.nombre_constructora = nombre_constructora;
    }

    public Lider getLider() {
        return lider;
    }

    public void setLider(Lider lider) {
        this.lider = lider;
    }

    public int getEstrato_proyecto() {
        return estrato_proyecto;
    }

    public void setEstrato_proyecto(int estrato_proyecto) {
        this.estrato_proyecto = estrato_proyecto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad){
        this.Ciudad = ciudad;
    }
    
    public String getCiudad(){
        return Ciudad;
    }

}