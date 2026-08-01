/*
 PROBLEMA: PROMEDIO DE CALIFICACIONES

 Crea un programa que:

 1. Cree un arreglo con 5 calificaciones.
 2. Muestre todas las calificaciones.
 3. Calcule la suma de todas.
 4. Calcule el promedio.
 5. Muestre si el promedio es mayor o igual a 70:
 
 "Alumno aprobado"

 Si es menor:
 
 "Alumno reprobado"
*/


package p04_arrays;

import java.util.Scanner;

public class problema_L {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] calificaciones = new int [5];
        int suma = 0;
        float promedio=0;
        
        for (int i=0; i<5; i++){
            System.out.print("Ingresa calificacion: ");
            calificaciones[i] = sc.nextInt();
        }
        System.out.println("Las calificaciones son:");
        for ( int i=0; i<5; i++){
            suma = suma + calificaciones [i]; 
            System.out.print(calificaciones[i]+", ");
        }
        System.out.println(" ");   
        promedio=suma/5;
        
        if (promedio>=70 && promedio <= 100 ){
            System.out.println("La suma de las califiaciones es: "+suma);
            System.out.println("El promedio es mayor o igual a 70.0");
            System.out.println("El promedio de las calificaciones es: "+promedio);
            System.out.println("Felicidades Aprobaste el año.");
            
        
        }else if (promedio>=0 && promedio<70){
            System.out.println("La suma de las califiaciones es: "+suma);
            System.out.println("El promedio es menor a 70.0");
            System.out.println("El promedio de las calificaciones es: "+promedio);
            System.out.println("Lamentablemente No pasas el año escolar!");
        
        }else {
            System.out.println("El promedio es invalido");
            System.out.println("Wtf pues que metiste de calificaciones jajaj lol");
        
        }

        
    }
}
