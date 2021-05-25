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

    private Connection con;

    public CursadaData(Conexion conexion) {
        con = conexion.getConnection();
    }

    public void guardarCursada(Cursada cursada) {
        String sql = "INSERT INTO cursada VALUES (null, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, cursada.getAlum().getIdAlumno());
            ps.setInt(2, cursada.getMater().getIdMateria());
            ps.setDouble(3, cursada.getNota());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                //Como nuestro objeto cursada no tiene id tenemos que recuperar el que se le asigno
                //en la base de datos.
                cursada.setIdCursada(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el Id de cursada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar cursada: " + ex.getMessage());
        }
    }  //FUNCIONA

    public ArrayList<Cursada> obtenerCursadas() {
        ArrayList<Cursada> cursadas = new ArrayList<>();
        Cursada cursada;
        String sql = "SELECT * FROM cursada";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cursada = new Cursada(new Materia(), new Alumno(), 0);
                cursada.setIdCursada(rs.getInt("idCursada"));
                cursada.getAlum().setIdAlumno(rs.getInt("idAlumno"));
                cursada.getMater().setIdMateria(rs.getInt("idMateria"));
                cursada.setNota(rs.getDouble("nota"));
                cursadas.add(cursada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener todas las cursadas: " + ex.getMessage());
        }
        return cursadas;
    } //FUNCIONA

        public ArrayList<Cursada> obtenerCursadasXAlumno(int id) {
        ArrayList<Cursada> cursadasXAlumno = new ArrayList<>();
        Cursada cursada;
        String sql = "SELECT * FROM cursada,materia WHERE cursada.idMateria=materia.idMateria AND cursada.idAlumno=?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cursada = new Cursada(new Materia(), new Alumno(), 0);
                cursada.setIdCursada(rs.getInt("idCursada"));
                cursada.getAlum().setIdAlumno(rs.getInt("idAlumno"));
                cursada.getMater().setIdMateria(rs.getInt("idMateria"));
                cursada.getMater().setNombre(rs.getString("nombre_materia"));
                cursada.setNota(rs.getDouble("nota"));
                cursadasXAlumno.add(cursada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener cursadas/Inscripciones del alumno: " + ex.getMessage());
        }
        return cursadasXAlumno;
    }   //FUNCIONA
    public ArrayList<Cursada>obtenerMateriasXAlumno(int id){
        ArrayList<Cursada> materiasXAlumno = new ArrayList<>();
        Cursada cursada;
        String sql = "SELECT * FROM cursada,alumno WHERE alumno.idAlumno=cursada.idAlumno AND cursada.idMateria=?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cursada = new Cursada(new Materia(), new Alumno(), 0);
                cursada.setIdCursada(rs.getInt("idCursada"));
                cursada.getAlum().setIdAlumno(rs.getInt("idAlumno"));
                cursada.getAlum().setNombre(rs.getNString("nombre"));
                cursada.getAlum().setApellido(rs.getNString("apellido"));
                cursada.getMater().setIdMateria(rs.getInt("idMateria"));
                cursada.setNota(rs.getDouble("nota"));
                materiasXAlumno.add(cursada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener cursadas/Inscripciones del alumno: " + ex.getMessage());
        }
        return materiasXAlumno;
    }

    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        ArrayList<Materia> materiasCursadas = new ArrayList<>();
        Materia materia;
        String sql = "SELECT materia.idMateria, nombre_materia, anio, estado FROM materia, cursada WHERE materia.idMateria = cursada.idMateria AND cursada.idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre_materia"));
                materia.setAño(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                materiasCursadas.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las materias cursadas del alumno: " + ex.getMessage());
        }
        return materiasCursadas;
    }  //FUNCIONA

    public ArrayList<Materia> obtenerMateriasNOCursadas(int id) {
        ArrayList<Materia> materiasNoCursadas = new ArrayList<>();
        Materia materia;
        String sql = "SELECT * FROM materia WHERE idMateria NOT IN"
                + "(SELECT materia.idMateria FROM materia, cursada WHERE materia.idMateria = cursada.idMateria AND cursada.idAlumno = ?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre_materia"));
                materia.setAño(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                materiasNoCursadas.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar las materias no cursadas del alumno: " + ex.getMessage());
        }
        return materiasNoCursadas;
    } //FUNCIONA 

    public void borrarCursadaDeUnaMateriaDeUnAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM cursada WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar una cursada de un alumno: " + ex.getMessage());
        }

    }  //FUNCIONA

    public Alumno buscarAlumno(int id) {
        Conexion c = new Conexion();
        AlumnoData newAlu = new AlumnoData(c);
        return newAlu.buscarAlumno(id);
    }   //FUNCIONA

    public Materia buscarMateria(int id) {
        Conexion c = new Conexion();
        MateriaData newMate = new MateriaData(c);
        return newMate.buscarMateria(id);
    }   //FUNCIONA

    public Cursada buscarInscripcion(int id) {
        Cursada curs = null;
        String sql = "SELECT * FROM cursada WHERE cursada.idCursada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                curs = new Cursada();
                curs.setIdCursada(rs.getInt(1));
                Alumno a = buscarAlumno(rs.getInt(2));
                Materia m = buscarMateria(rs.getInt(3));
                curs.setAlum(a);
                curs.setMater(m);
                curs.setNota(rs.getDouble(4));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return curs;
    }  //FUNCIONA

    public void actualizarCursada(Cursada cursada) {
        String sql = "UPDATE cursada SET nota=? WHERE cursada.idCursada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, cursada.getNota());
            ps.setInt(2, cursada.getIdCursada());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }  //FUNCIONA

    public void actualizarNotaCursada(int idMateria, int idAlumno, double nota) {
        String sql = "UPDATE cursada SET nota=? WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la nota de cursada: " + ex.getMessage());
        }

    }  //FUNCIONA

}
