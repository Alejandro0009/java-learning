
package app;

import modelo.alumno;
import dao.AlumnoDAO;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        AlumnoDAO dao = new AlumnoDAO();

        System.out.println("===== CENTRO EDUCATIVO AD =====");

        System.out.print("Nombre del alumno: ");
        String nombre = teclado.nextLine();

        System.out.print("Apellido paterno: ");
        String apellidoPaterno = teclado.nextLine();

        System.out.print("Apellido materno: ");
        String apellidoMaterno = teclado.nextLine();

        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = teclado.nextLine();

        System.out.print("Grado académico: ");
        String gradoAcademico = teclado.nextLine();

        System.out.print("Alergias: ");
        String alergias = teclado.nextLine();

        System.out.print("Fecha de inscripción (YYYY-MM-DD): ");
        String fechaInscripcion = teclado.nextLine();

        System.out.print("Estatus: ");
        String estatus = teclado.nextLine();

        System.out.print("Teléfono: ");
        String telefono = teclado.nextLine();


        alumno alumno = new alumno();

        alumno.setNombre(nombre);
        alumno.setApellidoPaterno(apellidoPaterno);
        alumno.setApellidoMaterno(apellidoMaterno);
        alumno.setFechaDeNacimiento(fechaNacimiento);
        alumno.setGradoAcademico(gradoAcademico);
        alumno.setAlergias(alergias);
        alumno.setFechaDeInscripcion(fechaInscripcion);
        alumno.setEstatus(estatus);
        alumno.setTelefonoEstudiante(telefono);


        dao.guardarAlumno(alumno);


        teclado.close();

    }
}
