
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
                String sql = "INSERT INTO cursada (idAlumno,idMateria,nota) VALUES (?,?,?)";
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
            JOptionPane.showMessageDialog(null, "error");
        }
    }  //FUNCIONA
    
    public ArrayList <Cursada> obtenerCursadas(){
        ArrayList <Cursada> cursadas = new ArrayList<>();
        Cursada cursada;
        String sql = "SELECT * FROM cursada";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()){
                
                cursada = new Cursada(new Materia(),new Alumno());
                cursada.setIdCursada(rs.getInt(1));
                cursada.getAlum().setIdAlumno(rs.getInt(2));
                cursada.getMater().setIdMateria(rs.getInt(3));
                cursada.setNota(rs.getDouble(4));
                cursadas.add(cursada);
            }
        
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cursadas;
    }

    public ArrayList <Cursada> obtenerCursadasXAlumno(int id){
        String sql = "SELECT * FROM cursada WHERE cursada.idAlumno=?";
        ArrayList <Cursada> cursadas = new ArrayList <> ();
        Cursada ins;      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                ins = new Cursada();
                ins.setIdCursada(rs.getInt(1));
                Alumno alu = this.buscarAlumno(rs.getInt(2));
                Materia mat = this.buscarMateria(rs.getInt(3));
                ins.setAlum(alu);
                ins.setMater(mat);
                ins.setNota(rs.getDouble(4));
                cursadas.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            ex.getLocalizedMessage();
        }     
    return cursadas;    
    }
    
    public ArrayList <Cursada> obtenerMateriasCursadas (int id){
    String sql = "SELECT * FROM cursada WHERE idMateria=?";
    ArrayList <Cursada> materias = new ArrayList <>();   
    Cursada ins;
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()){
            ins = new Cursada();
            ins.setIdCursada(rs.getInt(1));
            Alumno alu = buscarAlumno(rs.getInt(2));
            Materia mat = buscarMateria(rs.getInt(3));
            ins.setAlum(alu);
            ins.setMater(mat);
            ins.setNota(rs.getDouble(4));
            materias.add(ins);
        }
        ps.close();
    }catch (SQLException ex) {
        Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    return materias;
    }
    
    public ArrayList <Materia> obtenerMateriasNOCursadas (int id){
        Materia mater = null;
        String sql = "SELECT * FROM materia WHERE idMateria not in (SELECT idMateria FROM cursada WHERE idAlumno =?)";
        ArrayList <Materia> noCurs = new ArrayList <>();
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                mater = new Materia ();
                mater.setIdMateria(rs.getInt(1));
                mater.setNombre(rs.getString(2));
                mater.setAño(rs.getInt(3));
                mater.setEstado(rs.getBoolean(4));
                noCurs.add(mater);
            }
         ps.close();   
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return noCurs;
    }

    public void borrarCursadaDeUnaMateriaDeUnAlumno (int idAlumno, int idMateria){
        String sql = "DELETE FROM cursada WHERE cursada.idAlumno=?,cursada.idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void actualizarNotaCursada(int idAlumno, int nota){
        String sql = "UPDATE cursada SET nota=? WHERE cursada.idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    public Alumno buscarAlumno (int id){
        AlumnoData newAlu = new AlumnoData(conexion);
        return newAlu.buscarAlumno(id);
    }
    
    public Materia buscarMateria (int id){
        MateriaData newMate = new MateriaData(conexion);
        return newMate.buscarMateria(id);
    }
}
