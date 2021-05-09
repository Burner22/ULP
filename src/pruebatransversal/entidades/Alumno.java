
package pruebatransversal.entidades;

import java.time.LocalDate;


public class Alumno {
    private String nombre, apellido;
    private LocalDate fechNac;
    private int legajo,idAlumno;
    boolean estado;
    
    public Alumno() {    //Constructor
    }

    public Alumno(String nombre, String apellido, LocalDate fechNac, int legajo, boolean estado) { //Constructor sin id_alumno
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNac = fechNac;
        this.legajo = legajo;
        this.estado = estado;
    }

    public Alumno(String nombre, String apellido, LocalDate fechNac, int legajo, boolean estado, int idAlumno) {  //Constructor con id_alumno
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNac = fechNac;
        this.legajo = legajo;
        this.estado = estado;
        this.idAlumno = idAlumno;
    }
    
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha NacImiento: " + fechNac + ", Legajo: " + legajo + ", idAlumno: " + idAlumno + ", Estado: " + estado;
    }

    
  
}
