
package dao;

import conexion.conexionBD;
import modelo.alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlumnoDAO {

    public void guardarAlumno(alumno alumno) {

        String sql = "INSERT INTO alumno(" +
                     "nombre, apellido_paterno, apellido_materno, " +
                     "fecha_de_nacimiento, grado_academico, alergias, " +
                     "fecha_de_inscripcion, estatus, telefono_estudiante) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection conexion = conexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellidoPaterno());
            ps.setString(3, alumno.getApellidoMaterno());
            ps.setString(4, alumno.getFechaDeNacimiento());
            ps.setString(5, alumno.getGradoAcademico());
            ps.setString(6, alumno.getAlergias());
            ps.setString(7, alumno.getFechaDeInscripcion());
            ps.setString(8, alumno.getEstatus());
            ps.setString(9, alumno.getTelefonoEstudiante());

            ps.executeUpdate();

            System.out.println("Alumno guardado correctamente");

        } catch (Exception e) {

            System.out.println("Error al guardar alumno: " + e.getMessage());

        }
    }
}
