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

        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Grado: ");
        String grado = teclado.nextLine();

        System.out.print("Telefono: ");
        String telefono = teclado.nextLine();

        System.out.print("Correo: ");
        String correo = teclado.nextLine();


        alumno alumno = new alumno();

        alumno.setNombre(nombre);
        alumno.setEdad(edad);
        alumno.setGrado(grado);
        alumno.setTelefono(telefono);
        alumno.setCorreo(correo);
        alumno.setFecha_registro("2026-07-31");


        dao.guardarAlumno(alumno);


        teclado.close();

    }
}