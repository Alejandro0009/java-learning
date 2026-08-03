
package p01_fundamentals;

// Reto:

import java.util.Scanner;

// Crea un programa que determine el precio de una entrada de cine.
//
// Reglas:
//
// Si la persona tiene menos de 12 años:
// descuento del 50%
//
// Si tiene entre 12 y 59 años:
// paga precio completo
//
// Si tiene 60 años o más:
// descuento del 40%
//
// Datos:
// Edad: 15
// Precio entrada: 100
//
// Salida esperada:
// Precio final: 100

public class problema_Y {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad=0;
        double entrada=100;
        double descuento=0;
        System.out.println("Ingrese su edad: ");
        edad= sc.nextInt();
        if (edad>0 && edad<12){//descuento del %50
            descuento= (entrada*0.5);
            System.out.println("El desceunto para ti es: "+descuento);
        }else if(edad>=12 & edad<60){
            System.out.println("El valor de tu entrada es: "+entrada);
        }else if(edad>=60 && edad<120){//descuento del %40
            descuento= (entrada * 0.40);
            System.out.println("El descuento para ti es: "+descuento);
        }else{
            System.out.println("Edad invalida.");
        
        }
        
    }
    
}
