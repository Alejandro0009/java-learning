
package p04_arrays;
// Reto:
// Crea un arreglo de 5 números enteros.

import java.util.Scanner;

// Recorre el arreglo con un ciclo.
// Al final imprime cuál es el número mayor.

public class problema_N {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] numero = new int[5];
        int mayor =0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa numero: ");
            numero[i]=sc.nextInt();
            if (numero[i]>mayor){
                mayor= numero[i];
            }
        }
        System.out.println("El numero mas grande del arreglo es: "+mayor);
        
    }
    

}
    
  
    

