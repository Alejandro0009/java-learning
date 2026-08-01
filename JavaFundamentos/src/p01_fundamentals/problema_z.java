
package p01_fundamentals;

import java.util.Scanner;

/*
 * PROBLEMA: APROBADO O REPROBADO
 *
 * Desarrolla un programa que solicite la calificación de un estudiante.
 *
 * Requisitos:
 * 1. Pide al usuario una calificación del 0 al 100.
 * 2. Si la calificación es mayor o igual a 70, muestra:
 *    "Alumno aprobado."
 * 3. Si la calificación es menor a 70, muestra:
 *    "Alumno reprobado."
 * 4. Si la calificación es menor a 0 o mayor a 100, muestra:
 *    "Calificación inválida."
 *
 * Ejemplo:
 *
 * Ingrese la calificación: 85
 * Alumno aprobado.
 */
public class problema_z {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion; 
        System.out.println("Ingresa la calificacion del estudiante: ");
        calificacion = sc.nextInt();
        
        if(calificacion >100){
            System.out.println("Calificacion invalida.");
            System.out.println("La calificacion ingresada es: " + calificacion);
        
        }else if(calificacion <0){
            System.out.println("Calificacion invalida.");
            System.out.println("La calificacion ingresada es: " + calificacion);
        }else if (calificacion >=70){
            System.out.println("ALUMNO APROBADO!");
            System.out.println("La calificacion ingresada es: "+calificacion);
        
        }else{
            System.out.println("ALUMNO REPROBADO!");
            System.out.println("La calificacion ingresada es: "+calificacion);
        }
        
       
    }
    
}
