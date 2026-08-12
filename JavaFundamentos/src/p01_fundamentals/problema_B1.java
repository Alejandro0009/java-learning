
package p01_fundamentals;

import java.util.Scanner;

public class problema_B1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero=0, i=1;
        System.out.println("Hasta que numero quieres mostrar?");
        numero=scanner.nextInt();
        
        do{
            System.out.println(i);
            i++; // i=i+1;
        
        }while(numero>=i);
    }
  
}
