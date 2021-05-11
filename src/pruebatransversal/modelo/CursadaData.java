
package pruebatransversal.modelo;

import java.sql.Connection;
import java.util.ArrayList;
import pruebatransversal.entidades.Alumno;
import pruebatransversal.entidades.Cursada;
import pruebatransversal.entidades.Materia;

public class CursadaData {
    Connection connection;
    Conexion conexion;
    
    public CursadaData(Conexion conexion){
        connection = conexion.getConnection();
    }
    
    public void guardarCursada(Cursada cursada){
        
    }
    
    public ArrayList <Cursada> obtenerCursadas(){
        
    }

    public ArrayList <Cursada> obtenerCursadasXAlumno(int id){
        
    }
    
    public Alumno buscarAlumno (int id){
        
    }
    
    public Materia buscarMateria (int id){
        
    }
    
    public ArrayList <Materia> obtenerMateriasCursadas (int id){
        
    }
    
    public ArrayList <Materia> obtenerMateriasNOCursadas (int id){
        
    }
    
    public void borrarCursadaDeUnaMateriaDeUnAlumno (int idAlumno, int idMateria){
        
    }
    
    public void actualizarNotaCursada(int idAlumno, int nota){
        
    }
}
