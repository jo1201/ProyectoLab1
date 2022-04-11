
package Modelos;

public class MServicio {
    private String codigo, nombre, tipo;
    private float costo;
    
    public MServicio() {}
    
    public MServicio(String codigo, String nombre, String tipo, float costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
}
