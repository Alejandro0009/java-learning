package p01_fundamentals;

import java.util.Scanner;

public class problema_C1 {

    public static void main(String[] args) {
        //Determinar si un numero es par o impar 
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("=========== Programa para validar si el numero ingresado es par o impar.===================");
            System.out.println("1. Ingresar numero.");
            System.out.println("2. Salir");
            menu = scanner.nextInt();
            System.out.println("===============================================");
            System.out.println("  ");

            if (menu == 1) {

                System.out.println("Ingresa el valor de un numero: ");
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    System.out.println("El numero es par.");
                    System.out.println("  ");

                } else {
                    System.out.println("El numero es impar.");
                    System.out.println("  ");
                }

            }else if(menu!=1 && menu!=2){
                System.out.println("Numero ingresado invalido.");
                System.out.println("   ");
            
            }

        } while (menu != 2);

    }

}
