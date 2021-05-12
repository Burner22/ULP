
package pruebatransversal.modelo;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pruebatransversal.entidades.Alumno;
                                                    //.executeUpdate = Agregar, Modificar, Eliminar
                                                    //.executeQuery = para extraccion y consulta de datos
public class AlumnoData {
    private Connection con;

    public AlumnoData(Conexion c) {     //a la instancia de alumnoData le paso por parametro la conexion creada en la clase "Conexion"
        con = c.getConnection();
    }
    
    public void agregarAlumno (Alumno alumno){ 
        try{    
            String sql = "INSERT INTO alumno (nombre,apellido,fecha_nacimiento,legajo,estado) VALUES (?, ?, ?, ?, ?)";
                                    //Guardo en String la consulta SQL
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                                    //Instancio una consulta preparado
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechNac())); //parseo LocalDate a Date
            ps.setInt(4, alumno.getLegajo());
            ps.setBoolean(5, alumno.getEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del alumno");
            }
            
            ps.close();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo agregar el alumno");
        }
        
    }
            
    public Alumno buscarAlumno (int id){
        Alumno alumno = null;  //Instancio Alumno vacio para poder llenarlo y convertirlo en algo potable
        
        try{
            alumno = new Alumno(); //Nuevo alumno por si se realiza otra busqueda
            
            String sql = "SELECT * FROM alumno WHERE idAlumno = ?";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, id);   //(Parameter Index, valor int), 
            
            ResultSet rs = ps.executeQuery();   
            
            //Si encuentro alumno entonces lo instancio de manera manual, trayendo los datos de la BBDD
            if (rs.next()){                         //LLeno el nuevo alumno con los valores que estan en la base de datos
                alumno.setIdAlumno(rs.getInt(1));
                alumno.setNombre(rs.getString(2));
                alumno.setApellido(rs.getString(3));
                alumno.setFechNac(rs.getDate(4).toLocalDate());
                alumno.setLegajo(rs.getInt(5));
                alumno.setEstado(rs.getBoolean(6));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado dicho alumno");
            }
            ps.close();
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se ha encontrado alumno");
        } 
        
        return alumno;   
    }
    
    public ArrayList<Alumno> obtenerAlumnos(){
        ArrayList <Alumno> alumnos = new ArrayList <>();
        Alumno alumno = null;           //alumno nuevo vacio
        String sql = "SELECT * FROM alumno"; //No hace falta una condicion WHERE porque queremos traer todos los alumnos de la lista
        
         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ResultSet rs = ps.executeQuery();  
             
             while (rs.next()){                 //Mientras haya un siguiente alumno, lo asigno al alumno instanciado arriba
                alumno = new Alumno();          //y voy agregandolos a la lista en este while (Mostrar con iterator)
                alumno.setIdAlumno(rs.getInt(1));
                alumno.setNombre(rs.getString(2));
                alumno.setApellido(rs.getString(3));
                alumno.setFechNac(rs.getDate(4).toLocalDate());
                alumno.setLegajo(rs.getInt(5));
                alumno.setEstado(rs.getBoolean(6)); 
                alumnos.add(alumno);
             }
             ps.close();
         } catch (SQLException ex) {
             Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
         }
        return alumnos;      
    }
    
    public void actualizarAlumno (Alumno alumno){  //Aunque abajo aparezca "setInt" no significa que vaya a cambiar el valor
        String sql = "UPDATE alumno SET nombre = ?,apellido = ?,fecha_nacimiento = ?,legajo = ?,estado = ? WHERE idAlumno = ?"; 
                                //El orden de los signos es equivalente a lo que se va a setear abajo en el prepared Statement
        try {                      
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
 
             ps.setString(1, alumno.getNombre());
             ps.setString(2, alumno.getApellido());
             ps.setDate(3, Date.valueOf(alumno.getFechNac()));
             ps.setInt(4, alumno.getLegajo());
             ps.setBoolean(5, alumno.getEstado());
             ps.setInt(6, alumno.getIdAlumno());     
             
             ps.executeUpdate(); 
             ps.close();
         } catch (SQLException ex) {
             Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void borrarAlumno (int id){
        String sql = "DELETE FROM alumno WHERE idAlumno=?";
        
         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setInt(1, id);
             
             ps.executeUpdate();
             
             ps.close();
         } catch (SQLException ex) {
             Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
         }          
    }
    
}
