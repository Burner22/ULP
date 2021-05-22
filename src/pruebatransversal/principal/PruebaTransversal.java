package pruebatransversal.principal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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
        Conexion con = new Conexion();
        AlumnoData newAlu = new AlumnoData(con);
        MateriaData newMate = new MateriaData(con);
        CursadaData newCurs = new CursadaData(con);

        //-AlumnoData test.
        
        //agregarAlumno(). -Funcionando.
//        Alumno alu1 = new Alumno ("Daniel", "Gani", LocalDate.of(1996, Month.OCTOBER, 6), 190, true);//Añadimos un alumno sin id en la base de datos.
//        newAlu.agregarAlumno(alu1);//Agregamos al alumno en la base de datos. *Revisar la tabla alumno para poder ver los cambios.
        
        //buscarAlumno(). -Funcionando.
        //Buscamos al alumno que tenga como idAlumno = 11 en la tabla de alumno;
//        System.out.println(newAlu.buscarAlumno(11));
        //En el Output se muestra el nombre del alumno.
        
        //buscarAlumnoXLegajo(). -Funcionando.
        //Buscamos al alumno que tenga como legajo = 151015 en la tabla de alumno;
//        System.out.println(newAlu.buscarAlumnoXLegajo(151015));
        //En el Output se muestra el nombre del alumno.
        
        //obtenerAlumnos(). -Funcionando.
        //Obtenemos a todos los alumnos en la tabla "alumno" y los guardamos en un array list
        //(Hacemos esto solo para testear el metodo, se puede realizar usando sout y dentro el metodo obtenerAlumos()).
//        ArrayList<Alumno> alumnos = newAlu.obtenerAlumnos();
//        for(Alumno a: alumnos){
//            System.out.println(a);
//        }

        //actualizarAlumno(). -Funcionando.
        //Creamos un nuevo alumno, esta vez ingresando el idAlumno que tiene en la base de datos como parametro.
//        Alumno alu1 = new Alumno ("Daniel", "Gani", LocalDate.of(1996, Month.OCTOBER, 6), 190, true, 33);//Se usa el constructor con el idAlumno.
//        alu1.setFechNac(LocalDate.of(1996, Month.DECEMBER, 6));//Cambiamos el mes de su fecha de nacimiento
//        alu1.setNombre("Damian");//Cambiamos el nombre del alumno.
//        newAlu.actualizarAlumno(alu1);//Actualizamos en la tabla "alumno" al alumno que tiene idAlumno = 33. *Revisar la table "alumno" para poder ver los cambios.
        
        //borrarAlumnoLogico(). -Funcionando.
//        newAlu.borrarAlumnoLogico(25);//Cambiamos el estado de un alumno que tenga idAlumno = 25;
        
        


        //-MateriaData test
        
        //agregarMateria(). -Funcionando.
//        Materia mat1 = new Materia("Matematica", 1, true);//Añadimos una materia sin id en la base de datos.
//        newMate.agregarMateria(mat1);//Agregamos a la materia en la base de datos. *Revisar la tabla "materia" para poder ver los cambios.
        
        //buscarMateria(). -Funcionando.
        //Buscamos la materia que tenga como idMateria = 4 en la tabla de materia;
//        System.out.println(newMate.buscarMateria(4));
        //En el Output se muestra el nombre de la materia.

        //obtenerMaterias(). -Funcionando.
        //Obtenemos a todas las materias en la tabla "materia" y los guardamos en un arrayList.
        //(Hacemos esto solo para testear el metodo, se puede realizar usando sout y dentro el metodo obtenerMaterias()).
//        ArrayList<Materia> materias = newMate.obtenerMaterias();
//        for(Materia m: materias){
//            System.out.println(m);
//        }

        //actualizarMateria(). -Funcionando.
        //Creamos un nueva materia, esta vez ingresando el idMateria que tiene en la base de datos como parametro.
//        Materia mat1 = new Materia("Matematica", 1, true, 9);//Se usa el constructor con el idMateria.
//        mat1.setAño(2);//Cambiamos el año en que se cursa la materia.
//        mat1.setNombre("Matematica 2");//Cambiamos el nombre de la materia.
//        newMate.actualizarMateria(mat1);//Actualizamos en la tabla "materia" a la materia que tiene idMateria = 9. *Revisar la tabla "materia" para poder ver los cambios.

        //borrarMateriaLogico().-Funcionando.
//        newMate.borrarMateriaLogico(9);//Cambiamos el estado de la materia que tenga idMateria = 9;





        //-CursadaData test
        
        //guardarCursada(). -Funcionando
//        Materia mat1 = new Materia("Matematica 2", 2, true, 9);//Materia que existe en la base de datos
//        Alumno alu1 = new Alumno ("Damian", "Gani", LocalDate.of(1996, Month.DECEMBER, 6), 190, true, 33);//Alumno que existe en la base de datos y esta activo.
//        Cursada c1 = new Cursada(mat1, alu1, 0);//Nueva cursada con nota 0.
        
//        newCurs.guardarCursada(c1);//Se guarda una nueva cursada en la tabla "cursada".
        
        //obtenerCursadas(). -Funcionando
        //Obtenemos todas las cursadas en la tabla "cursada" y los guardamos en un arrayList.
        //(Hacemos esto solo para testear el metodo, se puede realizar usando sout y dentro el metodo obtenerCursadas()).
//        ArrayList<Cursada> cursadas = newCurs.obtenerCursadas();
//        for(Cursada c: cursadas){
//            System.out.println(c);
//        }

        //obtenerCursadasXAlumno().
        //Obtenemos todas las cursadas en la tabla "cursada" en las que esta el idAlumno = 9.
//        ArrayList<Cursada> cursadasXAlumnos = newCurs.obtenerCursadasXAlumno(9);
//        for(Cursada cxa: cursadasXAlumnos){
//            System.out.println(cxa);
//        }

        //obtenerMateriasCursasdas(). -Funcionando
        //Obtenemos todas las materias que esta cursando el idAlumno = 9.
//        ArrayList<Materia> materiasCursadas = newCurs.obtenerMateriasCursadas(9);
//        for(Materia m: materiasCursadas){
//            System.out.println(m);
//        }

        //obtenerMateriasNOCursadas(). -Funcionando
        //Obtenemos todas las materias que NO esta cursando el idAlumno = 11;
//        ArrayList<Materia> materiasNOCursadas = newCurs.obtenerMateriasNOCursadas(11);
//        for(Materia mnc: materiasNOCursadas){
//            System.out.println(mnc);
//        }

        //actualizarNotaCursada(). -Funcionando
        //Actualizamos la nota de una materia que esta cursando el idAlumno = 33;
//        newCurs.actualizarNotaCursada(9, 33, 8.5);

    }

}
