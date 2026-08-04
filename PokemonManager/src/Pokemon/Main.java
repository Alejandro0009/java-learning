
package Pokemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Pokemon pokemonUno = crearPokemon();
      Pokemon pokemonDos = crearPokemon();
      pokemonUno.atacar(pokemonDos);
      pokemonDos.mostrarInformacion();

    }
    
    public static Pokemon crearPokemon (){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre del pokemon: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el tipo: ");
        String tipo= sc.nextLine();
        System.out.println("ingresa el color: ");
        String color = sc.nextLine();
        System.out.println("Ingrese la estatura en metros: ");
        double estatura =sc.nextDouble();
        System.out.println("Ingrese el peso en kilogramos: ");
        double peso= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese su counter directo: ");
        String counter = sc.nextLine();
        System.out.println("Ingrese su evolucion: ");
        String evolucion = sc.nextLine();
        System.out.println(" ");
        
        Pokemon pokemonUno = new Pokemon (nombre, tipo,color,estatura, peso, counter, evolucion);
        return pokemonUno;
    
    }
    
}
