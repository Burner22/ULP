package pruebatransversal.modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pruebatransversal.entidades.Materia;

public class MateriaData {

    private Connection con;//conexion a base de datos
    //Probando push.

    public MateriaData(Conexion c) {//conexion a la base de datos
        con = c.getConnection();
    }

    public void agregarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre_materia,anio,estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.getEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();// el resultset trae los elementos de la BD, seria como una tabla virtual 

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID de Materia");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar materia: " + ex.getMessage());
        }
    }  //FUNCIONA

    public Materia buscarMateria(int id) {
        Materia materia = null;  //Instancio Alumno vacio para poder llenarlo y convertirlo en algo potable
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);   //(Parameter Index, valor int), 

            ResultSet rs = ps.executeQuery();

            //Si encuentro alumno entonces lo instancio de manera manual, trayendo los datos de la BBDD
            if (rs.next()) {                         //LLeno el nuevo alumno con los valores que estan en la base de datos
                materia = new Materia(); //Nuevo alumno por si se realiza otra busqueda
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre_materia"));
                materia.setAño(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado dicha materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar materia: "+ ex.getMessage());
        }

        return materia;
    }   //FUNCIONA            

    public ArrayList<Materia> obtenerMaterias() {//No esta devolviendo el año de las materias
        ArrayList<Materia> materias = new ArrayList<>();
        Materia materia = null;
        String sql = "SELECT * FROM materia"; //todo lo que tenga materia

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();  //este elemento muestra los elemntos que se encuentan en la BD

            while (rs.next()) {
                materia = new Materia();//aux sirve como auxiliar para cargar la materia a la lista. 
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre_materia"));
                materia.setIdMateria(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias: " + ex.getMessage());
        }
        return materias;
    }  //FUNCIONA

    public void actualizarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre_materia = ?,anio=?,estado = ? WHERE idMateria = ?";
        //El orden de los signos es equivalente a lo que se va a setear abajo en el prepared Statement
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.getEstado());
            ps.setInt(4, materia.getIdMateria());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar materia: " + ex.getMessage());
        }
    }   //FUNCIONA

    public void borrarMateria(int id) {
        String sql = "DELETE FROM materia WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar la materia: " + ex.getMessage());
        }
    }   //FUNCIONA

    public void borrarMateriaLogico(int id) {
        String query = "UPDATE materia SET estado=false WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar materia(Logico): " + ex.getMessage());
        }

    }
}
