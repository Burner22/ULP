
package entidades;

public class Materia {
    String nombre;
    int  año, estado, idMateria;

    public Materia() {
    }
    
    public Materia(String nombre, int año, int estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia(String nombre, int año, int estado, int idMateria) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
        this.idMateria = idMateria;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id Materia: " + idMateria + ", Nombre: " + nombre + ", Año: " + año;
    }
    
    
   
}