package model;

public class Cliente {
    private String nombres;
    private String telefono;
    private String direccion;
    private String profesion;
    private String lugarTrabajo;
    private int salario;
    private String barrio;
    private String zona;
    private int precioAlquiler;
    private String descripcion;

    public Cliente(String nombres, String telefono, String direccion, String profesion, String lugarTrabajo, int salario, String barrio, String zona, int precioAlquiler, String descripcion) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.profesion = profesion;
        this.lugarTrabajo = lugarTrabajo;
        this.salario = salario;
        this.barrio = barrio;
        this.zona = zona;
        this.precioAlquiler = precioAlquiler;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getProfesion() { return profesion; }
    public void setProfesion(String profesion) { this.profesion = profesion; }

    public String getLugarTrabajo() { return lugarTrabajo; }
    public void setLugarTrabajo(String lugarTrabajo) { this.lugarTrabajo = lugarTrabajo; }

    public int getSalario() { return salario; }
    public void setSalario(int salario) { this.salario = salario; }

    public String getBarrio() { return barrio; }
    public void setBarrio(String barrio) { this.barrio = barrio; }

    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }

    public int getPrecioAlquiler() { return precioAlquiler; }
    public void setPrecioAlquiler(int precioAlquiler) { this.precioAlquiler = precioAlquiler; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return nombres + " - " + telefono + " - " + direccion;
    }
}
