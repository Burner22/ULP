/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatransversal.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pruebatransversal.entidades.Materia;

/**
 *
 * @author Fiero-Sama
 */
public class MateriaData {
    Connection con;//conexion a base de datos
    
    public MateriaData(Conexion c){//conexion a la base de datos
        con = c.getConnection();
    }
    
    public void agregarMateria(Materia materia){
       try{    
            String sql = "INSERT INTO materia (nombre,anio,estado) VALUES (?, ?, ?)";
                                   
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                                    
            ps.setString(1, materia.getNombre());
            ps.setInt(4, materia.getAño());
            ps.setBoolean(5, materia.getEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();// el resultset trae los elementos de la BD, seria como una tabla virtual 
            
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID de Materia");
            }
            
            ps.close();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo agregar la Materia");
        }
    }
       public ArrayList <Materia> obtenerMaterias(){
        ArrayList <Materia> materias = new ArrayList <>();
        String sql = "SELECT * FROM materia"; //todo lo que tenga materia
        
         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ResultSet rs = ps.executeQuery();  //este elemento muestra los elemntos que se encuentan en la BD
             
             while (rs.next()){                 
               Materia aux=new Materia();//aux sirve como auxiliar para cargar la materia a la lista. 
               aux.setIdMateria(rs.getInt(1));
               aux.setNombre(rs.getString(2));
               aux.setIdMateria(rs.getInt(3));
               aux.setEstado(rs.getBoolean(6)); 
               materias.add(aux);
               
             }      
         } catch (SQLException ex) {
             Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
         }
        return materias;      
    }
    
    public void actualizarMateria (Materia materia){  
        String sql = "UPDATE materia SET nombre = ?,anio=?,estado = ? WHERE idMateria = ?"; 
                                //El orden de los signos es equivalente a lo que se va a setear abajo en el prepared Statement
        try {                      
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
 
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAño()); 
             ps.setBoolean(3, materia.getEstado());
                 
             
             ps.executeUpdate(); 
                   
         } catch (SQLException ex) {
             Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     public void actualizarEstadoMateria (Materia materia){  //para actualizar el estado, para no eliminar
        String sql = "UPDATE materia SET estado = ? WHERE idMateria = ?"; 
                                //se actualiza solo el estado de la materia
        try {                      
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
 
            
             ps.setBoolean(1, materia.getEstado());
             ps.setInt(2, materia.getIdMateria());     
             
             ps.executeUpdate(); 
                   
         } catch (SQLException ex) {
             Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    
}
