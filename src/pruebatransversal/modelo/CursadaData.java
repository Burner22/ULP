
package pruebatransversal.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pruebatransversal.entidades.Alumno;
import pruebatransversal.entidades.Cursada;
import pruebatransversal.entidades.Materia;

public class CursadaData {
    Connection con;
    Conexion conexion;
    
    public CursadaData(Conexion conexion){
        con = conexion.getConnection();
    }
    
    public void guardarCursada(Cursada cursada){
        try {
            String sql = "INSER INTO cursada (idAlumno,idMateria,nota) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
            ps.setInt(1, cursada.getAlum().getIdAlumno());
            ps.setInt(2, cursada.getMater().getIdMateria());
            ps.setDouble(3, cursada.getNota());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                cursada.setIdCursada(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo obtener el Id de cursada");
            }
            ps.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList <Cursada> obtenerCursadas(){
        ArrayList <Cursada> cursadas = new ArrayList<>();
        Cursada cursada = null;
        String sql = "SELECT * FROM cursada";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                cursada = new Cursada();
                cursada.setIdCursada(rs.getInt(1));
                cursada.getAlum().setIdAlumno(rs.getInt(2));
                cursada.getMater().setIdMateria(rs.getInt(3));
                cursada.setNota(rs.getDouble(4));
                cursadas.add(cursada);
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cursadas;
    }
/*d
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
    */
    public void borrarCursadaDeUnaMateriaDeUnAlumno (int idAlumno, int idMateria){
        
    }
    
    public void actualizarNotaCursada(int idAlumno, int nota){
        
    }
}
