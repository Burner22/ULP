
package pruebatransversal.modelo;

import java.sql.*;
import java.util.ArrayList;
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
        String sql = "INSERT INTO alumno (nombre,apellido,fecha_nacimiento,legajo,estado) VALUES (?, ?, ?, ?, ?)";//Guardo en String la consulta SQL
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Instancio una consulta preparada
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechNac())); //parseo LocalDate a Date
            ps.setInt(4, alumno.getLegajo());
            ps.setBoolean(5, alumno.getEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado con exito!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID del alumno");
            }

            ps.close();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Su alumno ya existe!");
        }
        
    } //FUNCIONA
            
    public Alumno buscarAlumno (int id){
        Alumno alumno = null;  //Instancio Alumno vacio para poder llenarlo y convertirlo en algo potable
        String sql = "SELECT * FROM alumno WHERE idAlumno = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);   //(Parameter Index, valor int), 
            
            ResultSet rs = ps.executeQuery();   
            
            //Si encuentro alumno entonces lo instancio de manera manual, trayendo los datos de la Base de datos.
            if (rs.next()){                         
                alumno = new Alumno(); //Nuevo alumno por si se realiza otra busqueda
                //LLeno el nuevo alumno con los valores que estan en la base de datos
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechNac(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setLegajo(rs.getInt("legajo"));
                alumno.setEstado(rs.getBoolean("estado"));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado dicho alumno");
            }
            ps.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar alumno: " + ex.getMessage());
        } 
        return alumno;   
    }  //FUNCIONA
    
    public Alumno buscarAlumnoXLegajo (int legajo){
        Alumno alumno = null;  //Instancio Alumno vacio para poder llenarlo y convertirlo en algo potable
        String sql = "SELECT * FROM alumno WHERE legajo = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, legajo);   //(Parameter Index, valor int), 
            
            ResultSet rs = ps.executeQuery();   
            
            //Si encuentro alumno entonces lo instancio de manera manual, trayendo los datos de la BBDD
            if (rs.next()){                        
                alumno = new Alumno(); 
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechNac(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setLegajo(rs.getInt("legajo"));
                alumno.setEstado(rs.getBoolean("estado"));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado dicho alumno");
            }
            ps.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar al alumno por legajo: " + ex.getMessage());
        } 
        return alumno;   
    }
    
    public ArrayList<Alumno> obtenerAlumnos(){
        ArrayList <Alumno> alumnos = new ArrayList <>();
        Alumno alumno = null;           //alumno nuevo vacio
        String sql = "SELECT * FROM alumno"; //No hace falta una condicion WHERE porque queremos traer todos los alumnos de la lista
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ResultSet rs = ps.executeQuery();  
             
             while (rs.next()){                 //Mientras haya un siguiente alumno, lo asigno al alumno instanciado arriba
                alumno = new Alumno();          //y voy agregandolos a la lista en este while.
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechNac(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setLegajo(rs.getInt("legajo"));
                alumno.setEstado(rs.getBoolean("estado")); 
                alumnos.add(alumno);
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener todos los alumnos: " + ex.getMessage());
         }
        return alumnos;      
    }  //FUNCIONA
    
    public void actualizarAlumno (Alumno alumno){  
        String sql = "UPDATE alumno SET nombre = ?,apellido = ?,fecha_nacimiento = ?,legajo = ?,estado = ? WHERE idAlumno = ?"; 
                                //El orden de los signos es equivalente a lo que se va a setear abajo en el prepared Statement
        try {                      
             PreparedStatement ps = con.prepareStatement(sql);
 
             ps.setString(1, alumno.getNombre());
             ps.setString(2, alumno.getApellido());
             ps.setDate(3, Date.valueOf(alumno.getFechNac()));
             ps.setInt(4, alumno.getLegajo());
             ps.setBoolean(5, alumno.getEstado());
             ps.setInt(6, alumno.getIdAlumno());     
             
             ps.executeUpdate(); 
             ps.close();
             JOptionPane.showMessageDialog(null, "Datos del alumno actualizados!");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al actualizar un alumno: " + ex.getMessage());
         }
    }  //FUNCIONA
    
//    public void borrarAlumno (int id){
//        String sql = "DELETE FROM alumno WHERE idAlumno=?";
//        
//         try {
//             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//             
//             ps.setInt(1, id);
//             
//             ps.executeUpdate();
//             
//             ps.close();
//         } catch (SQLException ex) {
//             Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
//         }          
//    }   //FUNCIONA
    
    public void borrarAlumnoLogico(int id){
        String sql = "UPDATE alumno SET estado=false WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al borrar alumno(Logico): " + ex.getMessage());
        }
        
    }
    
}
