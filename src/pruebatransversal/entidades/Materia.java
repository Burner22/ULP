
package pruebatransversal.entidades;

public class Materia {
    String nombre;
    int  año, idMateria;
    boolean estado;
    
    public Materia() {
    }
    
    public Materia(String nombre, int año, boolean estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia(String nombre, int año, boolean estado, int idMateria) {
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
    @Override
    public String toString() {
        return "Id Materia: " + idMateria + ", Nombre: " + nombre + ", Año: " + año;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Materia other = (Materia) o;
        if (this.hashCode() != other.hashCode()) {
            return false;
        }
        return true;     
    }

    @Override
    public int hashCode() {
        return this.idMateria; 
    }
    
   
}