package p01_fundamentals;

import java.util.Scanner;

public class problema_W {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double calificacion;
        double sumaAprobados = 0;
        double sumaReprobados = 0;
        double promedioAprobados = 0;
        double promedioReprobados = 0;

        int aprobados = 0;
        int reprobados = 0;

        char opcion;

        do {

            // Validar la calificación
            do {
                System.out.print("Ingrese una calificación (0 - 10): ");
                calificacion = sc.nextDouble();

                if (calificacion < 0 || calificacion > 10) {
                    System.out.println("❌ Error: La calificación debe estar entre 0 y 10.");
                }

            } while (calificacion < 0 || calificacion > 10);

            // Evaluar si aprobó o reprobó
            if (calificacion >= 8) {

                System.out.println("✅ Alumno APROBADO");

                aprobados++;
                sumaAprobados += calificacion;

            } else {

                System.out.println("❌ Alumno REPROBADO");

                reprobados++;
                sumaReprobados += calificacion;
            }

            // Preguntar si desea continuar
            System.out.print("\n¿Desea ingresar otra calificación? (S/N): ");
            opcion = sc.next().toUpperCase().charAt(0);

            System.out.println();

        } while (opcion == 'S');

        // Calcular promedios
        if (aprobados > 0) {
            promedioAprobados = sumaAprobados / aprobados;
        }

        if (reprobados > 0) {
            promedioReprobados = sumaReprobados / reprobados;
        }

        // Mostrar resultados
        System.out.println("========== RESUMEN FINAL ==========");
        System.out.println("Total de aprobados      : " + aprobados);
        System.out.println("Total de reprobados     : " + reprobados);
        System.out.printf("Promedio de aprobados   : %.2f%n", promedioAprobados);
        System.out.printf("Promedio de reprobados  : %.2f%n", promedioReprobados);
        System.out.println("===================================");

        sc.close();
    }
}