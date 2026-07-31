
package dao;

import conexion.conexionBD;
import modelo.alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlumnoDAO {

    public void guardarAlumno(alumno alumno) {

        String sql = "INSERT INTO alumnos(nombre, edad, grado, telefono, correo, fecha_registro) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection conexion = conexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, alumno.getNombre());
            ps.setInt(2, alumno.getEdad());
            ps.setString(3, alumno.getGrado());
            ps.setString(4, alumno.getTelefono());
            ps.setString(5, alumno.getCorreo());
            ps.setString(6, alumno.getFecha_registro());

            ps.executeUpdate();

            System.out.println("Alumno guardado correctamente");

        } catch (Exception e) {

            System.out.println("Error al guardar alumno: " + e.getMessage());

        }
    }
}