/*
Problema: Analizador de calificaciones

Crea un programa que:

1. Solicite al usuario 10 calificaciones.
2. Guarde las calificaciones dentro de un arreglo.
3. Recorra el arreglo para obtener los siguientes datos:

- Suma total de las calificaciones.
- Promedio del grupo.
- Cantidad de alumnos aprobados (calificación >= 6).
- Cantidad de alumnos reprobados.
- Calificación más alta.
- Calificación más baja.

Ejemplo de entrada:

Calificaciones:
8
5
10
7
6
4
9
3
8
10

Ejemplo de salida:

Suma: 70
Promedio: 7.0
Aprobados: 7
Reprobados: 3
Calificación mayor: 10
Calificación menor: 3

Utiliza:
- Scanner para capturar datos.
- Un arreglo de tipo int para almacenar calificaciones.
- Ciclo for para recorrer el arreglo.
- Condicionales if para comparar valores.
*/
package p04_arrays;

import java.util.Scanner;

public class problema_M {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] calificaciones = new int [10];
        int suma = 0;
        int promedio = 0;
        int aprobados =0;
        int reprobados =0;
        int mayor =0;
        int menor =10;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa calificacion: ");
            calificaciones[i] =sc.nextInt();
            if (calificaciones[i]>=0 && calificaciones[i]<6){
                reprobados = reprobados+1;
            }else if (calificaciones[i]>=6 && calificaciones[i]<=10){
                aprobados = aprobados+1;
            }
            
        }
        System.out.println("Las calificaciones son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(calificaciones[i] + ", ");
            suma= suma + calificaciones [i];
            if (calificaciones[i]>mayor){
                    mayor=calificaciones[i];
                }
            if (calificaciones[i]<menor){
                    menor=calificaciones[i];
                }
        }
        promedio= suma/10; 
        System.out.println("");
        System.out.println("La suma de las califiaciones es: "+suma);
        System.out.println("El promedio del grupo es: "+ promedio);
        System.out.println("Los alumnos aprobados son un total de: "+aprobados);
        System.out.println("Los alumnos reprobados son un total de: "+reprobados);
        System.out.println("La calificacion mas alta es de: "+mayor);
        System.out.println("La calificacion mas baja es de:  "+ menor);
        
    }
    
}
