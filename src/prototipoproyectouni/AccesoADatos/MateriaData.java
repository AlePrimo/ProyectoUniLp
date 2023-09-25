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
import prototipoproyectouni.Entidades.Materia;

public class MateriaData {

    private Connection con;
    private Materia materia;

    public MateriaData() {
        con = Conexion.getConnection();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES"
                + "(?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ingreso una materia con id :" + materia.getIdMateria());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Materia");
        }

    }

    public Materia buscarMateria(int id) {

        String sql = "SELECT * FROM materia WHERE idMateria=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();

            if (res.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(res.getString("nombre"));
                materia.setAnioMateria(res.getInt("anio"));
                materia.setActivo(res.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una materia con ese id ,ingrese el dato nuevamente!");
               
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Materia");
            
        }

        return materia;
    }

    public void ModificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            int carga = ps.executeUpdate();
            if (carga == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado la materia con id :" + materia.getIdMateria());

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Materia");
        }

    }

    public void eliminarMateria(int id) {

        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja la materia con id :" + id);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Materia");
        }

    }

    public List<Materia> listarMaterias() {

        String sql = "SELECT * FROM materia WHERE estado=1";
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            
            
            while (res.next()) {
                materia = new Materia();
                materia.setIdMateria(res.getInt("idMateria"));
                materia.setNombre(res.getString("nombre"));
                materia.setAnioMateria(res.getInt("anio"));
                materia.setActivo(true);
                materias.add(materia);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Materia");
        }

        return materias;
    }

}
