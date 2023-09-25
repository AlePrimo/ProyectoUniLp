package prototipoproyectouni.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
//import org.mariadb.jdbc.Statement;
import prototipoproyectouni.Entidades.Alumno;
import prototipoproyectouni.Entidades.Inscripcion;
import prototipoproyectouni.Entidades.Materia;

public class InscripcionData {

    private Inscripcion insc;
    private Connection con;
    private AlumnoData alu = new AlumnoData();
    private MateriaData mat = new MateriaData();

    public InscripcionData() {
        con = Conexion.getConnection();
    }


    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, insc.getNota());

            ps.setInt(2, insc.getAlumno().getIdAlumno());

            ps.setInt(3, insc.getMateria().getIdMateria());

            ps.executeUpdate();

            ResultSet res = ps.getGeneratedKeys();

            if (res.next()) {

                insc.setIdInscripcion(res.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Inscripciones");

        }

    }


    public List<Inscripcion> obtenerInscripciones() {

        ArrayList<Inscripcion> cursada = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion vis = new Inscripcion();
                vis.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno = alu.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = mat.buscarMateria(rs.getInt("idMateria"));
                vis.setAlumno(alumno);
                vis.setMateria(materia);
                vis.setNota(rs.getDouble("nota"));
                cursada.add(vis);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Inscripcion");
        }

        return cursada;

    }

   
    public List<Inscripcion> obtenerInscripcionesporAlumno(int id) {

        ArrayList<Inscripcion> cursadaPorAlumno = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion vis = new Inscripcion();
                vis.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno = alu.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = mat.buscarMateria(rs.getInt("idMateria"));
                vis.setAlumno(alumno);
                vis.setMateria(materia);
                vis.setNota(rs.getDouble("nota"));
                cursadaPorAlumno.add(vis);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Inscripcion");
        }

        return cursadaPorAlumno;

    }


    public List<Materia> obtenerMateriasCursadas(int idAlumno) {

        String sql = "SELECT materia.idMateria,nombre,anio,estado FROM materia,inscripcion WHERE inscripcion.idMateria=materia.IdMateria And idAlumno=?";

        ArrayList<Materia> materiasCursadas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia mate = new Materia();

                mate.setIdMateria(rs.getInt("idMateria"));

                mate.setNombre(rs.getString("nombre"));

                mate.setAnioMateria(rs.getInt("anio"));
                mate.setActivo(rs.getBoolean("estado"));

                materiasCursadas.add(mate);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla inscripcion");
        }

        return materiasCursadas;
    }


    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {

        ArrayList<Materia> materiasNoCursadas = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado=1 AND idMateria NOT IN (Select idMateria From inscripcion WHERE idAlumno=?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia mate = new Materia();

                mate.setIdMateria(rs.getInt("idMateria"));

                mate.setNombre(rs.getString("nombre"));

                mate.setAnioMateria(rs.getInt("anio"));
                mate.setActivo(rs.getBoolean("estado"));

                materiasNoCursadas.add(mate);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla inscripcion");
        }

        return materiasNoCursadas;
    }


    public void borrarInscripcionAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Borrado exitoso");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Inscripciones");
        }

    }


    public boolean actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? And idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int res = ps.executeUpdate();
            if (res == 1) return true;
            else return false;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Inscripciones");
            return false;
        }
    }


    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {

        ArrayList<Alumno> alumnosPorMateria = new ArrayList<>();
        String sql = "SELECT alumno.idAlumno FROM inscripcion,alumno WHERE inscripcion.idAlumno=alumno.idAlumno And idMateria= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno = alu.buscarAlumno(rs.getInt("idAlumno"));

                alumnosPorMateria.add(alumno);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Inscripcion");
        }

        return alumnosPorMateria;
    }

}
