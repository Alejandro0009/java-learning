/*
 * ============================================================
 *  Proyecto:       Programa de Calificaciones
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que permite registrar las calificaciones de un
 *      grupo de estudiantes, calcular estadísticas básicas y
 *      mostrar los resultados en pantalla.
 *
 *  Funcionalidades:
 *      - Ingreso dinámico del número de estudiantes
 *      - Captura de calificaciones con validación
 *      - Cálculo de:
 *          • Suma total
 *          • Promedio
 *          • Calificación mayor
 *          • Calificación menor
 *          • Alumnos aprobados y reprobados
 *
 *  Conceptos aplicados:
 *      - Arreglos (arrays)
 *      - Ciclos for
 *      - Condicionales
 *      - Acumuladores
 *      - Entrada de datos con Scanner
 * ============================================================
 */

package arrays;

import java.util.Scanner;

public class problemaL {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables de control y acumuladores
        double suma = 0;
        double calificacionMayor = Double.MIN_VALUE;
        double calificacionMenor = Double.MAX_VALUE;
        int alumnosAprobados = 0;
        int alumnosReprobados = 0;
        int contador = 0;

        // Solicitar número de estudiantes
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int numEstudiantes = entrada.nextInt();

        // Declaración del arreglo de calificaciones
        double[] calificaciones = new double[numEstudiantes];

        // Ingreso de calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa la calificación del estudiante #" + (i + 1) + ": ");
            double cal = entrada.nextDouble();

            if (cal >= 0 && cal <= 10) {
                calificaciones[i] = cal;
            } else {
                System.out.println("⚠ Calificación fuera de rango (0–10). Se ignorará.");
                continue;
            }
        }

        // Procesamiento de datos
        for (int i = 0; i < calificaciones.length; i++) {

            double cal = calificaciones[i];

            if (cal >= 0 && cal <= 10) {
                suma += cal;
                contador++;

                if (cal > calificacionMayor) {
                    calificacionMayor = cal;
                }

                if (cal < calificacionMenor) {
                    calificacionMenor = cal;
                }

                if (cal >= 6) {
                    alumnosAprobados++;
                } else {
                    alumnosReprobados++;
                }
            }
        }

        // Cálculo del promedio
        double promedio = (contador > 0) ? suma / contador : 0;

        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Suma total de calificaciones: " + suma);
        System.out.println("Promedio general: " + promedio);
        System.out.println("Calificación más alta: " + calificacionMayor);
        System.out.println("Calificación más baja: " + calificacionMenor);
        System.out.println("Alumnos aprobados: " + alumnosAprobados);
        System.out.println("Alumnos reprobados: " + alumnosReprobados);
    }
}
