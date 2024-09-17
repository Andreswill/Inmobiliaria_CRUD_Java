package model;

public class Propiedad {
    private String numeroMatricula;
    private String direccion;
    private String telefono;
    private boolean disponible;
    private int alquiler;
    private String zona;
    private String descripcion;

    public Propiedad(String numeroMatricula, String direccion, String telefono, boolean disponible, int alquiler, String zona, String descripcion) {
        this.numeroMatricula = numeroMatricula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.disponible = disponible;
        this.alquiler = alquiler;
        this.zona = zona;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public String getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(String numeroMatricula) { this.numeroMatricula = numeroMatricula; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public int getAlquiler() { return alquiler; }
    public void setAlquiler(int alquiler) { this.alquiler = alquiler; }

    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return direccion;
    }
}
