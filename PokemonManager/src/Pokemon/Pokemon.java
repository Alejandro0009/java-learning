
package Pokemon;

public class Pokemon {
    private String nombre; /**/
    private String tipo; /**/
    private String color;/**/
    private double estatura;/**/
    private double peso;/**/
    
    private int nivel; 
    private int vida;
    private int ataque;
    private int defensa;
    
    private String counter;/**/
    private String evolucion;/**/

    public Pokemon(String nombre, String tipo, String color, double estatura, double peso, String counter, String evolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.estatura = estatura;
        this.peso = peso;
        this.nivel = 1;
        this.vida = 100;
        this.ataque = 20;
        this.defensa = 15;
        this.counter = counter;
        this.evolucion = evolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }
    
}
