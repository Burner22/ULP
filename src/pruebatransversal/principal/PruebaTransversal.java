
package pruebatransversal.principal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import pruebatransversal.entidades.Alumno;
import pruebatransversal.modelo.AlumnoData;
import pruebatransversal.modelo.Conexion;

public class PruebaTransversal {

    public static void main(String[] args) {
        Conexion con = new Conexion ();
    
        Alumno a = new Alumno ("claudia","Clarinete",LocalDate.of(1995, Month.MARCH, 22),4,true,7); //Pruebas para actualizar alumno
        
        AlumnoData newAlu = new AlumnoData (con);
        
        //newAlu.agregarAlumno(a);
        
        //System.out.println(newAlu.buscarAlumno(6));
        
        Iterator it = newAlu.obtenerAlumnos().iterator(); //Instancio iterator sobre la lista creada en obtener alumnos
        
        while(it.hasNext()){
            System.out.println(it.next());  //Enlisto los alumnos
        }
        
        newAlu.actualizarAlumno(a);   //Actualizar alumnos
        
        newAlu.borrarAlumno(6);
        
        
    }
    
}
