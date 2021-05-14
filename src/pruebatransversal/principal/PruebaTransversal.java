
package pruebatransversal.principal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import pruebatransversal.entidades.Alumno;
import pruebatransversal.entidades.Cursada;
import pruebatransversal.entidades.Materia;
import pruebatransversal.modelo.AlumnoData;
import pruebatransversal.modelo.Conexion;
import pruebatransversal.modelo.CursadaData;
import pruebatransversal.modelo.MateriaData;

public class PruebaTransversal {

    public static void main(String[] args) {
        Conexion con = new Conexion ();
        AlumnoData newAlu = new AlumnoData(con);
        MateriaData newMate = new MateriaData(con);
        CursadaData newCurs = new CursadaData(con);
        
        //Alumno alu1 = new Alumno ("Roberto","Perez", LocalDate.of(1999, Month.FEBRUARY, 8),151015,true,9);
        Alumno alu2 = new Alumno ("Ezequiel","Coronel", LocalDate.of(2000, Month.MARCH, 22),784514,true);
        //Materia mat1 = new Materia ("Laboratorio de Programacion",4,true,4);
        Materia mat2 = new Materia ("EDA",1,true);
        //newAlu.agregarAlumno(alu2);
        //newMate.agregarMateria(mat2);
        
        //Cursada cur1 = new Cursada(11,mat2,alu2,10);
        
        //newCurs.guardarCursada(cur1); //guardarCursada(Cursada cursada)

//        Iterator it = newCurs.obtenerCursadas().iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        Iterator ip = newCurs.obtenerMateriasCursadas(4).iterator();
//            while(ip.hasNext()){
//            System.out.println(ip.next());
//        }
//       Iterator is = newCurs.obtenerCursadasXAlumno(11).iterator();
//       while(is.hasNext()){
//            System.out.println(is.next());
//        }
//       
//       Iterator ik = newCurs.obtenerMateriasNOCursadas(9).iterator();
//       while(ik.hasNext()){
//           System.out.println(ik.next());
//       }
        //System.out.println(newCurs.buscarInscripcion(13));
        
        newCurs.actualizarNotaCursada(4,5,7,9);
        
        //newCurs.borrarCursadaDeUnaMateriaDeUnAlumno(12);  //borrarCursadaDeUnaMateriaDeUnAlumno(int id) 

        //newCurs.actualizarNotaCursada(11, 8);   //actualizarNotaCursada(int idAlumno, nota)
        
        //////////////////////////////////////////////////////////
        
        //System.out.println(newAlu.buscarAlumno(9)); //buscarAlumno(int id)
        
        //Iterator it = newAlu.obtenerAlumnos().iterator(); //obtenerAlumnos()
        //while(it.hasNext()){
        //    System.out.println(it.next());
        //}
        
        //newAlu.actualizarAlumno(alu1);  //actualizarAlumno(Alumno alumno)

        //newAlu.borrarAlumno(12);  //borrarAlumno(int id)
        
        /////////////////////////////////////////////////////////
        
        //System.out.println(newMate.buscarMateria(4)); //buscarMateria(int id)
        
        //Iterator it = newMate.obtenerMaterias().iterator();  //obtenerMaterias()
        //while(it.hasNext()){
        //    System.out.println(it.next());  
        //}
        
        //newMate.actualizarMateria(mat1);  //actualizarMateria(Materia materia)
        
        //newMate.borrarMateria(6);  //borrarMateria(int id)
        
        ////////////////////////////////////////////////////////
        
    }
    
}
